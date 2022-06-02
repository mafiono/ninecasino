/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b0
 *  h.f0.f.c
 *  h.f0.f.e
 *  h.f0.f.g
 *  h.f0.g.c
 *  h.f0.g.f
 *  h.h
 *  h.t
 *  h.t$a
 *  h.w
 *  h.z
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 */
package h.f0.f;

import h.b0;
import h.f0.f.c;
import h.f0.f.e;
import h.f0.f.g;
import h.f0.g.f;
import h.h;
import h.t;
import h.w;
import h.z;
import java.io.IOException;
import java.util.Objects;

public final class a
implements t {
    public final w a;

    public a(w w3) {
        this.a = w3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public b0 a(t.a a2) {
        h.f0.g.c c3;
        f f2 = (f)a2;
        z z3 = f2.f;
        g g2 = f2.b;
        boolean bl = true ^ z3.b.equals((Object)"GET");
        w w3 = this.a;
        Objects.requireNonNull(g2);
        int n2 = f2.i;
        int n3 = f2.j;
        int n4 = f2.k;
        int n5 = w3.E;
        boolean bl2 = w3.z;
        try {
            h h2;
            c3 = g2.e(n2, n3, n4, n5, bl2, bl).i(w3, a2, g2);
            h h3 = h2 = g2.d;
            // MONITORENTER : h3
        }
        catch (IOException iOException) {
            throw new e(iOException);
        }
        g2.n = c3;
        // MONITOREXIT : h3
        return f2.b(z3, g2, c3, g2.b());
    }
}

