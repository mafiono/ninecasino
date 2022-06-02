/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$l
 *  androidx.recyclerview.widget.RecyclerView$m
 *  c.s.c.t
 */
package c.s.c;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c.s.c.t;

public final class r
extends t {
    public r(RecyclerView.l l2) {
        super(l2, null);
    }

    public int b(View view) {
        RecyclerView.m m2 = (RecyclerView.m)view.getLayoutParams();
        return this.a.G(view) + m2.rightMargin;
    }

    public int c(View view) {
        RecyclerView.m m2 = (RecyclerView.m)view.getLayoutParams();
        return this.a.F(view) + m2.leftMargin + m2.rightMargin;
    }

    public int d(View view) {
        RecyclerView.m m2 = (RecyclerView.m)view.getLayoutParams();
        return this.a.E(view) + m2.topMargin + m2.bottomMargin;
    }

    public int e(View view) {
        RecyclerView.m m2 = (RecyclerView.m)view.getLayoutParams();
        return this.a.D(view) - m2.leftMargin;
    }

    public int f() {
        return this.a.p;
    }

    public int g() {
        RecyclerView.l l2 = this.a;
        return l2.p - l2.O();
    }

    public int h() {
        return this.a.O();
    }

    public int i() {
        return this.a.n;
    }

    public int j() {
        return this.a.o;
    }

    public int k() {
        return this.a.N();
    }

    public int l() {
        RecyclerView.l l2 = this.a;
        return l2.p - l2.N() - this.a.O();
    }

    public int n(View view) {
        this.a.U(view, true, this.c);
        return this.c.right;
    }

    public int o(View view) {
        this.a.U(view, true, this.c);
        return this.c.left;
    }

    public void p(int n2) {
        this.a.a0(n2);
    }
}

