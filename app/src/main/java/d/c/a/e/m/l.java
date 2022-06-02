/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$d
 *  d.c.a.e.m.g
 *  d.c.a.e.m.v
 *  java.lang.Object
 */
package d.c.a.e.m;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d.c.a.e.m.g;
import d.c.a.e.m.s;
import d.c.a.e.m.v;

public class l
implements View.OnClickListener {
    public final /* synthetic */ v e;
    public final /* synthetic */ g f;

    public l(g g2, v v2) {
        this.f = g2;
        this.e = v2;
    }

    public void onClick(View view) {
        int n2 = 1 + this.f.w0().j1();
        if (n2 < this.f.g0.getAdapter().a()) {
            this.f.y0(this.e.e(n2));
        }
    }
}

