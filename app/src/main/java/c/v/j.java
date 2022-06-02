/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  c.e.a
 *  java.lang.Object
 *  java.util.ArrayList
 */
package c.v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import c.e.a;
import c.v.i;
import java.util.ArrayList;

public class j
extends AnimatorListenerAdapter {
    public final /* synthetic */ a a;
    public final /* synthetic */ i b;

    public j(i i2, a a2) {
        this.b = i2;
        this.a = a2;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.q.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.b.q.add(animator);
    }
}

