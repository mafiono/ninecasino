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
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.text.TextUtils
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  com.google.android.material.textfield.TextInputLayout
 *  d.c.a.e.a
 *  d.c.a.e.c.a
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package d.c.a.e.z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;

public final class n {
    public final Context a;
    public final TextInputLayout b;
    public LinearLayout c;
    public int d;
    public FrameLayout e;
    public int f;
    public Animator g;
    public final float h;
    public int i;
    public int j;
    public CharSequence k;
    public boolean l;
    public TextView m;
    public CharSequence n;
    public int o;
    public ColorStateList p;
    public CharSequence q;
    public boolean r;
    public TextView s;
    public int t;
    public ColorStateList u;
    public Typeface v;

    public n(TextInputLayout textInputLayout) {
        Context context;
        this.a = context = textInputLayout.getContext();
        this.b = textInputLayout;
        this.h = context.getResources().getDimensionPixelSize(2131099802);
    }

    public void a(TextView textView, int n2) {
        if (this.c == null && this.e == null) {
            LinearLayout linearLayout;
            this.c = linearLayout = new LinearLayout(this.a);
            linearLayout.setOrientation(0);
            this.b.addView(this.c, -1, -2);
            this.e = new FrameLayout(this.a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            this.c.addView(this.e, layoutParams);
            if (this.b.getEditText() != null) {
                this.b();
            }
        }
        boolean bl = n2 == 0 || n2 == 1;
        if (bl) {
            this.e.setVisibility(0);
            this.e.addView(textView);
            this.f = 1 + this.f;
        } else {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.c.addView(textView, layoutParams);
        }
        this.c.setVisibility(0);
        this.d = 1 + this.d;
    }

    public void b() {
        boolean bl = this.c != null && this.b.getEditText() != null;
        if (bl) {
            LinearLayout linearLayout = this.c;
            EditText editText = this.b.getEditText();
            linearLayout.setPaddingRelative(editText.getPaddingStart(), 0, this.b.getEditText().getPaddingEnd(), 0);
        }
    }

    public void c() {
        Animator animator = this.g;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(List<Animator> list, boolean bl, TextView textView, int n2, int n3, int n4) {
        if (textView != null) {
            if (!bl) {
                return;
            }
            if (n2 == n4 || n2 == n3) {
                boolean bl2 = n4 == n2;
                float f2 = bl2 ? 1.0f : 0.0f;
                ObjectAnimator objectAnimator = ObjectAnimator.ofFloat((Object)textView, (Property)View.ALPHA, new float[]{f2});
                objectAnimator.setDuration(167L);
                objectAnimator.setInterpolator(d.c.a.e.c.a.a);
                list.add(objectAnimator);
                if (n4 == n2) {
                    Property property = View.TRANSLATION_Y;
                    float[] arrf = new float[]{-this.h, 0.0f};
                    ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat((Object)textView, property, arrf);
                    objectAnimator2.setDuration(217L);
                    objectAnimator2.setInterpolator(d.c.a.e.c.a.d);
                    list.add(objectAnimator2);
                }
            }
        }
    }

    public boolean e() {
        return this.j == 1 && this.m != null && !TextUtils.isEmpty(this.k);
    }

    public final TextView f(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                return null;
            }
            return this.s;
        }
        return this.m;
    }

    public int g() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public void h() {
        this.k = null;
        this.c();
        if (this.i == 1) {
            int n2 = this.r && !TextUtils.isEmpty(this.q) ? 2 : 0;
            this.j = n2;
        }
        this.k(this.i, this.j, this.j(this.m, null));
    }

    public void i(TextView textView, int n2) {
        FrameLayout frameLayout;
        int n3;
        LinearLayout linearLayout = this.c;
        if (linearLayout == null) {
            return;
        }
        boolean bl = n2 == 0 || n2 == 1;
        if (bl && (frameLayout = this.e) != null) {
            int n4;
            this.f = n4 = this.f - 1;
            if (n4 == 0) {
                frameLayout.setVisibility(8);
            }
            this.e.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        this.d = n3 = this.d - 1;
        LinearLayout linearLayout2 = this.c;
        if (n3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean j(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.b;
        return textInputLayout.isLaidOut() && this.b.isEnabled() && (this.j != this.i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public final void k(final int n2, final int n3, boolean bl) {
        if (n2 == n3) {
            return;
        }
        if (bl) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.g = animatorSet;
            ArrayList arrayList = new ArrayList();
            this.d((List<Animator>)arrayList, this.r, this.s, 2, n2, n3);
            this.d((List<Animator>)arrayList, this.l, this.m, 1, n2, n3);
            d.c.a.e.a.g0((AnimatorSet)animatorSet, (List)arrayList);
            final TextView textView = this.f(n2);
            final TextView textView2 = this.f(n3);
            AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter(){

                public void onAnimationEnd(Animator animator) {
                    TextView textView4;
                    n n22 = n.this;
                    n22.i = n3;
                    n22.g = null;
                    TextView textView22 = textView;
                    if (textView22 != null) {
                        TextView textView3;
                        textView22.setVisibility(4);
                        if (n2 == 1 && (textView3 = n.this.m) != null) {
                            textView3.setText(null);
                        }
                    }
                    if ((textView4 = textView2) != null) {
                        textView4.setTranslationY(0.0f);
                        textView2.setAlpha(1.0f);
                    }
                }

                public void onAnimationStart(Animator animator) {
                    TextView textView3 = textView2;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                }
            };
            animatorSet.addListener(animatorListenerAdapter);
            animatorSet.start();
        } else if (n2 != n3) {
            TextView textView;
            TextView textView3;
            if (n3 != 0 && (textView3 = this.f(n3)) != null) {
                textView3.setVisibility(0);
                textView3.setAlpha(1.0f);
            }
            if (n2 != 0 && (textView = this.f(n2)) != null) {
                textView.setVisibility(4);
                if (n2 == 1) {
                    textView.setText(null);
                }
            }
            this.i = n3;
        }
        this.b.v();
        this.b.y(bl, false);
        this.b.F();
    }

}

