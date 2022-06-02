/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ProgressBar
 *  android.widget.SeekBar
 *  c.b.b
 *  c.b.h.d0
 *  c.b.h.p
 *  c.b.h.w0
 *  c.h.b.g
 *  c.h.j.n
 */
package c.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import c.b.b;
import c.b.h.d0;
import c.b.h.p;
import c.b.h.w0;
import c.h.b.g;
import c.h.j.n;

public class t
extends p {
    public final SeekBar d;
    public Drawable e;
    public ColorStateList f = null;
    public PorterDuff.Mode g = null;
    public boolean h = false;
    public boolean i = false;

    public t(SeekBar seekBar) {
        super((ProgressBar)seekBar);
        this.d = seekBar;
    }

    public void a(AttributeSet attributeSet, int n2) {
        super.a(attributeSet, n2);
        Context context = this.d.getContext();
        int[] arrn = b.g;
        w0 w02 = w0.q((Context)context, (AttributeSet)attributeSet, (int[])arrn, (int)n2, (int)0);
        SeekBar seekBar = this.d;
        n.s((View)seekBar, (Context)seekBar.getContext(), (int[])arrn, (AttributeSet)attributeSet, (TypedArray)w02.b, (int)n2, (int)0);
        Drawable drawable = w02.h(0);
        if (drawable != null) {
            this.d.setThumb(drawable);
        }
        Drawable drawable2 = w02.g(1);
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            drawable3.setCallback(null);
        }
        this.e = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this.d);
            SeekBar seekBar2 = this.d;
            g.R((Drawable)drawable2, (int)seekBar2.getLayoutDirection());
            if (drawable2.isStateful()) {
                drawable2.setState(this.d.getDrawableState());
            }
            this.c();
        }
        this.d.invalidate();
        if (w02.o(3)) {
            this.g = d0.c((int)w02.j(3, -1), (PorterDuff.Mode)this.g);
            this.i = true;
        }
        if (w02.o(2)) {
            this.f = w02.c(2);
            this.h = true;
        }
        w02.b.recycle();
        this.c();
    }

    public final void c() {
        Drawable drawable = this.e;
        if (drawable != null && (this.h || this.i)) {
            Drawable drawable2;
            this.e = drawable2 = g.c0((Drawable)drawable.mutate());
            if (this.h) {
                g.X((Drawable)drawable2, (ColorStateList)this.f);
            }
            if (this.i) {
                g.Y((Drawable)this.e, (PorterDuff.Mode)this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(this.d.getDrawableState());
            }
        }
    }

    public void d(Canvas canvas) {
        int n2;
        int n3;
        if (this.e != null && (n2 = this.d.getMax()) > (n3 = 1)) {
            int n4 = this.e.getIntrinsicWidth();
            int n5 = this.e.getIntrinsicHeight();
            int n6 = n4 >= 0 ? n4 / 2 : 1;
            if (n5 >= 0) {
                n3 = n5 / 2;
            }
            this.e.setBounds(-n6, -n3, n6, n3);
            float f2 = (float)(this.d.getWidth() - this.d.getPaddingLeft() - this.d.getPaddingRight()) / (float)n2;
            int n7 = canvas.save();
            canvas.translate((float)this.d.getPaddingLeft(), (float)(this.d.getHeight() / 2));
            for (int i2 = 0; i2 <= n2; ++i2) {
                this.e.draw(canvas);
                canvas.translate(f2, 0.0f);
            }
            canvas.restoreToCount(n7);
        }
    }
}

