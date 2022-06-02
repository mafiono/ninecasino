/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.f.b.b$a
 *  c.f.b.c
 *  c.f.b.g
 *  d.a.b.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package c.f.b;

import c.f.b.b;
import c.f.b.c;
import c.f.b.g;
import d.a.b.a.a;
import java.util.Arrays;

public class h
implements b.a {
    public int a = 16;
    public int[] b = new int[16];
    public int[] c = new int[16];
    public int[] d = new int[16];
    public float[] e = new float[16];
    public int[] f = new int[16];
    public int[] g = new int[16];
    public int h = 0;
    public int i = -1;
    public final b j;
    public final c k;

    public h(b b2, c c2) {
        this.j = b2;
        this.k = c2;
        this.clear();
    }

    public float a(int n2) {
        int n3 = this.h;
        int n4 = this.i;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (i2 == n2) {
                return this.e[n4];
            }
            if ((n4 = this.g[n4]) == -1) break;
        }
        return 0.0f;
    }

    public float b(b b2, boolean bl) {
        float f2 = this.g(b2.a);
        this.d(b2.a, bl);
        h h2 = (h)b2.d;
        int n2 = h2.h;
        int n3 = 0;
        int n4 = 0;
        while (n3 < n2) {
            int[] arrn = h2.d;
            if (arrn[n4] != -1) {
                float f3 = h2.e[n4];
                this.e(this.k.d[arrn[n4]], f3 * f2, bl);
                ++n3;
            }
            ++n4;
        }
        return f2;
    }

    public void c(g g2, float f2) {
        int n2;
        int n3;
        block16 : {
            if (f2 > -0.001f && f2 < 0.001f) {
                this.d(g2, true);
                return;
            }
            if (this.h == 0) {
                this.m(0, g2, f2);
                this.l(g2, 0);
                this.i = 0;
                return;
            }
            int n4 = this.n(g2);
            if (n4 != -1) {
                this.e[n4] = f2;
                return;
            }
            int n5 = 1 + this.h;
            int n6 = this.a;
            if (n5 >= n6) {
                int n7 = n6 * 2;
                this.d = Arrays.copyOf(this.d, n7);
                this.e = Arrays.copyOf(this.e, n7);
                this.f = Arrays.copyOf(this.f, n7);
                this.g = Arrays.copyOf(this.g, n7);
                this.c = Arrays.copyOf(this.c, n7);
                for (int i2 = this.a; i2 < n7; ++i2) {
                    this.d[i2] = -1;
                    this.c[i2] = -1;
                }
                this.a = n7;
            }
            int n8 = this.h;
            int n9 = this.i;
            int n10 = 0;
            n3 = -1;
            do {
                n2 = 0;
                if (n10 >= n8) break;
                int[] arrn = this.d;
                int n11 = arrn[n9];
                int n12 = g2.b;
                if (n11 == n12) {
                    this.e[n9] = f2;
                    return;
                }
                if (arrn[n9] < n12) {
                    n3 = n9;
                }
                if ((n9 = this.g[n9]) == -1) {
                    n2 = 0;
                    break;
                }
                ++n10;
            } while (true);
            while (n2 < this.a) {
                if (this.d[n2] != -1) {
                    ++n2;
                    continue;
                }
                break block16;
            }
            n2 = -1;
        }
        this.m(n2, g2, f2);
        int[] arrn = this.f;
        if (n3 != -1) {
            arrn[n2] = n3;
            int[] arrn2 = this.g;
            arrn2[n2] = arrn2[n3];
            arrn2[n3] = n2;
        } else {
            arrn[n2] = -1;
            if (this.h > 0) {
                this.g[n2] = this.i;
                this.i = n2;
            } else {
                this.g[n2] = -1;
            }
        }
        int[] arrn3 = this.g;
        if (arrn3[n2] != -1) {
            this.f[arrn3[n2]] = n2;
        }
        this.l(g2, n2);
    }

    public void clear() {
        int n2 = this.h;
        for (int i2 = 0; i2 < n2; ++i2) {
            g g2 = this.f(i2);
            if (g2 == null) continue;
            g2.b(this.j);
        }
        for (int i3 = 0; i3 < this.a; ++i3) {
            this.d[i3] = -1;
            this.c[i3] = -1;
        }
        for (int i4 = 0; i4 < 16; ++i4) {
            this.b[i4] = -1;
        }
        this.h = 0;
        this.i = -1;
    }

    public float d(g g2, boolean bl) {
        int[] arrn;
        int n2 = this.n(g2);
        if (n2 == -1) {
            return 0.0f;
        }
        int[] arrn2 = this.b;
        int n3 = g2.b;
        int n4 = n3 % 16;
        int n5 = arrn2[n4];
        if (n5 != -1) {
            if (this.d[n5] == n3) {
                int[] arrn3 = this.c;
                arrn2[n4] = arrn3[n5];
                arrn3[n5] = -1;
            } else {
                int[] arrn4;
                while ((arrn4 = this.c)[n5] != -1 && this.d[arrn4[n5]] != n3) {
                    n5 = arrn4[n5];
                }
                int n6 = arrn4[n5];
                if (n6 != -1 && this.d[n6] == n3) {
                    arrn4[n5] = arrn4[n6];
                    arrn4[n6] = -1;
                }
            }
        }
        float f2 = this.e[n2];
        if (this.i == n2) {
            this.i = this.g[n2];
        }
        this.d[n2] = -1;
        int[] arrn5 = this.f;
        if (arrn5[n2] != -1) {
            int[] arrn6 = this.g;
            arrn6[arrn5[n2]] = arrn6[n2];
        }
        if ((arrn = this.g)[n2] != -1) {
            arrn5[arrn[n2]] = arrn5[n2];
        }
        this.h = -1 + this.h;
        g2.l = -1 + g2.l;
        if (bl) {
            g2.b(this.j);
        }
        return f2;
    }

    public void e(g g2, float f2, boolean bl) {
        if (f2 > -0.001f && f2 < 0.001f) {
            return;
        }
        int n2 = this.n(g2);
        if (n2 == -1) {
            this.c(g2, f2);
            return;
        }
        float[] arrf = this.e;
        arrf[n2] = f2 + arrf[n2];
        if (arrf[n2] > -0.001f && arrf[n2] < 0.001f) {
            arrf[n2] = 0.0f;
            this.d(g2, bl);
        }
    }

    public g f(int n2) {
        int n3 = this.h;
        if (n3 == 0) {
            return null;
        }
        int n4 = this.i;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (i2 == n2 && n4 != -1) {
                return this.k.d[this.d[n4]];
            }
            if ((n4 = this.g[n4]) != -1) continue;
            return null;
        }
        return null;
    }

    public float g(g g2) {
        int n2 = this.n(g2);
        if (n2 != -1) {
            return this.e[n2];
        }
        return 0.0f;
    }

    public boolean h(g g2) {
        return this.n(g2) != -1;
    }

    public void i(float f2) {
        int n2 = this.h;
        int n3 = this.i;
        for (int i2 = 0; i2 < n2; ++i2) {
            float[] arrf = this.e;
            arrf[n3] = arrf[n3] / f2;
            if ((n3 = this.g[n3]) != -1) continue;
            return;
        }
    }

    public void j() {
        int n2 = this.h;
        int n3 = this.i;
        for (int i2 = 0; i2 < n2; ++i2) {
            float[] arrf = this.e;
            arrf[n3] = -1.0f * arrf[n3];
            if ((n3 = this.g[n3]) != -1) continue;
            return;
        }
    }

    public int k() {
        return this.h;
    }

    public final void l(g g2, int n2) {
        int[] arrn = this.b;
        int n3 = g2.b % 16;
        int n4 = arrn[n3];
        if (n4 == -1) {
            arrn[n3] = n2;
        } else {
            int[] arrn2;
            while ((arrn2 = this.c)[n4] != -1) {
                n4 = arrn2[n4];
            }
            arrn2[n4] = n2;
        }
        this.c[n2] = -1;
    }

    public final void m(int n2, g g2, float f2) {
        this.d[n2] = g2.b;
        this.e[n2] = f2;
        this.f[n2] = -1;
        this.g[n2] = -1;
        g2.a(this.j);
        g2.l = 1 + g2.l;
        this.h = 1 + this.h;
    }

    public int n(g g2) {
        int[] arrn;
        if (this.h == 0) {
            return -1;
        }
        int n2 = g2.b;
        int n3 = n2 % 16;
        int n4 = this.b[n3];
        if (n4 == -1) {
            return -1;
        }
        if (this.d[n4] == n2) {
            return n4;
        }
        while ((arrn = this.c)[n4] != -1 && this.d[arrn[n4]] != n2) {
            n4 = arrn[n4];
        }
        if (arrn[n4] == -1) {
            return -1;
        }
        if (this.d[arrn[n4]] == n2) {
            return arrn[n4];
        }
        return -1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.hashCode());
        stringBuilder.append(" { ");
        String string = stringBuilder.toString();
        int n2 = this.h;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2;
            StringBuilder stringBuilder2;
            g g2 = this.f(i2);
            if (g2 == null) continue;
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string);
            stringBuilder3.append((Object)g2);
            stringBuilder3.append(" = ");
            stringBuilder3.append(this.a(i2));
            stringBuilder3.append(" ");
            String string3 = stringBuilder3.toString();
            int n3 = this.n(g2);
            String string4 = a.m((String)string3, (String)"[p: ");
            if (this.f[n3] != -1) {
                stringBuilder2 = a.d((String)string4);
                stringBuilder2.append((Object)this.k.d[this.d[this.f[n3]]]);
            } else {
                stringBuilder2 = a.e((String)string4, (String)"none");
            }
            String string5 = a.m((String)stringBuilder2.toString(), (String)", n: ");
            if (this.g[n3] != -1) {
                StringBuilder stringBuilder4 = a.d((String)string5);
                stringBuilder4.append((Object)this.k.d[this.d[this.g[n3]]]);
                string2 = stringBuilder4.toString();
            } else {
                string2 = a.m((String)string5, (String)"none");
            }
            string = a.m((String)string2, (String)"]");
        }
        return a.m((String)string, (String)" }");
    }
}

