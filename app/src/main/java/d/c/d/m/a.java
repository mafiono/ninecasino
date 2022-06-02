/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  B
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Array
 *  java.util.Map
 */
package d.c.d.m;

import d.c.d.c;
import d.c.d.g;
import d.c.d.j.b;
import java.lang.reflect.Array;
import java.util.Map;

public final class a
implements g {
    public static b b(byte[][] arrby, int n2) {
        int n3 = arrby[0].length;
        int n4 = n2 * 2;
        b b3 = new b(n3 + n4, n4 + arrby.length);
        int n5 = b3.h.length;
        for (int i2 = 0; i2 < n5; ++i2) {
            b3.h[i2] = 0;
        }
        int n6 = b3.f - n2 - 1;
        int n7 = 0;
        while (n7 < arrby.length) {
            byte[] arrby2 = arrby[n7];
            for (int i3 = 0; i3 < arrby[0].length; ++i3) {
                if (arrby2[i3] != 1) continue;
                b3.c(i3 + n2, n6);
            }
            ++n7;
            --n6;
        }
        return b3;
    }

    public static byte[][] c(byte[][] arrby) {
        int n2 = arrby[0].length;
        int n3 = arrby.length;
        int[] arrn = new int[2];
        arrn[1] = n3;
        arrn[0] = n2;
        byte[][] arrby2 = (byte[][])Array.newInstance(B.class, arrn);
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            int n4 = arrby.length - i2 - 1;
            for (int i3 = 0; i3 < arrby[0].length; ++i3) {
                arrby2[i3][n4] = arrby[i2][i3];
            }
        }
        return arrby2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public b a(String var1_1, d.c.d.a var2_2, int var3_3, int var4_4, Map<c, ?> var5_5) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[UNCONDITIONALDOLOOP]], but top level block is 7[WHILELOOP]
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

