/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.os.Bundle
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.Window
 *  android.view.Window$Callback
 *  c.h.j.d
 *  c.h.j.d$a
 *  c.n.f
 *  c.n.f$b
 *  c.n.k
 *  c.n.v
 *  java.lang.String
 */
package c.h.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import c.h.j.d;
import c.n.f;
import c.n.k;
import c.n.m;
import c.n.v;

public class h
extends Activity
implements k,
d.a {
    public m e = new m(this);

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View view = this.getWindow().getDecorView();
        if (view != null && d.a((View)view, (KeyEvent)keyEvent)) {
            return true;
        }
        return d.b((d.a)this, (View)view, (Window.Callback)this, (KeyEvent)keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View view = this.getWindow().getDecorView();
        if (view != null && d.a((View)view, (KeyEvent)keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @SuppressLint(value={"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v.c((Activity)this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        m m2 = this.e;
        f.b b2 = f.b.g;
        m2.d("markState");
        m2.d("setCurrentState");
        m2.g(b2);
        super.onSaveInstanceState(bundle);
    }
}

