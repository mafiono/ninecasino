/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.concurrent.Executor
 */
package d.c.b.m.e;

import android.util.Log;
import d.c.a.d.j.g;
import d.c.b.m.e.h;
import d.c.b.m.e.s.d;
import d.c.b.m.e.s.i.b;
import java.util.concurrent.Executor;

public class e
implements g<b, Void> {
    public final /* synthetic */ String a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ h d;

    public e(h h2, String string, d d3, Executor executor) {
        this.d = h2;
        this.a = string;
        this.b = d3;
        this.c = executor;
    }

    public d.c.a.d.j.h a(Object object) {
        b b3 = (b)object;
        try {
            h.a(this.d, b3, this.a, this.b, this.c, true);
            return null;
        }
        catch (Exception exception) {
            if (d.c.b.m.e.b.a.a(6)) {
                Log.e("FirebaseCrashlytics", "Error performing auto configuration.", exception);
            }
            throw exception;
        }
    }
}

