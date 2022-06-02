/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  c.h.d.l.a
 */
package d.c.a.e.u;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import d.c.a.e.u.a;
import d.c.a.e.w.g;
import d.c.a.e.w.j;
import d.c.a.e.w.n;

public class a
extends Drawable
implements n,
c.h.d.l.a {
    public b e;

    public a(b b3, a a2) {
        this.e = b3;
    }

    public a(j j2) {
        ConstantState constantState = new ConstantState(new g(j2)){
            public g a;
            public boolean b;
            {
                this.a = (g)b3.a.e.newDrawable();
                this.b = b3.b;
            }
            {
                this.a = g2;
                this.b = false;
            }

            public int getChangingConfigurations() {
                return 0;
            }

            public Drawable newDrawable() {
                return new a(new /* invalid duplicate definition of identical inner class */, null);
            }
        };
        this.e = constantState;
    }

    public void draw(Canvas canvas) {
        b b3 = this.e;
        if (b.b) {
            b.a.draw(canvas);
        }
    }

    public ConstantState getConstantState() {
        return this.e;
    }

    public int getOpacity() {
        return b.a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        this.e = new /* invalid duplicate definition of identical inner class */;
        return this;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b.a.setBounds(rect);
    }

    public boolean onStateChange(int[] arrn) {
        boolean bl = super.onStateChange(arrn);
        if (b.a.setState(arrn)) {
            bl = true;
        }
        boolean bl2 = b.b(arrn);
        b b3 = this.e;
        if (b.b != bl2) {
            b.b = bl2;
            return true;
        }
        return bl;
    }

    public void setAlpha(int n2) {
        b.a.setAlpha(n2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        b.a.setColorFilter(colorFilter);
    }

    @Override
    public void setShapeAppearanceModel(j j2) {
        g g2 = b.a;
        g2.e.a = j2;
        g2.invalidateSelf();
    }

    public void setTint(int n2) {
        b.a.setTint(n2);
    }

    public void setTintList(ColorStateList colorStateList) {
        b.a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        b.a.setTintMode(mode);
    }

}

