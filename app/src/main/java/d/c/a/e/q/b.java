/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  com.google.android.material.floatingactionbutton.FloatingActionButton
 *  com.google.android.material.floatingactionbutton.FloatingActionButton$a
 *  d.c.a.e.q.a
 */
package d.c.a.e.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d.c.a.e.q.a;
import d.c.a.e.q.d;

public class b
extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d.f c;
    public final /* synthetic */ d d;

    public b(d d2, boolean bl, d.f f2) {
        this.d = d2;
        this.b = bl;
        this.c = f2;
    }

    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public void onAnimationEnd(Animator animator) {
        d d2 = this.d;
        d2.o = 0;
        d2.j = null;
        if (!this.a) {
            FloatingActionButton floatingActionButton = d2.s;
            boolean bl = this.b;
            int n2 = bl ? 8 : 4;
            floatingActionButton.b(n2, bl);
            d.f f2 = this.c;
            if (f2 != null) {
                a a2 = (a)f2;
                a2.a.a(a2.b);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        this.d.s.b(0, this.b);
        d d2 = this.d;
        d2.o = 1;
        d2.j = animator;
        this.a = false;
    }
}

