/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$i
 *  androidx.recyclerview.widget.RecyclerView$i$c
 *  androidx.recyclerview.widget.RecyclerView$z
 *  c.s.c.k
 *  c.s.c.k$a
 *  java.lang.Object
 *  java.util.ArrayList
 */
package c.s.c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c.s.c.k;
import java.util.ArrayList;

public abstract class x
extends RecyclerView.i {
    public boolean g = true;

    public boolean a(RecyclerView.z z2, RecyclerView.z z3, RecyclerView.i.c c2, RecyclerView.i.c c3) {
        int n2;
        int n3;
        int n4 = c2.a;
        int n5 = c2.b;
        if (z3.t()) {
            int n6 = c2.a;
            n3 = c2.b;
            n2 = n6;
        } else {
            int n7 = c3.a;
            int n8 = c3.b;
            n2 = n7;
            n3 = n8;
        }
        k k2 = (k)this;
        if (z2 == z3) {
            return k2.i(z2, n4, n5, n2, n3);
        }
        float f2 = z2.a.getTranslationX();
        float f3 = z2.a.getTranslationY();
        float f4 = z2.a.getAlpha();
        k2.n(z2);
        int n9 = (int)((float)(n2 - n4) - f2);
        int n10 = (int)((float)(n3 - n5) - f3);
        z2.a.setTranslationX(f2);
        z2.a.setTranslationY(f3);
        z2.a.setAlpha(f4);
        k2.n(z3);
        z3.a.setTranslationX((float)(-n9));
        z3.a.setTranslationY((float)(-n10));
        z3.a.setAlpha(0.0f);
        ArrayList arrayList = k2.k;
        k.a a2 = new k.a(z2, z3, n4, n5, n2, n3);
        arrayList.add((Object)a2);
        return true;
    }

    public abstract boolean i(RecyclerView.z var1, int var2, int var3, int var4, int var5);
}

