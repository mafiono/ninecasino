/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.f.b.b$a
 *  c.f.b.c
 *  c.f.b.d
 *  c.f.b.f$a
 *  c.f.b.f$b
 *  c.f.b.g
 *  d.a.b.a.a
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Comparator
 *  java.util.Objects
 */
package c.f.b;

import c.f.b.b;
import c.f.b.c;
import c.f.b.d;
import c.f.b.f;
import c.f.b.g;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/*
 * Exception performing whole class analysis.
 */
public class f
extends c.f.b.b {
    public int f;
    public g[] g;
    public g[] h;
    public int i;
    public b j;

    public f(c c2) {
        super(c2);
        this.f = 128;
        this.g = new g[128];
        this.h = new g[128];
        this.i = 0;
        this.j = new /* Unavailable Anonymous Inner Class!! */;
    }

    @Override
    public void a(g g2) {
        this.j.e = g2;
        Arrays.fill((float[])g2.h, 0.0f);
        g2.h[g2.d] = 1.0f;
        this.m(g2);
    }

    @Override
    public g b(d d2, boolean[] arrbl) {
        int n2 = -1;
        for (int i2 = 0; i2 < this.i; ++i2) {
            int n3;
            g[] arrg = this.g;
            g g2 = arrg[i2];
            if (arrbl[g2.b]) continue;
            b b2 = this.j;
            b2.e = g2;
            boolean bl = true;
            if (n2 == -1) {
                block8 : {
                    float f2;
                    Objects.requireNonNull((Object)b2);
                    for (n3 = 8; n3 >= 0 && !((f2 = b2.e.h[n3]) > 0.0f); --n3) {
                        if (!(f2 < 0.0f)) {
                            continue;
                        }
                        break block8;
                    }
                    bl = false;
                }
                if (!bl) continue;
            } else {
                block9 : {
                    g g3 = arrg[n2];
                    Objects.requireNonNull((Object)b2);
                    while (n3 >= 0) {
                        float f3 = b2.e.h[n3];
                        float f4 = g3.h[n3];
                        if (f3 == f4) {
                            --n3;
                            continue;
                        }
                        if (f3 < f4) break block9;
                    }
                    bl = false;
                }
                if (!bl) continue;
            }
            n2 = i2;
        }
        if (n2 == -1) {
            return null;
        }
        return this.g[n2];
    }

    @Override
    public void clear() {
        this.i = 0;
        this.b = 0.0f;
    }

    @Override
    public void l(c.f.b.b b2, boolean bl) {
        g g2 = b2.a;
        if (g2 == null) {
            return;
        }
        b.a a2 = b2.d;
        int n2 = a2.k();
        for (int i2 = 0; i2 < n2; ++i2) {
            g g3 = a2.f(i2);
            float f2 = a2.a(i2);
            b b3 = this.j;
            b3.e = g3;
            boolean bl2 = g3.a;
            boolean bl3 = true;
            if (bl2) {
                for (int i3 = 0; i3 < 9; ++i3) {
                    float[] arrf = b3.e.h;
                    arrf[i3] = arrf[i3] + f2 * g2.h[i3];
                    if (Math.abs(arrf[i3]) < 1.0E-4f) {
                        b3.e.h[i3] = 0.0f;
                        continue;
                    }
                    bl3 = false;
                }
                if (bl3) {
                    b3.f.n(b3.e);
                }
                bl3 = false;
            } else {
                for (int i4 = 0; i4 < 9; ++i4) {
                    float f3 = g2.h[i4];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f2;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        b3.e.h[i4] = f4;
                        continue;
                    }
                    b3.e.h[i4] = 0.0f;
                }
            }
            if (bl3) {
                this.m(g3);
            }
            this.b += f2 * b2.b;
        }
        this.n(g2);
    }

    public final void m(g g2) {
        int n2;
        int n3 = 1 + this.i;
        Object[] arrobject = this.g;
        if (n3 > arrobject.length) {
            Object[] arrobject2 = Arrays.copyOf(arrobject, 2 * arrobject.length);
            this.g = arrobject2;
            this.h = (g[])Arrays.copyOf(arrobject2, 2 * arrobject2.length);
        }
        g[] arrg = this.g;
        int n4 = this.i;
        arrg[n4] = g2;
        this.i = n2 = n4 + 1;
        if (n2 > 1 && arrg[n2 - 1].b > g2.b) {
            int n5;
            int n6 = 0;
            for (int i2 = 0; i2 < (n5 = this.i); ++i2) {
                this.h[i2] = this.g[i2];
            }
            Arrays.sort((Object[])this.h, 0, n5, (Comparator)new a(this));
            while (n6 < this.i) {
                this.g[n6] = this.h[n6];
                ++n6;
            }
        }
        g2.a = true;
        g2.a((c.f.b.b)this);
    }

    public final void n(g g2) {
        for (int i2 = 0; i2 < this.i; ++i2) {
            int n2;
            if (this.g[i2] != g2) continue;
            while (i2 < (n2 = this.i) - 1) {
                g[] arrg = this.g;
                int n3 = i2 + 1;
                arrg[i2] = arrg[n3];
                i2 = n3;
            }
            this.i = n2 - 1;
            g2.a = false;
            return;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.e((String)"", (String)" goal -> (");
        stringBuilder.append(this.b);
        stringBuilder.append(") : ");
        String string = stringBuilder.toString();
        for (int i2 = 0; i2 < this.i; ++i2) {
            g g2;
            this.j.e = g2 = this.g[i2];
            StringBuilder stringBuilder2 = d.a.b.a.a.d((String)string);
            stringBuilder2.append(this.j);
            stringBuilder2.append(" ");
            string = stringBuilder2.toString();
        }
        return string;
    }
}

