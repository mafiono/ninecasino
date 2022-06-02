/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.recyclerview.widget.RecyclerView
 *  c.s.c.b
 *  c.s.c.b$b
 *  java.lang.Object
 */
package c.s.c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c.s.c.b;

public class u
implements b.b {
    public final /* synthetic */ RecyclerView a;

    public u(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public View a(int n2) {
        return this.a.getChildAt(n2);
    }

    public int b() {
        return this.a.getChildCount();
    }

    public void c(int n2) {
        View view = this.a.getChildAt(n2);
        if (view != null) {
            this.a.p(view);
            view.clearAnimation();
        }
        this.a.removeViewAt(n2);
    }
}

