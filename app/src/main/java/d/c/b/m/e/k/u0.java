/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  org.json.JSONObject
 */
package d.c.b.m.e.k;

import d.a.b.a.a;
import d.c.b.m.e.k.z0;
import java.io.File;
import java.nio.charset.Charset;
import org.json.JSONObject;

public class u0 {
    public final File a;

    public static {
        Charset.forName("UTF-8");
    }

    public u0(File file) {
        this.a = file;
    }

    public static z0 b(String string) {
        JSONObject jSONObject = new JSONObject(string);
        z0 z02 = new z0();
        boolean bl = jSONObject.isNull("userId");
        String string2 = null;
        if (!bl) {
            string2 = jSONObject.optString("userId", null);
        }
        if (string2 != null && (string2 = string2.trim()).length() > 1024) {
            string2 = string2.substring(0, 1024);
        }
        z02.a = string2;
        return z02;
    }

    public File a(String string) {
        return new File(this.a, a.n((String)string, (String)"user", (String)".meta"));
    }
}

