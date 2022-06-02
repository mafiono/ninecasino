/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.widget.Adapter
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.HeaderViewListAdapter
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  c.b.g.i.f
 *  c.b.g.i.m
 *  c.b.g.i.p
 *  java.lang.Object
 */
package c.b.g.i;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import c.b.g.i.f;
import c.b.g.i.g;
import c.b.g.i.i;
import c.b.g.i.m;
import c.b.g.i.p;

public abstract class k
implements p,
m,
AdapterView.OnItemClickListener {
    public Rect e;

    public static int n(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int n2) {
        int n3 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int n4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        f f2 = (f)listAdapter;
        int n5 = f2.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int n6 = 0;
        int n7 = 0;
        for (int i2 = 0; i2 < n5; ++i2) {
            int n8 = f2.getItemViewType(i2);
            if (n8 != n7) {
                view = null;
                n7 = n8;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = f2.getView(i2, view, (ViewGroup)frameLayout);
            view.measure(n3, n4);
            int n9 = view.getMeasuredWidth();
            if (n9 >= n2) {
                return n2;
            }
            if (n9 <= n6) continue;
            n6 = n9;
        }
        return n6;
    }

    public static boolean v(g g2) {
        int n2 = g2.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            MenuItem menuItem = g2.getItem(i2);
            if (!menuItem.isVisible() || menuItem.getIcon() == null) continue;
            return true;
        }
        return false;
    }

    public void d(Context context, g g2) {
    }

    public boolean e(g g2, i i2) {
        return false;
    }

    public boolean g(g g2, i i2) {
        return false;
    }

    public abstract void l(g var1);

    public boolean m() {
        return true;
    }

    public abstract void o(View var1);

    public void onItemClick(AdapterView<?> adapterView, View view, int n2, long l2) {
        ListAdapter listAdapter = (ListAdapter)adapterView.getAdapter();
        f f2 = listAdapter instanceof HeaderViewListAdapter ? (f)((HeaderViewListAdapter)listAdapter).getWrappedAdapter() : (f)listAdapter;
        g g2 = f2.e;
        MenuItem menuItem = (MenuItem)listAdapter.getItem(n2);
        int n3 = this.m() ? 0 : 4;
        g2.s(menuItem, this, n3);
    }

    public abstract void p(boolean var1);

    public abstract void q(int var1);

    public abstract void r(int var1);

    public abstract void s(PopupWindow.OnDismissListener var1);

    public abstract void t(boolean var1);

    public abstract void u(int var1);
}

