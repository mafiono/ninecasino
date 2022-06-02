/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package d.c.b.m.e;

import android.util.Log;

public class b {
    public static final b a = new b("FirebaseCrashlytics");

    public b(String string) {
    }

    public final boolean a(int n2) {
        return 4 <= n2 || Log.isLoggable("FirebaseCrashlytics", n2);
        {
        }
    }

    public void b(String string) {
        if (this.a(3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public void c(String string, Throwable throwable) {
        if (this.a(3)) {
            Log.d("FirebaseCrashlytics", string, throwable);
        }
    }

    public void d(String string) {
        if (this.a(6)) {
            Log.e("FirebaseCrashlytics", string, null);
        }
    }

    public void e(String string, Throwable throwable) {
        if (this.a(6)) {
            Log.e("FirebaseCrashlytics", string, throwable);
        }
    }

    public void f(String string) {
        if (this.a(5)) {
            Log.w("FirebaseCrashlytics", string, null);
        }
    }
}

