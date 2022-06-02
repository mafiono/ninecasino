/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Transformation
 *  androidx.swiperefreshlayout.widget.SwipeRefreshLayout
 */
package c.u.b;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class e
extends Animation {
    public final /* synthetic */ SwipeRefreshLayout e;

    public e(SwipeRefreshLayout swipeRefreshLayout) {
        this.e = swipeRefreshLayout;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        this.e.setAnimationProgress(f2);
    }
}

