/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  d.a.b.a.a
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Objects
 */
package d.c.b.m.e.k;

import android.util.Log;
import d.c.a.d.j.a;
import d.c.a.d.j.h;
import d.c.b.m.e.b;
import d.c.b.m.e.k.k0;
import d.c.b.m.e.k.x0;
import d.c.b.m.e.o.g;
import java.util.Objects;

public final class v0
implements a {
    public final x0 a;

    public v0(x0 x02) {
        this.a = x02;
    }

    public Object a(h h2) {
        boolean bl;
        x0 x02 = this.a;
        Objects.requireNonNull((Object)x02);
        b b3 = b.a;
        if (h2.n()) {
            k0 k02 = (k0)h2.j();
            StringBuilder stringBuilder = d.a.b.a.a.d((String)"Crashlytics report successfully enqueued to DataTransport: ");
            stringBuilder.append(k02.b());
            b3.b(stringBuilder.toString());
            x02.b.c(k02.b());
            bl = true;
        } else {
            Exception exception = h2.i();
            if (b3.a(3)) {
                Log.d("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", exception);
            }
            bl = false;
        }
        return bl;
    }
}

