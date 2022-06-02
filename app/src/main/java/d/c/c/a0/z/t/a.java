/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Character
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.ParsePosition
 *  java.util.Date
 *  java.util.TimeZone
 */
package d.c.c.a0.z.t;

import java.text.ParsePosition;
import java.util.Date;
import java.util.TimeZone;

public class a {
    public static final TimeZone a = TimeZone.getTimeZone("UTC");

    public static boolean a(String string, int n2, char c2) {
        return n2 < string.length() && string.charAt(n2) == c2;
    }

    /*
     * Exception decompiling
     */
    public static Date b(String var0, ParsePosition var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 9[UNCONDITIONALDOLOOP]
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

    /*
     * Enabled aggressive block sorting
     */
    public static int c(String string, int n2, int n3) {
        if (n2 >= 0 && n3 <= string.length() && n2 <= n3) {
            int n4;
            int n5;
            if (n2 < n3) {
                n4 = n2 + 1;
                int n6 = Character.digit(string.charAt(n2), 10);
                if (n6 < 0) {
                    StringBuilder stringBuilder = d.a.b.a.a.d((String)"Invalid number: ");
                    stringBuilder.append(string.substring(n2, n3));
                    throw new NumberFormatException(stringBuilder.toString());
                }
                n5 = -n6;
            } else {
                n5 = 0;
                n4 = n2;
            }
            while (n4 < n3) {
                int n7 = n4 + 1;
                int n8 = Character.digit(string.charAt(n4), 10);
                if (n8 < 0) {
                    StringBuilder stringBuilder = d.a.b.a.a.d((String)"Invalid number: ");
                    stringBuilder.append(string.substring(n2, n3));
                    throw new NumberFormatException(stringBuilder.toString());
                }
                n5 = n5 * 10 - n8;
                n4 = n7;
            }
            return -n5;
        }
        NumberFormatException numberFormatException = new NumberFormatException(string);
        throw numberFormatException;
    }
}

