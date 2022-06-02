/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.Button
 *  android.widget.TextView
 *  c.b.h.e
 *  c.b.h.r0
 *  c.b.h.t0
 *  c.b.h.u0
 *  c.b.h.x
 *  c.b.h.z
 *  c.h.b.g
 *  c.h.j.m
 *  c.h.k.b
 *  c.h.k.f
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.String
 */
package c.b.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import c.b.h.e;
import c.b.h.r0;
import c.b.h.t0;
import c.b.h.u0;
import c.b.h.x;
import c.b.h.z;
import c.h.b.g;
import c.h.j.m;
import c.h.k.b;

public class f
extends Button
implements m,
b,
c.h.k.f {
    public final e e;
    public final x f;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130903155);
    }

    public f(Context context, AttributeSet attributeSet, int n2) {
        e e2;
        x x2;
        super(t0.a((Context)context), attributeSet, n2);
        r0.a((View)this, (Context)this.getContext());
        this.e = e2 = new e((View)this);
        e2.d(attributeSet, n2);
        this.f = x2 = new x((TextView)this);
        x2.e(attributeSet, n2);
        x2.b();
    }

    public void drawableStateChanged() {
        x x2;
        super.drawableStateChanged();
        e e2 = this.e;
        if (e2 != null) {
            e2.a();
        }
        if ((x2 = this.f) != null) {
            x2.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        x x2 = this.f;
        if (x2 != null) {
            return Math.round((float)x2.i.e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.a) {
            return super.getAutoSizeMinTextSize();
        }
        x x2 = this.f;
        if (x2 != null) {
            return Math.round((float)x2.i.d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.a) {
            return super.getAutoSizeStepGranularity();
        }
        x x2 = this.f;
        if (x2 != null) {
            return Math.round((float)x2.i.c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x x2 = this.f;
        if (x2 != null) {
            return x2.i.f;
        }
        return new int[0];
    }

    @SuppressLint(value={"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.a) {
            int n2 = super.getAutoSizeTextType();
            int n3 = 0;
            if (n2 == 1) {
                n3 = 1;
            }
            return n3;
        }
        x x2 = this.f;
        if (x2 != null) {
            return x2.i.a;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e e2 = this.e;
        if (e2 != null) {
            return e2.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e e2 = this.e;
        if (e2 != null) {
            return e2.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        u0 u02 = this.f.h;
        if (u02 != null) {
            return u02.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        u0 u02 = this.f.h;
        if (u02 != null) {
            return u02.b;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        super.onLayout(bl, n2, n3, n4, n5);
        x x2 = this.f;
        if (x2 != null && !b.a) {
            x2.i.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
        super.onTextChanged(charSequence, n2, n3, n4);
        x x2 = this.f;
        if (x2 != null && !b.a && x2.d()) {
            this.f.i.a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int n2, int n3, int n4, int n5) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(n2, n3, n4, n5);
            return;
        }
        x x2 = this.f;
        if (x2 != null) {
            x2.g(n2, n3, n4, n5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] arrn, int n2) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(arrn, n2);
            return;
        }
        x x2 = this.f;
        if (x2 != null) {
            x2.h(arrn, n2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int n2) {
        if (b.a) {
            super.setAutoSizeTextTypeWithDefaults(n2);
            return;
        }
        x x2 = this.f;
        if (x2 != null) {
            x2.i(n2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e e2 = this.e;
        if (e2 != null) {
            e2.e();
        }
    }

    public void setBackgroundResource(int n2) {
        super.setBackgroundResource(n2);
        e e2 = this.e;
        if (e2 != null) {
            e2.f(n2);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.d0((TextView)this, (ActionMode.Callback)callback));
    }

    public void setSupportAllCaps(boolean bl) {
        x x2 = this.f;
        if (x2 != null) {
            x2.a.setAllCaps(bl);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e e2 = this.e;
        if (e2 != null) {
            e2.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e e2 = this.e;
        if (e2 != null) {
            e2.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f.j(colorStateList);
        this.f.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f.k(mode);
        this.f.b();
    }

    public void setTextAppearance(Context context, int n2) {
        super.setTextAppearance(context, n2);
        x x2 = this.f;
        if (x2 != null) {
            x2.f(context, n2);
        }
    }

    public void setTextSize(int n2, float f2) {
        boolean bl = b.a;
        if (bl) {
            super.setTextSize(n2, f2);
            return;
        }
        x x2 = this.f;
        if (x2 != null && !bl && !x2.d()) {
            x2.i.f(n2, f2);
        }
    }
}

