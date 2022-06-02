/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.database.DataSetObserver
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupWindow
 *  c.b.b
 *  c.b.g.i.p
 *  c.b.h.e0
 *  c.b.h.j0$a
 *  c.b.h.j0$b
 *  c.b.h.j0$c
 *  c.b.h.j0$d
 *  c.b.h.j0$e
 *  c.b.h.o
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.reflect.Method
 */
package c.b.h;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import c.b.g.i.p;
import c.b.h.e0;
import c.b.h.j0;
import c.b.h.o;
import java.lang.reflect.Method;

/*
 * Exception performing whole class analysis.
 */
public class j0
implements p {
    public static Method E;
    public static Method F;
    public static Method G;
    public final Rect A;
    public Rect B;
    public boolean C;
    public PopupWindow D;
    public Context e;
    public ListAdapter f;
    public e0 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public DataSetObserver s;
    public View t;
    public AdapterView.OnItemClickListener u;
    public final e v;
    public final d w;
    public final c x;
    public final a y;
    public final Handler z;

    /*
     * Exception decompiling
     */
    public static {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl66 : RETURN : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
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

    public j0(Context context, AttributeSet attributeSet, int n2, int n3) {
        int n4;
        this.h = -2;
        this.i = -2;
        this.l = 1002;
        this.p = 0;
        this.q = Integer.MAX_VALUE;
        this.r = 0;
        this.v = new /* Unavailable Anonymous Inner Class!! */;
        this.w = new /* Unavailable Anonymous Inner Class!! */;
        this.x = new /* Unavailable Anonymous Inner Class!! */;
        this.y = new /* Unavailable Anonymous Inner Class!! */;
        this.A = new Rect();
        this.e = context;
        this.z = new Handler(context.getMainLooper());
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, c.b.b.o, n2, n3);
        this.j = typedArray.getDimensionPixelOffset(0, 0);
        this.k = n4 = typedArray.getDimensionPixelOffset(1, 0);
        if (n4 != 0) {
            this.m = true;
        }
        typedArray.recycle();
        o o2 = new o(context, attributeSet, n2, n3);
        this.D = o2;
        o2.setInputMethodMode(1);
    }

    public void a(int n2) {
        this.j = n2;
    }

    public boolean b() {
        return this.D.isShowing();
    }

    public int c() {
        return this.j;
    }

    public void dismiss() {
        this.D.dismiss();
        this.D.setContentView(null);
        this.g = null;
        this.z.removeCallbacks((Runnable)this.v);
    }

    /*
     * Exception decompiling
     */
    public void f() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl469 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
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

    public int g() {
        if (!this.m) {
            return 0;
        }
        return this.k;
    }

    public Drawable i() {
        return this.D.getBackground();
    }

    public ListView k() {
        return this.g;
    }

    public void m(Drawable drawable) {
        this.D.setBackgroundDrawable(drawable);
    }

    public void n(int n2) {
        this.k = n2;
        this.m = true;
    }

    public void o(ListAdapter listAdapter) {
        e0 e02;
        DataSetObserver dataSetObserver = this.s;
        if (dataSetObserver == null) {
            this.s = new /* Unavailable Anonymous Inner Class!! */;
        } else {
            ListAdapter listAdapter2 = this.f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        if ((e02 = this.g) != null) {
            e02.setAdapter(this.f);
        }
    }

    public e0 q(Context context, boolean bl) {
        return new e0(context, bl);
    }

    public void r(int n2) {
        Drawable drawable = this.D.getBackground();
        if (drawable != null) {
            drawable.getPadding(this.A);
            Rect rect = this.A;
            this.i = n2 + (rect.left + rect.right);
            return;
        }
        this.i = n2;
    }

    public void s(boolean bl) {
        this.C = bl;
        this.D.setFocusable(bl);
    }
}

