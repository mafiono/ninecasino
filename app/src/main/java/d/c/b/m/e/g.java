/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.Void
 */
package d.c.b.m.e;

import android.util.Log;
import d.c.a.d.j.a;
import d.c.b.m.e.b;
import d.c.b.m.e.h;

public class g
implements a<Void, Object> {
    public g(h h2) {
    }

    public Object a(d.c.a.d.j.h<Void> h2) {
        if (!h2.n()) {
            b b3 = b.a;
            Exception exception = h2.i();
            if (b3.a(6)) {
                Log.e("FirebaseCrashlytics", "Error fetching settings.", exception);
            }
        }
        return null;
    }
}

