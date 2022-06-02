/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  com.google.android.material.internal.CheckableImageButton
 *  d.c.a.e.z.h
 *  java.lang.Float
 *  java.lang.Object
 */
package d.c.a.e.z;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;
import d.c.a.e.z.h;
import d.c.a.e.z.m;

public class i
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ h a;

    public i(h h2) {
        this.a = h2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        this.a.c.setAlpha(f2);
    }
}

