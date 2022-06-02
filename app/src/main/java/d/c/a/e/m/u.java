/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$d
 *  androidx.recyclerview.widget.RecyclerView$e
 *  com.google.android.material.datepicker.MaterialCalendarGridView
 *  d.c.a.e.m.g
 *  d.c.a.e.m.g$d
 *  d.c.a.e.m.v
 *  d.c.a.e.m.x
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.LinkedHashSet
 */
package d.c.a.e.m;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import d.c.a.e.m.a;
import d.c.a.e.m.d;
import d.c.a.e.m.g;
import d.c.a.e.m.t;
import d.c.a.e.m.v;
import d.c.a.e.m.w;
import d.c.a.e.m.x;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class u
implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView e;
    public final /* synthetic */ v f;

    public u(v v2, MaterialCalendarGridView materialCalendarGridView) {
        this.f = v2;
        this.e = materialCalendarGridView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int n2, long l2) {
        t t2 = this.e.a();
        boolean bl = n2 >= t2.a() && n2 <= t2.c();
        if (bl) {
            g.f f2 = this.f.e;
            long l3 = this.e.a().b(n2);
            g.d d2 = (g.d)f2;
            if (d2.a.b0.h.k(l3)) {
                d2.a.a0.n(l3);
                Iterator iterator = d2.a.Y.iterator();
                while (iterator.hasNext()) {
                    ((w)iterator.next()).a(d2.a.a0.g());
                }
                d2.a.g0.getAdapter().a.b();
                RecyclerView recyclerView = d2.a.f0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().a.b();
                }
            }
        }
    }
}

