/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  androidx.coordinatorlayout.widget.CoordinatorLayout
 *  androidx.coordinatorlayout.widget.CoordinatorLayout$c
 *  d.c.a.e.d.h
 */
package d.c.a.e.d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d.c.a.e.d.h;

public class g<V extends View>
extends CoordinatorLayout.c<V> {
    public h a;
    public int b = 0;

    public g() {
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int B() {
        h h2 = this.a;
        if (h2 != null) {
            return h2.d;
        }
        return 0;
    }

    public void C(CoordinatorLayout coordinatorLayout, V v3, int n2) {
        coordinatorLayout.r(v3, n2);
    }

    public boolean D(int n2) {
        h h2 = this.a;
        if (h2 != null) {
            int n3 = h2.d;
            boolean bl = false;
            if (n3 != n2) {
                h2.d = n2;
                h2.a();
                bl = true;
            }
            return bl;
        }
        this.b = n2;
        return false;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, V v3, int n2) {
        this.C(coordinatorLayout, v3, n2);
        if (this.a == null) {
            this.a = new h(v3);
        }
        h h2 = this.a;
        h2.b = h2.a.getTop();
        h2.c = h2.a.getLeft();
        this.a.a();
        int n3 = this.b;
        if (n3 != 0) {
            h h3 = this.a;
            if (h3.d != n3) {
                h3.d = n3;
                h3.a();
            }
            this.b = 0;
        }
        return true;
    }
}

