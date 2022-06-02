/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.a0
 *  h.u
 *  h.v
 *  h.v$a
 *  h.v$b
 *  h.w
 *  h.w$b
 *  java.io.File
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Objects
 *  java.util.concurrent.TimeUnit
 */
package d.c.b.m.e.n;

import d.c.b.m.e.n.a;
import d.c.b.m.e.n.d;
import h.a0;
import h.u;
import h.v;
import h.w;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class b {
    public static final w f;
    public final a a;
    public final String b;
    public final Map<String, String> c;
    public final Map<String, String> d;
    public v.a e = null;

    public static {
        w.b b2 = new w.b(new w(new w.b()));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Objects.requireNonNull((Object)timeUnit, "unit == null");
        long l2 = timeUnit.toMillis(10000L);
        if (l2 <= Integer.MAX_VALUE) {
            if (l2 != 0L) {
                b2.w = (int)l2;
                f = new w(b2);
                return;
            }
            throw new IllegalArgumentException("timeout too small.");
        }
        throw new IllegalArgumentException("timeout too large.");
    }

    public b(a a2, String string, Map<String, String> map) {
        this.a = a2;
        this.b = string;
        this.c = map;
        this.d = new HashMap();
    }

    /*
     * Exception decompiling
     */
    public d a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl41 : ALOAD : trying to set 1 previously set to 0
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

    public b b(String string, String string2) {
        if (this.e == null) {
            v.a a2 = new v.a();
            a2.c(v.f);
            this.e = a2;
        }
        v.a a3 = this.e;
        Objects.requireNonNull(a3);
        a3.a(v.b.b((String)string, null, (a0)a0.create(null, (String)string2)));
        this.e = a3;
        return this;
    }

    public b c(String string, String string2, String string3, File file) {
        a0 a02 = a0.create((u)u.b((String)string3), (File)file);
        if (this.e == null) {
            v.a a2 = new v.a();
            a2.c(v.f);
            this.e = a2;
        }
        v.a a3 = this.e;
        Objects.requireNonNull(a3);
        a3.a(v.b.b((String)string, (String)string2, (a0)a02));
        this.e = a3;
        return this;
    }
}

