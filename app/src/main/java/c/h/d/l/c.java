/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  c.h.d.l.a
 *  c.h.d.l.b
 *  c.h.d.l.e
 *  java.lang.Runnable
 */
package c.h.d.l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import c.h.d.l.a;
import c.h.d.l.b;
import c.h.d.l.e;

public class c
extends Drawable
implements Drawable.Callback,
b,
a {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public int e;
    public PorterDuff.Mode f;
    public boolean g;
    public e h;
    public boolean i;
    public Drawable j;

    public c(Drawable drawable) {
        this.h = new e(this.h);
        this.b(drawable);
    }

    public c(e e2, Resources resources) {
        ConstantState constantState;
        this.h = e2;
        if (e2 != null && (constantState = e2.b) != null) {
            this.b(constantState.newDrawable(resources));
        }
    }

    public final Drawable a() {
        return this.j;
    }

    public final void b(Drawable drawable) {
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            this.setVisible(drawable.isVisible(), true);
            this.setState(drawable.getState());
            this.setLevel(drawable.getLevel());
            this.setBounds(drawable.getBounds());
            e e2 = this.h;
            if (e2 != null) {
                e2.b = drawable.getConstantState();
            }
        }
        this.invalidateSelf();
    }

    public boolean c() {
        return true;
    }

    public final boolean d(int[] arrn) {
        if (!this.c()) {
            return false;
        }
        e e2 = this.h;
        ColorStateList colorStateList = e2.c;
        PorterDuff.Mode mode = e2.d;
        if (colorStateList != null && mode != null) {
            int n2 = colorStateList.getColorForState(arrn, colorStateList.getDefaultColor());
            if (!this.g || n2 != this.e || mode != this.f) {
                this.setColorFilter(n2, mode);
                this.e = n2;
                this.f = mode;
                this.g = true;
                return true;
            }
        } else {
            this.g = false;
            this.clearColorFilter();
        }
        return false;
    }

    public void draw(Canvas canvas) {
        this.j.draw(canvas);
    }

    public int getChangingConfigurations() {
        int n2 = super.getChangingConfigurations();
        e e2 = this.h;
        int n3 = e2 != null ? e2.getChangingConfigurations() : 0;
        return n2 | n3 | this.j.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        boolean bl;
        e e2 = this.h;
        if (e2 != null && (bl = e2.b != null)) {
            e2.a = this.getChangingConfigurations();
            return this.h;
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.j.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.j.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.j.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.j.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.j.getMinimumWidth();
    }

    public int getOpacity() {
        return this.j.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.j.getPadding(rect);
    }

    public int[] getState() {
        return this.j.getState();
    }

    public Region getTransparentRegion() {
        return this.j.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        this.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.j.isAutoMirrored();
    }

    public boolean isStateful() {
        e e2;
        ColorStateList colorStateList = this.c() && (e2 = this.h) != null ? e2.c : null;
        return colorStateList != null && colorStateList.isStateful() || this.j.isStateful();
    }

    public void jumpToCurrentState() {
        this.j.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            e e2;
            this.h = new e(this.h);
            Drawable drawable = this.j;
            if (drawable != null) {
                drawable.mutate();
            }
            if ((e2 = this.h) != null) {
                Drawable drawable2 = this.j;
                ConstantState constantState = drawable2 != null ? drawable2.getConstantState() : null;
                e2.b = constantState;
            }
            this.i = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLevelChange(int n2) {
        return this.j.setLevel(n2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l2) {
        this.scheduleSelf(runnable, l2);
    }

    public void setAlpha(int n2) {
        this.j.setAlpha(n2);
    }

    public void setAutoMirrored(boolean bl) {
        this.j.setAutoMirrored(bl);
    }

    public void setChangingConfigurations(int n2) {
        this.j.setChangingConfigurations(n2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
    }

    public void setDither(boolean bl) {
        this.j.setDither(bl);
    }

    public void setFilterBitmap(boolean bl) {
        this.j.setFilterBitmap(bl);
    }

    public boolean setState(int[] arrn) {
        boolean bl = this.j.setState(arrn);
        return this.d(arrn) || bl;
        {
        }
    }

    public void setTint(int n2) {
        this.setTintList(ColorStateList.valueOf(n2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.h.c = colorStateList;
        this.d(this.getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.h.d = mode;
        this.d(this.getState());
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        return super.setVisible(bl, bl2) || this.j.setVisible(bl, bl2);
        {
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}

