/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.graphics.drawable.StateListDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextWatcher
 *  android.text.method.KeyListener
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.View$OnTouchListener
 *  android.view.accessibility.AccessibilityManager
 *  android.widget.AutoCompleteTextView
 *  android.widget.AutoCompleteTextView$OnDismissListener
 *  android.widget.EditText
 *  c.b.d.a.a
 *  com.google.android.material.internal.CheckableImageButton
 *  com.google.android.material.textfield.TextInputLayout
 *  com.google.android.material.textfield.TextInputLayout$e
 *  com.google.android.material.textfield.TextInputLayout$f
 *  com.google.android.material.textfield.TextInputLayout$g
 *  d.c.a.e.a
 *  d.c.a.e.c.a
 *  d.c.a.e.z.h$c
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.util.LinkedHashSet
 *  java.util.Objects
 */
package d.c.a.e.z;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d.c.a.e.w.g;
import d.c.a.e.w.j;
import d.c.a.e.z.h;
import d.c.a.e.z.i;
import d.c.a.e.z.j;
import d.c.a.e.z.k;
import d.c.a.e.z.l;
import d.c.a.e.z.m;
import java.util.LinkedHashSet;
import java.util.Objects;

public class h
extends m {
    public static final boolean q;
    public final TextWatcher d = new TextWatcher(this){
        public final /* synthetic */ h e;
        {
            this.e = h2;
        }

        public void afterTextChanged(android.text.Editable editable) {
            h h2 = this.e;
            AutoCompleteTextView autoCompleteTextView = h.e(h2, h2.a.getEditText());
            autoCompleteTextView.post(new Runnable(this, autoCompleteTextView){
                public final /* synthetic */ AutoCompleteTextView e;
                public final /* synthetic */ a f;
                {
                    this.f = a2;
                    this.e = autoCompleteTextView;
                }

                public void run() {
                    boolean bl = this.e.isPopupShowing();
                    h.f(this.f.e, bl);
                    this.f.e.i = bl;
                }
            });
        }

        public void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
        }

        public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
        }
    };
    public final View.OnFocusChangeListener e = new View.OnFocusChangeListener(this){
        public final /* synthetic */ h a;
        {
            this.a = h2;
        }

        public void onFocusChange(View view, boolean bl) {
            this.a.a.setEndIconActivated(bl);
            if (!bl) {
                h.f(this.a, false);
                this.a.i = false;
            }
        }
    };
    public final TextInputLayout.e f = new c(this, this.a);
    public final TextInputLayout.f g = new TextInputLayout.f(){

        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextView;
            boolean bl;
            block12 : {
                g g2;
                block14 : {
                    h h2;
                    int n2;
                    block13 : {
                        autoCompleteTextView = h.e(h.this, textInputLayout.getEditText());
                        h2 = h.this;
                        Objects.requireNonNull((Object)h2);
                        bl = h.q;
                        if (!bl) break block12;
                        n2 = h2.a.getBoxBackgroundMode();
                        if (n2 != 2) break block13;
                        g2 = h2.m;
                        break block14;
                    }
                    if (n2 != 1) break block12;
                    g2 = h2.l;
                }
                autoCompleteTextView.setDropDownBackgroundDrawable(g2);
            }
            h h3 = h.this;
            Objects.requireNonNull((Object)h3);
            if (autoCompleteTextView.getKeyListener() == null) {
                int n3 = h3.a.getBoxBackgroundMode();
                g g3 = h3.a.getBoxBackground();
                int n4 = d.c.a.e.a.A((View)autoCompleteTextView, (int)2130903216);
                int[][] arrarrn = new int[][]{{16842919}, new int[0]};
                if (n3 == 2) {
                    LayerDrawable layerDrawable;
                    int n5 = d.c.a.e.a.A((View)autoCompleteTextView, (int)2130903232);
                    g g4 = new g(g3.e.a);
                    int n6 = d.c.a.e.a.X((int)n4, (int)n5, (float)0.1f);
                    g4.p(new ColorStateList(arrarrn, new int[]{n6, 0}));
                    if (bl) {
                        g4.setTint(n5);
                        ColorStateList colorStateList = new ColorStateList(arrarrn, new int[]{n6, n5});
                        g g5 = new g(g3.e.a);
                        g5.setTint(-1);
                        layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, g4, g5), g3});
                    } else {
                        layerDrawable = new LayerDrawable(new Drawable[]{g4, g3});
                    }
                    autoCompleteTextView.setBackground(layerDrawable);
                } else if (n3 == 1) {
                    int n7 = h3.a.getBoxBackgroundColor();
                    int[] arrn = new int[]{d.c.a.e.a.X((int)n4, (int)n7, (float)0.1f), n7};
                    if (bl) {
                        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(arrarrn, arrn), g3, g3);
                        autoCompleteTextView.setBackground(rippleDrawable);
                    } else {
                        g g6 = new g(g3.e.a);
                        g6.p(new ColorStateList(arrarrn, arrn));
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{g3, g6});
                        int n8 = autoCompleteTextView.getPaddingStart();
                        int n10 = autoCompleteTextView.getPaddingTop();
                        int n11 = autoCompleteTextView.getPaddingEnd();
                        int n12 = autoCompleteTextView.getPaddingBottom();
                        autoCompleteTextView.setBackground(layerDrawable);
                        autoCompleteTextView.setPaddingRelative(n8, n10, n11, n12);
                    }
                }
            }
            h h4 = h.this;
            Objects.requireNonNull((Object)h4);
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener)new j(h4, autoCompleteTextView));
            autoCompleteTextView.setOnFocusChangeListener(h4.e);
            if (bl) {
                autoCompleteTextView.setOnDismissListener(new k(h4));
            }
            autoCompleteTextView.setThreshold(0);
            autoCompleteTextView.removeTextChangedListener(h.this.d);
            autoCompleteTextView.addTextChangedListener(h.this.d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable(null);
            textInputLayout.setTextInputAccessibilityDelegate(h.this.f);
            textInputLayout.setEndIconVisible(true);
        }
    };
    @SuppressLint(value={"ClickableViewAccessibility"})
    public final TextInputLayout.g h = new TextInputLayout.g(){

        public void a(TextInputLayout textInputLayout, int n2) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)textInputLayout.getEditText();
            if (autoCompleteTextView != null && n2 == 3) {
                autoCompleteTextView.removeTextChangedListener(h.this.d);
                if (autoCompleteTextView.getOnFocusChangeListener() == h.this.e) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (h.q) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
        }
    };
    public boolean i = false;
    public boolean j = false;
    public long k = Long.MAX_VALUE;
    public StateListDrawable l;
    public g m;
    public AccessibilityManager n;
    public ValueAnimator o;
    public ValueAnimator p;

    public static {
        boolean bl = Build.VERSION.SDK_INT >= 21;
        q = bl;
    }

    public h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public static AutoCompleteTextView e(h h2, EditText editText) {
        Objects.requireNonNull((Object)h2);
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView)editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static void f(h h2, boolean bl) {
        if (h2.j != bl) {
            h2.j = bl;
            h2.p.cancel();
            h2.o.start();
        }
    }

    public static void g(h h2, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull((Object)h2);
        if (autoCompleteTextView == null) {
            return;
        }
        if (h2.i()) {
            h2.i = false;
        }
        if (!h2.i) {
            if (q) {
                boolean bl = h2.j;
                boolean bl2 = bl ^ true;
                if (bl != bl2) {
                    h2.j = bl2;
                    h2.p.cancel();
                    h2.o.start();
                }
            } else {
                h2.j = true ^ h2.j;
                h2.c.toggle();
            }
            if (h2.j) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        h2.i = false;
    }

    @Override
    public void a() {
        StateListDrawable stateListDrawable;
        float f2 = this.b.getResources().getDimensionPixelOffset(2131099954);
        float f3 = this.b.getResources().getDimensionPixelOffset(2131099912);
        int n2 = this.b.getResources().getDimensionPixelOffset(2131099914);
        g g2 = this.h(f2, f2, f3, n2);
        g g3 = this.h(0.0f, f2, f3, n2);
        this.m = g2;
        this.l = stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842922}, g2);
        this.l.addState(new int[0], g3);
        int n3 = q ? 2131165362 : 2131165363;
        this.a.setEndIconDrawable(c.b.d.a.a.b((Context)this.b, (int)n3));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(2131624017));
        this.a.setEndIconOnClickListener(new View.OnClickListener(this){
            public final /* synthetic */ h e;
            {
                this.e = h2;
            }

            public void onClick(View view) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)this.e.a.getEditText();
                h.g(this.e, autoCompleteTextView);
            }
        });
        this.a.a(this.g);
        TextInputLayout textInputLayout2 = this.a;
        TextInputLayout.g g4 = this.h;
        textInputLayout2.j0.add((Object)g4);
        ValueAnimator valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = d.c.a.e.c.a.a;
        valueAnimator.setInterpolator(timeInterpolator);
        valueAnimator.setDuration(67);
        valueAnimator.addUpdateListener(new i(this));
        this.p = valueAnimator;
        ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        valueAnimator2.setInterpolator(timeInterpolator);
        valueAnimator2.setDuration(50);
        valueAnimator2.addUpdateListener(new i(this));
        this.o = valueAnimator2;
        valueAnimator2.addListener(new l(this));
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImportantForAccessibility(2);
        this.n = (AccessibilityManager)this.b.getSystemService("accessibility");
    }

    @Override
    public boolean b(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean d() {
        return true;
    }

    public final g h(float f2, float f3, float f5, int n2) {
        j.b b3 = new j.b();
        b3.e = new d.c.a.e.w.a(f2);
        b3.f = new d.c.a.e.w.a(f2);
        b3.h = new d.c.a.e.w.a(f3);
        b3.g = new d.c.a.e.w.a(f3);
        d.c.a.e.w.j j2 = b3.a();
        Context context = this.b;
        int n3 = d.c.a.e.a.l0((Context)context, (int)2130903232, (String)g.class.getSimpleName());
        g g2 = new g();
        g2.e.b = new d.c.a.e.o.a(context);
        g2.w();
        g2.p(ColorStateList.valueOf(n3));
        g.b b4 = g2.e;
        if (b4.o != f5) {
            b4.o = f5;
            g2.w();
        }
        g2.e.a = j2;
        g2.invalidateSelf();
        g.b b6 = g2.e;
        if (b6.i == null) {
            b6.i = new Rect();
        }
        g2.e.i.set(0, n2, 0, n2);
        g2.invalidateSelf();
        return g2;
    }

    public final boolean i() {
        long l4 = System.currentTimeMillis() - this.k;
        return l4 < 0L || l4 > 300L;
        {
        }
    }

}

