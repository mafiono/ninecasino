/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.os.Bundle
 *  android.util.TypedValue
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.Window$Callback
 *  c.b.c.i
 *  c.b.c.j
 *  c.b.g.a
 *  c.b.g.a$a
 *  c.h.j.d
 *  c.h.j.d$a
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.c;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import c.b.c.i;
import c.b.c.j;
import c.b.c.k;
import c.b.g.a;
import c.h.j.d;

public class q
extends Dialog
implements i {
    public j e;
    public final d.a f;

    public q(Context context, int n2) {
        int n3;
        if (n2 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130903310, typedValue, true);
            n3 = typedValue.resourceId;
        } else {
            n3 = n2;
        }
        super(context, n3);
        this.f = new d.a(){

            public boolean f(KeyEvent keyEvent) {
                return q.this.b(keyEvent);
            }
        };
        j j2 = this.a();
        if (n2 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130903310, typedValue, true);
            n2 = typedValue.resourceId;
        }
        j2.x(n2);
        j2.l(null);
    }

    public j a() {
        if (this.e == null) {
            this.e = new k(this.getContext(), this.getWindow(), this, (Object)this);
        }
        return this.e;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.a().c(view, layoutParams);
    }

    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void dismiss() {
        super.dismiss();
        this.a().m();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View view = this.getWindow().getDecorView();
        return d.b((d.a)this.f, (View)view, (Window.Callback)this, (KeyEvent)keyEvent);
    }

    public <T extends View> T findViewById(int n2) {
        return (T)this.a().e(n2);
    }

    public void g(c.b.g.a a2) {
    }

    public void i(c.b.g.a a2) {
    }

    public void invalidateOptionsMenu() {
        this.a().j();
    }

    public c.b.g.a j(a.a a2) {
        return null;
    }

    public void onCreate(Bundle bundle) {
        this.a().i();
        super.onCreate(bundle);
        this.a().l(bundle);
    }

    public void onStop() {
        super.onStop();
        this.a().r();
    }

    public void setContentView(int n2) {
        this.a().u(n2);
    }

    public void setContentView(View view) {
        this.a().v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.a().w(view, layoutParams);
    }

    public void setTitle(int n2) {
        super.setTitle(n2);
        this.a().y((CharSequence)this.getContext().getString(n2));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a().y(charSequence);
    }

}

