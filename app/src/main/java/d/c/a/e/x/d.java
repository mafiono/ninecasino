/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.widget.FrameLayout
 *  c.h.b.g
 *  c.h.j.n
 *  d.c.a.e.a
 *  d.c.a.e.a0.a.a
 *  d.c.a.e.b
 *  java.lang.Object
 */
package d.c.a.e.x;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c.h.b.g;
import c.h.j.n;
import d.c.a.e.b;
import d.c.a.e.x.c;

public class d
extends FrameLayout {
    public static final OnTouchListener l = new OnTouchListener(){

        @SuppressLint(value={"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    public c e;
    public b f;
    public int g;
    public final float h;
    public final float i;
    public ColorStateList j;
    public PorterDuff.Mode k;

    public d(Context context, AttributeSet attributeSet) {
        super(d.c.a.e.a0.a.a.a((Context)context, (AttributeSet)attributeSet, (int)0, (int)0), attributeSet);
        Context context2 = this.getContext();
        TypedArray typedArray = context2.obtainStyledAttributes(attributeSet, b.t);
        if (typedArray.hasValue(6)) {
            n.u((View)this, (float)typedArray.getDimensionPixelSize(6, 0));
        }
        this.g = typedArray.getInt(2, 0);
        this.h = typedArray.getFloat(3, 1.0f);
        this.setBackgroundTintList(d.c.a.e.a.B((Context)context2, (TypedArray)typedArray, (int)4));
        this.setBackgroundTintMode(d.c.a.e.a.e0((int)typedArray.getInt(5, -1), (PorterDuff.Mode)PorterDuff.Mode.SRC_IN));
        this.i = typedArray.getFloat(1, 1.0f);
        typedArray.recycle();
        this.setOnTouchListener(l);
        this.setFocusable(true);
        if (this.getBackground() == null) {
            Drawable drawable;
            float f2 = this.getResources().getDimension(2131099966);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(f2);
            float f3 = this.getBackgroundOverlayColorAlpha();
            gradientDrawable.setColor(d.c.a.e.a.X((int)d.c.a.e.a.A((View)this, (int)2130903232), (int)d.c.a.e.a.A((View)this, (int)2130903224), (float)f3));
            if (this.j != null) {
                drawable = g.c0((Drawable)gradientDrawable);
                g.X((Drawable)drawable, (ColorStateList)this.j);
            } else {
                drawable = g.c0((Drawable)gradientDrawable);
            }
            this.setBackground(drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.i;
    }

    public int getAnimationMode() {
        return this.g;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.h;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b b2 = this.f;
        if (b2 != null) {
            b2.onViewAttachedToWindow(this);
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.requestApplyInsets();
            return;
        }
        this.requestFitSystemWindows();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b b2 = this.f;
        if (b2 != null) {
            b2.onViewDetachedFromWindow(this);
        }
    }

    public void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        super.onLayout(bl, n2, n3, n4, n5);
        c c2 = this.e;
        if (c2 != null) {
            c2.a(this, n2, n3, n4, n5);
        }
    }

    public void setAnimationMode(int n2) {
        this.g = n2;
    }

    public void setBackground(Drawable drawable) {
        this.setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.j != null) {
            drawable = g.c0((Drawable)drawable.mutate());
            g.X((Drawable)drawable, (ColorStateList)this.j);
            g.Y((Drawable)drawable, (PorterDuff.Mode)this.k);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        if (this.getBackground() != null) {
            Drawable drawable = g.c0((Drawable)this.getBackground().mutate());
            g.X((Drawable)drawable, (ColorStateList)colorStateList);
            g.Y((Drawable)drawable, (PorterDuff.Mode)this.k);
            if (drawable != this.getBackground()) {
                super.setBackgroundDrawable(drawable);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        if (this.getBackground() != null) {
            Drawable drawable = g.c0((Drawable)this.getBackground().mutate());
            g.Y((Drawable)drawable, (PorterDuff.Mode)mode);
            if (drawable != this.getBackground()) {
                super.setBackgroundDrawable(drawable);
            }
        }
    }

    public void setOnAttachStateChangeListener(b b2) {
        this.f = b2;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        OnTouchListener onTouchListener = onClickListener != null ? null : l;
        this.setOnTouchListener(onTouchListener);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(c c2) {
        this.e = c2;
    }

}

