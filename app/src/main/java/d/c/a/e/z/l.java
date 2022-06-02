/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.ValueAnimator
 *  com.google.android.material.internal.CheckableImageButton
 *  d.c.a.e.z.h
 */
package d.c.a.e.z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;
import d.c.a.e.z.h;
import d.c.a.e.z.m;

public class l
extends AnimatorListenerAdapter {
    public final /* synthetic */ h a;

    public l(h h2) {
        this.a = h2;
    }

    public void onAnimationEnd(Animator animator) {
        h h2 = this.a;
        h2.c.setChecked(h2.j);
        this.a.p.start();
    }
}

