/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.ApplicationInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.util.Log
 *  c.e.a
 *  c.h.c.a
 *  com.google.firebase.iid.FirebaseInstanceId
 *  d.a.b.a.a
 *  java.io.File
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 *  java.util.concurrent.TimeUnit
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package d.c.b.r;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import d.c.b.c;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class w {
    public final SharedPreferences a;
    public final Context b;
    public final Map<String, Long> c = new c.e.a();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public w(Context context) {
        FirebaseInstanceId firebaseInstanceId;
        SharedPreferences sharedPreferences;
        File file;
        this.b = context;
        this.a = sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        if (Build.VERSION.SDK_INT >= 21) {
            file = context.getNoBackupFilesDir();
        } else {
            File file2 = new File(context.getApplicationInfo().dataDir, "no_backup");
            Class<c.h.c.a> class_ = c.h.c.a.class;
            // MONITORENTER : c.h.c.a.class
            if (!(file2.exists() || file2.mkdirs() || file2.exists())) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to create files subdir ");
                stringBuilder.append(file2.getPath());
                Log.w("ContextCompat", stringBuilder.toString());
                file2 = null;
            }
            // MONITOREXIT : class_
            file = file2;
        }
        File file3 = new File(file, "com.google.android.gms.appid-no-backup");
        if (file3.exists()) {
            return;
        }
        if (!file3.createNewFile()) return;
        w w2 = this;
        // MONITORENTER : w2
        boolean bl = sharedPreferences.getAll().isEmpty();
        if (bl) return;
        Log.i("FirebaseInstanceId", "App restored, clearing state");
        this.c();
        FirebaseInstanceId firebaseInstanceId2 = firebaseInstanceId = FirebaseInstanceId.getInstance((c)c.b());
        // MONITORENTER : firebaseInstanceId2
        FirebaseInstanceId.i.c();
        try {
            // MONITOREXIT : firebaseInstanceId2
            return;
        }
        catch (IOException iOException) {
            if (!Log.isLoggable("FirebaseInstanceId", 3)) return;
            String string = String.valueOf(iOException.getMessage());
            String string2 = string.length() != 0 ? "Error creating file in no backup dir: ".concat(string) : "Error creating file in no backup dir: ";
            Log.d("FirebaseInstanceId", string2);
        }
    }

    public static String a(String string, String string2) {
        return d.a.b.a.a.i((int)(d.a.b.a.a.b((String)string, (int)3) + string2.length()), (String)string, (String)"|S|", (String)string2);
    }

    public final String b(String string, String string2, String string3) {
        StringBuilder stringBuilder = d.a.b.a.a.c((int)d.a.b.a.a.b((String)string3, (int)d.a.b.a.a.b((String)string2, (int)d.a.b.a.a.b((String)string, (int)4))), (String)string, (String)"|T|", (String)string2, (String)"|");
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public void c() {
        w w2 = this;
        synchronized (w2) {
            this.c.clear();
            this.a.edit().clear().commit();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final long d(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl44.1 : LCONST_0 : trying to set 0 previously set to 1
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

    public static class a {
        public static final long d = TimeUnit.DAYS.toMillis(7L);
        public static final /* synthetic */ int e;
        public final String a;
        public final String b;
        public final long c;

        public a(String string, String string2, long l2) {
            this.a = string;
            this.b = string2;
            this.c = l2;
        }

        public static String a(String string, String string2, long l2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", string);
                jSONObject.put("appVersion", string2);
                jSONObject.put("timestamp", l2);
                String string3 = jSONObject.toString();
                return string3;
            }
            catch (JSONException jSONException) {
                String string4 = String.valueOf(jSONException);
                d.a.b.a.a.g((int)(24 + string4.length()), (String)"Failed to encode token: ", (String)string4, (String)"FirebaseInstanceId");
                return null;
            }
        }

        public static a b(String string) {
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            if (string.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    a a2 = new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                    return a2;
                }
                catch (JSONException jSONException) {
                    String string2 = String.valueOf(jSONException);
                    d.a.b.a.a.g((int)(23 + string2.length()), (String)"Failed to parse token: ", (String)string2, (String)"FirebaseInstanceId");
                    return null;
                }
            }
            return new a(string, null, 0L);
        }
    }

}

