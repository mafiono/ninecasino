/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.util.Log
 *  android.view.Gravity
 *  android.view.View
 *  c.h.h.c
 *  c.h.h.d
 *  c.h.h.d$c
 *  d.a.b.a.a
 *  d.c.a.e.c.a
 *  d.c.a.e.t.a
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Objects
 */
package d.c.a.e.r;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import c.h.h.d;
import d.c.a.e.r.h;
import d.c.a.e.t.a;
import java.util.Objects;

public final class c {
    public float A;
    public float B;
    public int[] C;
    public boolean D;
    public final TextPaint E;
    public final TextPaint F;
    public TimeInterpolator G;
    public TimeInterpolator H;
    public float I;
    public float J;
    public float K;
    public ColorStateList L;
    public StaticLayout M;
    public float N;
    public float O;
    public float P;
    public CharSequence Q;
    public final View a;
    public boolean b;
    public float c;
    public final Rect d;
    public final Rect e;
    public final RectF f;
    public int g = 16;
    public int h = 16;
    public float i = 15.0f;
    public float j = 15.0f;
    public ColorStateList k;
    public ColorStateList l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public a v;
    public CharSequence w;
    public CharSequence x;
    public boolean y;
    public Bitmap z;

    public c(View view) {
        TextPaint textPaint;
        this.a = view;
        this.E = textPaint = new TextPaint(129);
        this.F = new TextPaint(textPaint);
        this.e = new Rect();
        this.d = new Rect();
        this.f = new RectF();
    }

    public static int a(int n2, int n3, float f2) {
        float f3 = 1.0f - f2;
        float f4 = f3 * (float)Color.alpha(n2) + f2 * (float)Color.alpha(n3);
        float f5 = f3 * (float)Color.red(n2) + f2 * (float)Color.red(n3);
        float f6 = f3 * (float)Color.green(n2) + f2 * (float)Color.green(n3);
        float f7 = f3 * (float)Color.blue(n2) + f2 * (float)Color.blue(n3);
        return Color.argb((int)f4, (int)f5, (int)f6, (int)f7);
    }

    public static float i(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return d.a.b.a.a.a((float)f3, (float)f2, (float)f4, (float)f2);
    }

    public static boolean l(Rect rect, int n2, int n3, int n4, int n5) {
        return rect.left == n2 && rect.top == n3 && rect.right == n4 && rect.bottom == n5;
    }

    public float b() {
        if (this.w == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.F;
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
        TextPaint textPaint2 = this.F;
        CharSequence charSequence = this.w;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    public final boolean c(CharSequence charSequence) {
        int n2;
        View view = this.a;
        int n3 = view.getLayoutDirection();
        if (n3 != (n2 = 1)) {
            n2 = 0;
        }
        c.h.h.c c2 = n2 != 0 ? d.d : d.c;
        int n4 = charSequence.length();
        return ((d.c)c2).b(charSequence, 0, n4);
    }

    public final void d(float f2) {
        int n2;
        TextPaint textPaint;
        this.f.left = c.i(this.d.left, this.e.left, f2, this.G);
        this.f.top = c.i(this.m, this.n, f2, this.G);
        this.f.right = c.i(this.d.right, this.e.right, f2, this.G);
        this.f.bottom = c.i(this.d.bottom, this.e.bottom, f2, this.G);
        this.q = c.i(this.o, this.p, f2, this.G);
        this.r = c.i(this.m, this.n, f2, this.G);
        this.p(c.i(this.i, this.j, f2, this.H));
        float f3 = 1.0f - f2;
        TimeInterpolator timeInterpolator = d.c.a.e.c.a.b;
        this.N = 1.0f - c.i(0.0f, 1.0f, f3, timeInterpolator);
        View view = this.a;
        view.postInvalidateOnAnimation();
        this.O = c.i(1.0f, 0.0f, f2, timeInterpolator);
        this.a.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.l;
        ColorStateList colorStateList2 = this.k;
        if (colorStateList != colorStateList2) {
            textPaint = this.E;
            n2 = c.a(this.h(colorStateList2), this.g(), f2);
        } else {
            textPaint = this.E;
            n2 = this.g();
        }
        textPaint.setColor(n2);
        this.E.setShadowLayer(c.i(0.0f, this.I, f2, null), c.i(0.0f, this.J, f2, null), c.i(0.0f, this.K, f2, null), c.a(this.h(null), this.h(this.L), f2));
        this.a.postInvalidateOnAnimation();
    }

    public final void e(float f2) {
        boolean bl;
        float f3;
        if (this.w == null) {
            return;
        }
        float f4 = this.e.width();
        float f5 = this.d.width();
        boolean bl2 = Math.abs(f2 - this.j) < 0.001f;
        if (bl2) {
            f3 = this.j;
            this.A = 1.0f;
            Typeface typeface = this.u;
            Typeface typeface2 = this.s;
            if (typeface != typeface2) {
                this.u = typeface2;
                bl = true;
            } else {
                bl = false;
            }
        } else {
            float f6 = this.i;
            Typeface typeface = this.u;
            Typeface typeface3 = this.t;
            if (typeface != typeface3) {
                this.u = typeface3;
                bl = true;
            } else {
                bl = false;
            }
            boolean bl3 = Math.abs(f2 - f6) < 0.001f;
            this.A = bl3 ? 1.0f : f2 / this.i;
            float f7 = this.j / this.i;
            f4 = f5 * f7 > f4 ? Math.min(f4 / f7, f5) : f5;
            f3 = f6;
        }
        if (f4 > 0.0f) {
            bl = this.B != f3 || this.D || bl;
            this.B = f3;
            this.D = false;
        }
        if (this.x == null || bl) {
            StaticLayout staticLayout;
            boolean bl4;
            this.E.setTextSize(this.B);
            this.E.setTypeface(this.u);
            TextPaint textPaint = this.E;
            boolean bl5 = this.A != 1.0f;
            textPaint.setLinearText(bl5);
            this.y = bl4 = this.c(this.w);
            try {
                h h2 = new h(this.w, this.E, (int)f4);
                h2.i = TextUtils.TruncateAt.END;
                h2.h = bl4;
                h2.e = Layout.Alignment.ALIGN_NORMAL;
                h2.g = false;
                h2.f = 1;
                staticLayout = h2.a();
            }
            catch (h.a a2) {
                Log.e("CollapsingTextHelper", a2.getCause().getMessage(), a2);
                staticLayout = null;
            }
            Objects.requireNonNull(staticLayout);
            this.M = staticLayout;
            this.x = staticLayout.getText();
        }
    }

    public float f() {
        TextPaint textPaint = this.F;
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
        return -this.F.ascent();
    }

    public int g() {
        return this.h(this.l);
    }

    public final int h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] arrn = this.C;
        if (arrn != null) {
            return colorStateList.getColorForState(arrn, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public void j() {
        boolean bl = this.e.width() > 0 && this.e.height() > 0 && this.d.width() > 0 && this.d.height() > 0;
        this.b = bl;
    }

    public void k() {
        block7 : {
            float f2;
            float f3;
            block18 : {
                float f4;
                float f5;
                block19 : {
                    block16 : {
                        block17 : {
                            int n2;
                            block14 : {
                                float f6;
                                block15 : {
                                    block12 : {
                                        float f7;
                                        block13 : {
                                            block10 : {
                                                float f8;
                                                float f9;
                                                block11 : {
                                                    block8 : {
                                                        block9 : {
                                                            StaticLayout staticLayout;
                                                            CharSequence charSequence;
                                                            if (this.a.getHeight() <= 0 || this.a.getWidth() <= 0) break block7;
                                                            f3 = this.B;
                                                            this.e(this.j);
                                                            CharSequence charSequence2 = this.x;
                                                            if (charSequence2 != null && (staticLayout = this.M) != null) {
                                                                this.Q = TextUtils.ellipsize(charSequence2, this.E, (float)staticLayout.getWidth(), TextUtils.TruncateAt.END);
                                                            }
                                                            f8 = (charSequence = this.Q) != null ? this.E.measureText(charSequence, 0, charSequence.length()) : 0.0f;
                                                            int n3 = Gravity.getAbsoluteGravity(this.h, (int)this.y);
                                                            int n4 = n3 & 112;
                                                            if (n4 != 48) {
                                                                float f10;
                                                                if (n4 != 80) {
                                                                    float f11 = (this.E.descent() - this.E.ascent()) / 2.0f;
                                                                    f10 = (float)this.e.centerY() - f11;
                                                                } else {
                                                                    f10 = (float)this.e.bottom + this.E.ascent();
                                                                }
                                                                this.n = f10;
                                                            } else {
                                                                this.n = this.e.top;
                                                            }
                                                            int n5 = n3 & 8388615;
                                                            if (n5 == 1) break block8;
                                                            if (n5 == 5) break block9;
                                                            this.p = this.e.left;
                                                            break block10;
                                                        }
                                                        f9 = this.e.right;
                                                        break block11;
                                                    }
                                                    f9 = this.e.centerX();
                                                    f8 /= 2.0f;
                                                }
                                                this.p = f9 - f8;
                                            }
                                            this.e(this.i);
                                            StaticLayout staticLayout = this.M;
                                            f7 = staticLayout != null ? (float)staticLayout.getHeight() : 0.0f;
                                            CharSequence charSequence = this.x;
                                            f5 = charSequence != null ? this.E.measureText(charSequence, 0, charSequence.length()) : 0.0f;
                                            StaticLayout staticLayout2 = this.M;
                                            float f12 = 0.0f;
                                            if (staticLayout2 != null) {
                                                f12 = staticLayout2.getLineLeft(0);
                                            }
                                            this.P = f12;
                                            n2 = Gravity.getAbsoluteGravity(this.g, (int)this.y);
                                            int n6 = n2 & 112;
                                            if (n6 == 48) break block12;
                                            if (n6 == 80) break block13;
                                            float f13 = f7 / 2.0f;
                                            this.m = (float)this.d.centerY() - f13;
                                            break block14;
                                        }
                                        f6 = (float)this.d.bottom - f7 + this.E.descent();
                                        break block15;
                                    }
                                    f6 = this.d.top;
                                }
                                this.m = f6;
                            }
                            int n7 = n2 & 8388615;
                            if (n7 == 1) break block16;
                            if (n7 == 5) break block17;
                            f2 = this.d.left;
                            break block18;
                        }
                        f4 = this.d.right;
                        break block19;
                    }
                    f4 = this.d.centerX();
                    f5 /= 2.0f;
                }
                f2 = f4 - f5;
            }
            this.o = f2;
            Bitmap bitmap = this.z;
            if (bitmap != null) {
                bitmap.recycle();
                this.z = null;
            }
            this.p(f3);
            this.d(this.c);
        }
    }

    public void m(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            this.k();
        }
    }

    public void n(int n2) {
        if (this.h != n2) {
            this.h = n2;
            this.k();
        }
    }

    public void o(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.c) {
            this.c = f2;
            this.d(f2);
        }
    }

    public final void p(float f2) {
        this.e(f2);
        View view = this.a;
        view.postInvalidateOnAnimation();
    }

    public void q(Typeface typeface) {
        boolean bl;
        a a2 = this.v;
        boolean bl2 = true;
        if (a2 != null) {
            a2.c = bl2;
        }
        if (this.s != typeface) {
            this.s = typeface;
            bl = true;
        } else {
            bl = false;
        }
        if (this.t != typeface) {
            this.t = typeface;
        } else {
            bl2 = false;
        }
        if (bl || bl2) {
            this.k();
        }
    }
}

