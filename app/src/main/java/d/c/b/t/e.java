/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  d.c.b.t.f
 *  d.c.b.t.h
 *  d.c.b.t.p.a
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Objects
 */
package d.c.b.t;

import android.content.Context;
import d.c.b.t.b;
import d.c.b.t.f;
import d.c.b.t.h;
import d.c.b.t.o;
import d.c.b.t.p.a;
import d.c.b.t.p.c;
import d.c.b.t.p.d;
import java.io.IOException;
import java.util.Objects;

public final class e
implements Runnable {
    public final f e;
    public final boolean f;

    public e(f f2, boolean bl) {
        this.e = f2;
        this.f = bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void run() {
        Throwable throwable;
        f f2;
        block27 : {
            boolean bl;
            Object object;
            d d3;
            f2 = this.e;
            boolean bl2 = this.f;
            Objects.requireNonNull((Object)f2);
            Object object2 = object = f.l;
            // MONITORENTER : object2
            d.c.b.c c2 = f2.a;
            c2.a();
            b b2 = b.a(c2.a, "generatefid.lock");
            d d4 = f2.c.b();
            // MONITOREXIT : object2
            try {}
            catch (h h2) {
                // empty catch block
                break block27;
            }
            finally {
                if (b2 != null) {
                    b2.b();
                }
            }
            if (!d4.h() && !(bl = d4.f() == c.a.g)) {
                if (!bl2) {
                    if (!f2.d.d(d4)) return;
                }
                d3 = f2.c(d4);
            } else {
                d3 = f2.k(d4);
            }
            object2 = object;
            // MONITORENTER : object2
            d.c.b.c c3 = f2.a;
            c3.a();
            b b3 = b.a(c3.a, "generatefid.lock");
            f2.c.a(d3);
            // MONITOREXIT : object2
            if (d3.j()) {
                String string = ((a)d3).b;
                f f3 = f2;
                // MONITORENTER : f3
                f2.j = string;
                // MONITOREXIT : f3
            }
            if (d3.h()) {
                throwable = new h(h.a.e);
            } else {
                if (!d3.i()) {
                    f2.m(d3);
                    return;
                }
                throwable = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
            }
            break block27;
            finally {
                if (b3 != null) {
                    b3.b();
                }
            }
        }
        f2.l((Exception)throwable);
    }
}

