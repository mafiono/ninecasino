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

public class c
extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d.f b;
    public final /* synthetic */ d c;

    public c(d d2, boolean bl, d.f f2) {
        this.c = d2;
        this.a = bl;
        this.b = f2;
    }

    public void onAnimationEnd(Animator animator) {
        d d2 = this.c;
        d2.o = 0;
        d2.j = null;
        d.f f2 = this.b;
        if (f2 != null) {
            a a2 = (a)f2;
            a2.a.b(a2.b);
        }
    }

    public void onAnimationStart(Animator animator) {
        this.c.s.b(0, this.a);
        d d2 = this.c;
        d2.o = 2;
        d2.j = animator;
    }
}

