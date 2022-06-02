/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.e.a
 *  f.k
 *  f.m.d
 *  f.m.j.a
 *  f.m.k.a.d
 *  f.o.b.i
 *  java.io.Serializable
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package f.m.k.a;

import f.k;
import f.m.d;
import f.o.b.i;
import java.io.Serializable;

public abstract class a
implements d<Object>,
f.m.k.a.d,
Serializable {
    public final d<Object> e;

    public a(d<Object> d3) {
        this.e = d3;
    }

    public f.m.k.a.d c() {
        d<Object> d3 = this.e;
        if (!(d3 instanceof f.m.k.a.d)) {
            d3 = null;
        }
        return (f.m.k.a.d)d3;
    }

    public final void g(Object object) {
        d<Object> d3;
        a a2 = this;
        do {
            i.e((Object)a2, (String)"frame");
            d3 = a2.e;
            i.c(d3);
            try {
                object = a2.m(object);
                f.m.j.a a3 = f.m.j.a.e;
                if (object == a3) {
                    return;
                }
            }
            catch (Throwable throwable) {
                object = d.c.a.e.a.q((Throwable)throwable);
            }
            a2.n();
            if (!(d3 instanceof a)) break;
            a2 = (a)d3;
        } while (true);
        d3.g(object);
    }

    public d<k> i(Object object, d<?> d3) {
        i.e(d3, (String)"completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /*
     * Exception decompiling
     */
    public StackTraceElement l() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl112 : ALOAD : trying to set 1 previously set to 0
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

    public abstract Object m(Object var1);

    public void n() {
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Continuation at ");
        Object object = this.l();
        if (object == null) {
            object = this.getClass().getName();
        }
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

