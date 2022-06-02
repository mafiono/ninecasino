/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.view.Window$Callback
 *  android.widget.TextView
 *  androidx.appcompat.widget.ActionMenuView
 *  androidx.appcompat.widget.Toolbar
 *  androidx.appcompat.widget.Toolbar$d
 *  c.b.b
 *  c.b.d.a.a
 *  c.b.g.i.m
 *  c.b.g.i.m$a
 *  c.b.h.c
 *  c.b.h.c$c
 *  c.b.h.c0
 *  c.b.h.o0
 *  c.b.h.p0
 *  c.b.h.w0
 *  c.b.h.x0
 *  c.b.h.y0$a
 *  c.h.j.n
 *  c.h.j.s
 *  c.h.j.t
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  java.util.Objects
 */
package c.b.h;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import c.b.b;
import c.b.g.i.g;
import c.b.g.i.i;
import c.b.g.i.m;
import c.b.h.c;
import c.b.h.c0;
import c.b.h.o0;
import c.b.h.p0;
import c.b.h.w0;
import c.b.h.x0;
import c.b.h.y0;
import c.h.j.n;
import c.h.j.s;
import c.h.j.t;
import java.lang.ref.WeakReference;
import java.util.Objects;

public class y0
implements c0 {
    public Toolbar a;
    public int b;
    public View c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public c n;
    public int o = 0;
    public Drawable p;

    public y0(Toolbar toolbar, boolean bl) {
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        boolean bl2 = this.i != null;
        this.h = bl2;
        this.g = toolbar.getNavigationIcon();
        w0 w02 = w0.q((Context)toolbar.getContext(), null, (int[])b.a, (int)2130903045, (int)0);
        int n2 = 15;
        this.p = w02.g(n2);
        if (bl) {
            Drawable drawable;
            Drawable drawable2;
            int n3;
            Drawable drawable3;
            int n4;
            int n5;
            int n6;
            CharSequence charSequence;
            CharSequence charSequence2 = w02.n(27);
            if (!TextUtils.isEmpty(charSequence2)) {
                this.h = true;
                this.i = charSequence2;
                if ((8 & this.b) != 0) {
                    this.a.setTitle(charSequence2);
                }
            }
            if (!TextUtils.isEmpty(charSequence = w02.n(25))) {
                this.j = charSequence;
                if ((8 & this.b) != 0) {
                    this.a.setSubtitle(charSequence);
                }
            }
            if ((drawable2 = w02.g(20)) != null) {
                this.f = drawable2;
                this.y();
            }
            if ((drawable3 = w02.g(17)) != null) {
                this.e = drawable3;
                this.y();
            }
            if (this.g == null && (drawable = this.p) != null) {
                this.g = drawable;
                this.x();
            }
            this.v(w02.j(10, 0));
            int n7 = w02.l(9, 0);
            if (n7 != 0) {
                View view = LayoutInflater.from(this.a.getContext()).inflate(n7, this.a, false);
                View view2 = this.d;
                if (view2 != null && (16 & this.b) != 0) {
                    this.a.removeView(view2);
                }
                this.d = view;
                if (view != null && (16 & this.b) != 0) {
                    this.a.addView(view);
                }
                this.v(16 | this.b);
            }
            if ((n4 = w02.k(13, 0)) > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = n4;
                this.a.setLayoutParams(layoutParams);
            }
            int n8 = w02.e(7, -1);
            int n9 = w02.e(3, -1);
            if (n8 >= 0 || n9 >= 0) {
                Toolbar toolbar2 = this.a;
                int n10 = Math.max(n8, 0);
                int n11 = Math.max(n9, 0);
                toolbar2.d();
                toolbar2.x.a(n10, n11);
            }
            if ((n5 = w02.l(28, 0)) != 0) {
                Toolbar toolbar3 = this.a;
                Context context = toolbar3.getContext();
                toolbar3.p = n5;
                TextView textView = toolbar3.f;
                if (textView != null) {
                    textView.setTextAppearance(context, n5);
                }
            }
            if ((n6 = w02.l(26, 0)) != 0) {
                Toolbar toolbar4 = this.a;
                Context context = toolbar4.getContext();
                toolbar4.q = n6;
                TextView textView = toolbar4.g;
                if (textView != null) {
                    textView.setTextAppearance(context, n6);
                }
            }
            if ((n3 = w02.l(22, 0)) != 0) {
                this.a.setPopupTheme(n3);
            }
        } else {
            if (this.a.getNavigationIcon() != null) {
                this.p = this.a.getNavigationIcon();
            } else {
                n2 = 11;
            }
            this.b = n2;
        }
        w02.b.recycle();
        if (2131623937 != this.o) {
            this.o = 2131623937;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                int n12 = this.o;
                String string = n12 == 0 ? null : this.d().getString(n12);
                this.k = string;
                this.w();
            }
        }
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener((View.OnClickListener)new x0(this));
    }

    public void a(Menu menu, m.a a2) {
        if (this.n == null) {
            c c2;
            this.n = c2 = new c(this.a.getContext());
            Objects.requireNonNull((Object)c2);
        }
        c c3 = this.n;
        c3.i = a2;
        Toolbar toolbar = this.a;
        g g2 = (g)menu;
        if (g2 == null && toolbar.e == null) {
            return;
        }
        toolbar.f();
        g g3 = toolbar.e.t;
        if (g3 == g2) {
            return;
        }
        if (g3 != null) {
            g3.u((m)toolbar.N);
            g3.u((m)toolbar.O);
        }
        if (toolbar.O == null) {
            toolbar.O = new Toolbar.d(toolbar);
        }
        c3.u = true;
        if (g2 != null) {
            g2.b((m)c3, toolbar.n);
            g2.b((m)toolbar.O, toolbar.n);
        } else {
            i i2;
            c3.d(toolbar.n, null);
            Toolbar.d d2 = toolbar.O;
            g g4 = d2.e;
            if (g4 != null && (i2 = d2.f) != null) {
                g4.d(i2);
            }
            d2.e = null;
            c3.j(true);
            toolbar.O.j(true);
        }
        toolbar.e.setPopupTheme(toolbar.o);
        toolbar.e.setPresenter(c3);
        toolbar.N = c3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b() {
        ActionMenuView actionMenuView = this.a.e;
        boolean bl = false;
        if (actionMenuView == null) return bl;
        c c2 = actionMenuView.x;
        if (c2 == null) return false;
        if (c2.z != null) return true;
        return c2.m();
    }

    public boolean c() {
        return this.a.o();
    }

    public void collapseActionView() {
        Toolbar.d d2 = this.a.O;
        i i2 = d2 == null ? null : d2.f;
        if (i2 != null) {
            i2.collapseActionView();
        }
    }

    public Context d() {
        return this.a.getContext();
    }

    public boolean e() {
        ActionMenuView actionMenuView = this.a.e;
        boolean bl = false;
        if (actionMenuView != null) {
            c c2 = actionMenuView.x;
            boolean bl2 = c2 != null && c2.k();
            bl = bl2;
        }
        return bl;
    }

    public boolean f() {
        return this.a.u();
    }

    public void g() {
        this.m = true;
    }

    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    public boolean h() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.e) != null && actionMenuView.w;
    }

    public void i() {
        c c2;
        ActionMenuView actionMenuView = this.a.e;
        if (actionMenuView != null && (c2 = actionMenuView.x) != null) {
            c2.b();
        }
    }

    public int j() {
        return this.b;
    }

    public void k(int n2) {
        this.a.setVisibility(n2);
    }

    public void l(int n2) {
        Drawable drawable = n2 != 0 ? c.b.d.a.a.b((Context)this.d(), (int)n2) : null;
        this.f = drawable;
        this.y();
    }

    public void m(p0 p02) {
        Toolbar toolbar;
        ViewParent viewParent;
        View view = this.c;
        if (view != null && (viewParent = view.getParent()) == (toolbar = this.a)) {
            toolbar.removeView(this.c);
        }
        this.c = null;
    }

    public ViewGroup n() {
        return this.a;
    }

    public void o(boolean bl) {
    }

    public int p() {
        return 0;
    }

    public s q(int n2, long l2) {
        s s2 = n.a((View)this.a);
        float f2 = n2 == 0 ? 1.0f : 0.0f;
        s2.a(f2);
        s2.c(l2);
        a a2 = new a(this, n2);
        View view = (View)s2.a.get();
        if (view != null) {
            s2.e(view, (t)a2);
        }
        return s2;
    }

    public void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public boolean s() {
        Toolbar.d d2 = this.a.O;
        return d2 != null && d2.f != null;
    }

    public void setIcon(int n2) {
        Drawable drawable = n2 != 0 ? c.b.d.a.a.b((Context)this.d(), (int)n2) : null;
        this.e = drawable;
        this.y();
    }

    public void setIcon(Drawable drawable) {
        this.e = drawable;
        this.y();
    }

    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.h) {
            this.i = charSequence;
            if ((8 & this.b) != 0) {
                this.a.setTitle(charSequence);
            }
        }
    }

    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void u(boolean bl) {
        this.a.setCollapsible(bl);
    }

    public void v(int n2) {
        int n3 = n2 ^ this.b;
        this.b = n2;
        if (n3 != 0) {
            View view;
            if ((n3 & 4) != 0) {
                if ((n2 & 4) != 0) {
                    this.w();
                }
                this.x();
            }
            if ((n3 & 3) != 0) {
                this.y();
            }
            if ((n3 & 8) != 0) {
                CharSequence charSequence;
                Toolbar toolbar;
                if ((n2 & 8) != 0) {
                    this.a.setTitle(this.i);
                    toolbar = this.a;
                    charSequence = this.j;
                } else {
                    Toolbar toolbar2 = this.a;
                    charSequence = null;
                    toolbar2.setTitle(null);
                    toolbar = this.a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((n3 & 16) != 0 && (view = this.d) != null) {
                if ((n2 & 16) != 0) {
                    this.a.addView(view);
                    return;
                }
                this.a.removeView(view);
            }
        }
    }

    public final void w() {
        if ((4 & this.b) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.a.setNavigationContentDescription(this.o);
                return;
            }
            this.a.setNavigationContentDescription(this.k);
        }
    }

    public final void x() {
        Toolbar toolbar;
        Drawable drawable;
        if ((4 & this.b) != 0) {
            toolbar = this.a;
            drawable = this.g;
            if (drawable == null) {
                drawable = this.p;
            }
        } else {
            toolbar = this.a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void y() {
        Drawable drawable;
        int n2 = this.b;
        if ((n2 & 2) != 0) {
            if ((n2 & 1) == 0 || (drawable = this.f) == null) {
                drawable = this.e;
            }
        } else {
            drawable = null;
        }
        this.a.setLogo(drawable);
    }
}

