/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Paint
 *  android.graphics.Paint$FontMetricsInt
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextDirectionHeuristic
 *  android.text.TextDirectionHeuristics
 *  android.text.TextPaint
 *  android.util.AttributeSet
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.textclassifier.TextClassifier
 *  android.widget.TextView
 *  c.b.a
 *  c.b.d.a.a
 *  c.b.h.e
 *  c.b.h.r0
 *  c.b.h.t0
 *  c.b.h.u0
 *  c.b.h.w
 *  c.b.h.x
 *  c.b.h.z
 *  c.h.b.g
 *  c.h.d.d
 *  c.h.d.j
 *  c.h.h.b
 *  c.h.h.b$a
 *  c.h.j.m
 *  c.h.k.b
 *  c.h.k.f
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Future
 */
package c.b.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import c.b.a;
import c.b.h.e;
import c.b.h.r0;
import c.b.h.t0;
import c.b.h.u0;
import c.b.h.w;
import c.b.h.x;
import c.b.h.z;
import c.h.b.g;
import c.h.c.b.c;
import c.h.d.d;
import c.h.d.j;
import c.h.h.b;
import c.h.j.m;
import c.h.k.b;
import c.h.k.f;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

public class y
extends TextView
implements m,
f,
b {
    public final e e;
    public final x f;
    public final w g;
    public Future<c.h.h.b> h;

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public y(Context context, AttributeSet attributeSet, int n2) {
        e e2;
        x x2;
        super(t0.a((Context)context), attributeSet, n2);
        r0.a((View)this, (Context)this.getContext());
        this.e = e2 = new e((View)this);
        e2.d(attributeSet, n2);
        this.f = x2 = new x((TextView)this);
        x2.e(attributeSet, n2);
        x2.b();
        this.g = new w((TextView)this);
    }

    public void drawableStateChanged() {
        x x2;
        super.drawableStateChanged();
        e e2 = this.e;
        if (e2 != null) {
            e2.a();
        }
        if ((x2 = this.f) != null) {
            x2.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        x x2 = this.f;
        if (x2 != null) {
            return Math.round((float)x2.i.e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.a) {
            return super.getAutoSizeMinTextSize();
        }
        x x2 = this.f;
        if (x2 != null) {
            return Math.round((float)x2.i.d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.a) {
            return super.getAutoSizeStepGranularity();
        }
        x x2 = this.f;
        if (x2 != null) {
            return Math.round((float)x2.i.c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x x2 = this.f;
        if (x2 != null) {
            return x2.i.f;
        }
        return new int[0];
    }

    @SuppressLint(value={"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.a) {
            int n2 = super.getAutoSizeTextType();
            int n3 = 0;
            if (n2 == 1) {
                n3 = 1;
            }
            return n3;
        }
        x x2 = this.f;
        if (x2 != null) {
            return x2.i.a;
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return this.getPaddingTop() - this.getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return this.getPaddingBottom() + this.getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e e2 = this.e;
        if (e2 != null) {
            return e2.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e e2 = this.e;
        if (e2 != null) {
            return e2.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        u0 u02 = this.f.h;
        if (u02 != null) {
            return u02.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        u0 u02 = this.f.h;
        if (u02 != null) {
            return u02.b;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public CharSequence getText() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    public TextClassifier getTextClassifier() {
        w w2;
        if (Build.VERSION.SDK_INT < 28 && (w2 = this.g) != null) {
            return w2.a();
        }
        return super.getTextClassifier();
    }

    public b.a getTextMetricsParamsCompat() {
        return g.B((TextView)this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        a.b((InputConnection)inputConnection, (EditorInfo)editorInfo, (View)this);
        return inputConnection;
    }

    public void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        super.onLayout(bl, n2, n3, n4, n5);
        x x2 = this.f;
        if (x2 != null && !b.a) {
            x2.i.a();
        }
    }

    /*
     * Exception decompiling
     */
    public void onMeasure(int var1, int var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
        super.onTextChanged(charSequence, n2, n3, n4);
        x x2 = this.f;
        if (x2 != null && !b.a && x2.d()) {
            this.f.i.a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int n2, int n3, int n4, int n5) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(n2, n3, n4, n5);
            return;
        }
        x x2 = this.f;
        if (x2 != null) {
            x2.g(n2, n3, n4, n5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] arrn, int n2) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(arrn, n2);
            return;
        }
        x x2 = this.f;
        if (x2 != null) {
            x2.h(arrn, n2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int n2) {
        if (b.a) {
            super.setAutoSizeTextTypeWithDefaults(n2);
            return;
        }
        x x2 = this.f;
        if (x2 != null) {
            x2.i(n2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e e2 = this.e;
        if (e2 != null) {
            e2.e();
        }
    }

    public void setBackgroundResource(int n2) {
        super.setBackgroundResource(n2);
        e e2 = this.e;
        if (e2 != null) {
            e2.f(n2);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x x2 = this.f;
        if (x2 != null) {
            x2.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x x2 = this.f;
        if (x2 != null) {
            x2.b();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int n2, int n3, int n4, int n5) {
        Context context = this.getContext();
        Drawable drawable = n2 != 0 ? c.b.d.a.a.b((Context)context, (int)n2) : null;
        Drawable drawable2 = n3 != 0 ? c.b.d.a.a.b((Context)context, (int)n3) : null;
        Drawable drawable3 = n4 != 0 ? c.b.d.a.a.b((Context)context, (int)n4) : null;
        Drawable drawable4 = null;
        if (n5 != 0) {
            drawable4 = c.b.d.a.a.b((Context)context, (int)n5);
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x x2 = this.f;
        if (x2 != null) {
            x2.b();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x x2 = this.f;
        if (x2 != null) {
            x2.b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int n2, int n3, int n4, int n5) {
        Context context = this.getContext();
        Drawable drawable = n2 != 0 ? c.b.d.a.a.b((Context)context, (int)n2) : null;
        Drawable drawable2 = n3 != 0 ? c.b.d.a.a.b((Context)context, (int)n3) : null;
        Drawable drawable3 = n4 != 0 ? c.b.d.a.a.b((Context)context, (int)n4) : null;
        Drawable drawable4 = null;
        if (n5 != 0) {
            drawable4 = c.b.d.a.a.b((Context)context, (int)n5);
        }
        this.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x x2 = this.f;
        if (x2 != null) {
            x2.b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x x2 = this.f;
        if (x2 != null) {
            x2.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.d0((TextView)this, (ActionMode.Callback)callback));
    }

    public void setFirstBaselineToTopHeight(int n2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(n2);
            return;
        }
        g.N((TextView)this, (int)n2);
    }

    public void setLastBaselineToBottomHeight(int n2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(n2);
            return;
        }
        g.Q((TextView)this, (int)n2);
    }

    public void setLineHeight(int n2) {
        g.S((TextView)this, (int)n2);
    }

    public void setPrecomputedText(c.h.h.b b2) {
        g.U((TextView)this, (c.h.h.b)b2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e e2 = this.e;
        if (e2 != null) {
            e2.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e e2 = this.e;
        if (e2 != null) {
            e2.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f.j(colorStateList);
        this.f.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f.k(mode);
        this.f.b();
    }

    public void setTextAppearance(Context context, int n2) {
        super.setTextAppearance(context, n2);
        x x2 = this.f;
        if (x2 != null) {
            x2.f(context, n2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        w w2;
        if (Build.VERSION.SDK_INT < 28 && (w2 = this.g) != null) {
            w2.b = textClassifier;
            return;
        }
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<c.h.h.b> future) {
        this.h = future;
        if (future != null) {
            this.requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a a2) {
        int n2 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = a2.b;
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int n3 = 1;
        if (textDirectionHeuristic != textDirectionHeuristic2 && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                n3 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                n3 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                n3 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                n3 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                n3 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                n3 = 7;
            }
        }
        this.setTextDirection(n3);
        if (n2 < 23) {
            float f2 = a2.a.getTextScaleX();
            this.getPaint().set(a2.a);
            if (f2 == this.getTextScaleX()) {
                this.setTextScaleX(1.0f + f2 / 2.0f);
            }
            this.setTextScaleX(f2);
            return;
        }
        this.getPaint().set(a2.a);
        this.setBreakStrategy(a2.c);
        this.setHyphenationFrequency(a2.d);
    }

    public void setTextSize(int n2, float f2) {
        boolean bl = b.a;
        if (bl) {
            super.setTextSize(n2, f2);
            return;
        }
        x x2 = this.f;
        if (x2 != null && !bl && !x2.d()) {
            x2.i.f(n2, f2);
        }
    }

    public void setTypeface(Typeface typeface, int n2) {
        Object object;
        block3 : {
            block4 : {
                block5 : {
                    object = null;
                    if (typeface == null) break block3;
                    object = null;
                    if (n2 <= 0) break block3;
                    Context context = this.getContext();
                    if (context == null) break block4;
                    if (Build.VERSION.SDK_INT >= 21) break block5;
                    j j2 = d.a;
                    Objects.requireNonNull(j2);
                    long l2 = j.g((Typeface)typeface);
                    c c2 = l2 == 0L ? null : (c)j2.a.get((Object)l2);
                    object = c2 == null ? null : j2.a(context, c2, context.getResources(), n2);
                    if (object != null) break block3;
                }
                object = Typeface.create(typeface, n2);
                break block3;
            }
            throw new IllegalArgumentException("Context cannot be null");
        }
        if (object != null) {
            typeface = object;
        }
        super.setTypeface(typeface, n2);
    }
}

