/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  com.google.android.material.textfield.TextInputLayout
 *  d.c.a.e.z.a
 */
package d.c.a.e.z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.TextInputLayout;
import d.c.a.e.z.a;
import d.c.a.e.z.m;

public class b
extends AnimatorListenerAdapter {
    public final /* synthetic */ a a;

    public b(a a2) {
        this.a = a2;
    }

    public void onAnimationStart(Animator animator) {
        this.a.a.setEndIconVisible(true);
    }
}

