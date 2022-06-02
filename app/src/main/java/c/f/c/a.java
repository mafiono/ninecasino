/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.View
 *  c.f.b.i.a
 *  c.f.b.i.d
 *  c.f.b.i.g
 *  c.f.c.c
 */
package c.f.c;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import c.f.b.i.d;
import c.f.b.i.g;
import c.f.c.c;

public class a
extends c {
    public int k;
    public int l;
    public c.f.b.i.a m;

    public a(Context context) {
        super(context);
        View.super.setVisibility(8);
    }

    public void e(AttributeSet attributeSet) {
        c.f.b.i.a a2;
        super.e(null);
        this.m = a2 = new c.f.b.i.a();
        this.h = a2;
        this.j();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f(d d2, boolean bl) {
        block6 : {
            int n2;
            block9 : {
                block5 : {
                    int n3;
                    block8 : {
                        block7 : {
                            block4 : {
                                this.l = n3 = this.k;
                                if (!bl) break block4;
                                if (n3 == 5) break block5;
                                if (n3 != 6) break block6;
                                break block7;
                            }
                            if (n3 != 5) break block8;
                        }
                        n2 = 0;
                        break block9;
                    }
                    if (n3 != 6) break block6;
                }
                n2 = 1;
            }
            this.l = n2;
        }
        if (d2 instanceof c.f.b.i.a) {
            ((c.f.b.i.a)d2).g0 = this.l;
        }
    }

    public int getMargin() {
        return this.m.i0;
    }

    public int getType() {
        return this.k;
    }

    public void setAllowsGoneWidget(boolean bl) {
        this.m.h0 = bl;
    }

    public void setDpMargin(int n2) {
        int n3;
        this.m.i0 = n3 = (int)(0.5f + this.getResources().getDisplayMetrics().density * (float)n2);
    }

    public void setMargin(int n2) {
        this.m.i0 = n2;
    }

    public void setType(int n2) {
        this.k = n2;
    }
}

