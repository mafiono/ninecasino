/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.animation.TypeEvaluator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.res.ColorStateList
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.InsetDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Property
 *  android.util.StateSet
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  c.h.b.g
 *  com.google.android.material.floatingactionbutton.FloatingActionButton
 *  com.google.android.material.floatingactionbutton.FloatingActionButton$b
 *  d.c.a.e.a
 *  d.c.a.e.c.a
 *  d.c.a.e.c.e
 *  d.c.a.e.c.g
 *  d.c.a.e.c.h
 *  d.c.a.e.q.d$a
 *  d.c.a.e.q.d$b
 *  d.c.a.e.q.d$c
 *  d.c.a.e.q.d$d
 *  d.c.a.e.q.d$g
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 */
package d.c.a.e.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d.c.a.e.q.d;
import d.c.a.e.r.g;
import d.c.a.e.w.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/*
 * Exception performing whole class analysis.
 */
public class d {
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final TimeInterpolator z;
    public j a;
    public boolean b;
    public boolean c;
    public float d;
    public float e;
    public float f;
    public final d.c.a.e.r.g g;
    public d.c.a.e.c.g h;
    public d.c.a.e.c.g i;
    public Animator j;
    public d.c.a.e.c.g k;
    public d.c.a.e.c.g l;
    public float m;
    public float n;
    public int o;
    public ArrayList<Animator.AnimatorListener> p;
    public ArrayList<Animator.AnimatorListener> q;
    public ArrayList<e> r;
    public final FloatingActionButton s;
    public final d.c.a.e.v.b t;
    public final Rect u;
    public final RectF v;
    public final RectF w;
    public final Matrix x;
    public ViewTreeObserver.OnPreDrawListener y;

    public static {
        z = d.c.a.e.c.a.c;
        A = new int[]{16842919, 16842910};
        B = new int[]{16843623, 16842908, 16842910};
        C = new int[]{16842908, 16842910};
        D = new int[]{16843623, 16842910};
        E = new int[]{16842910};
        F = new int[0];
    }

    public d(FloatingActionButton floatingActionButton, d.c.a.e.v.b b2) {
        d.c.a.e.r.g g2;
        this.c = true;
        this.n = 1.0f;
        this.o = 0;
        this.u = new Rect();
        this.v = new RectF();
        this.w = new RectF();
        this.x = new Matrix();
        this.s = floatingActionButton;
        this.t = b2;
        this.g = g2 = new g();
        g2.a(A, this.b((h)new /* Unavailable Anonymous Inner Class!! */));
        g2.a(B, this.b((h)new /* Unavailable Anonymous Inner Class!! */));
        g2.a(C, this.b((h)new /* Unavailable Anonymous Inner Class!! */));
        g2.a(D, this.b((h)new /* Unavailable Anonymous Inner Class!! */));
        g2.a(E, this.b((h)new /* Unavailable Anonymous Inner Class!! */));
        g2.a(F, this.b((h)new /* Unavailable Anonymous Inner Class!! */));
        this.m = floatingActionButton.getRotation();
    }

    public final AnimatorSet a(d.c.a.e.c.g g2, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat((Object)this.s, (Property)View.ALPHA, new float[]{f2});
        g2.d("opacity").a((Animator)objectAnimator);
        arrayList.add(objectAnimator);
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat((Object)this.s, (Property)View.SCALE_X, new float[]{f3});
        g2.d("scale").a((Animator)objectAnimator2);
        int n2 = Build.VERSION.SDK_INT;
        if (n2 == 26) {
            objectAnimator2.setEvaluator(new d.c.a.e.q.e(this));
        }
        arrayList.add(objectAnimator2);
        ObjectAnimator objectAnimator3 = ObjectAnimator.ofFloat((Object)this.s, (Property)View.SCALE_Y, new float[]{f3});
        g2.d("scale").a((Animator)objectAnimator3);
        if (n2 == 26) {
            objectAnimator3.setEvaluator(new d.c.a.e.q.e(this));
        }
        arrayList.add(objectAnimator3);
        this.x.reset();
        this.s.getDrawable();
        FloatingActionButton floatingActionButton = this.s;
        d.c.a.e.c.e e2 = new d.c.a.e.c.e();
        a a2 = new a(this);
        Object[] arrobject = new Matrix[]{new Matrix(this.x)};
        ObjectAnimator objectAnimator4 = ObjectAnimator.ofObject((Object)floatingActionButton, e2, (TypeEvaluator)a2, (Object[])arrobject);
        g2.d("iconScale").a((Animator)objectAnimator4);
        arrayList.add(objectAnimator4);
        AnimatorSet animatorSet = new AnimatorSet();
        d.c.a.e.a.g0((AnimatorSet)animatorSet, (List)arrayList);
        return animatorSet;
    }

    public final ValueAnimator b(h h2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(z);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(h2);
        valueAnimator.addUpdateListener(h2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public float c() {
        return this.d;
    }

    public void d(Rect rect) {
        boolean bl = this.b;
        int n2 = 0;
        if (bl) {
            n2 = (0 - this.s.getSizeDimension()) / 2;
        }
        float f2 = this.c ? this.c() + this.f : 0.0f;
        int n3 = Math.max(n2, (int)Math.ceil(f2));
        int n4 = Math.max(n2, (int)Math.ceil(f2 * 1.5f));
        rect.set(n3, n4, n3, n4);
    }

    public boolean e() {
        if (this.s.getVisibility() == 0) {
            int n2 = this.o;
            boolean bl = n2 == 1;
            return bl;
        }
        int n3 = this.o;
        boolean bl = n3 != 2;
        return bl;
    }

    public boolean f() {
        if (this.s.getVisibility() != 0) {
            int n2 = this.o;
            boolean bl = n2 == 2;
            return bl;
        }
        int n3 = this.o;
        boolean bl = n3 != 1;
        return bl;
    }

    public void g() {
        d.c.a.e.r.g g2 = this.g;
        ValueAnimator valueAnimator = g2.c;
        if (valueAnimator != null) {
            valueAnimator.end();
            g2.c = null;
        }
    }

    public void h() {
    }

    public void i(int[] arrn) {
        d.c.a.e.r.g g2;
        ValueAnimator valueAnimator;
        g.b b2;
        block5 : {
            g2 = this.g;
            int n2 = g2.a.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                b2 = g2.a.get(i2);
                if (!StateSet.stateSetMatches(b2.a, arrn)) {
                    continue;
                }
                break block5;
            }
            b2 = null;
        }
        g.b b3 = g2.b;
        if (b2 == b3) {
            return;
        }
        if (b3 != null && (valueAnimator = g2.c) != null) {
            valueAnimator.cancel();
            g2.c = null;
        }
        g2.b = b2;
        if (b2 != null) {
            ValueAnimator valueAnimator2;
            g2.c = valueAnimator2 = b2.b;
            valueAnimator2.start();
        }
    }

    public void j(float f2, float f3, float f4) {
        this.t();
        throw null;
    }

    public void k() {
        ArrayList<e> arrayList = this.r;
        if (arrayList != null) {
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                ((e)iterator.next()).a();
            }
        }
    }

    public void l() {
        ArrayList<e> arrayList = this.r;
        if (arrayList != null) {
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                ((e)iterator.next()).b();
            }
        }
    }

    public boolean m() {
        return true;
    }

    public final void n(float f2) {
        this.n = f2;
        Matrix matrix = this.x;
        matrix.reset();
        this.s.getDrawable();
        this.s.setImageMatrix(matrix);
    }

    public void o(ColorStateList colorStateList) {
    }

    public boolean p() {
        return true;
    }

    public final boolean q() {
        FloatingActionButton floatingActionButton = this.s;
        return floatingActionButton.isLaidOut() && !this.s.isInEditMode();
    }

    public final boolean r() {
        return !this.b || this.s.getSizeDimension() >= 0;
        {
        }
    }

    public void s() {
        block2 : {
            int n2;
            FloatingActionButton floatingActionButton;
            block4 : {
                block3 : {
                    if (Build.VERSION.SDK_INT != 19) break block2;
                    if (this.m % 90.0f == 0.0f) break block3;
                    int n3 = this.s.getLayerType();
                    if (n3 == (n2 = 1)) break block2;
                    floatingActionButton = this.s;
                    break block4;
                }
                if (this.s.getLayerType() == 0) break block2;
                floatingActionButton = this.s;
                n2 = 0;
            }
            floatingActionButton.setLayerType(n2, null);
        }
    }

    public final void t() {
        Rect rect = this.u;
        this.d(rect);
        c.h.b.g.g(null, (Object)"Didn't initialize content background");
        if (this.p()) {
            InsetDrawable insetDrawable = new InsetDrawable(null, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.b b2 = (FloatingActionButton.b)this.t;
            Objects.requireNonNull(b2);
            FloatingActionButton.c((FloatingActionButton)b2.a, (Drawable)insetDrawable);
        } else {
            Objects.requireNonNull(this.t);
        }
        d.c.a.e.v.b b3 = this.t;
        Objects.requireNonNull(((FloatingActionButton.b)b3).a);
        throw null;
    }

    public interface e {
        void a();

        void b();
    }

    public interface f {
    }

    public abstract class h
    extends AnimatorListenerAdapter
    implements ValueAnimator.AnimatorUpdateListener {
        public boolean a;
        public float b;

        public h(d.c.a.e.q.b b2) {
        }

        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            Objects.requireNonNull((Object)d.this);
            this.a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                Objects.requireNonNull((Object)d.this);
                this.b = this.a();
                this.a = true;
            }
            d d2 = d.this;
            valueAnimator.getAnimatedFraction();
            Objects.requireNonNull((Object)d2);
        }
    }

}

