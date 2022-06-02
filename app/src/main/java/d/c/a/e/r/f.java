/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.util.AttributeSet
 *  android.view.Gravity
 *  android.view.ViewGroup
 *  c.b.h.h0
 *  d.c.a.e.b
 */
package d.c.a.e.r;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.ViewGroup;
import c.b.h.h0;
import d.c.a.e.b;
import d.c.a.e.r.j;

public class f
extends h0 {
    public Drawable t;
    public final Rect u = new Rect();
    public final Rect v = new Rect();
    public int w = 119;
    public boolean x = true;
    public boolean y = false;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        int[] arrn = b.h;
        int[] arrn2 = new int[]{};
        j.a(context, attributeSet, n2, 0);
        j.b(context, attributeSet, arrn, n2, 0, arrn2);
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, arrn, n2, 0);
        this.w = typedArray.getInt(1, this.w);
        Drawable drawable = typedArray.getDrawable(0);
        if (drawable != null) {
            this.setForeground(drawable);
        }
        this.x = typedArray.getBoolean(2, true);
        typedArray.recycle();
    }

    public void draw(Canvas canvas) {
        ViewGroup.super.draw(canvas);
        Drawable drawable = this.t;
        if (drawable != null) {
            if (this.y) {
                this.y = false;
                Rect rect = this.u;
                Rect rect2 = this.v;
                int n2 = this.getRight() - this.getLeft();
                int n3 = this.getBottom() - this.getTop();
                if (this.x) {
                    rect.set(0, 0, n2, n3);
                } else {
                    rect.set(this.getPaddingLeft(), this.getPaddingTop(), n2 - this.getPaddingRight(), n3 - this.getPaddingBottom());
                }
                Gravity.apply(this.w, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(value=21)
    public void drawableHotspotChanged(float f2, float f3) {
        ViewGroup.super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    public void drawableStateChanged() {
        ViewGroup.super.drawableStateChanged();
        Drawable drawable = this.t;
        if (drawable != null && drawable.isStateful()) {
            this.t.setState(this.getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.t;
    }

    public int getForegroundGravity() {
        return this.w;
    }

    public void jumpDrawablesToCurrentState() {
        ViewGroup.super.jumpDrawablesToCurrentState();
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        super.onLayout(bl, n2, n3, n4, n5);
        this.y = bl | this.y;
    }

    public void onSizeChanged(int n2, int n3, int n4, int n5) {
        ViewGroup.super.onSizeChanged(n2, n3, n4, n5);
        this.y = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                this.unscheduleDrawable(this.t);
            }
            this.t = drawable;
            if (drawable != null) {
                this.setWillNotDraw(false);
                drawable.setCallback((Drawable.Callback)this);
                if (drawable.isStateful()) {
                    drawable.setState(this.getDrawableState());
                }
                if (this.w == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                this.setWillNotDraw(true);
            }
            this.requestLayout();
            this.invalidate();
        }
    }

    public void setForegroundGravity(int n2) {
        if (this.w != n2) {
            if ((8388615 & n2) == 0) {
                n2 |= 8388611;
            }
            if ((n2 & 112) == 0) {
                n2 |= 48;
            }
            this.w = n2;
            if (n2 == 119 && this.t != null) {
                Rect rect = new Rect();
                this.t.getPadding(rect);
            }
            this.requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return ViewGroup.super.verifyDrawable(drawable) || drawable == this.t;
        {
        }
    }
}

