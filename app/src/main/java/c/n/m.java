/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  c.c.a.b.b
 *  c.c.a.b.b$c
 *  c.n.f
 *  c.n.f$a
 *  c.n.f$b
 *  c.n.j
 *  c.n.k
 *  c.n.m$a
 *  d.a.b.a.a
 *  java.lang.Enum
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.HashMap
 */
package c.n;

import android.annotation.SuppressLint;
import c.c.a.b.b;
import c.n.f;
import c.n.j;
import c.n.k;
import c.n.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Exception performing whole class analysis.
 */
public class m
extends f {
    public c.c.a.b.a<j, a> b;
    public f.b c;
    public final WeakReference<k> d;
    public int e;
    public boolean f;
    public boolean g;
    public ArrayList<f.b> h;
    public final boolean i;

    public m(k k2) {
        this.b = new c.c.a.b.a();
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = new ArrayList();
        this.d = new WeakReference((Object)k2);
        this.c = f.b.f;
        this.i = true;
    }

    public static f.b f(f.b b2, f.b b3) {
        if (b3 != null && b3.compareTo((Enum)b2) < 0) {
            b2 = b3;
        }
        return b2;
    }

    public void a(j j2) {
        this.d("addObserver");
        f.b b2 = this.c;
        f.b b3 = f.b.e;
        if (b2 != b3) {
            b3 = f.b.f;
        }
        a a2 = new /* Unavailable Anonymous Inner Class!! */;
        if (this.b.j(j2, a2) != null) {
            return;
        }
        k k2 = this.d.get();
        if (k2 == null) {
            return;
        }
        boolean bl = this.e != 0 || this.f;
        f.b b4 = this.c(j2);
        this.e = 1 + this.e;
        while (a2.a.compareTo((Enum)b4) < 0 && this.b.i.containsKey((Object)j2)) {
            f.b b5 = a2.a;
            this.h.add(b5);
            f.a a3 = f.a.i((f.b)a2.a);
            if (a3 != null) {
                a2.a(k2, a3);
                this.h();
                b4 = this.c(j2);
                continue;
            }
            StringBuilder stringBuilder = d.a.b.a.a.d((String)"no event up from ");
            stringBuilder.append((Object)a2.a);
            throw new IllegalStateException(stringBuilder.toString());
        }
        if (!bl) {
            this.i();
        }
        this.e = -1 + this.e;
    }

    public void b(j j2) {
        this.d("removeObserver");
        this.b.k(j2);
    }

    public final f.b c(j j2) {
        c.c.a.b.a<j, a> a2 = this.b;
        b.c c2 = a2.i.containsKey((Object)j2) ? ((b.c)a2.i.get((Object)j2)).h : null;
        f.b b2 = c2 != null ? (c2.f).a : null;
        boolean bl = this.h.isEmpty();
        f.b b3 = null;
        if (!bl) {
            ArrayList<f.b> arrayList = this.h;
            b3 = arrayList.get(-1 + arrayList.size());
        }
        return m.f(m.f(this.c, b2), b3);
    }

    @SuppressLint(value={"RestrictedApi"})
    public final void d(String string) {
        if (this.i) {
            if (c.c.a.a.a.b().a()) {
                return;
            }
            throw new IllegalStateException(d.a.b.a.a.n((String)"Method ", (String)string, (String)" must be called on the main thread"));
        }
    }

    public void e(f.a a2) {
        this.d("handleLifecycleEvent");
        this.g(a2.g());
    }

    public final void g(f.b b2) {
        if (this.c == b2) {
            return;
        }
        this.c = b2;
        if (!this.f && this.e == 0) {
            this.f = true;
            this.i();
            this.f = false;
            return;
        }
        this.g = true;
    }

    public final void h() {
        ArrayList<f.b> arrayList = this.h;
        arrayList.remove(-1 + arrayList.size());
    }

    /*
     * Exception decompiling
     */
    public final void i() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[DOLOOP]], but top level block is 4[UNCONDITIONALDOLOOP]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
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
}

