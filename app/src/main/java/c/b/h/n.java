/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.widget.MultiAutoCompleteTextView
 *  android.widget.TextView
 *  c.b.a
 *  c.b.d.a.a
 *  c.b.h.e
 *  c.b.h.r0
 *  c.b.h.t0
 *  c.b.h.w0
 *  c.b.h.x
 *  c.h.j.m
 */
package c.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import c.b.a;
import c.b.h.e;
import c.b.h.r0;
import c.b.h.t0;
import c.b.h.w0;
import c.b.h.x;
import c.h.j.m;

public class n
extends MultiAutoCompleteTextView
implements m {
    public static final int[] g = new int[]{16843126};
    public final e e;
    public final x f;

    public n(Context context, AttributeSet attributeSet) {
        e e2;
        x x2;
        super(t0.a((Context)context), attributeSet, 2130903091);
        r0.a((View)this, (Context)this.getContext());
        w0 w02 = w0.q((Context)this.getContext(), (AttributeSet)attributeSet, (int[])g, (int)2130903091, (int)0);
        if (w02.o(0)) {
            this.setDropDownBackgroundDrawable(w02.g(0));
        }
        w02.b.recycle();
        this.e = e2 = new e((View)this);
        e2.d(attributeSet, 2130903091);
        this.f = x2 = new x((TextView)this);
        x2.e(attributeSet, 2130903091);
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

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        a.b((InputConnection)inputConnection, (EditorInfo)editorInfo, (View)this);
        return inputConnection;
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

    public void setDropDownBackgroundResource(int n2) {
        this.setDropDownBackgroundDrawable(c.b.d.a.a.b((Context)this.getContext(), (int)n2));
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

    public void setTextAppearance(Context context, int n2) {
        super.setTextAppearance(context, n2);
        x x2 = this.f;
        if (x2 != null) {
            x2.f(context, n2);
        }
    }
}

