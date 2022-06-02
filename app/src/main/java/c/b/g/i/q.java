/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.Gravity
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  android.widget.TextView
 *  c.b.g.i.f
 *  c.b.g.i.l
 *  c.b.g.i.m
 *  c.b.g.i.m$a
 *  c.b.g.i.q$a
 *  c.b.g.i.q$b
 *  c.b.h.e0
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 */
package c.b.g.i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import c.b.g.i.f;
import c.b.g.i.g;
import c.b.g.i.k;
import c.b.g.i.l;
import c.b.g.i.m;
import c.b.g.i.q;
import c.b.g.i.r;
import c.b.h.e0;
import c.b.h.j0;
import c.b.h.l0;
import java.util.Objects;

public final class q
extends k
implements PopupWindow.OnDismissListener,
AdapterView.OnItemClickListener,
m,
View.OnKeyListener {
    public final Context f;
    public final g g;
    public final f h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final l0 m;
    public final ViewTreeObserver.OnGlobalLayoutListener n = new a(this);
    public final View.OnAttachStateChangeListener o = new b(this);
    public PopupWindow.OnDismissListener p;
    public View q;
    public View r;
    public m.a s;
    public ViewTreeObserver t;
    public boolean u;
    public boolean v;
    public int w;
    public int x = 0;
    public boolean y;

    public q(Context context, g g2, View view, int n2, int n3, boolean bl) {
        this.f = context;
        this.g = g2;
        this.i = bl;
        this.h = new f(g2, LayoutInflater.from(context), bl, 2131427351);
        this.k = n2;
        this.l = n3;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131099671));
        this.q = view;
        this.m = new l0(context, null, n2, n3);
        g2.b(this, context);
    }

    public void a(g g2, boolean bl) {
        if (g2 != this.g) {
            return;
        }
        this.dismiss();
        m.a a2 = this.s;
        if (a2 != null) {
            a2.a(g2, bl);
        }
    }

    public boolean b() {
        return !this.u && this.m.b();
    }

    public boolean c() {
        return false;
    }

    public void dismiss() {
        if (this.b()) {
            this.m.dismiss();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void f() {
        if (this.b()) {
            do {
                return;
                break;
            } while (true);
        }
        boolean bl = this.u;
        boolean bl2 = false;
        if (!bl) {
            View view = this.q;
            if (view == null) {
                bl2 = false;
            } else {
                ViewTreeObserver viewTreeObserver;
                this.r = view;
                this.m.D.setOnDismissListener(this);
                l0 l02 = this.m;
                l02.u = this;
                l02.s(true);
                View view2 = this.r;
                boolean bl3 = this.t == null;
                this.t = viewTreeObserver = view2.getViewTreeObserver();
                if (bl3) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.n);
                }
                view2.addOnAttachStateChangeListener(this.o);
                l0 l03 = this.m;
                l03.t = view2;
                l03.p = this.x;
                if (!this.v) {
                    this.w = k.n((ListAdapter)this.h, null, this.f, this.j);
                    this.v = true;
                }
                this.m.r(this.w);
                this.m.D.setInputMethodMode(2);
                l0 l04 = this.m;
                Rect rect = this.e;
                Objects.requireNonNull((Object)l04);
                Rect rect2 = rect != null ? new Rect(rect) : null;
                l04.B = rect2;
                this.m.f();
                e0 e02 = this.m.g;
                e02.setOnKeyListener((View.OnKeyListener)this);
                if (this.y && this.g.m != null) {
                    FrameLayout frameLayout = (FrameLayout)LayoutInflater.from(this.f).inflate(2131427350, (ViewGroup)e02, false);
                    TextView textView = frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.g.m);
                    }
                    frameLayout.setEnabled(false);
                    e02.addHeaderView((View)frameLayout, null, false);
                }
                this.m.o((ListAdapter)this.h);
                this.m.f();
                return;
            }
        }
        if (bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        throw illegalStateException;
    }

    public void h(m.a a2) {
        this.s = a2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean i(r r2) {
        boolean bl;
        if (!r2.hasVisibleItems()) return false;
        l l2 = new l(this.f, (g)r2, this.r, this.i, this.k, this.l);
        l2.d(this.s);
        l2.h = bl = k.v(r2);
        k k2 = l2.j;
        if (k2 != null) {
            k2.p(bl);
        }
        l2.k = this.p;
        this.p = null;
        this.g.c(false);
        l0 l02 = this.m;
        int n2 = l02.j;
        int n3 = !l02.m ? 0 : l02.k;
        int n4 = this.x;
        View view = this.q;
        if ((7 & Gravity.getAbsoluteGravity(n4, view.getLayoutDirection())) == 5) {
            n2 += this.q.getWidth();
        }
        if (!l2.b()) {
            if (l2.f == null) {
                return false;
            }
            l2.e(n2, n3, true, true);
        }
        boolean bl2 = true;
        if (!bl2) return false;
        m.a a2 = this.s;
        if (a2 == null) return true;
        a2.b((g)r2);
        return true;
    }

    public void j(boolean bl) {
        this.v = false;
        f f2 = this.h;
        if (f2 != null) {
            f2.notifyDataSetChanged();
        }
    }

    public ListView k() {
        return this.m.g;
    }

    @Override
    public void l(g g2) {
    }

    @Override
    public void o(View view) {
        this.q = view;
    }

    public void onDismiss() {
        this.u = true;
        this.g.c(true);
        ViewTreeObserver viewTreeObserver = this.t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.t = this.r.getViewTreeObserver();
            }
            this.t.removeGlobalOnLayoutListener(this.n);
            this.t = null;
        }
        this.r.removeOnAttachStateChangeListener(this.o);
        PopupWindow.OnDismissListener onDismissListener = this.p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int n2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n2 == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }

    @Override
    public void p(boolean bl) {
        this.h.g = bl;
    }

    @Override
    public void q(int n2) {
        this.x = n2;
    }

    @Override
    public void r(int n2) {
        this.m.j = n2;
    }

    @Override
    public void s(PopupWindow.OnDismissListener onDismissListener) {
        this.p = onDismissListener;
    }

    @Override
    public void t(boolean bl) {
        this.y = bl;
    }

    @Override
    public void u(int n2) {
        l0 l02 = this.m;
        l02.k = n2;
        l02.m = true;
    }
}

