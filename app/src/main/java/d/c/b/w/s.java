/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Log
 *  d.a.b.a.a
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.MissingFormatArgumentException
 *  java.util.Set
 *  org.json.JSONArray
 */
package d.c.b.w;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import d.a.b.a.a;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import org.json.JSONArray;

public class s {
    public final Bundle a;

    public s(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public static boolean f(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
        {
        }
    }

    public static String h(String string) {
        if (string.startsWith("gcm.n.")) {
            string = string.substring(6);
        }
        return string;
    }

    public boolean a(String string) {
        String string2 = this.e(string);
        return "1".equals(string2) || Boolean.parseBoolean(string2);
        {
        }
    }

    /*
     * Exception decompiling
     */
    public Integer b(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl37 : ACONST_NULL : trying to set 0 previously set to 1
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

    /*
     * Exception decompiling
     */
    public JSONArray c(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl38 : ACONST_NULL : trying to set 0 previously set to 1
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

    public String d(Resources resources, String string, String string2) {
        Object[] arrobject;
        String string3 = this.e(string2);
        if (!TextUtils.isEmpty(string3)) {
            return string3;
        }
        String string4 = this.e(string2.concat("_loc_key"));
        if (TextUtils.isEmpty(string4)) {
            return null;
        }
        int n2 = resources.getIdentifier(string4, "string", string);
        if (n2 == 0) {
            String string5 = s.h(string2.concat("_loc_key"));
            StringBuilder stringBuilder = new StringBuilder(a.b((String)string5, (int)49) + string2.length());
            stringBuilder.append(string5);
            stringBuilder.append(" resource not found: ");
            stringBuilder.append(string2);
            stringBuilder.append(" Default value will be used.");
            Log.w("NotificationParams", stringBuilder.toString());
            return null;
        }
        JSONArray jSONArray = this.c(string2.concat("_loc_args"));
        if (jSONArray == null) {
            arrobject = null;
        } else {
            int n3 = jSONArray.length();
            arrobject = new String[n3];
            for (int i2 = 0; i2 < n3; ++i2) {
                arrobject[i2] = jSONArray.optString(i2);
            }
        }
        if (arrobject == null) {
            return resources.getString(n2);
        }
        try {
            String string6 = resources.getString(n2, arrobject);
            return string6;
        }
        catch (MissingFormatArgumentException missingFormatArgumentException) {
            String string7 = s.h(string2);
            String string8 = Arrays.toString(arrobject);
            StringBuilder stringBuilder = a.c((int)a.b((String)string8, (int)a.b((String)string7, (int)58)), (String)"Missing format argument for ", (String)string7, (String)": ", (String)string8);
            stringBuilder.append(" Default value will be used.");
            Log.w("NotificationParams", stringBuilder.toString(), missingFormatArgumentException);
            return null;
        }
    }

    public String e(String string) {
        String string2;
        Bundle bundle = this.a;
        if (!bundle.containsKey(string) && string.startsWith("gcm.n.") && this.a.containsKey(string2 = !string.startsWith("gcm.n.") ? string : string.replace("gcm.n.", "gcm.notification."))) {
            string = string2;
        }
        return bundle.getString(string);
    }

    public Bundle g() {
        Bundle bundle = new Bundle(this.a);
        for (String string : this.a.keySet()) {
            boolean bl = string.startsWith("google.c.a.") || string.equals("from");
            if (bl) continue;
            bundle.remove(string);
        }
        return bundle;
    }
}

