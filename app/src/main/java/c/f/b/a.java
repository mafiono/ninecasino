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
import java.util.Arrays;

public class a
implements b.a {
    public int a = 0;
    public final b b;
    public final c c;
    public int d = 8;
    public int[] e = new int[8];
    public int[] f = new int[8];
    public float[] g = new float[8];
    public int h = -1;
    public int i = -1;
    public boolean j = false;

    public a(b b2, c c2) {
        this.b = b2;
        this.c = c2;
    }

    public float a(int n2) {
        int n3 = this.h;
        for (int i2 = 0; n3 != -1 && i2 < this.a; ++i2) {
            if (i2 == n2) {
                return this.g[n3];
            }
            n3 = this.f[n3];
        }
        return 0.0f;
    }

    public float b(b b2, boolean bl) {
        float f2 = this.g(b2.a);
        this.d(b2.a, bl);
        b.a a2 = b2.d;
        int n2 = a2.k();
        for (int i2 = 0; i2 < n2; ++i2) {
            g g2 = a2.f(i2);
            this.e(g2, f2 * a2.g(g2), bl);
        }
        return f2;
    }

    public final void c(g g2, float f2) {
        int n2;
        int[] arrn;
        int[] arrn2;
        if (f2 == 0.0f) {
            this.d(g2, true);
            return;
        }
        int n3 = this.h;
        if (n3 == -1) {
            this.h = 0;
            this.g[0] = f2;
            this.e[0] = g2.b;
            this.f[0] = -1;
            g2.l = 1 + g2.l;
            g2.a(this.b);
            this.a = 1 + this.a;
            if (!this.j) {
                int n4;
                this.i = n4 = 1 + this.i;
                int[] arrn3 = this.e;
                if (n4 >= arrn3.length) {
                    this.j = true;
                    this.i = arrn3.length - 1;
                }
            }
            return;
        }
        int n5 = -1;
        for (int i2 = 0; n3 != -1 && i2 < this.a; ++i2) {
            int[] arrn4 = this.e;
            int n6 = arrn4[n3];
            int n7 = g2.b;
            if (n6 == n7) {
                this.g[n3] = f2;
                return;
            }
            if (arrn4[n3] < n7) {
                n5 = n3;
            }
            n3 = this.f[n3];
        }
        int n8 = this.i;
        int n9 = n8 + 1;
        if (this.j) {
            int[] arrn5 = this.e;
            if (arrn5[n8] != -1) {
                n8 = arrn5.length;
            }
        } else {
            n8 = n9;
        }
        int[] arrn6 = this.e;
        if (n8 >= arrn6.length && this.a < arrn6.length) {
            int[] arrn7;
            for (int i3 = 0; i3 < (arrn7 = this.e).length; ++i3) {
                if (arrn7[i3] != -1) continue;
                n8 = i3;
                break;
            }
        }
        if (n8 >= (arrn2 = this.e).length) {
            int n10;
            n8 = arrn2.length;
            this.d = n10 = 2 * this.d;
            this.j = false;
            this.i = n8 - 1;
            this.g = Arrays.copyOf(this.g, n10);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[n8] = g2.b;
        this.g[n8] = f2;
        int[] arrn8 = this.f;
        if (n5 != -1) {
            arrn8[n8] = arrn8[n5];
            arrn8[n5] = n8;
        } else {
            arrn8[n8] = this.h;
            this.h = n8;
        }
        g2.l = 1 + g2.l;
        g2.a(this.b);
        this.a = n2 = 1 + this.a;
        if (!this.j) {
            this.i = 1 + this.i;
        }
        if (n2 >= (arrn = this.e).length) {
            this.j = true;
        }
        if (this.i >= arrn.length) {
            this.j = true;
            this.i = arrn.length - 1;
        }
    }

    public final void clear() {
        int n2 = this.h;
        for (int i2 = 0; n2 != -1 && i2 < this.a; ++i2) {
            g g2 = this.c.d[this.e[n2]];
            if (g2 != null) {
                g2.b(this.b);
            }
            n2 = this.f[n2];
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final float d(g g2, boolean bl) {
        int n2 = this.h;
        if (n2 == -1) {
            return 0.0f;
        }
        int n3 = -1;
        for (int i2 = 0; n2 != -1 && i2 < this.a; ++i2) {
            if (this.e[n2] == g2.b) {
                if (n2 == this.h) {
                    this.h = this.f[n2];
                } else {
                    int[] arrn = this.f;
                    arrn[n3] = arrn[n2];
                }
                if (bl) {
                    g2.b(this.b);
                }
                g2.l = -1 + g2.l;
                this.a = -1 + this.a;
                this.e[n2] = -1;
                if (this.j) {
                    this.i = n2;
                }
                return this.g[n2];
            }
            int n4 = this.f[n2];
            n3 = n2;
            n2 = n4;
        }
        return 0.0f;
    }

    public void e(g g2, float f2, boolean bl) {
        int[] arrn;
        int n2;
        int[] arrn2;
        if (f2 > -0.001f && f2 < 0.001f) {
            return;
        }
        int n3 = this.h;
        if (n3 == -1) {
            this.h = 0;
            this.g[0] = f2;
            this.e[0] = g2.b;
            this.f[0] = -1;
            g2.l = 1 + g2.l;
            g2.a(this.b);
            this.a = 1 + this.a;
            if (!this.j) {
                int n4;
                this.i = n4 = 1 + this.i;
                int[] arrn3 = this.e;
                if (n4 >= arrn3.length) {
                    this.j = true;
                    this.i = arrn3.length - 1;
                }
            }
            return;
        }
        int n5 = -1;
        for (int i2 = 0; n3 != -1 && i2 < this.a; ++i2) {
            int[] arrn4 = this.e;
            int n6 = arrn4[n3];
            int n7 = g2.b;
            if (n6 == n7) {
                float[] arrf = this.g;
                float f3 = f2 + arrf[n3];
                if (f3 > -0.001f && f3 < 0.001f) {
                    f3 = 0.0f;
                }
                arrf[n3] = f3;
                if (f3 == 0.0f) {
                    if (n3 == this.h) {
                        this.h = this.f[n3];
                    } else {
                        int[] arrn5 = this.f;
                        arrn5[n5] = arrn5[n3];
                    }
                    if (bl) {
                        g2.b(this.b);
                    }
                    if (this.j) {
                        this.i = n3;
                    }
                    --g2.l;
                    --this.a;
                }
                return;
            }
            if (arrn4[n3] < n7) {
                n5 = n3;
            }
            n3 = this.f[n3];
        }
        int n8 = this.i;
        int n9 = n8 + 1;
        if (this.j) {
            int[] arrn6 = this.e;
            if (arrn6[n8] != -1) {
                n8 = arrn6.length;
            }
        } else {
            n8 = n9;
        }
        int[] arrn7 = this.e;
        if (n8 >= arrn7.length && this.a < arrn7.length) {
            int[] arrn8;
            for (int i3 = 0; i3 < (arrn8 = this.e).length; ++i3) {
                if (arrn8[i3] != -1) continue;
                n8 = i3;
                break;
            }
        }
        if (n8 >= (arrn = this.e).length) {
            int n10;
            n8 = arrn.length;
            this.d = n10 = 2 * this.d;
            this.j = false;
            this.i = n8 - 1;
            this.g = Arrays.copyOf(this.g, n10);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[n8] = g2.b;
        this.g[n8] = f2;
        int[] arrn9 = this.f;
        if (n5 != -1) {
            arrn9[n8] = arrn9[n5];
            arrn9[n5] = n8;
        } else {
            arrn9[n8] = this.h;
            this.h = n8;
        }
        g2.l = 1 + g2.l;
        g2.a(this.b);
        this.a = 1 + this.a;
        if (!this.j) {
            this.i = 1 + this.i;
        }
        if ((n2 = this.i) >= (arrn2 = this.e).length) {
            this.j = true;
            this.i = arrn2.length - 1;
        }
    }

    public g f(int n2) {
        int n3 = this.h;
        for (int i2 = 0; n3 != -1 && i2 < this.a; ++i2) {
            if (i2 == n2) {
                return this.c.d[this.e[n3]];
            }
            n3 = this.f[n3];
        }
        return null;
    }

    public final float g(g g2) {
        int n2 = this.h;
        for (int i2 = 0; n2 != -1 && i2 < this.a; ++i2) {
            if (this.e[n2] == g2.b) {
                return this.g[n2];
            }
            n2 = this.f[n2];
        }
        return 0.0f;
    }

    public boolean h(g g2) {
        int n2 = this.h;
        if (n2 == -1) {
            return false;
        }
        for (int i2 = 0; n2 != -1 && i2 < this.a; ++i2) {
            if (this.e[n2] == g2.b) {
                return true;
            }
            n2 = this.f[n2];
        }
        return false;
    }

    public void i(float f2) {
        int n2 = this.h;
        for (int i2 = 0; n2 != -1 && i2 < this.a; ++i2) {
            float[] arrf = this.g;
            arrf[n2] = arrf[n2] / f2;
            n2 = this.f[n2];
        }
    }

    public void j() {
        int n2 = this.h;
        for (int i2 = 0; n2 != -1 && i2 < this.a; ++i2) {
            float[] arrf = this.g;
            arrf[n2] = -1.0f * arrf[n2];
            n2 = this.f[n2];
        }
    }

    public int k() {
        return this.a;
    }

    public String toString() {
        int n2 = this.h;
        String string = "";
        for (int i2 = 0; n2 != -1 && i2 < this.a; ++i2) {
            StringBuilder stringBuilder = d.a.b.a.a.d((String)d.a.b.a.a.m((String)string, (String)" -> "));
            stringBuilder.append(this.g[n2]);
            stringBuilder.append(" : ");
            StringBuilder stringBuilder2 = d.a.b.a.a.d((String)stringBuilder.toString());
            stringBuilder2.append((Object)this.c.d[this.e[n2]]);
            string = stringBuilder2.toString();
            n2 = this.f[n2];
        }
        return string;
    }
}

