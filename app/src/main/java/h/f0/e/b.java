/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b0
 *  h.b0$a
 *  h.c0
 *  h.f0.e.e
 *  h.t
 *  h.t$a
 *  java.lang.Object
 *  java.lang.String
 */
package h.f0.e;

import h.b0;
import h.c0;
import h.f0.e.e;
import h.t;

public final class b
implements t {
    public final e a;

    public b(e e2) {
        this.a = e2;
    }

    public static boolean b(String string) {
        return "Content-Length".equalsIgnoreCase(string) || "Content-Encoding".equalsIgnoreCase(string) || "Content-Type".equalsIgnoreCase(string);
        {
        }
    }

    public static boolean c(String string) {
        return !"Connection".equalsIgnoreCase(string) && !"Keep-Alive".equalsIgnoreCase(string) && !"Proxy-Authenticate".equalsIgnoreCase(string) && !"Proxy-Authorization".equalsIgnoreCase(string) && !"TE".equalsIgnoreCase(string) && !"Trailers".equalsIgnoreCase(string) && !"Transfer-Encoding".equalsIgnoreCase(string) && !"Upgrade".equalsIgnoreCase(string);
    }

    public static b0 d(b0 b02) {
        if (b02 != null && b02.k != null) {
            b0.a a2 = new b0.a(b02);
            a2.g = null;
            b02 = a2.a();
        }
        return b02;
    }

    /*
     * Exception decompiling
     */
    public b0 a(t.a var1) {
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
}

