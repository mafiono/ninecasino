/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.animation.AnimatorSet$Builder
 *  android.animation.ObjectAnimator
 *  android.animation.StateListAnimator
 *  android.animation.TimeInterpolator
 *  android.content.res.ColorStateList
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Property
 *  android.view.View
 *  com.google.android.material.floatingactionbutton.FloatingActionButton
 *  com.google.android.material.floatingactionbutton.FloatingActionButton$b
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package d.c.a.e.q;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d.c.a.e.q.d;
import d.c.a.e.v.b;
import java.util.ArrayList;

public class g
extends d {
    public g(FloatingActionButton floatingActionButton, b b3) {
        super(floatingActionButton, b3);
    }

    @Override
    public float c() {
        return this.s.getElevation();
    }

    @Override
    public void d(Rect rect) {
        if (((FloatingActionButton.b)this.t).a.n) {
            super.d(rect);
            return;
        }
        boolean bl = this.r();
        int n2 = 0;
        if (!bl) {
            n2 = (0 - this.s.getSizeDimension()) / 2;
        }
        rect.set(n2, n2, n2, n2);
    }

    @Override
    public void g() {
    }

    @Override
    public void h() {
        this.t();
        throw null;
    }

    @Override
    public void i(int[] arrn) {
        block0 : {
            FloatingActionButton floatingActionButton;
            float f2;
            block3 : {
                block4 : {
                    block1 : {
                        block2 : {
                            if (Build.VERSION.SDK_INT != 21) break block0;
                            boolean bl = this.s.isEnabled();
                            f2 = 0.0f;
                            if (!bl) break block1;
                            this.s.setElevation(this.d);
                            if (!this.s.isPressed()) break block2;
                            floatingActionButton = this.s;
                            f2 = this.f;
                            break block3;
                        }
                        if (!this.s.isFocused() && !this.s.isHovered()) break block4;
                        floatingActionButton = this.s;
                        f2 = this.e;
                        break block3;
                    }
                    this.s.setElevation(0.0f);
                }
                floatingActionButton = this.s;
            }
            floatingActionButton.setTranslationZ(f2);
        }
    }

    @Override
    public void j(float f2, float f3, float f5) {
        int n2 = Build.VERSION.SDK_INT;
        if (n2 == 21) {
            this.s.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(d.A, this.u(f2, f5));
            stateListAnimator.addState(d.B, this.u(f2, f3));
            stateListAnimator.addState(d.C, this.u(f2, f3));
            stateListAnimator.addState(d.D, this.u(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.s, "elevation", new float[]{f2}).setDuration(0L));
            if (n2 >= 22 && n2 <= 24) {
                FloatingActionButton floatingActionButton = this.s;
                Property property = View.TRANSLATION_Z;
                float[] arrf = new float[]{floatingActionButton.getTranslationZ()};
                arrayList.add(ObjectAnimator.ofFloat((Object)floatingActionButton, property, arrf).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat((Object)this.s, (Property)View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100L));
            animatorSet.playSequentially((Animator[])arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(d.z);
            stateListAnimator.addState(d.E, (Animator)animatorSet);
            stateListAnimator.addState(d.F, this.u(0.0f, 0.0f));
            this.s.setStateListAnimator(stateListAnimator);
        }
        if (!this.p()) {
            return;
        }
        this.t();
        throw null;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void o(ColorStateList colorStateList) {
    }

    @Override
    public boolean p() {
        return ((FloatingActionButton.b)this.t).a.n || !this.r();
        {
        }
    }

    @Override
    public void s() {
    }

    public final Animator u(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.s, "elevation", new float[]{f2}).setDuration(0L)).with(ObjectAnimator.ofFloat((Object)this.s, (Property)View.TRANSLATION_Z, new float[]{f3}).setDuration(100L));
        animatorSet.setInterpolator(d.z);
        return animatorSet;
    }
}

