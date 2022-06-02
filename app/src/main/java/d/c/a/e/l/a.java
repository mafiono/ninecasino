/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package d.c.a.e.l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import d.c.a.e.l.d;

public final class a
extends AnimatorListenerAdapter {
    public final /* synthetic */ d a;

    public a(d d2) {
        this.a = d2;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.b();
    }

    public void onAnimationStart(Animator animator) {
        this.a.a();
    }
}

