/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  com.google.android.material.internal.CheckableImageButton
 *  d.c.a.e.z.a
 *  java.lang.Float
 *  java.lang.Object
 */
package d.c.a.e.z;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;
import d.c.a.e.z.a;
import d.c.a.e.z.m;

public class d
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ a a;

    public d(a a2) {
        this.a = a2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        this.a.c.setAlpha(f2);
    }
}

