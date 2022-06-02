/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  d.a.b.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 */
package d.c.b.m.e.m.x;

import android.util.JsonReader;
import d.a.b.a.a;
import d.c.b.m.e.m.c;
import d.c.b.m.e.m.x.h;
import java.util.Objects;

public final class c
implements h.a {
    public static final c a = new c();

    public Object a(JsonReader jsonReader) {
        IllegalStateException illegalStateException;
        jsonReader.beginObject();
        String string = null;
        String string2 = null;
        while (jsonReader.hasNext()) {
            String string3 = jsonReader.nextName();
            string3.hashCode();
            if (!string3.equals("key")) {
                if (!string3.equals("value")) {
                    jsonReader.skipValue();
                    continue;
                }
                string2 = jsonReader.nextString();
                Objects.requireNonNull((Object)string2, "Null value");
                continue;
            }
            string = jsonReader.nextString();
            Objects.requireNonNull((Object)string, "Null key");
        }
        jsonReader.endObject();
        String string4 = string == null ? " key" : "";
        if (string2 == null) {
            string4 = a.m((String)string4, (String)" value");
        }
        if (string4.isEmpty()) {
            return new d.c.b.m.e.m.c(string, string2, null);
        }
        illegalStateException = new IllegalStateException(a.m((String)"Missing required properties:", (String)string4));
        throw illegalStateException;
    }
}

