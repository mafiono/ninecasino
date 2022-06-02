/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.JsonReader
 *  android.util.Log
 *  d.a.b.a.a
 *  d.c.a.d.d.m.m
 *  d.c.a.d.d.p.a
 *  d.c.a.d.d.p.e
 *  d.c.b.t.h
 *  d.c.b.t.q.a
 *  d.c.b.t.q.b
 *  d.c.b.t.q.b$b
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.OutputStream
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.net.URLConnection
 *  java.nio.charset.Charset
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  java.util.zip.GZIPOutputStream
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package d.c.b.t.q;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.JsonReader;
import android.util.Log;
import d.c.a.d.d.m.m;
import d.c.b.q.d;
import d.c.b.t.h;
import d.c.b.t.o;
import d.c.b.t.q.a;
import d.c.b.t.q.b;
import d.c.b.t.q.d;
import d.c.b.t.q.e;
import d.c.b.t.q.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    public static final Pattern e = Pattern.compile("[0-9]+s");
    public static final Charset f = Charset.forName("UTF-8");
    public final Context a;
    public final d.c.b.s.a<d.c.b.x.h> b;
    public final d.c.b.s.a<d.c.b.q.d> c;
    public final e d;

    public c(Context context, d.c.b.s.a<d.c.b.x.h> a2, d.c.b.s.a<d.c.b.q.d> a3) {
        this.a = context;
        this.b = a2;
        this.c = a3;
        this.d = new e();
    }

    /*
     * Exception decompiling
     */
    public static void b(HttpURLConnection var0, String var1, String var2, String var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl75.1 : ALOAD : trying to set 1 previously set to 0
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

    public static long d(String string) {
        m.b((boolean)e.matcher(string).matches(), (Object)"Invalid Expiration Timestamp.");
        if (string != null && string.length() != 0) {
            return Long.parseLong(string.substring(0, -1 + string.length()));
        }
        return 0L;
    }

    public static void i(URLConnection uRLConnection, byte[] arrby) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(arrby);
            }
            catch (Throwable throwable) {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                }
                catch (IOException iOException) {}
                throw throwable;
            }
            try {
                gZIPOutputStream.close();
                outputStream.close();
            }
            catch (IOException iOException) {}
            return;
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    public final URL a(String string) {
        try {
            URL uRL = new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", string}));
            return uRL;
        }
        catch (MalformedURLException malformedURLException) {
            throw new h(malformedURLException.getMessage(), h.a.f);
        }
    }

    public final HttpURLConnection c(URL uRL, String string) {
        HttpURLConnection httpURLConnection;
        String string2;
        byte[] arrby;
        block7 : {
            d.a a2;
            try {
                httpURLConnection = (HttpURLConnection)uRL.openConnection();
            }
            catch (IOException iOException) {
                throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.f);
            }
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.a.getPackageName());
            if (this.c.get() != null && this.b.get() != null && (a2 = this.c.get().a("fire-installations-id")) != d.a.f) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.b.get().a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a2.e));
            }
            string2 = null;
            Context context = this.a;
            arrby = d.c.a.d.d.p.a.a((Context)context, (String)context.getPackageName());
            if (arrby != null) break block7;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not get fingerprint hash for package: ");
            stringBuilder.append(this.a.getPackageName());
            Log.e("ContentValues", stringBuilder.toString());
            string2 = null;
        }
        try {
            string2 = d.c.a.d.d.p.e.a((byte[])arrby, (boolean)false);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            StringBuilder stringBuilder = o.b.a.a.d((String)"No such package: ");
            stringBuilder.append(this.a.getPackageName());
            Log.e("ContentValues", stringBuilder.toString(), nameNotFoundException);
        }
        httpURLConnection.addRequestProperty("X-Android-Cert", string2);
        httpURLConnection.addRequestProperty("x-goog-api-key", string);
        return httpURLConnection;
    }

    public final d e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f));
        f.a a2 = f.a();
        jsonReader.beginObject();
        String string = null;
        String string2 = null;
        String string3 = null;
        f f2 = null;
        while (jsonReader.hasNext()) {
            String string4 = jsonReader.nextName();
            if (string4.equals("name")) {
                string = jsonReader.nextString();
                continue;
            }
            if (string4.equals("fid")) {
                string2 = jsonReader.nextString();
                continue;
            }
            if (string4.equals("refreshToken")) {
                string3 = jsonReader.nextString();
                continue;
            }
            if (string4.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String string5 = jsonReader.nextName();
                    if (string5.equals("token")) {
                        String string6;
                        ((b.b)a2).a = string6 = jsonReader.nextString();
                        continue;
                    }
                    if (string5.equals("expiresIn")) {
                        a2.b(c.d(jsonReader.nextString()));
                        continue;
                    }
                    jsonReader.skipValue();
                }
                f2 = a2.a();
                jsonReader.endObject();
                continue;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        d.a a3 = d.a.e;
        a a4 = new a(string, string2, string3, f2, a3, null);
        return a4;
    }

    public final f f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f));
        f.a a2 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            if (string.equals("token")) {
                String string2;
                ((b.b)a2).a = string2 = jsonReader.nextString();
                continue;
            }
            if (string.equals("expiresIn")) {
                a2.b(c.d(jsonReader.nextString()));
                continue;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        f.b b2 = f.b.e;
        b.b b3 = (b.b)a2;
        b3.c = b2;
        return b3.a();
    }

    public final void g(HttpURLConnection httpURLConnection, String string, String string2) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("fid", string);
            jSONObject.put("appId", string2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.4");
        }
        catch (JSONException jSONException) {
            throw new IllegalStateException(jSONException);
        }
        c.i((URLConnection)httpURLConnection, jSONObject.toString().getBytes(StandardCharsets.UTF_8));
    }

    public final void h(HttpURLConnection httpURLConnection) {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sdkVersion", "a:16.3.4");
            jSONObject = new JSONObject();
            jSONObject.put("installation", jSONObject2);
        }
        catch (JSONException jSONException) {
            throw new IllegalStateException(jSONException);
        }
        c.i((URLConnection)httpURLConnection, jSONObject.toString().getBytes(StandardCharsets.UTF_8));
    }
}

