/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.StateListDrawable
 *  android.view.MotionEvent
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$k
 *  androidx.recyclerview.widget.RecyclerView$l
 *  androidx.recyclerview.widget.RecyclerView$o
 *  androidx.recyclerview.widget.RecyclerView$p
 *  androidx.recyclerview.widget.RecyclerView$w
 *  c.s.c.l$a
 *  c.s.c.l$c
 *  c.s.c.l$d
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package c.s.c;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import c.s.c.l;
import java.util.ArrayList;
import java.util.List;

/*
 * Exception performing whole class analysis.
 */
public class l
extends RecyclerView.k
implements RecyclerView.o {
    public static final int[] D;
    public static final int[] E;
    public int A;
    public final Runnable B;
    public final RecyclerView.p C;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public int q;
    public int r;
    public RecyclerView s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public final int[] x;
    public final int[] y;
    public final ValueAnimator z;

    public static {
        D = new int[]{16842919};
        E = new int[0];
    }

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int n2, int n3, int n4) {
        ValueAnimator valueAnimator;
        RecyclerView.p p2;
        this.q = 0;
        this.r = 0;
        this.t = false;
        this.u = false;
        this.v = 0;
        this.w = 0;
        this.x = new int[2];
        this.y = new int[2];
        this.z = valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A = 0;
        this.B = new a(this);
        this.C = p2 = new RecyclerView.p(){

            public void b(RecyclerView recyclerView, int n2, int n3) {
                int n4;
                l l2 = l.this;
                int n5 = recyclerView.computeHorizontalScrollOffset();
                int n6 = recyclerView.computeVerticalScrollOffset();
                int n7 = l2.s.computeVerticalScrollRange();
                boolean bl = n7 - (n4 = l2.r) > 0 && n4 >= l2.a;
                l2.t = bl;
                int n8 = l2.s.computeHorizontalScrollRange();
                int n9 = l2.q;
                boolean bl2 = n8 - n9 > 0 && n9 >= l2.a;
                l2.u = bl2;
                boolean bl3 = l2.t;
                if (!bl3 && !bl2) {
                    if (l2.v != 0) {
                        l2.j(0);
                        return;
                    }
                } else {
                    int n10;
                    if (bl3) {
                        float f2 = n6;
                        float f3 = n4;
                        l2.l = (int)(f3 * (f2 + f3 / 2.0f) / (float)n7);
                        l2.k = Math.min(n4, n4 * n4 / n7);
                    }
                    if (l2.u) {
                        float f4 = n5;
                        float f5 = n9;
                        l2.o = (int)(f5 * (f4 + f5 / 2.0f) / (float)n8);
                        l2.n = Math.min(n9, n9 * n9 / n8);
                    }
                    if ((n10 = l2.v) == 0 || n10 == 1) {
                        l2.j(1);
                    }
                }
            }
        };
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(n2, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(n2, drawable.getIntrinsicWidth());
        this.i = Math.max(n2, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(n2, drawable2.getIntrinsicWidth());
        this.a = n3;
        this.b = n4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimator.addListener((Animator.AnimatorListener)new /* Unavailable Anonymous Inner Class!! */);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new /* Unavailable Anonymous Inner Class!! */);
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            List list;
            RecyclerView.l l2 = recyclerView2.p;
            if (l2 != null) {
                l2.d("Cannot remove item decoration during a scroll  or layout");
            }
            recyclerView2.r.remove((Object)this);
            if (recyclerView2.r.isEmpty()) {
                int n5 = recyclerView2.getOverScrollMode();
                boolean bl = n5 == 2;
                recyclerView2.setWillNotDraw(bl);
            }
            recyclerView2.Q();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.s;
            recyclerView3.s.remove((Object)this);
            if (recyclerView3.t == this) {
                recyclerView3.t = null;
            }
            if ((list = this.s.k0) != null) {
                list.remove((Object)p2);
            }
            this.f();
        }
        this.s = recyclerView;
        recyclerView.g((RecyclerView.k)this);
        this.s.s.add((Object)this);
        this.s.h(p2);
    }

    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int n2 = this.v;
        if (n2 == 1) {
            boolean bl = this.h(motionEvent.getX(), motionEvent.getY());
            boolean bl2 = this.g(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (bl || bl2)) {
                if (bl2) {
                    this.w = 1;
                    this.p = (int)motionEvent.getX();
                } else if (bl) {
                    this.w = 2;
                    this.m = (int)motionEvent.getY();
                }
                this.j(2);
                return true;
            }
        } else return n2 == 2;
        return false;
    }

    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean bl = this.h(motionEvent.getX(), motionEvent.getY());
            boolean bl2 = this.g(motionEvent.getX(), motionEvent.getY());
            if (bl || bl2) {
                if (bl2) {
                    this.w = 1;
                    this.p = (int)motionEvent.getX();
                } else if (bl) {
                    this.w = 2;
                    this.m = (int)motionEvent.getY();
                }
                this.j(2);
                return;
            }
        } else {
            if (motionEvent.getAction() == 1 && this.v == 2) {
                this.m = 0.0f;
                this.p = 0.0f;
                this.j(1);
                this.w = 0;
                return;
            }
            if (motionEvent.getAction() == 2 && this.v == 2) {
                this.k();
                if (this.w == 1) {
                    int n2;
                    float f2 = motionEvent.getX();
                    int[] arrn = this.y;
                    arrn[0] = n2 = this.b;
                    arrn[1] = this.q - n2;
                    float f3 = Math.max((float)arrn[0], Math.min((float)arrn[1], f2));
                    if (!(Math.abs((float)this.o - f3) < 2.0f)) {
                        int n3 = this.i(this.p, f3, arrn, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
                        if (n3 != 0) {
                            this.s.scrollBy(n3, 0);
                        }
                        this.p = f3;
                    }
                }
                if (this.w == 2) {
                    int n4;
                    float f4 = motionEvent.getY();
                    int[] arrn = this.x;
                    arrn[0] = n4 = this.b;
                    arrn[1] = this.r - n4;
                    float f5 = Math.max((float)arrn[0], Math.min((float)arrn[1], f4));
                    if (Math.abs((float)this.l - f5) < 2.0f) {
                        return;
                    }
                    int n5 = this.i(this.m, f5, arrn, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
                    if (n5 != 0) {
                        this.s.scrollBy(0, n5);
                    }
                    this.m = f5;
                }
            }
        }
    }

    public void c(boolean bl) {
    }

    public void e(Canvas canvas, RecyclerView recyclerView, RecyclerView.w w2) {
        if (this.q == this.s.getWidth() && this.r == this.s.getHeight()) {
            if (this.A != 0) {
                if (this.t) {
                    int n2 = this.q;
                    int n3 = this.e;
                    int n4 = n2 - n3;
                    int n5 = this.l;
                    int n6 = this.k;
                    int n7 = n5 - n6 / 2;
                    this.c.setBounds(0, 0, n3, n6);
                    this.d.setBounds(0, 0, this.f, this.r);
                    RecyclerView recyclerView2 = this.s;
                    int n8 = recyclerView2.getLayoutDirection();
                    int n9 = 1;
                    if (n8 != n9) {
                        n9 = 0;
                    }
                    if (n9 != 0) {
                        this.d.draw(canvas);
                        canvas.translate((float)this.e, (float)n7);
                        canvas.scale(-1.0f, 1.0f);
                        this.c.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        n4 = this.e;
                    } else {
                        canvas.translate((float)n4, 0.0f);
                        this.d.draw(canvas);
                        canvas.translate(0.0f, (float)n7);
                        this.c.draw(canvas);
                    }
                    canvas.translate((float)(-n4), (float)(-n7));
                }
                if (this.u) {
                    int n10 = this.r;
                    int n11 = this.i;
                    int n12 = n10 - n11;
                    int n13 = this.o;
                    int n14 = this.n;
                    int n15 = n13 - n14 / 2;
                    this.g.setBounds(0, 0, n14, n11);
                    this.h.setBounds(0, 0, this.q, this.j);
                    canvas.translate(0.0f, (float)n12);
                    this.h.draw(canvas);
                    canvas.translate((float)n15, 0.0f);
                    this.g.draw(canvas);
                    canvas.translate((float)(-n15), (float)(-n12));
                }
            }
            return;
        }
        this.q = this.s.getWidth();
        this.r = this.s.getHeight();
        this.j(0);
    }

    public final void f() {
        this.s.removeCallbacks(this.B);
    }

    public boolean g(float f2, float f3) {
        int n2;
        int n3;
        return f3 >= (float)(this.r - this.i) && f2 >= (float)((n2 = this.o) - (n3 = this.n) / 2) && f2 <= (float)(n2 + n3 / 2);
    }

    public boolean h(float f2, float f3) {
        boolean bl;
        block6 : {
            block7 : {
                block5 : {
                    RecyclerView recyclerView = this.s;
                    boolean bl2 = recyclerView.getLayoutDirection() == 1;
                    if (!bl2) break block5;
                    float f4 = f2 FCMPG (float)(this.e / 2);
                    bl = false;
                    if (f4 > 0) break block6;
                    break block7;
                }
                float f5 = f2 FCMPL (float)(this.q - this.e);
                bl = false;
                if (f5 < 0) break block6;
            }
            int n2 = this.l;
            int n3 = this.k / 2;
            float f6 = f3 FCMPL (float)(n2 - n3);
            bl = false;
            if (f6 >= 0) {
                float f7 = f3 FCMPG (float)(n3 + n2);
                bl = f7 <= 0;
            }
        }
        return bl;
    }

    public final int i(float f2, float f3, int[] arrn, int n2, int n3, int n4) {
        int n5 = arrn[1] - arrn[0];
        if (n5 == 0) {
            return 0;
        }
        float f4 = (f3 - f2) / (float)n5;
        int n6 = n2 - n4;
        int n7 = (int)(f4 * (float)n6);
        int n8 = n3 + n7;
        if (n8 < n6 && n8 >= 0) {
            return n7;
        }
        return 0;
    }

    public void j(int n2) {
        block8 : {
            int n3;
            block7 : {
                block6 : {
                    if (n2 == 2 && this.v != 2) {
                        this.c.setState(D);
                        this.f();
                    }
                    if (n2 == 0) {
                        this.s.invalidate();
                    } else {
                        this.k();
                    }
                    if (this.v != 2 || n2 == 2) break block6;
                    this.c.setState(E);
                    n3 = 1200;
                    break block7;
                }
                if (n2 != 1) break block8;
                n3 = 1500;
            }
            this.f();
            this.s.postDelayed(this.B, n3);
        }
        this.v = n2;
    }

    public void k() {
        int n2 = this.A;
        if (n2 != 0) {
            if (n2 != 3) {
                return;
            }
            this.z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        float[] arrf = new float[]{((Float)valueAnimator.getAnimatedValue()).floatValue(), 1.0f};
        valueAnimator.setFloatValues(arrf);
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }

}

