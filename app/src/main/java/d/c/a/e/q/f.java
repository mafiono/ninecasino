/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  com.google.android.material.floatingactionbutton.FloatingActionButton
 *  java.lang.Object
 */
package d.c.a.e.q;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d.c.a.e.q.d;

public class f
implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ d e;

    public f(d d2) {
        this.e = d2;
    }

    public boolean onPreDraw() {
        d d2 = this.e;
        float f2 = d2.s.getRotation();
        if (d2.m != f2) {
            d2.m = f2;
            d2.s();
        }
        return true;
    }
}

