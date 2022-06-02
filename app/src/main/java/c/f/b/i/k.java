/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.f.b.c
 *  c.f.b.i.d
 *  java.lang.Object
 *  java.util.ArrayList
 */
package c.f.b.i;

import c.f.b.c;
import c.f.b.i.d;
import java.util.ArrayList;

public class k
extends d {
    public ArrayList<d> e0 = new ArrayList();

    public void E() {
        ArrayList<d> arrayList = this.e0;
        if (arrayList == null) {
            return;
        }
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            d d2 = this.e0.get(i2);
            if (!(d2 instanceof k)) continue;
            ((k)d2).E();
        }
    }

    public void u() {
        this.e0.clear();
        super.u();
    }

    public void v(c c2) {
        super.v(c2);
        int n2 = this.e0.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((d)this.e0.get(i2)).v(c2);
        }
    }
}

