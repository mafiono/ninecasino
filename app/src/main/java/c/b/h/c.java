/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.SparseBooleanArray
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.widget.ImageView
 *  androidx.appcompat.view.menu.ActionMenuItemView
 *  androidx.appcompat.view.menu.ActionMenuItemView$b
 *  androidx.appcompat.widget.ActionMenuView
 *  androidx.appcompat.widget.ActionMenuView$a
 *  androidx.appcompat.widget.ActionMenuView$c
 *  androidx.appcompat.widget.AppCompatImageView
 *  c.b.a
 *  c.b.g.i.g$b
 *  c.b.g.i.l
 *  c.b.g.i.m
 *  c.b.g.i.m$a
 *  c.b.g.i.n
 *  c.b.g.i.n$a
 *  c.b.h.c$c
 *  c.b.h.g0
 *  c.h.b.g
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Objects
 */
package c.b.h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import c.b.g.i.g;
import c.b.g.i.i;
import c.b.g.i.k;
import c.b.g.i.l;
import c.b.g.i.m;
import c.b.g.i.n;
import c.b.g.i.r;
import c.b.h.c;
import c.b.h.g0;
import java.util.ArrayList;
import java.util.Objects;

/*
 * Exception performing whole class analysis.
 */
public class c
extends c.b.g.i.b {
    public b A;
    public final f B;
    public d m;
    public Drawable n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public int v;
    public final SparseBooleanArray w;
    public e x;
    public a y;
    public c z;

    public c(Context context) {
        super(context, 2131427335, 2131427334);
        this.w = new SparseBooleanArray();
        this.B = new m.a(){

            public void a(g g2, boolean bl) {
                m.a a2;
                if (g2 instanceof r) {
                    g2.k().c(false);
                }
                if ((a2 = c.this.i) != null) {
                    a2.a(g2, bl);
                }
            }

            public boolean b(g g2) {
                c c2 = c.this;
                if (g2 == c2.g) {
                    return false;
                }
                m.a a2 = c2.i;
                boolean bl = false;
                if (a2 != null) {
                    bl = a2.b(g2);
                }
                return bl;
            }
        };
    }

    public void a(g g2, boolean bl) {
        this.b();
        m.a a2 = this.i;
        if (a2 != null) {
            a2.a(g2, bl);
        }
    }

    public boolean b() {
        return this.k() | this.l();
    }

    public boolean c() {
        int n2;
        int n3;
        int n4;
        ArrayList<i> arrayList;
        g g2 = this.g;
        if (g2 != null) {
            arrayList = g2.l();
            n3 = arrayList.size();
        } else {
            arrayList = null;
            n3 = 0;
        }
        int n5 = this.t;
        int n6 = this.s;
        int n7 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup)this.l;
        int n8 = 0;
        boolean bl = false;
        int n9 = 0;
        int n10 = 0;
        do {
            n2 = 2;
            n4 = 1;
            if (n8 >= n3) break;
            i i2 = arrayList.get(n8);
            int n11 = i2.y;
            boolean bl2 = (n11 & 2) == n2;
            if (bl2) {
                ++n10;
            } else {
                boolean bl3 = (n11 & 1) == n4;
                if (bl3) {
                    ++n9;
                } else {
                    bl = true;
                }
            }
            if (this.u && i2.C) {
                n5 = 0;
            }
            ++n8;
        } while (true);
        if (this.p && (bl || n9 + n10 > n5)) {
            --n5;
        }
        int n12 = n5 - n10;
        SparseBooleanArray sparseBooleanArray = this.w;
        sparseBooleanArray.clear();
        int n13 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            i i4 = arrayList.get(i3);
            int n14 = i4.y;
            boolean bl4 = (n14 & 2) == n2;
            if (bl4) {
                int n15;
                View view = this.f(i4, null, viewGroup);
                view.measure(n7, n7);
                int n16 = view.getMeasuredWidth();
                n6 -= n16;
                if (n13 == 0) {
                    n13 = n16;
                }
                if ((n15 = i4.b) != 0) {
                    sparseBooleanArray.put(n15, (boolean)n4);
                }
                i4.k((boolean)n4);
            } else {
                boolean bl5 = (n14 & 1) == n4;
                if (bl5) {
                    int n17 = i4.b;
                    boolean bl6 = sparseBooleanArray.get(n17);
                    boolean bl7 = (n12 > 0 || bl6) && n6 > 0;
                    if (bl7) {
                        View view = this.f(i4, null, viewGroup);
                        view.measure(n7, n7);
                        int n18 = view.getMeasuredWidth();
                        n6 -= n18;
                        if (n13 == 0) {
                            n13 = n18;
                        }
                        boolean bl8 = n6 + n13 > 0;
                        bl7 &= bl8;
                    }
                    if (bl7 && n17 != 0) {
                        sparseBooleanArray.put(n17, true);
                    } else if (bl6) {
                        sparseBooleanArray.put(n17, false);
                        for (int i5 = 0; i5 < i3; ++i5) {
                            i i6 = arrayList.get(i5);
                            if (i6.b != n17) continue;
                            if (i6.g()) {
                                ++n12;
                            }
                            i6.k(false);
                        }
                    }
                    if (bl7) {
                        --n12;
                    }
                    i4.k(bl7);
                } else {
                    i4.k(false);
                }
            }
            n2 = 2;
            n4 = 1;
        }
        return true;
    }

    public void d(Context context, g g2) {
        this.f = context;
        LayoutInflater.from(context);
        this.g = g2;
        Resources resources = context.getResources();
        if (!this.q) {
            this.p = true;
        }
        int n2 = context.getResources().getDisplayMetrics().widthPixels;
        int n3 = 2;
        this.r = n2 / n3;
        Configuration configuration = context.getResources().getConfiguration();
        int n4 = configuration.screenWidthDp;
        int n5 = configuration.screenHeightDp;
        if (!(configuration.smallestScreenWidthDp > 600 || n4 > 600 || n4 > 960 && n5 > 720 || n4 > 720 && n5 > 960)) {
            if (!(n4 >= 500 || n4 > 640 && n5 > 480 || n4 > 480 && n5 > 640)) {
                if (n4 >= 360) {
                    n3 = 3;
                }
            } else {
                n3 = 4;
            }
        } else {
            n3 = 5;
        }
        this.t = n3;
        int n6 = this.r;
        if (this.p) {
            if (this.m == null) {
                d d2;
                this.m = d2 = new d(this.e);
                if (this.o) {
                    d2.setImageDrawable(this.n);
                    this.n = null;
                    this.o = false;
                }
                int n7 = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.m.measure(n7, n7);
            }
            n6 -= this.m.getMeasuredWidth();
        } else {
            this.m = null;
        }
        this.s = n6;
        this.v = (int)(56.0f * resources.getDisplayMetrics().density);
    }

    public View f(i i2, View view, ViewGroup viewGroup) {
        View view2 = i2.getActionView();
        if (view2 == null || i2.f()) {
            n.a a2 = view instanceof n.a ? (n.a)view : (n.a)this.h.inflate(this.k, viewGroup, false);
            a2.d(i2, 0);
            ActionMenuView actionMenuView = (ActionMenuView)this.l;
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView)a2;
            actionMenuItemView.setItemInvoker(actionMenuView);
            if (this.A == null) {
                this.A = new ActionMenuItemView.b(){};
            }
            actionMenuItemView.setPopupCallback((ActionMenuItemView.b)this.A);
            view2 = (View)a2;
        }
        boolean bl = i2.C;
        int n2 = 0;
        if (bl) {
            n2 = 8;
        }
        view2.setVisibility(n2);
        ActionMenuView actionMenuView = (ActionMenuView)viewGroup;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            view2.setLayoutParams((ViewGroup.LayoutParams)actionMenuView.r(layoutParams));
        }
        return view2;
    }

    public boolean i(r r2) {
        IllegalStateException illegalStateException;
        View view;
        g g2;
        boolean bl;
        if (!r2.hasVisibleItems()) {
            return false;
        }
        r r3 = r2;
        while ((g2 = r3.z) != this.g) {
            r3 = (r)g2;
        }
        i i2 = r3.A;
        ViewGroup viewGroup = (ViewGroup)this.l;
        if (viewGroup == null) {
            view = null;
        } else {
            int n2 = viewGroup.getChildCount();
            int n3 = 0;
            do {
                view = null;
                if (n3 >= n2) break;
                View view2 = viewGroup.getChildAt(n3);
                if (view2 instanceof n.a && ((n.a)view2).getItemData() == i2) {
                    view = view2;
                    break;
                }
                ++n3;
            } while (true);
        }
        if (view == null) {
            return false;
        }
        int n4 = r2.size();
        int n5 = 0;
        do {
            bl = false;
            if (n5 >= n4) break;
            MenuItem menuItem = r2.getItem(n5);
            if (menuItem.isVisible() && menuItem.getIcon() != null) {
                bl = true;
                break;
            }
            ++n5;
        } while (true);
        l l2 = new l(this.f, r2, view){
            {
                if (!r2.A.g()) {
                    d d2 = c.this.m;
                    if (d2 == null) {
                        d2 = (View)c.this.l;
                    }
                    this.f = d2;
                }
                this.d((m.a)c.this.B);
            }

            public void c() {
                c c2 = c.this;
                c2.y = null;
                Objects.requireNonNull((Object)c2);
                super.c();
            }
        };
        this.y = l2;
        l2.h = bl;
        k k2 = l2.j;
        if (k2 != null) {
            k2.p(bl);
        }
        if (this.y.f()) {
            m.a a2 = this.i;
            if (a2 != null) {
                a2.b((g)r2);
            }
            return true;
        }
        illegalStateException = new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        throw illegalStateException;
    }

    public void j(boolean bl) {
        n n2;
        ViewParent viewParent;
        ViewGroup viewGroup = (ViewGroup)this.l;
        if (viewGroup != null) {
            int n3;
            g g2 = this.g;
            if (g2 != null) {
                g2.i();
                ArrayList<i> arrayList = this.g.l();
                int n4 = arrayList.size();
                n3 = 0;
                for (int i2 = 0; i2 < n4; ++i2) {
                    i i3 = arrayList.get(i2);
                    if (!i3.g()) continue;
                    View view = viewGroup.getChildAt(n3);
                    i i4 = view instanceof n.a ? ((n.a)view).getItemData() : null;
                    View view2 = this.f(i3, view, viewGroup);
                    if (i3 != i4) {
                        view2.setPressed(false);
                        view2.jumpDrawablesToCurrentState();
                    }
                    if (view2 != view) {
                        ViewGroup viewGroup2 = (ViewGroup)view2.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(view2);
                        }
                        ((ViewGroup)this.l).addView(view2, n3);
                    }
                    ++n3;
                }
            } else {
                n3 = 0;
            }
            while (n3 < viewGroup.getChildCount()) {
                boolean bl2;
                if (viewGroup.getChildAt(n3) == this.m) {
                    bl2 = false;
                } else {
                    viewGroup.removeViewAt(n3);
                    bl2 = true;
                }
                if (bl2) continue;
                ++n3;
            }
        }
        ((View)this.l).requestLayout();
        g g3 = this.g;
        if (g3 != null) {
            g3.i();
            ArrayList<i> arrayList = g3.i;
            int n5 = arrayList.size();
            for (int i5 = 0; i5 < n5; ++i5) {
            }
        }
        g g4 = this.g;
        ArrayList<i> arrayList = null;
        if (g4 != null) {
            g4.i();
            arrayList = g4.j;
        }
        boolean bl3 = this.p;
        boolean bl4 = false;
        if (bl3) {
            bl4 = false;
            if (arrayList != null) {
                int n6 = arrayList.size();
                if (n6 == 1) {
                    bl4 = true ^ arrayList.get(0).C;
                } else {
                    bl4 = n6 > 0;
                }
            }
        }
        d d2 = this.m;
        if (bl4) {
            ViewGroup viewGroup3;
            if (d2 == null) {
                this.m = new d(this.e);
            }
            if ((viewGroup3 = (ViewGroup)this.m.getParent()) != this.l) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.m);
                }
                ActionMenuView actionMenuView = (ActionMenuView)this.l;
                d d3 = this.m;
                ActionMenuView.c c2 = actionMenuView.q();
                c2.c = true;
                actionMenuView.addView(d3, (ViewGroup.LayoutParams)c2);
            }
        } else if (d2 != null && (viewParent = d2.getParent()) == (n2 = this.l)) {
            ((ViewGroup)n2).removeView(this.m);
        }
        ((ActionMenuView)this.l).setOverflowReserved(this.p);
    }

    public boolean k() {
        n n2;
        c c2 = this.z;
        if (c2 != null && (n2 = this.l) != null) {
            n2.removeCallbacks((Runnable)c2);
            this.z = null;
            return true;
        }
        e e2 = this.x;
        if (e2 != null) {
            if (e2.b()) {
                e2.j.dismiss();
            }
            return true;
        }
        return false;
    }

    public boolean l() {
        a a2 = this.y;
        if (a2 != null) {
            if (a2.b()) {
                a2.j.dismiss();
            }
            return true;
        }
        return false;
    }

    public boolean m() {
        e e2 = this.x;
        return e2 != null && e2.b();
    }

    public boolean n() {
        g g2;
        if (this.p && !this.m() && (g2 = this.g) != null && this.l != null && this.z == null) {
            g2.i();
            if (!g2.j.isEmpty()) {
                c c2;
                l l2 = new l(this.f, this.g, (View)this.m, true){
                    {
                        this.g = 8388613;
                        this.d((m.a)c.this.B);
                    }

                    public void c() {
                        g g2 = c.this.g;
                        if (g2 != null) {
                            g2.c(true);
                        }
                        c.this.x = null;
                        super.c();
                    }
                };
                this.z = c2 = new /* Unavailable Anonymous Inner Class!! */;
                ((View)this.l).post((Runnable)c2);
                return true;
            }
        }
        return false;
    }

    public class d
    extends AppCompatImageView
    implements ActionMenuView.a {
        public d(Context context) {
            super(context, null, 2130903069);
            this.setClickable(true);
            this.setFocusable(true);
            this.setVisibility(0);
            this.setEnabled(true);
            c.b.a.c((View)this, (CharSequence)this.getContentDescription());
            this.setOnTouchListener((OnTouchListener)new g0(this, (View)this, c.this){
                public final /* synthetic */ d n;
                {
                    this.n = d2;
                    super(view);
                }

                public c.b.g.i.p b() {
                    e e2 = this.n.c.this.x;
                    if (e2 == null) {
                        return null;
                    }
                    return e2.a();
                }

                public boolean c() {
                    this.n.c.this.n();
                    return true;
                }

                public boolean d() {
                    c c2 = this.n.c.this;
                    if (c2.z != null) {
                        return false;
                    }
                    c2.k();
                    return true;
                }
            });
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (ImageView.super.performClick()) {
                return true;
            }
            this.playSoundEffect(0);
            c.this.n();
            return true;
        }

        public boolean setFrame(int n2, int n3, int n4, int n5) {
            boolean bl = ImageView.super.setFrame(n2, n3, n4, n5);
            Drawable drawable = this.getDrawable();
            Drawable drawable2 = this.getBackground();
            if (drawable != null && drawable2 != null) {
                int n6 = this.getWidth();
                int n7 = this.getHeight();
                int n8 = Math.max(n6, n7) / 2;
                int n9 = this.getPaddingLeft() - this.getPaddingRight();
                int n10 = this.getPaddingTop() - this.getPaddingBottom();
                int n11 = (n6 + n9) / 2;
                int n12 = (n7 + n10) / 2;
                c.h.b.g.P((Drawable)drawable2, (int)(n11 - n8), (int)(n12 - n8), (int)(n11 + n8), (int)(n12 + n8));
            }
            return bl;
        }
    }

}

