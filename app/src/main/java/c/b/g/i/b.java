/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  c.b.g.i.m
 *  c.b.g.i.m$a
 *  c.b.g.i.n
 *  java.lang.Object
 */
package c.b.g.i;

import android.content.Context;
import android.view.LayoutInflater;
import c.b.g.i.g;
import c.b.g.i.i;
import c.b.g.i.m;
import c.b.g.i.n;

public abstract class b
implements m {
    public Context e;
    public Context f;
    public g g;
    public LayoutInflater h;
    public m.a i;
    public int j;
    public int k;
    public n l;

    public b(Context context, int n2, int n3) {
        this.e = context;
        this.h = LayoutInflater.from(context);
        this.j = n2;
        this.k = n3;
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
}

