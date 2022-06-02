/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  com.google.android.material.bottomsheet.BottomSheetBehavior
 *  d.c.a.e.w.g
 *  java.lang.Float
 *  java.lang.Object
 */
package d.c.a.e.g;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d.c.a.e.w.g;

public class a
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        g g2 = this.a.i;
        if (g2 != null) {
            g2.q(f2);
        }
    }
}

