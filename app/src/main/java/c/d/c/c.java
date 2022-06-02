/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  androidx.cardview.widget.CardView
 *  androidx.cardview.widget.CardView$a
 *  c.d.c.d
 *  c.d.c.e
 *  c.d.c.g
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 */
package c.d.c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;
import c.d.c.d;
import c.d.c.e;
import c.d.c.g;
import java.util.Objects;

public class c
implements e {
    public final RectF a = new RectF();

    public float a(d d2) {
        return this.o(d2).h;
    }

    public float b(d d2) {
        return this.o(d2).f;
    }

    public float c(d d2) {
        g g2 = this.o(d2);
        float f2 = g2.h;
        return 2.0f * Math.max(f2, (float)(g2.f + (float)g2.a + f2 * 1.5f / 2.0f)) + 2.0f * (1.5f * g2.h + (float)g2.a);
    }

    public float d(d d2) {
        g g2 = this.o(d2);
        float f2 = g2.h;
        return 2.0f * Math.max(f2, (float)(g2.f + (float)g2.a + f2 / 2.0f)) + 2.0f * (g2.h + (float)g2.a);
    }

    public void e(d d2) {
    }

    public ColorStateList f(d d2) {
        return this.o(d2).k;
    }

    public void g(d d2, float f2) {
        g g2 = this.o(d2);
        g2.d(f2, g2.h);
    }

    public void h(d d2, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        g g2 = new g(context.getResources(), colorStateList, f2, f3, f4);
        CardView.a a2 = (CardView.a)d2;
        g2.o = a2.a();
        g2.invalidateSelf();
        a2.a = g2;
        a2.b.setBackgroundDrawable((Drawable)g2);
        this.p((d)a2);
    }

    public void i(d d2, float f2) {
        g g2 = this.o(d2);
        Objects.requireNonNull(g2);
        if (!(f2 < 0.0f)) {
            float f3 = (int)(f2 + 0.5f);
            if (g2.f != f3) {
                g2.f = f3;
                g2.l = true;
                g2.invalidateSelf();
            }
            this.p(d2);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid radius ");
        stringBuilder.append(f2);
        stringBuilder.append(". Must be >= 0");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void j(d d2) {
        g g2 = this.o(d2);
        CardView.a a2 = (CardView.a)d2;
        g2.o = a2.a();
        g2.invalidateSelf();
        this.p((d)a2);
    }

    public void k(d d2, ColorStateList colorStateList) {
        g g2 = this.o(d2);
        g2.c(colorStateList);
        g2.invalidateSelf();
    }

    public float l(d d2) {
        return this.o(d2).j;
    }

    public void m(d d2, float f2) {
        g g2 = this.o(d2);
        g2.d(g2.j, f2);
        this.p(d2);
    }

    public final g o(d d2) {
        return (g)((CardView.a)d2).a;
    }

    public void p(d d2) {
        Rect rect = new Rect();
        this.o(d2).getPadding(rect);
        int n2 = (int)Math.ceil(this.d(d2));
        int n3 = (int)Math.ceil(this.c(d2));
        CardView.a a2 = (CardView.a)d2;
        CardView cardView = a2.b;
        if (n2 > cardView.g) {
            CardView.d((CardView)cardView, (int)n2);
        }
        CardView cardView2 = a2.b;
        if (n3 > cardView2.h) {
            CardView.e((CardView)cardView2, (int)n3);
        }
        int n4 = rect.left;
        int n5 = rect.top;
        int n6 = rect.right;
        int n7 = rect.bottom;
        ((CardView.a)d2).b(n4, n5, n6, n7);
    }
}

