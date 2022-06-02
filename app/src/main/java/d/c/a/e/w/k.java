/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.Path$Op
 *  android.graphics.PointF
 *  android.graphics.RectF
 *  d.c.a.e.w.g
 *  d.c.a.e.w.g$a
 *  d.c.a.e.w.l
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.BitSet
 *  java.util.Collection
 *  java.util.List
 *  java.util.Objects
 */
package d.c.a.e.w;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import d.c.a.e.w.c;
import d.c.a.e.w.d;
import d.c.a.e.w.f;
import d.c.a.e.w.g;
import d.c.a.e.w.j;
import d.c.a.e.w.l;
import d.c.a.e.w.m;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class k {
    public final m[] a = new m[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final m g = new m();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public boolean j = true;

    public k() {
        for (int i2 = 0; i2 < 4; ++i2) {
            this.a[i2] = new m();
            this.b[i2] = new Matrix();
            this.c[i2] = new Matrix();
        }
    }

    public void a(j j2, float f2, RectF rectF, a a2, Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        int n2 = 0;
        while (n2 < 4) {
            float f3;
            float f4;
            float f5;
            int n3;
            PointF pointF;
            block13 : {
                block14 : {
                    block11 : {
                        block12 : {
                            c c2 = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? j2.f : j2.e) : j2.h) : j2.g;
                            d d2 = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? j2.b : j2.a) : j2.d) : j2.c;
                            m m2 = this.a[n2];
                            Objects.requireNonNull((Object)d2);
                            d2.a(m2, 90.0f, f2, c2.a(rectF));
                            n3 = n2 + 1;
                            f3 = n3 * 90;
                            this.b[n2].reset();
                            pointF = this.d;
                            if (n2 == 1) break block11;
                            if (n2 == 2) break block12;
                            f5 = n2 != 3 ? rectF.right : rectF.left;
                            f4 = rectF.top;
                            break block13;
                        }
                        f5 = rectF.left;
                        break block14;
                    }
                    f5 = rectF.right;
                }
                f4 = rectF.bottom;
            }
            pointF.set(f5, f4);
            Matrix matrix = this.b[n2];
            PointF pointF2 = this.d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.b[n2].preRotate(f3);
            float[] arrf = this.h;
            m[] arrm = this.a;
            arrf[0] = arrm[n2].c;
            arrf[1] = arrm[n2].d;
            this.b[n2].mapPoints(arrf);
            this.c[n2].reset();
            Matrix matrix2 = this.c[n2];
            float[] arrf2 = this.h;
            matrix2.setTranslate(arrf2[0], arrf2[1]);
            this.c[n2].preRotate(f3);
            n2 = n3;
        }
        int n4 = 0;
        while (n4 < 4) {
            m m3;
            float f6;
            float f7;
            Path path2;
            Matrix matrix;
            float[] arrf = this.h;
            m[] arrm = this.a;
            arrf[0] = arrm[n4].a;
            arrf[1] = arrm[n4].b;
            this.b[n4].mapPoints(arrf);
            float[] arrf3 = this.h;
            if (n4 == 0) {
                path.moveTo(arrf3[0], arrf3[1]);
            } else {
                path.lineTo(arrf3[0], arrf3[1]);
            }
            this.a[n4].c(this.b[n4], path);
            if (a2 != null) {
                m m4 = this.a[n4];
                Matrix matrix3 = this.b[n4];
                g.a a3 = (g.a)a2;
                BitSet bitSet = a3.a.h;
                Objects.requireNonNull((Object)m4);
                bitSet.set(n4, false);
                m.f[] arrf4 = a3.a.f;
                m4.b(m4.f);
                arrf4[n4] = new l(m4, new ArrayList(m4.h), matrix3);
            }
            int n5 = n4 + 1;
            int n6 = n5 % 4;
            float[] arrf5 = this.h;
            m[] arrm2 = this.a;
            arrf5[0] = arrm2[n4].c;
            arrf5[1] = arrm2[n4].d;
            this.b[n4].mapPoints(arrf5);
            float[] arrf6 = this.i;
            m[] arrm3 = this.a;
            arrf6[0] = arrm3[n6].a;
            arrf6[1] = arrm3[n6].b;
            this.b[n6].mapPoints(arrf6);
            float[] arrf7 = this.h;
            float f8 = arrf7[0];
            float[] arrf8 = this.i;
            float f9 = Math.max((float)Math.hypot(f8 - arrf8[0], arrf7[1] - arrf8[1]) - 0.001f, 0.0f);
            float[] arrf9 = this.h;
            m[] arrm4 = this.a;
            arrf9[0] = arrm4[n4].c;
            arrf9[1] = arrm4[n4].d;
            this.b[n4].mapPoints(arrf9);
            if (n4 != 1 && n4 != 3) {
                f7 = rectF.centerY();
                f6 = this.h[1];
            } else {
                f7 = rectF.centerX();
                f6 = this.h[0];
            }
            float f10 = Math.abs(f7 - f6);
            this.g.e(0.0f, 0.0f, 270.0f, 0.0f);
            f f11 = n4 != 1 ? (n4 != 2 ? (n4 != 3 ? j2.j : j2.i) : j2.l) : j2.k;
            f11.b(f9, f10, f2, this.g);
            Path path3 = new Path();
            this.g.c(this.c[n4], path3);
            if (this.j && (this.b(path3, n4) || this.b(path3, n6))) {
                path3.op(path3, this.f, Path.Op.DIFFERENCE);
                float[] arrf10 = this.h;
                m m5 = this.g;
                arrf10[0] = m5.a;
                arrf10[1] = m5.b;
                this.c[n4].mapPoints(arrf10);
                Path path4 = this.e;
                float[] arrf11 = this.h;
                path4.moveTo(arrf11[0], arrf11[1]);
                m3 = this.g;
                matrix = this.c[n4];
                path2 = this.e;
            } else {
                m3 = this.g;
                matrix = this.c[n4];
                path2 = path;
            }
            m3.c(matrix, path2);
            if (a2 != null) {
                m m6 = this.g;
                Matrix matrix4 = this.c[n4];
                g.a a4 = (g.a)a2;
                BitSet bitSet = a4.a.h;
                int n7 = n4 + 4;
                Objects.requireNonNull((Object)m6);
                bitSet.set(n7, false);
                m.f[] arrf12 = a4.a.g;
                m6.b(m6.f);
                arrf12[n4] = new l(m6, new ArrayList(m6.h), matrix4);
            }
            n4 = n5;
        }
        path.close();
        this.e.close();
        if (!this.e.isEmpty()) {
            path.op(this.e, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int n2) {
        Path path2 = new Path();
        this.a[n2].c(this.b[n2], path2);
        RectF rectF = new RectF();
        boolean bl = true;
        path.computeBounds(rectF, bl);
        path2.computeBounds(rectF, bl);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, bl);
        if (rectF.isEmpty()) {
            if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
                return bl;
            }
            bl = false;
        }
        return bl;
    }

    public interface a {
    }

}

