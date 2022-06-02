/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.CheckBox
 *  android.widget.CompoundButton
 *  android.widget.TextView
 *  c.b.d.a.a
 *  c.b.h.e
 *  c.b.h.i
 *  c.b.h.r0
 *  c.b.h.t0
 *  c.b.h.x
 *  c.h.j.m
 *  c.h.k.e
 */
package c.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import c.b.d.a.a;
import c.b.h.e;
import c.b.h.i;
import c.b.h.r0;
import c.b.h.t0;
import c.b.h.x;
import c.h.j.m;

public class g
extends CheckBox
implements c.h.k.e,
m {
    public final i e;
    public final e f;
    public final x g;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130903168);
    }

    public g(Context context, AttributeSet attributeSet, int n2) {
        i i2;
        x x2;
        e e2;
        super(t0.a((Context)context), attributeSet, n2);
        r0.a((View)this, (Context)this.getContext());
        this.e = i2 = new i((CompoundButton)this);
        i2.b(attributeSet, n2);
        this.f = e2 = new e((View)this);
        e2.d(attributeSet, n2);
        this.g = x2 = new x((TextView)this);
        x2.e(attributeSet, n2);
    }

    public void drawableStateChanged() {
        x x2;
        super.drawableStateChanged();
        e e2 = this.f;
        if (e2 != null) {
            e2.a();
        }
        if ((x2 = this.g) != null) {
            x2.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int n2 = super.getCompoundPaddingLeft();
        return n2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e e2 = this.f;
        if (e2 != null) {
            return e2.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e e2 = this.f;
        if (e2 != null) {
            return e2.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i i2 = this.e;
        if (i2 != null) {
            return i2.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i i2 = this.e;
        if (i2 != null) {
            return i2.c;
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e e2 = this.f;
        if (e2 != null) {
            e2.e();
        }
    }

    public void setBackgroundResource(int n2) {
        super.setBackgroundResource(n2);
        e e2 = this.f;
        if (e2 != null) {
            e2.f(n2);
        }
    }

    public void setButtonDrawable(int n2) {
        this.setButtonDrawable(a.b((Context)this.getContext(), (int)n2));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i i2 = this.e;
        if (i2 != null) {
            if (i2.f) {
                i2.f = false;
                return;
            }
            i2.f = true;
            i2.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e e2 = this.f;
        if (e2 != null) {
            e2.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e e2 = this.f;
        if (e2 != null) {
            e2.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i i2 = this.e;
        if (i2 != null) {
            i2.b = colorStateList;
            i2.d = true;
            i2.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i i2 = this.e;
        if (i2 != null) {
            i2.c = mode;
            i2.e = true;
            i2.a();
        }
    }
}

