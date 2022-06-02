/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  androidx.appcompat.widget.ActionBarContextView
 *  c.b.g.a
 *  c.b.g.a$a
 *  c.b.g.f
 *  c.b.g.i.g$a
 *  c.b.h.a
 *  c.b.h.c
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 */
package c.b.g;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import c.b.g.a;
import c.b.g.f;
import c.b.g.i.g;
import c.b.h.c;
import java.lang.ref.WeakReference;

public class d
extends a
implements g.a {
    public Context g;
    public ActionBarContextView h;
    public a.a i;
    public WeakReference<View> j;
    public boolean k;
    public g l;

    public d(Context context, ActionBarContextView actionBarContextView, a.a a2, boolean bl) {
        this.g = context;
        this.h = actionBarContextView;
        this.i = a2;
        g g2 = new g(actionBarContextView.getContext());
        g2.l = 1;
        this.l = g2;
        g2.e = this;
    }

    public boolean a(g g2, MenuItem menuItem) {
        return this.i.b((a)this, menuItem);
    }

    public void b(g g2) {
        this.i();
        c c2 = this.h.h;
        if (c2 != null) {
            c2.n();
        }
    }

    public void c() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.h.sendAccessibilityEvent(32);
        this.i.d((a)this);
    }

    public View d() {
        WeakReference<View> weakReference = this.j;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.l;
    }

    public MenuInflater f() {
        return new f(this.h.getContext());
    }

    public CharSequence g() {
        return this.h.getSubtitle();
    }

    public CharSequence h() {
        return this.h.getTitle();
    }

    public void i() {
        this.i.a((a)this, (Menu)this.l);
    }

    public boolean j() {
        return this.h.v;
    }

    public void k(View view) {
        this.h.setCustomView(view);
        WeakReference weakReference = view != null ? new WeakReference(view) : null;
        this.j = weakReference;
    }

    public void l(int n2) {
        String string = this.g.getString(n2);
        this.h.setSubtitle(string);
    }

    public void m(CharSequence charSequence) {
        this.h.setSubtitle(charSequence);
    }

    public void n(int n2) {
        String string = this.g.getString(n2);
        this.h.setTitle(string);
    }

    public void o(CharSequence charSequence) {
        this.h.setTitle(charSequence);
    }

    public void p(boolean bl) {
        this.f = bl;
        this.h.setTitleOptional(bl);
    }
}

