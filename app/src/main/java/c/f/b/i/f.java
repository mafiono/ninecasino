/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.f.b.b$a
 *  c.f.b.d
 *  c.f.b.g
 *  c.f.b.i.c
 *  c.f.b.i.c$a
 *  c.f.b.i.d
 *  c.f.b.i.d$a
 *  c.f.b.i.e
 *  java.lang.AssertionError
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package c.f.b.i;

import c.f.b.b;
import c.f.b.g;
import c.f.b.i.c;
import c.f.b.i.d;
import c.f.b.i.e;
import java.util.ArrayList;

public class f
extends d {
    public float e0 = -1.0f;
    public int f0 = -1;
    public int g0 = -1;
    public c h0 = this.z;
    public int i0 = 0;

    public f() {
        this.H.clear();
        this.H.add((Object)this.h0);
        int n2 = this.G.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.G[i2] = this.h0;
        }
    }

    public void D(c.f.b.d d2) {
        if (this.K == null) {
            return;
        }
        int n2 = d2.o((Object)this.h0);
        if (this.i0 == 1) {
            this.P = n2;
            this.Q = 0;
            this.w(this.K.i());
            this.B(0);
            return;
        }
        this.P = 0;
        this.Q = n2;
        this.B(this.K.o());
        this.w(0);
    }

    public void E(int n2) {
        if (this.i0 == n2) {
            return;
        }
        this.i0 = n2;
        this.H.clear();
        c c2 = this.i0 == 1 ? this.y : this.z;
        this.h0 = c2;
        this.H.add((Object)this.h0);
        int n3 = this.G.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            this.G[i2] = this.h0;
        }
    }

    public void b(c.f.b.d d2) {
        d.a a2 = d.a.f;
        e e2 = (e)this.K;
        if (e2 == null) {
            return;
        }
        c c2 = e2.f(c.a.f);
        c c3 = e2.f(c.a.h);
        d d3 = this.K;
        int n2 = 1;
        int n3 = d3 != null && d3.J[0] == a2 ? 1 : 0;
        if (this.i0 == 0) {
            c2 = e2.f(c.a.g);
            c3 = e2.f(c.a.i);
            d d4 = this.K;
            if (d4 == null || d4.J[n2] != a2) {
                n2 = 0;
            }
            n3 = n2;
        }
        if (this.f0 != -1) {
            g g2 = d2.l((Object)this.h0);
            d2.d(g2, d2.l((Object)c2), this.f0, 8);
            if (n3 != 0) {
                d2.f(d2.l((Object)c3), g2, 0, 5);
                return;
            }
        } else if (this.g0 != -1) {
            g g3 = d2.l((Object)this.h0);
            g g4 = d2.l((Object)c3);
            d2.d(g3, g4, -this.g0, 8);
            if (n3 != 0) {
                d2.f(g3, d2.l((Object)c2), 0, 5);
                d2.f(g4, g3, 0, 5);
                return;
            }
        } else if (this.e0 != -1.0f) {
            g g5 = d2.l((Object)this.h0);
            g g6 = d2.l((Object)c3);
            float f2 = this.e0;
            b b2 = d2.m();
            b2.d.c(g5, -1.0f);
            b2.d.c(g6, f2);
            d2.c(b2);
        }
    }

    public boolean c() {
        return true;
    }

    public c f(c.a a2) {
        switch (a2.ordinal()) {
            default: {
                break;
            }
            case 0: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return null;
            }
            case 2: 
            case 4: {
                if (this.i0 != 0) break;
                return this.h0;
            }
            case 1: 
            case 3: {
                if (this.i0 != 1) break;
                return this.h0;
            }
        }
        throw new AssertionError((Object)a2.name());
    }
}

