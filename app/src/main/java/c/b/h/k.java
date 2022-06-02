/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.Editable
 *  android.util.AttributeSet
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.textclassifier.TextClassifier
 *  android.widget.EditText
 *  android.widget.TextView
 *  c.b.a
 *  c.b.h.e
 *  c.b.h.r0
 *  c.b.h.t0
 *  c.b.h.w
 *  c.b.h.x
 *  c.h.b.g
 *  c.h.j.m
 *  java.lang.CharSequence
 */
package c.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import c.b.a;
import c.b.h.e;
import c.b.h.r0;
import c.b.h.t0;
import c.b.h.w;
import c.b.h.x;
import c.h.b.g;
import c.h.j.m;

public class k
extends EditText
implements m {
    public final e e;
    public final x f;
    public final w g;

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130903335);
    }

    public k(Context context, AttributeSet attributeSet, int n2) {
        e e2;
        x x2;
        super(t0.a((Context)context), attributeSet, n2);
        r0.a((View)this, (Context)this.getContext());
        this.e = e2 = new e((View)this);
        e2.d(attributeSet, n2);
        this.f = x2 = new x((TextView)this);
        x2.e(attributeSet, n2);
        x2.b();
        this.g = new w((TextView)this);
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

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        w w2;
        if (Build.VERSION.SDK_INT < 28 && (w2 = this.g) != null) {
            return w2.a();
        }
        return super.getTextClassifier();
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.d0((TextView)this, (ActionMode.Callback)callback));
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

    public void setTextClassifier(TextClassifier textClassifier) {
        w w2;
        if (Build.VERSION.SDK_INT < 28 && (w2 = this.g) != null) {
            w2.b = textClassifier;
            return;
        }
        super.setTextClassifier(textClassifier);
    }
}

