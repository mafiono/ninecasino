/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.graphics.drawable.Drawable
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 *  androidx.appcompat.app.AlertController
 *  androidx.appcompat.app.AlertController$b
 *  androidx.appcompat.view.menu.ExpandedMenuView
 *  c.b.c.g
 *  c.b.c.g$a
 *  c.b.g.i.e$a
 *  c.b.g.i.m
 *  c.b.g.i.m$a
 *  c.b.g.i.r
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package c.b.g.i;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import c.b.c.g;
import c.b.g.i.e;
import c.b.g.i.g;
import c.b.g.i.h;
import c.b.g.i.i;
import c.b.g.i.m;
import c.b.g.i.r;

/*
 * Exception performing whole class analysis.
 */
public class e
implements m,
AdapterView.OnItemClickListener {
    public Context e;
    public LayoutInflater f;
    public g g;
    public ExpandedMenuView h;
    public m.a i;
    public a j;

    public e(Context context, int n2) {
        this.e = context;
        this.f = LayoutInflater.from(context);
    }

    public void a(g g2, boolean bl) {
        m.a a2 = this.i;
        if (a2 != null) {
            a2.a(g2, bl);
        }
    }

    public ListAdapter b() {
        if (this.j == null) {
            this.j = new /* Unavailable Anonymous Inner Class!! */;
        }
        return this.j;
    }

    public boolean c() {
        return false;
    }

    public void d(Context context, g g2) {
        if (this.e != null) {
            this.e = context;
            if (this.f == null) {
                this.f = LayoutInflater.from(context);
            }
        }
        this.g = g2;
        a a2 = this.j;
        if (a2 != null) {
            a2.notifyDataSetChanged();
        }
    }

    public boolean e(g g2, i i2) {
        return false;
    }

    public boolean g(g g2, i i2) {
        return false;
    }

    public void h(m.a a2) {
        this.i = a2;
    }

    public boolean i(r r2) {
        c.b.c.g g2;
        e e2;
        if (!r2.hasVisibleItems()) {
            return false;
        }
        h h2 = new h(r2);
        g.a a2 = new g.a(r2.a);
        h2.g = e2 = new e(a2.a.a, 2131427348);
        e2.i = h2;
        g g3 = h2.e;
        g3.b(e2, g3.a);
        ListAdapter listAdapter = h2.g.b();
        AlertController.b b2 = a2.a;
        b2.g = listAdapter;
        b2.h = h2;
        View view = r2.o;
        if (view != null) {
            b2.e = view;
        } else {
            b2.c = r2.n;
            b2.d = r2.m;
        }
        b2.f = h2;
        h2.f = g2 = a2.a();
        g2.setOnDismissListener(h2);
        WindowManager.LayoutParams layoutParams = h2.f.getWindow().getAttributes();
        layoutParams.type = 1003;
        layoutParams.flags = 131072 | layoutParams.flags;
        h2.f.show();
        m.a a3 = this.i;
        if (a3 != null) {
            a3.b((g)r2);
        }
        return true;
    }

    public void j(boolean bl) {
        a a2 = this.j;
        if (a2 != null) {
            a2.notifyDataSetChanged();
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int n2, long l2) {
        this.g.s((MenuItem)this.j.b(n2), this, 0);
    }
}

