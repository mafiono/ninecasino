/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  android.util.Log
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Objects
 *  java.util.Queue
 *  java.util.concurrent.Callable
 */
package d.c.b.r;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import d.c.b.r.v;
import d.c.b.r.y;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Callable;

public final class b
implements Callable {
    public final Context a;
    public final Intent b;

    public b(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object call() {
        int n2;
        String string;
        v v2;
        Intent intent;
        Context context;
        block16 : {
            block17 : {
                block14 : {
                    ServiceInfo serviceInfo;
                    block15 : {
                        String string2;
                        block13 : {
                            String string3;
                            context = this.a;
                            Intent intent2 = this.b;
                            v2 = v.a();
                            Objects.requireNonNull((Object)v2);
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                Log.d("FirebaseInstanceId", "Starting service");
                            }
                            v2.d.offer(intent2);
                            intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                            intent.setPackage(context.getPackageName());
                            v v3 = v2;
                            // MONITORENTER : v3
                            string2 = v2.a;
                            if (string2 != null) break block13;
                            ResolveInfo resolveInfo = context.getPackageManager().resolveService(intent, 0);
                            string = null;
                            if (resolveInfo == null || (serviceInfo = resolveInfo.serviceInfo) == null) break block14;
                            if (!context.getPackageName().equals(serviceInfo.packageName) || (string3 = serviceInfo.name) == null) break block15;
                            if (string3.startsWith(".")) {
                                String string4 = String.valueOf(context.getPackageName());
                                String string5 = String.valueOf(serviceInfo.name);
                                string2 = string5.length() != 0 ? string4.concat(string5) : string4;
                            } else {
                                string2 = serviceInfo.name;
                            }
                            v2.a = string2;
                        }
                        // MONITOREXIT : v3
                        string = string2;
                        break block16;
                    }
                    String string6 = serviceInfo.packageName;
                    String string7 = serviceInfo.name;
                    StringBuilder stringBuilder = new StringBuilder(94 + String.valueOf(string6).length() + String.valueOf(string7).length());
                    stringBuilder.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                    stringBuilder.append(string6);
                    stringBuilder.append("/");
                    stringBuilder.append(string7);
                    Log.e("FirebaseInstanceId", stringBuilder.toString());
                    break block17;
                }
                Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
            }
            // MONITOREXIT : v3
        }
        if (string != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String string8 = string.length() != 0 ? "Restricting intent to a specific service: ".concat(string) : "Restricting intent to a specific service: ";
                Log.d("FirebaseInstanceId", string8);
            }
            intent.setClassName(context.getPackageName(), string);
        }
        try {
            ComponentName componentName;
            if (v2.c(context)) {
                componentName = y.a(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName == null) {
                Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
                n2 = 404;
                return n2;
            }
            n2 = -1;
            return n2;
        }
        catch (IllegalStateException illegalStateException) {
            string = String.valueOf(illegalStateException);
            StringBuilder stringBuilder = new StringBuilder(45 + string.length());
            stringBuilder.append("Failed to start service while in background: ");
            stringBuilder.append(string);
            Log.e("FirebaseInstanceId", stringBuilder.toString());
            n2 = 402;
            return n2;
        }
        catch (SecurityException securityException) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", securityException);
            n2 = 401;
        }
        return n2;
    }
}

