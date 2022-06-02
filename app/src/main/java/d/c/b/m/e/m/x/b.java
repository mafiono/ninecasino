/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  android.util.JsonReader
 *  d.a.b.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 */
package d.c.b.m.e.m.x;

import android.util.Base64;
import android.util.JsonReader;
import d.a.b.a.a;
import d.c.b.m.e.m.e;
import d.c.b.m.e.m.x.h;
import java.util.Objects;

public final class b
implements h.a {
    public static final b a = new b();

    public Object a(JsonReader jsonReader) {
        IllegalStateException illegalStateException;
        jsonReader.beginObject();
        String string = null;
        byte[] arrby = null;
        while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            if (!string2.equals("filename")) {
                if (!string2.equals("contents")) {
                    jsonReader.skipValue();
                    continue;
                }
                arrby = Base64.decode(jsonReader.nextString(), 2);
                Objects.requireNonNull((Object)arrby, "Null contents");
                continue;
            }
            string = jsonReader.nextString();
            Objects.requireNonNull((Object)string, "Null filename");
        }
        jsonReader.endObject();
        String string3 = string == null ? " filename" : "";
        if (arrby == null) {
            string3 = a.m((String)string3, (String)" contents");
        }
        if (string3.isEmpty()) {
            return new e(string, arrby, null);
        }
        illegalStateException = new IllegalStateException(a.m((String)"Missing required properties:", (String)string3));
        throw illegalStateException;
    }
}

