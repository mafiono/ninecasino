/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.util.Log
 *  d.c.a.d.j.a
 *  d.c.a.d.j.f0
 *  d.c.a.d.j.h
 *  d.c.a.d.j.i
 *  d.c.b.m.e.k.c1
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.Void
 */
package d.c.b.m.e.k;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import d.c.a.d.j.a;
import d.c.a.d.j.f0;
import d.c.a.d.j.h;
import d.c.a.d.j.i;
import d.c.b.c;
import d.c.b.m.e.b;
import d.c.b.m.e.k.c1;
import d.c.b.m.e.k.g;

public class m0 {
    public final SharedPreferences a;
    public final c b;
    public final Object c = new Object();
    public i<Void> d = new i();
    public boolean e = false;
    public Boolean f;
    public i<Void> g = new i();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public m0(c c2) {
        Boolean bl;
        SharedPreferences sharedPreferences;
        Object object;
        c2.a();
        Context context = c2.a;
        this.b = c2;
        this.a = sharedPreferences = g.n(context);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.e = false;
            bl = sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true);
        } else {
            bl = null;
        }
        if (bl == null) {
            Boolean bl2;
            block11 : {
                block10 : {
                    try {
                        Bundle bundle;
                        ApplicationInfo applicationInfo;
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) break block10;
                        bl2 = applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled");
                        break block11;
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        if (!b.a.a(3)) break block10;
                        Log.d("FirebaseCrashlytics", "Unable to get PackageManager. Falling through", nameNotFoundException);
                    }
                }
                bl2 = null;
            }
            if (bl2 == null) {
                this.e = false;
                bl = null;
            } else {
                this.e = true;
                bl = Boolean.TRUE.equals(bl2);
            }
        }
        this.f = bl;
        Object object2 = object = this.c;
        synchronized (object2) {
            if (this.a()) {
                this.d.b(null);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a() {
        m0 m02 = this;
        synchronized (m02) {
            Boolean bl = this.f;
            boolean bl2 = bl != null ? bl.booleanValue() : this.b.f();
            String string = bl2 ? "ENABLED" : "DISABLED";
            String string2 = this.f == null ? "global Firebase setting" : (this.e ? "firebase_crashlytics_collection_enabled manifest flag" : "API");
            b.a.b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{string, string2}));
            return bl2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public h<Void> b() {
        Object object;
        f0 f02;
        f0 f03 = this.g.a;
        Object object2 = object = this.c;
        synchronized (object2) {
            f02 = this.d.a;
        }
        i i2 = new i();
        c1 c12 = new c1(i2);
        f03.f((a)c12);
        f02.f((a)c12);
        return i2.a;
    }
}

