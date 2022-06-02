/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$p
 *  com.google.android.material.button.MaterialButton
 *  d.c.a.e.m.g
 *  java.lang.CharSequence
 *  java.lang.String
 */
package d.c.a.e.m;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import d.c.a.e.m.a;
import d.c.a.e.m.g;
import d.c.a.e.m.s;
import d.c.a.e.m.v;

public class j
extends RecyclerView.p {
    public final /* synthetic */ v a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ g c;

    public j(g g2, v v3, MaterialButton materialButton) {
        this.c = g2;
        this.a = v3;
        this.b = materialButton;
    }

    public void a(RecyclerView recyclerView, int n2) {
        if (n2 == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    public void b(RecyclerView recyclerView, int n2, int n3) {
        LinearLayoutManager linearLayoutManager = this.c.w0();
        int n4 = n2 < 0 ? linearLayoutManager.j1() : linearLayoutManager.l1();
        this.c.c0 = this.a.e(n4);
        this.b.setText(this.a.c.e.v(n4).f);
    }
}

