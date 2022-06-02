/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  d.c.b.r.m
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
package d.c.b.r;

import android.content.Context;
import android.os.Bundle;
import d.c.b.c;
import d.c.b.q.d;
import d.c.b.r.g;
import d.c.b.r.m;
import d.c.b.r.q;
import d.c.b.s.a;
import d.c.b.x.h;
import java.util.concurrent.Executor;

public class n {
    public final c a;
    public final q b;
    public final d.c.a.d.c.c c;
    public final a<h> d;
    public final a<d> e;
    public final d.c.b.t.g f;

    public n(c c2, q q2, a<h> a2, a<d> a3, d.c.b.t.g g2) {
        c2.a();
        d.c.a.d.c.c c3 = new d.c.a.d.c.c(c2.a);
        this.a = c2;
        this.b = q2;
        this.c = c3;
        this.d = a2;
        this.e = a3;
        this.f = g2;
    }

    public final d.c.a.d.j.h<String> a(d.c.a.d.j.h<Bundle> h2) {
        return h2.g(g.e, (d.c.a.d.j.a)new m(this));
    }

    /*
     * Exception decompiling
     */
    public final d.c.a.d.j.h<Bundle> b(String var1, String var2, String var3, Bundle var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl109 : ALOAD : trying to set 1 previously set to 0
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
}

