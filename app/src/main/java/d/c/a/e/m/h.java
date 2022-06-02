/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  androidx.recyclerview.widget.GridLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$d
 *  androidx.recyclerview.widget.RecyclerView$k
 *  androidx.recyclerview.widget.RecyclerView$l
 *  androidx.recyclerview.widget.RecyclerView$w
 *  c.h.i.a
 *  d.c.a.e.m.g
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.Calendar
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Objects
 */
package d.c.a.e.m;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.h.i.a;
import d.c.a.e.m.a0;
import d.c.a.e.m.c0;
import d.c.a.e.m.d;
import d.c.a.e.m.g;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class h
extends RecyclerView.k {
    public final Calendar a = a0.e();
    public final Calendar b = a0.e();
    public final /* synthetic */ g c;

    public h(g g2) {
        this.c = g2;
    }

    public void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.w w3) {
        if (recyclerView.getAdapter() instanceof c0) {
            if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                return;
            }
            (c0)recyclerView.getAdapter();
            (GridLayoutManager)recyclerView.getLayoutManager();
            Iterator iterator = this.c.a0.j().iterator();
            while (iterator.hasNext()) {
                Objects.requireNonNull((Object) iterator.next());
            }
        }
    }
}

