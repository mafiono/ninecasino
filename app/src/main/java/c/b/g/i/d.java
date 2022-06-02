/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.transition.Transition
 *  android.util.DisplayMetrics
 *  android.view.Gravity
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnKeyListener
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.HeaderViewListAdapter
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  c.b.g.i.d$a
 *  c.b.g.i.d$b
 *  c.b.g.i.d$d
 *  c.b.g.i.f
 *  c.b.g.i.m
 *  c.b.g.i.m$a
 *  c.b.h.e0
 *  c.b.h.k0
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 */
package c.b.g.i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.transition.Transition;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import c.b.g.i.d;
import c.b.g.i.f;
import c.b.g.i.g;
import c.b.g.i.k;
import c.b.g.i.m;
import c.b.g.i.r;
import c.b.h.e0;
import c.b.h.j0;
import c.b.h.k0;
import c.b.h.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class d
extends k
implements m,
View.OnKeyListener,
PopupWindow.OnDismissListener {
    public boolean A;
    public m.a B;
    public ViewTreeObserver C;
    public PopupWindow.OnDismissListener D;
    public boolean E;
    public final Context f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final Handler k;
    public final List<g> l = new ArrayList();
    public final List<d> m = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener n = new a(this);
    public final View.OnAttachStateChangeListener o = new b(this);
    public final k0 p = new k0(this){
        public final /* synthetic */ d e;
        {
            this.e = d2;
        }

        public void e(g g2, android.view.MenuItem menuItem) {
            int n2;
            block4 : {
                this.e.k.removeCallbacksAndMessages(null);
                int n3 = this.e.m.size();
                for (n2 = 0; n2 < n3; ++n2) {
                    if (g2 != (this.e.m.get(n2)).b) {
                        continue;
                    }
                    break block4;
                }
                n2 = -1;
            }
            if (n2 == -1) {
                return;
            }
            int n4 = n2 + 1;
            int n5 = this.e.m.size();
            d d2 = null;
            if (n4 < n5) {
                d2 = this.e.m.get(n4);
            }
            c.b.g.i.d$c$a a2 = new c.b.g.i.d$c$a(this, d2, menuItem, g2);
            long l2 = 200L + android.os.SystemClock.uptimeMillis();
            this.e.k.postAtTime((Runnable)a2, g2, l2);
        }

        public void h(g g2, android.view.MenuItem menuItem) {
            this.e.k.removeCallbacksAndMessages(g2);
        }
    };
    public int q = 0;
    public int r = 0;
    public View s;
    public View t;
    public int u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public boolean z;

    public d(Context context, View view, int n2, int n3, boolean bl) {
        this.f = context;
        this.s = view;
        this.h = n2;
        this.i = n3;
        this.j = bl;
        this.z = false;
        int n4 = view.getLayoutDirection() == 1 ? 0 : 1;
        this.u = n4;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131099671));
        this.k = new Handler();
    }

    public void a(g g2, boolean bl) {
        int n2;
        View view;
        block11 : {
            int n3 = this.m.size();
            for (n2 = 0; n2 < n3; ++n2) {
                if (g2 != (this.m.get(n2)).b) {
                    continue;
                }
                break block11;
            }
            n2 = -1;
        }
        if (n2 < 0) {
            return;
        }
        int n4 = n2 + 1;
        if (n4 < this.m.size()) {
            (this.m.get(n4)).b.c(false);
        }
        d d2 = this.m.remove(n2);
        d2.b.u(this);
        if (this.E) {
            l0 l02 = d2.a;
            Objects.requireNonNull((Object)l02);
            if (Build.VERSION.SDK_INT >= 23) {
                l02.D.setExitTransition(null);
            }
            d2.a.D.setAnimationStyle(0);
        }
        d2.a.dismiss();
        int n5 = this.m.size();
        int n6 = n5 > 0 ? (this.m.get(n5 - 1)).c : ((view = this.s).getLayoutDirection() == 1 ? 0 : 1);
        this.u = n6;
        if (n5 == 0) {
            ViewTreeObserver viewTreeObserver;
            this.dismiss();
            m.a a2 = this.B;
            if (a2 != null) {
                a2.a(g2, true);
            }
            if ((viewTreeObserver = this.C) != null) {
                if (viewTreeObserver.isAlive()) {
                    this.C.removeGlobalOnLayoutListener(this.n);
                }
                this.C = null;
            }
            this.t.removeOnAttachStateChangeListener(this.o);
            this.D.onDismiss();
            return;
        }
        if (bl) {
            (this.m.get(0)).b.c(false);
        }
    }

    public boolean b() {
        int n2 = this.m.size();
        boolean bl = false;
        if (n2 > 0) {
            boolean bl2 = (this.m.get(0)).a.b();
            bl = bl2;
        }
        return bl;
    }

    public boolean c() {
        return false;
    }

    public void dismiss() {
        int n2 = this.m.size();
        if (n2 > 0) {
            d[] arrd = (d[])this.m.toArray((Object[])new d[n2]);
            for (int i2 = n2 - 1; i2 >= 0; --i2) {
                d d2 = arrd[i2];
                if (!d2.a.b()) continue;
                d2.a.dismiss();
            }
        }
    }

    public void f() {
        View view;
        if (this.b()) {
            return;
        }
        Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            this.w((g)iterator.next());
        }
        this.l.clear();
        this.t = view = this.s;
        if (view != null) {
            ViewTreeObserver viewTreeObserver;
            boolean bl = this.C == null;
            this.C = viewTreeObserver = view.getViewTreeObserver();
            if (bl) {
                viewTreeObserver.addOnGlobalLayoutListener(this.n);
            }
            this.t.addOnAttachStateChangeListener(this.o);
        }
    }

    public void h(m.a a2) {
        this.B = a2;
    }

    public boolean i(r r2) {
        for (d d2 : this.m) {
            if (r2 != d2.b) continue;
            d2.a.g.requestFocus();
            return true;
        }
        if (r2.hasVisibleItems()) {
            r2.b(this, this.f);
            if (this.b()) {
                this.w(r2);
            } else {
                this.l.add(r2);
            }
            m.a a2 = this.B;
            if (a2 != null) {
                a2.b((g)r2);
            }
            return true;
        }
        return false;
    }

    public void j(boolean bl) {
        Iterator iterator = this.m.iterator();
        while (iterator.hasNext()) {
            ListAdapter listAdapter = (iterator.next()).a.g.getAdapter();
            if (listAdapter instanceof HeaderViewListAdapter) {
                listAdapter = ((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
            }
            ((f)listAdapter).notifyDataSetChanged();
        }
    }

    public ListView k() {
        if (this.m.isEmpty()) {
            return null;
        }
        List<d> list = this.m;
        return (list.get(-1 + list.size())).a.g;
    }

    @Override
    public void l(g g2) {
        g2.b(this, this.f);
        if (this.b()) {
            this.w(g2);
            return;
        }
        this.l.add(g2);
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void o(View view) {
        if (this.s != view) {
            this.s = view;
            int n2 = this.q;
            this.r = Gravity.getAbsoluteGravity(n2, view.getLayoutDirection());
        }
    }

    public void onDismiss() {
        d d2;
        block3 : {
            int n2 = this.m.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                d2 = this.m.get(i2);
                if (d2.a.b()) {
                    continue;
                }
                break block3;
            }
            d2 = null;
        }
        if (d2 != null) {
            d2.b.c(false);
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
        this.z = bl;
    }

    @Override
    public void q(int n2) {
        if (this.q != n2) {
            this.q = n2;
            View view = this.s;
            this.r = Gravity.getAbsoluteGravity(n2, view.getLayoutDirection());
        }
    }

    @Override
    public void r(int n2) {
        this.v = true;
        this.x = n2;
    }

    @Override
    public void s(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override
    public void t(boolean bl) {
        this.A = bl;
    }

    @Override
    public void u(int n2) {
        this.w = true;
        this.y = n2;
    }

    /*
     * Exception decompiling
     */
    public final void w(g var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl240 : ILOAD_2 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }
}

