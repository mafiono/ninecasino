/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  java.lang.Object
 */
package d.c.a.e.t;

import android.graphics.Typeface;
import d.c.a.e.r.b;
import d.c.a.e.r.c;
import d.c.a.e.t.d;

public final class a
extends d {
    public final Typeface a;
    public final a b;
    public boolean c;

    public a(a a2, Typeface typeface) {
        this.a = typeface;
        this.b = a2;
    }

    @Override
    public void a(int n2) {
        this.c(this.a);
    }

    @Override
    public void b(Typeface typeface, boolean bl) {
        this.c(typeface);
    }

    public final void c(Typeface typeface) {
        if (!this.c) {
            c c3 = ((b)this.b).a;
            a a2 = c3.v;
            boolean bl = true;
            if (a2 != null) {
                a2.c = bl;
            }
            if (c3.s != typeface) {
                c3.s = typeface;
            } else {
                bl = false;
            }
            if (bl) {
                c3.k();
            }
        }
    }

}

