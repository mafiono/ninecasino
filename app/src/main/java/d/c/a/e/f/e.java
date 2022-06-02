/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  com.google.android.material.bottomappbar.BottomAppBar
 *  java.lang.Object
 *  java.util.Objects
 */
package d.c.a.e.f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

public class e
extends AnimatorListenerAdapter {
    public final /* synthetic */ BottomAppBar a;

    public e(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull((Object)this.a);
        throw null;
    }
}

