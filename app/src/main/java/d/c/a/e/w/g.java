/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Outline
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Region
 *  android.graphics.Region$Op
 *  android.graphics.Xfermode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  c.h.d.a
 *  c.h.d.l.a
 *  d.c.a.e.a
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.BitSet
 *  java.util.Objects
 */
package d.c.a.e.w;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import d.c.a.e.w.c;
import d.c.a.e.w.h;
import d.c.a.e.w.j;
import d.c.a.e.w.k;
import d.c.a.e.w.m;
import d.c.a.e.w.n;
import java.util.BitSet;
import java.util.Objects;

public class g
extends Drawable
implements c.h.d.l.a,
n {
    public static final String A = g.class.getSimpleName();
    public static final Paint B = new Paint(1);
    public b e;
    public final m.f[] f = new m.f[4];
    public final m.f[] g = new m.f[4];
    public final BitSet h = new BitSet(8);
    public boolean i;
    public final Matrix j = new Matrix();
    public final Path k = new Path();
    public final Path l = new Path();
    public final RectF m = new RectF();
    public final RectF n = new RectF();
    public final Region o = new Region();
    public final Region p = new Region();
    public j q;
    public final Paint r;
    public final Paint s;
    public final d.c.a.e.v.a t;
    public final k.a u;
    public final k v;
    public PorterDuffColorFilter w;
    public PorterDuffColorFilter x;
    public final RectF y;
    public boolean z;

    public g() {
        this(new j());
    }

    public g(b b3) {
        Paint paint;
        Paint paint2;
        this.r = paint = new Paint(1);
        this.s = paint2 = new Paint(1);
        this.t = new d.c.a.e.v.a();
        this.v = new k();
        this.y = new RectF();
        this.z = true;
        this.e = b3;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = B;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.v();
        this.u(this.getState());
        this.u = new k.a(){};
    }

    public g(j j2) {
        this(new ConstantState(j2, null){
            public j a;
            public d.c.a.e.o.a b;
            public final ColorFilter c;
            public ColorStateList d = null;
            public ColorStateList e = null;
            public ColorStateList f = null;
            public ColorStateList g = null;
            public PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
            public Rect i = null;
            public float j = 1.0f;
            public float k = 1.0f;
            public final float l;
            public int m = 255;
            public float n = 0.0f;
            public float o = 0.0f;
            public float p = 0.0f;
            public int q = 0;
            public int r = 0;
            public int s = 0;
            public int t = 0;
            public boolean u = false;
            public Paint.Style v = Paint.Style.FILL_AND_STROKE;
            {
                this.a = b3.a;
                this.b = b3.b;
                this.l = b3.l;
                this.c = b3.c;
                this.d = b3.d;
                this.e = b3.e;
                this.h = b3.h;
                this.g = b3.g;
                this.m = b3.m;
                this.j = b3.j;
                this.s = b3.s;
                this.q = b3.q;
                this.u = b3.u;
                this.k = b3.k;
                this.n = b3.n;
                this.o = b3.o;
                this.p = b3.p;
                this.r = b3.r;
                this.t = b3.t;
                this.f = b3.f;
                this.v = b3.v;
                if (b3.i != null) {
                    this.i = new Rect(b3.i);
                }
            }
            {
                this.a = j2;
                this.b = null;
            }

            public int getChangingConfigurations() {
                return 0;
            }

            public Drawable newDrawable() {
                g g2 = new g(this);
                g2.i = true;
                return g2;
            }
        });
    }

    public final void b(RectF rectF, Path path) {
        this.c(rectF, path);
        if (this.e.j != 1.0f) {
            this.j.reset();
            Matrix matrix = this.j;
            float f2 = this.e.j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.j);
        }
        path.computeBounds(this.y, true);
    }

    public final void c(RectF rectF, Path path) {
        k k4 = this.v;
        b b3 = this.e;
        k4.a(b3.a, b3.k, rectF, this.u, path);
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean bl) {
        int n2;
        int n3;
        if (colorStateList != null && mode != null) {
            int n4 = colorStateList.getColorForState(this.getState(), 0);
            if (bl) {
                n4 = this.e(n4);
            }
            return new PorterDuffColorFilter(n4, mode);
        }
        PorterDuffColorFilter porterDuffColorFilter = bl && (n3 = this.e(n2 = paint.getColor())) != n2 ? new PorterDuffColorFilter(n3, PorterDuff.Mode.SRC_IN) : null;
        return porterDuffColorFilter;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void draw(Canvas var1_1) {
        block17 : {
            block16 : {
                this.r.setColorFilter(this.w);
                var3_2 = this.r.getAlpha();
                var4_3 = this.r;
                var5_4 = this.e.m;
                var4_3.setAlpha(var3_2 * (var5_4 + (var5_4 >>> 7)) >>> 8);
                this.s.setColorFilter(this.x);
                this.s.setStrokeWidth(this.e.l);
                var7_5 = this.s.getAlpha();
                var8_6 = this.s;
                var9_7 = this.e.m;
                var8_6.setAlpha(var7_5 * (var9_7 + (var9_7 >>> 7)) >>> 8);
                if (this.i) {
                    var35_8 = -this.k();
                    var36_9 = this.e.a;
                    Objects.requireNonNull(var36_9);
                    var38_10 = new j.b(var36_9);
                    var39_11 = var36_9.e;
                    if (!(var39_11 instanceof h)) {
                        var39_11 = new b(var35_8, var39_11);
                    }
                    var38_10.e = var39_11;
                    var40_12 = var36_9.f;
                    if (!(var40_12 instanceof h)) {
                        var40_12 = new b(var35_8, var40_12);
                    }
                    var38_10.f = var40_12;
                    var41_13 = var36_9.h;
                    if (!(var41_13 instanceof h)) {
                        var41_13 = new b(var35_8, var41_13);
                    }
                    var38_10.h = var41_13;
                    var42_14 = var36_9.g;
                    if (!(var42_14 instanceof h)) {
                        var42_14 = new b(var35_8, var42_14);
                    }
                    var38_10.g = var42_14;
                    this.q = var43_15 = var38_10.a();
                    var44_16 = this.v;
                    var45_17 = this.e.k;
                    this.n.set(this.h());
                    var46_18 = this.k();
                    this.n.inset(var46_18, var46_18);
                    var44_16.a(var43_15, var45_17, this.n, null, this.l);
                    this.b(this.h(), this.k);
                    this.i = false;
                }
                var10_19 = Build.VERSION.SDK_INT;
                var11_20 = this.e;
                var12_21 = var11_20.q;
                if (var12_21 == 1 || var11_20.r <= 0) ** GOTO lbl-1000
                if (var12_21 == 2) ** GOTO lbl-1000
                var34_22 = var10_19 < 21 || !var11_20.a.d(this.h()) && !this.k.isConvex() && var10_19 < 29;
                if (var34_22) lbl-1000: // 2 sources:
                {
                    var13_23 = true;
                } else lbl-1000: // 2 sources:
                {
                    var13_23 = false;
                }
                if (var13_23) {
                    var1_1.save();
                    var15_24 = this.i();
                    var16_25 = this.j();
                    if (var10_19 < 21 && this.z) {
                        var31_26 = var1_1.getClipBounds();
                        var32_27 = -this.e.r;
                        var31_26.inset(var32_27, var32_27);
                        var31_26.offset(var15_24, var16_25);
                        var1_1.clipRect(var31_26, Region.Op.REPLACE);
                    }
                    var1_1.translate((float)var15_24, (float)var16_25);
                    if (!this.z) {
                        this.f(var1_1);
                    } else {
                        var17_28 = (int)(this.y.width() - (float)this.getBounds().width());
                        var18_29 = (int)(this.y.height() - (float)this.getBounds().height());
                        if (var17_28 < 0) throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        if (var18_29 < 0) throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        var19_30 = Bitmap.createBitmap((int)(var17_28 + ((int)this.y.width() + 2 * this.e.r)), (int)(var18_29 + ((int)this.y.height() + 2 * this.e.r)), Bitmap.Config.ARGB_8888);
                        var20_31 = new Canvas(var19_30);
                        var21_32 = this.getBounds().left - this.e.r - var17_28;
                        var22_33 = this.getBounds().top - this.e.r - var18_29;
                        var20_31.translate(-var21_32, -var22_33);
                        this.f(var20_31);
                        var1_1.drawBitmap(var19_30, var21_32, var22_33, null);
                        var19_30.recycle();
                    }
                    var1_1.restore();
                }
                var23_34 = this.e;
                var24_35 = var23_34.v;
                if (var24_35 == Paint.Style.FILL_AND_STROKE) break block16;
                var30_36 = Paint.Style.FILL;
                var25_37 = false;
                if (var24_35 != var30_36) break block17;
            }
            var25_37 = true;
        }
        if (var25_37) {
            this.g(var1_1, this.r, this.k, var23_34.a, this.h());
        }
        if (this.m()) {
            var26_38 = this.s;
            var27_39 = this.l;
            var28_40 = this.q;
            this.n.set(this.h());
            var29_41 = this.k();
            this.n.inset(var29_41, var29_41);
            this.g(var1_1, var26_38, var27_39, var28_40, this.n);
        }
        this.r.setAlpha(var3_2);
        this.s.setAlpha(var7_5);
    }

    public final int e(int n2) {
        boolean bl;
        b b3 = this.e;
        float f2 = b3.o + b3.p + b3.n;
        d.c.a.e.o.a a2 = b3.b;
        if (a2 != null && a2.a && (bl = c.h.d.a.c((int)n2, (int)255) == a2.c)) {
            float f3 = a2.d;
            float f5 = f3 FCMPG 0.0f;
            float f8 = 0.0f;
            if (f5 > 0) {
                f8 = f2 <= 0.0f ? 0.0f : Math.min((2.0f + 4.5f * (float)Math.log1p(f2 / f3)) / 100.0f, 1.0f);
            }
            int n3 = Color.alpha(n2);
            n2 = c.h.d.a.c((int)d.c.a.e.a.X((int)c.h.d.a.c((int)n2, (int)255), (int)a2.b, (float)f8), (int)n3);
        }
        return n2;
    }

    public final void f(Canvas canvas) {
        if (this.h.cardinality() > 0) {
            Log.w(A, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.e.s != 0) {
            canvas.drawPath(this.k, this.t.a);
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            m.f f2 = this.f[i2];
            d.c.a.e.v.a a2 = this.t;
            int n2 = this.e.r;
            Matrix matrix = m.f.a;
            f2.a(matrix, a2, n2, canvas);
            this.g[i2].a(matrix, this.t, this.e.r, canvas);
        }
        if (this.z) {
            int n3 = this.i();
            int n4 = this.j();
            canvas.translate((float)(-n3), (float)(-n4));
            canvas.drawPath(this.k, B);
            canvas.translate((float)n3, (float)n4);
        }
    }

    public final void g(Canvas canvas, Paint paint, Path path, j j2, RectF rectF) {
        if (j2.d(rectF)) {
            float f2 = j2.f.a(rectF) * this.e.k;
            canvas.drawRoundRect(rectF, f2, f2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public ConstantState getConstantState() {
        return this.e;
    }

    public int getOpacity() {
        return -3;
    }

    /*
     * Exception decompiling
     */
    @TargetApi(value=21)
    public void getOutline(Outline var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.e.i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    public Region getTransparentRegion() {
        Rect rect = this.getBounds();
        this.o.set(rect);
        this.b(this.h(), this.k);
        this.p.setPath(this.k, this.o);
        this.o.op(this.p, Region.Op.DIFFERENCE);
        return this.o;
    }

    public RectF h() {
        this.m.set(this.getBounds());
        return this.m;
    }

    public int i() {
        b b3 = this.e;
        double d3 = b3.s;
        double d4 = Math.sin(Math.toRadians((double)b3.t));
        Double.isNaN(d3);
        return (int)(d4 * d3);
    }

    public void invalidateSelf() {
        this.i = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || (colorStateList4 = this.e.g) != null && colorStateList4.isStateful() || (colorStateList3 = this.e.f) != null && colorStateList3.isStateful() || (colorStateList2 = this.e.e) != null && colorStateList2.isStateful() || (colorStateList = this.e.d) != null && colorStateList.isStateful();
        {
        }
    }

    public int j() {
        b b3 = this.e;
        double d3 = b3.s;
        double d4 = Math.cos(Math.toRadians((double)b3.t));
        Double.isNaN(d3);
        return (int)(d4 * d3);
    }

    public final float k() {
        if (this.m()) {
            return this.s.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float l() {
        return this.e.a.e.a(this.h());
    }

    public final boolean m() {
        Paint.Style style = this.e.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.s.getStrokeWidth() > 0.0f;
    }

    public Drawable mutate() {
        this.e = new /* invalid duplicate definition of identical inner class */;
        return this;
    }

    public void n(Context context) {
        this.e.b = new d.c.a.e.o.a(context);
        this.w();
    }

    public void o(float f2) {
        b b3 = this.e;
        if (b3.o != f2) {
            b3.o = f2;
            this.w();
        }
    }

    public void onBoundsChange(Rect rect) {
        this.i = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] arrn) {
        boolean bl = this.u(arrn);
        boolean bl2 = this.v();
        boolean bl3 = bl || bl2;
        if (bl3) {
            this.invalidateSelf();
        }
        return bl3;
    }

    public void p(ColorStateList colorStateList) {
        b b3 = this.e;
        if (b3.d != colorStateList) {
            b3.d = colorStateList;
            this.onStateChange(this.getState());
        }
    }

    public void q(float f2) {
        b b3 = this.e;
        if (b3.k != f2) {
            b3.k = f2;
            this.i = true;
            this.invalidateSelf();
        }
    }

    public void r(float f2, int n2) {
        this.e.l = f2;
        this.invalidateSelf();
        this.t(ColorStateList.valueOf(n2));
    }

    public void s(float f2, ColorStateList colorStateList) {
        this.e.l = f2;
        this.invalidateSelf();
        this.t(colorStateList);
    }

    public void setAlpha(int n2) {
        b b3 = this.e;
        if (b3.m != n2) {
            b3.m = n2;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.e.c = colorFilter;
        super.invalidateSelf();
    }

    @Override
    public void setShapeAppearanceModel(j j2) {
        this.e.a = j2;
        this.invalidateSelf();
    }

    public void setTint(int n2) {
        this.setTintList(ColorStateList.valueOf(n2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.e.g = colorStateList;
        this.v();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        b b3 = this.e;
        if (b3.h != mode) {
            b3.h = mode;
            this.v();
            super.invalidateSelf();
        }
    }

    public void t(ColorStateList colorStateList) {
        b b3 = this.e;
        if (b3.e != colorStateList) {
            b3.e = colorStateList;
            this.onStateChange(this.getState());
        }
    }

    public final boolean u(int[] arrn) {
        int n2;
        int n3;
        boolean bl;
        int n4;
        int n5;
        if (this.e.d != null && (n3 = this.r.getColor()) != (n5 = this.e.d.getColorForState(arrn, n3))) {
            this.r.setColor(n5);
            bl = true;
        } else {
            bl = false;
        }
        if (this.e.e != null && (n2 = this.s.getColor()) != (n4 = this.e.e.getColorForState(arrn, n2))) {
            this.s.setColor(n4);
            return true;
        }
        return bl;
    }

    public final boolean v() {
        PorterDuffColorFilter porterDuffColorFilter = this.w;
        PorterDuffColorFilter porterDuffColorFilter2 = this.x;
        b b3 = this.e;
        ColorStateList colorStateList = b3.g;
        PorterDuff.Mode mode = b3.h;
        Paint paint = this.r;
        boolean bl = true;
        this.w = this.d(colorStateList, mode, paint, bl);
        b b4 = this.e;
        this.x = this.d(b4.f, b4.h, this.s, false);
        b b6 = this.e;
        if (b6.u) {
            this.t.a(b6.g.getColorForState(this.getState(), 0));
        }
        if (Objects.equals(porterDuffColorFilter, this.w)) {
            if (!Objects.equals(porterDuffColorFilter2, this.x)) {
                return bl;
            }
            bl = false;
        }
        return bl;
    }

    public final void w() {
        b b3 = this.e;
        float f2 = b3.o + b3.p;
        b3.r = (int)Math.ceil(0.75f * f2);
        this.e.s = (int)Math.ceil(f2 * 0.25f);
        this.v();
        super.invalidateSelf();
    }

}

