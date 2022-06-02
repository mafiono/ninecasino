/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$l
 *  androidx.recyclerview.widget.RecyclerView$r
 *  androidx.recyclerview.widget.RecyclerView$w
 *  c.h.j.a
 *  c.h.j.x.b
 *  c.h.j.x.b$b
 *  c.h.j.x.c
 *  java.lang.Object
 *  java.util.Map
 *  java.util.WeakHashMap
 */
package c.s.c;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import c.h.j.x.b;
import c.h.j.x.c;
import java.util.Map;
import java.util.WeakHashMap;

public class w
extends c.h.j.a {
    public final RecyclerView d;
    public final a e;

    public w(RecyclerView recyclerView) {
        this.d = recyclerView;
        a a2 = this.e;
        if (a2 == null) {
            a2 = new a(this);
        }
        this.e = a2;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView;
        a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (view instanceof RecyclerView && !this.j() && (recyclerView = (RecyclerView)view).getLayoutManager() != null) {
            recyclerView.getLayoutManager().i0(accessibilityEvent);
        }
    }

    public void d(View view, b b2) {
        a.onInitializeAccessibilityNodeInfo(view, b2.a);
        if (!this.j() && this.d.getLayoutManager() != null) {
            RecyclerView.l l2 = this.d.getLayoutManager();
            RecyclerView recyclerView = l2.b;
            RecyclerView.r r2 = recyclerView.f;
            RecyclerView.w w2 = recyclerView.i0;
            if (recyclerView.canScrollVertically(-1) || l2.b.canScrollHorizontally(-1)) {
                b2.a.addAction(8192);
                b2.a.setScrollable(true);
            }
            if (l2.b.canScrollVertically(1) || l2.b.canScrollHorizontally(1)) {
                b2.a.addAction(4096);
                b2.a.setScrollable(true);
            }
            b2.i((Object)b.b.a((int)l2.S(r2, w2), (int)l2.A(r2, w2), (boolean)l2.W(), (int)l2.T()));
        }
    }

    public boolean g(View view, int n2, Bundle bundle) {
        if (super.g(view, n2, bundle)) {
            return true;
        }
        if (!this.j() && this.d.getLayoutManager() != null) {
            RecyclerView.l l2 = this.d.getLayoutManager();
            return l2.B0(n2);
        }
        return false;
    }

    public boolean j() {
        return this.d.M();
    }

    public static class a
    extends c.h.j.a {
        public final w d;
        public Map<View, c.h.j.a> e = new WeakHashMap();

        public a(w w2) {
            this.d = w2;
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            c.h.j.a a2 = this.e.get(view);
            if (a2 != null) {
                return a2.a(view, accessibilityEvent);
            }
            return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public c b(View view) {
            c.h.j.a a2 = this.e.get(view);
            if (a2 != null) {
                return a2.b(view);
            }
            return super.b(view);
        }

        public void c(View view, AccessibilityEvent accessibilityEvent) {
            c.h.j.a a2 = this.e.get(view);
            if (a2 != null) {
                a2.c(view, accessibilityEvent);
                return;
            }
            this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        public void d(View view, b b2) {
            if (!this.d.j() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().k0(view, b2);
                c.h.j.a a2 = this.e.get(view);
                if (a2 != null) {
                    a2.d(view, b2);
                    return;
                }
            }
            this.a.onInitializeAccessibilityNodeInfo(view, b2.a);
        }

        public void e(View view, AccessibilityEvent accessibilityEvent) {
            c.h.j.a a2 = this.e.get(view);
            if (a2 != null) {
                a2.e(view, accessibilityEvent);
                return;
            }
            this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            c.h.j.a a2 = this.e.get(viewGroup);
            if (a2 != null) {
                return a2.f(viewGroup, view, accessibilityEvent);
            }
            return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean g(View view, int n2, Bundle bundle) {
            if (!this.d.j() && this.d.d.getLayoutManager() != null) {
                c.h.j.a a2 = this.e.get(view);
                if (a2 != null ? a2.g(view, n2, bundle) : super.g(view, n2, bundle)) {
                    return true;
                }
                RecyclerView.l l2 = this.d.d.getLayoutManager();
                return l2.C0();
            }
            return super.g(view, n2, bundle);
        }

        public void h(View view, int n2) {
            c.h.j.a a2 = this.e.get(view);
            if (a2 != null) {
                a2.h(view, n2);
                return;
            }
            this.a.sendAccessibilityEvent(view, n2);
        }

        public void i(View view, AccessibilityEvent accessibilityEvent) {
            c.h.j.a a2 = this.e.get(view);
            if (a2 != null) {
                a2.i(view, accessibilityEvent);
                return;
            }
            this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

}

