/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewPropertyAnimator
 *  android.view.Window
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  androidx.appcompat.widget.ActionBarContainer
 *  androidx.appcompat.widget.ActionBarContextView
 *  androidx.appcompat.widget.ActionBarOverlayLayout
 *  androidx.appcompat.widget.ActionBarOverlayLayout$d
 *  androidx.appcompat.widget.Toolbar
 *  c.b.b
 *  c.b.c.a
 *  c.b.c.a$b
 *  c.b.c.u$a
 *  c.b.c.u$b
 *  c.b.g.a
 *  c.b.g.a$a
 *  c.b.g.f
 *  c.b.g.g
 *  c.b.g.i.g$a
 *  c.b.h.a
 *  c.b.h.c
 *  c.b.h.c0
 *  c.b.h.p0
 *  c.h.j.n
 *  c.h.j.s
 *  c.h.j.t
 *  c.h.j.v
 *  d.a.b.a.a
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 */
package c.b.c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import c.b.c.a;
import c.b.c.u;
import c.b.g.a;
import c.b.g.f;
import c.b.g.g;
import c.b.g.i.g;
import c.b.h.c0;
import c.b.h.p0;
import c.h.j.n;
import c.h.j.s;
import c.h.j.t;
import c.h.j.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class u
extends c.b.c.a
implements ActionBarOverlayLayout.d {
    public static final Interpolator A;
    public static final Interpolator z;
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public c0 e;
    public ActionBarContextView f;
    public View g;
    public boolean h;
    public d i;
    public c.b.g.a j;
    public a.a k;
    public boolean l;
    public ArrayList<a.b> m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public g t;
    public boolean u;
    public boolean v;
    public final t w;
    public final t x;
    public final v y;

    public static {
        z = new AccelerateInterpolator();
        A = new DecelerateInterpolator();
    }

    public u(Activity activity, boolean bl) {
        new ArrayList();
        this.m = new ArrayList();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new a(this);
        this.x = new b(this);
        this.y = new v(){};
        View view = activity.getWindow().getDecorView();
        this.e(view);
        if (!bl) {
            this.g = view.findViewById(16908290);
        }
    }

    public u(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new a(this);
        this.x = new b(this);
        this.y = new /* invalid duplicate definition of identical inner class */;
        this.e(dialog.getWindow().getDecorView());
    }

    public void a(boolean bl) {
        if (bl == this.l) {
            return;
        }
        this.l = bl;
        int n2 = this.m.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((a.b)this.m.get(i2)).a(bl);
        }
    }

    public Context b() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(2130903050, typedValue, true);
            int n2 = typedValue.resourceId;
            this.b = n2 != 0 ? new ContextThemeWrapper(this.a, n2) : this.a;
        }
        return this.b;
    }

    public void c(boolean bl) {
        if (!this.h) {
            int n2 = bl ? 4 : 0;
            int n3 = this.e.j();
            this.h = true;
            this.e.v(n2 & 4 | n3 & -5);
        }
    }

    public void d(boolean bl) {
        ActionBarContainer actionBarContainer;
        if (bl) {
            if (!this.r) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                this.g(false);
            }
        } else if (this.r) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            this.g(false);
        }
        if ((actionBarContainer = this.d).isLaidOut()) {
            s s2;
            s s3;
            if (bl) {
                s3 = this.e.q(4, 100L);
                s2 = this.f.e(0, 200L);
            } else {
                s2 = this.e.q(0, 200L);
                s3 = this.f.e(8, 100L);
            }
            g g2 = new g();
            g2.a.add((Object)s3);
            View view = (View)s3.a.get();
            long l2 = view != null ? view.animate().getDuration() : 0L;
            View view2 = (View)s2.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(l2);
            }
            g2.a.add((Object)s2);
            g2.b();
            return;
        }
        if (bl) {
            this.e.k(4);
            this.f.setVisibility(0);
            return;
        }
        this.e.k(0);
        this.f.setVisibility(8);
    }

    public final void e(View view) {
        View view2;
        block12 : {
            c0 c02;
            ActionBarContainer actionBarContainer;
            block11 : {
                block10 : {
                    ActionBarOverlayLayout actionBarOverlayLayout;
                    this.c = actionBarOverlayLayout = view.findViewById(2131230864);
                    if (actionBarOverlayLayout != null) {
                        actionBarOverlayLayout.setActionBarVisibilityCallback((ActionBarOverlayLayout.d)this);
                    }
                    if (!((view2 = view.findViewById(2131230769)) instanceof c0)) break block10;
                    c02 = (c0)view2;
                    break block11;
                }
                if (!(view2 instanceof Toolbar)) break block12;
                c02 = ((Toolbar)view2).getWrapper();
            }
            this.e = c02;
            this.f = view.findViewById(2131230777);
            this.d = actionBarContainer = view.findViewById(2131230771);
            c0 c03 = this.e;
            if (c03 != null && this.f != null && actionBarContainer != null) {
                int n2;
                this.a = c03.d();
                boolean bl = (4 & this.e.j()) != 0;
                if (bl) {
                    this.h = true;
                }
                Context context = this.a;
                boolean bl2 = context.getApplicationInfo().targetSdkVersion < 14;
                boolean bl3 = bl2 || bl;
                this.e.o(bl3);
                this.f(context.getResources().getBoolean(2130968576));
                TypedArray typedArray = this.a.obtainStyledAttributes(null, c.b.b.a, 2130903045, 0);
                if (typedArray.getBoolean(14, false)) {
                    ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                    if (actionBarOverlayLayout.l) {
                        this.v = true;
                        actionBarOverlayLayout.setHideOnContentScrollEnabled(true);
                    } else {
                        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                    }
                }
                if ((n2 = typedArray.getDimensionPixelSize(12, 0)) != 0) {
                    float f2 = n2;
                    n.u((View)this.d, (float)f2);
                }
                typedArray.recycle();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(u.class.getSimpleName());
            stringBuilder.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Can't make a decor toolbar out of ");
        String string = view2 != null ? view2.getClass().getSimpleName() : "null";
        stringBuilder.append(string);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void f(boolean bl) {
        this.n = bl;
        if (!bl) {
            this.e.m(null);
            this.d.setTabContainer(null);
        } else {
            this.d.setTabContainer(null);
            this.e.m(null);
        }
        int n2 = this.e.p();
        boolean bl2 = true;
        boolean bl3 = n2 == 2;
        c0 c02 = this.e;
        boolean bl4 = !this.n && bl3;
        c02.u(bl4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (this.n || !bl3) {
            bl2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(bl2);
    }

    public final void g(boolean bl) {
        boolean bl2 = this.q;
        boolean bl3 = this.r || !bl2;
        if (bl3) {
            if (!this.s) {
                this.s = true;
                g g2 = this.t;
                if (g2 != null) {
                    g2.a();
                }
                this.d.setVisibility(0);
                if (this.o == 0 && (this.u || bl)) {
                    View view;
                    this.d.setTranslationY(0.0f);
                    float f2 = -this.d.getHeight();
                    if (bl) {
                        int[] arrn = new int[]{0, 0};
                        this.d.getLocationInWindow(arrn);
                        f2 -= (float)arrn[1];
                    }
                    this.d.setTranslationY(f2);
                    g g3 = new g();
                    s s2 = n.a((View)this.d);
                    s2.g(0.0f);
                    s2.f(this.y);
                    if (!g3.e) {
                        g3.a.add((Object)s2);
                    }
                    if (this.p && (view = this.g) != null) {
                        view.setTranslationY(f2);
                        s s3 = n.a((View)this.g);
                        s3.g(0.0f);
                        if (!g3.e) {
                            g3.a.add((Object)s3);
                        }
                    }
                    Interpolator interpolator = A;
                    boolean bl4 = g3.e;
                    if (!bl4) {
                        g3.c = interpolator;
                    }
                    if (!bl4) {
                        g3.b = 250L;
                    }
                    t t2 = this.x;
                    if (!bl4) {
                        g3.d = t2;
                    }
                    this.t = g3;
                    g3.b();
                } else {
                    View view;
                    this.d.setAlpha(1.0f);
                    this.d.setTranslationY(0.0f);
                    if (this.p && (view = this.g) != null) {
                        view.setTranslationY(0.0f);
                    }
                    this.x.a(null);
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    if (Build.VERSION.SDK_INT >= 20) {
                        actionBarOverlayLayout.requestApplyInsets();
                        return;
                    }
                    actionBarOverlayLayout.requestFitSystemWindows();
                    return;
                }
            }
        } else if (this.s) {
            this.s = false;
            g g4 = this.t;
            if (g4 != null) {
                g4.a();
            }
            if (this.o == 0 && (this.u || bl)) {
                View view;
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                g g5 = new g();
                float f3 = -this.d.getHeight();
                if (bl) {
                    int[] arrn = new int[]{0, 0};
                    this.d.getLocationInWindow(arrn);
                    f3 -= (float)arrn[1];
                }
                s s4 = n.a((View)this.d);
                s4.g(f3);
                s4.f(this.y);
                if (!g5.e) {
                    g5.a.add((Object)s4);
                }
                if (this.p && (view = this.g) != null) {
                    s s5 = n.a((View)view);
                    s5.g(f3);
                    if (!g5.e) {
                        g5.a.add((Object)s5);
                    }
                }
                Interpolator interpolator = z;
                boolean bl5 = g5.e;
                if (!bl5) {
                    g5.c = interpolator;
                }
                if (!bl5) {
                    g5.b = 250L;
                }
                t t3 = this.w;
                if (!bl5) {
                    g5.d = t3;
                }
                this.t = g5;
                g5.b();
                return;
            }
            this.w.a(null);
        }
    }

    public class d
    extends c.b.g.a
    implements g.a {
        public final Context g;
        public final c.b.g.i.g h;
        public a.a i;
        public WeakReference<View> j;

        public d(Context context, a.a a2) {
            this.g = context;
            this.i = a2;
            c.b.g.i.g g2 = new g(context);
            g2.l = 1;
            this.h = g2;
            g2.e = this;
        }

        public boolean a(c.b.g.i.g g2, MenuItem menuItem) {
            a.a a2 = this.i;
            if (a2 != null) {
                return a2.b((c.b.g.a)this, menuItem);
            }
            return false;
        }

        public void b(c.b.g.i.g g2) {
            if (this.i == null) {
                return;
            }
            this.i();
            c.b.h.c c2 = u.this.f.h;
            if (c2 != null) {
                c2.n();
            }
        }

        public void c() {
            u u2 = u.this;
            if (u2.i != this) {
                return;
            }
            if (true == u2.q) {
                u2.j = this;
                u2.k = this.i;
            } else {
                this.i.d((c.b.g.a)this);
            }
            this.i = null;
            u.this.d(false);
            ActionBarContextView actionBarContextView = u.this.f;
            if (actionBarContextView.o == null) {
                actionBarContextView.h();
            }
            u.this.e.n().sendAccessibilityEvent(32);
            u u3 = u.this;
            u3.c.setHideOnContentScrollEnabled(u3.v);
            u.this.i = null;
        }

        public View d() {
            WeakReference<View> weakReference = this.j;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.h;
        }

        public MenuInflater f() {
            return new f(this.g);
        }

        public CharSequence g() {
            return u.this.f.getSubtitle();
        }

        public CharSequence h() {
            return u.this.f.getTitle();
        }

        public void i() {
            if (u.this.i != this) {
                return;
            }
            this.h.z();
            try {
                this.i.a((c.b.g.a)this, (Menu)this.h);
                return;
            }
            finally {
                this.h.y();
            }
        }

        public boolean j() {
            return u.this.f.v;
        }

        public void k(View view) {
            u.this.f.setCustomView(view);
            this.j = new WeakReference(view);
        }

        public void l(int n2) {
            String string = u.this.a.getResources().getString(n2);
            u.this.f.setSubtitle(string);
        }

        public void m(CharSequence charSequence) {
            u.this.f.setSubtitle(charSequence);
        }

        public void n(int n2) {
            String string = u.this.a.getResources().getString(n2);
            u.this.f.setTitle(string);
        }

        public void o(CharSequence charSequence) {
            u.this.f.setTitle(charSequence);
        }

        public void p(boolean bl) {
            this.f = bl;
            u.this.f.setTitleOptional(bl);
        }
    }

}

