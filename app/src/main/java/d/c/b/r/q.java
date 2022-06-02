/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 *  d.a.b.a.a
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  javax.annotation.concurrent.GuardedBy
 */
package d.c.b.r;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import d.c.a.d.b.a;
import d.c.b.c;
import d.c.b.i;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

public class q {
    public final Context a;
    @GuardedBy(value="this")
    public String b;
    @GuardedBy(value="this")
    public String c;
    @GuardedBy(value="this")
    public int d;
    @GuardedBy(value="this")
    public int e = 0;

    public q(Context context) {
        this.a = context;
    }

    public static String b(c c2) {
        c2.a();
        String string = c2.c.e;
        if (string != null) {
            return string;
        }
        c2.a();
        String string2 = c2.c.b;
        if (!string2.startsWith("1:")) {
            return string2;
        }
        String[] arrstring = string2.split(":");
        if (arrstring.length < 2) {
            return null;
        }
        String string3 = arrstring[1];
        if (string3.isEmpty()) {
            return null;
        }
        return string3;
    }

    public String a() {
        q q2 = this;
        synchronized (q2) {
            if (this.b == null) {
                this.e();
            }
            String string = this.b;
            return string;
        }
    }

    public final PackageInfo c(String string) {
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(string, 0);
            return packageInfo;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            String string2 = String.valueOf(nameNotFoundException);
            d.a.b.a.a.g((int)(23 + string2.length()), (String)"Failed to find package ", (String)string2, (String)"FirebaseInstanceId");
            return null;
        }
    }

    public boolean d() {
        q q2 = this;
        synchronized (q2) {
            int n2;
            block10 : {
                block13 : {
                    PackageManager packageManager;
                    block12 : {
                        block11 : {
                            n2 = this.e;
                            if (n2 != 0) break block10;
                            packageManager = this.a.getPackageManager();
                            if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") != -1) break block11;
                            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                            // MONITOREXIT [1, 7] lbl10 : w: MONITOREXIT : var12_1
                            n2 = 0;
                        }
                        if (a.p()) break block12;
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List list = packageManager.queryIntentServices(intent, 0);
                        if (list == null) break block12;
                        if (list.size() <= 0) break block12;
                        this.e = 1;
                        // MONITOREXIT [3, 7] lbl22 : w: MONITOREXIT : var12_1
                        n2 = 1;
                    }
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List list = packageManager.queryBroadcastReceivers(intent, 0);
                    if (list == null) break block13;
                    if (list.size() <= 0) break block13;
                    this.e = 2;
                    // MONITOREXIT [5, 7] lbl33 : w: MONITOREXIT : var12_1
                    n2 = 2;
                }
                Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                this.e = a.p() ? 2 : 1;
                n2 = this.e;
            }
            return n2 != 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        q q2 = this;
        synchronized (q2) {
            PackageInfo packageInfo = this.c(this.a.getPackageName());
            if (packageInfo != null) {
                this.b = Integer.toString(packageInfo.versionCode);
                this.c = packageInfo.versionName;
            }
            return;
        }
    }
}

