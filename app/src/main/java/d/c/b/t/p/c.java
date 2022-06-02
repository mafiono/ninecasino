/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  d.a.b.a.a
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package d.c.b.t.p;

import android.content.Context;
import d.c.b.t.p.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.json.JSONException;
import org.json.JSONObject;

public class c {
    public final File a;
    public final d.c.b.c b;

    public c(d.c.b.c c2) {
        c2.a();
        File file = c2.a.getFilesDir();
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"PersistedInstallation.");
        stringBuilder.append(c2.c());
        stringBuilder.append(".json");
        this.a = new File(file, stringBuilder.toString());
        this.b = c2;
    }

    public d a(d d3) {
        block3 : {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", d3.c());
            jSONObject.put("Status", d3.f().ordinal());
            jSONObject.put("AuthToken", d3.a());
            jSONObject.put("RefreshToken", d3.e());
            jSONObject.put("TokenCreationEpochInSecs", d3.g());
            jSONObject.put("ExpiresInSecs", d3.b());
            jSONObject.put("FisError", d3.d());
            d.c.b.c c2 = this.b;
            c2.a();
            File file = File.createTempFile("PersistedInstallation", "tmp", c2.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
            fileOutputStream.close();
            if (!file.renameTo(this.a)) break block3;
            return d3;
        }
        try {
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        catch (IOException | JSONException throwable) {
            return d3;
        }
    }

    /*
     * Exception decompiling
     */
    public d b() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl48 : ALOAD : trying to set 1 previously set to 0
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

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a e;
        public static final /* enum */ a f;
        public static final /* enum */ a g;
        public static final /* enum */ a h;
        public static final /* enum */ a i;
        public static final /* synthetic */ a[] j;

        public static {
            a a2;
            a a3;
            a a4;
            a a5;
            a a6;
            e = a4 = new a();
            f = a6 = new a();
            g = a3 = new a();
            h = a2 = new a();
            i = a5 = new a();
            j = new a[]{a4, a6, a3, a2, a5};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return j.clone();
        }
    }

}

