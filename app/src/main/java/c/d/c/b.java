/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  androidx.cardview.widget.CardView
 *  androidx.cardview.widget.CardView$a
 *  c.d.c.d
 *  c.d.c.e
 *  c.d.c.f
 *  c.d.c.g
 *  java.lang.Math
 *  java.lang.Object
 */
package c.d.c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;
import c.d.c.d;
import c.d.c.e;
import c.d.c.f;
import c.d.c.g;

public class b
implements e {
    public float a(d d2) {
        return this.o(d2).e;
    }

    public float b(d d2) {
        return this.o(d2).a;
    }

    public float c(d d2) {
        return 2.0f * this.o(d2).a;
    }

    public float d(d d2) {
        return 2.0f * this.o(d2).a;
    }

    public void e(d d2) {
        this.m(d2, this.o(d2).e);
    }

    public ColorStateList f(d d2) {
        return this.o(d2).h;
    }

    public void g(d d2, float f2) {
        ((CardView.a)d2).b.setElevation(f2);
    }

    public void h(d d2, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        f f5 = new f(colorStateList, f2);
        CardView.a a2 = (CardView.a)d2;
        a2.a = f5;
        a2.b.setBackgroundDrawable((Drawable)f5);
        CardView cardView = a2.b;
        cardView.setClipToOutline(true);
        cardView.setElevation(f3);
        this.m(d2, f4);
    }

    public void i(d d2, float f2) {
        f f3 = this.o(d2);
        if (f2 == f3.a) {
            return;
        }
        f3.a = f2;
        f3.c(null);
        f3.invalidateSelf();
    }

    public void j(d d2) {
        this.m(d2, this.o(d2).e);
    }

    public void k(d d2, ColorStateList colorStateList) {
        f f2 = this.o(d2);
        f2.b(colorStateList);
        f2.invalidateSelf();
    }

    public float l(d d2) {
        return ((CardView.a)d2).b.getElevation();
    }

    public void m(d d2, float f2) {
        f f3 = this.o(d2);
        CardView.a a2 = (CardView.a)d2;
        boolean bl = a2.b.getUseCompatPadding();
        boolean bl2 = a2.a();
        if (f2 != f3.e || f3.f != bl || f3.g != bl2) {
            f3.e = f2;
            f3.f = bl;
            f3.g = bl2;
            f3.c(null);
            f3.invalidateSelf();
        }
        if (!a2.b.getUseCompatPadding()) {
            a2.b(0, 0, 0, 0);
            return;
        }
        float f4 = this.o(d2).e;
        float f5 = this.o(d2).a;
        int n2 = (int)Math.ceil((double)g.a((float)f4, (float)f5, (boolean)a2.a()));
        int n3 = (int)Math.ceil((double)g.b((float)f4, (float)f5, (boolean)a2.a()));
        a2.b(n2, n3, n2, n3);
    }

    public void n() {
    }

    public final f o(d d2) {
        return (f)((CardView.a)d2).a;
    }
}

