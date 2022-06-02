/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  android.util.JsonReader
 *  d.a.b.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  java.util.Objects
 */
package d.c.b.m.e.m.x;

import android.util.Base64;
import android.util.JsonReader;
import d.a.b.a.a;
import d.c.b.m.e.m.m;
import d.c.b.m.e.m.v;
import d.c.b.m.e.m.x.h;
import java.nio.charset.Charset;
import java.util.Objects;

public final class e
implements h.a {
    public static final e a = new e();

    public Object a(JsonReader jsonReader) {
        IllegalStateException illegalStateException;
        jsonReader.beginObject();
        Long l4 = null;
        Long l5 = null;
        String string = null;
        String string2 = null;
        block12 : while (jsonReader.hasNext()) {
            String string3 = jsonReader.nextName();
            string3.hashCode();
            string3.hashCode();
            int n2 = -1;
            switch (string3.hashCode()) {
                default: {
                    break;
                }
                case 1153765347: {
                    if (!string3.equals("baseAddress")) break;
                    n2 = 3;
                    break;
                }
                case 3601339: {
                    if (!string3.equals("uuid")) break;
                    n2 = 2;
                    break;
                }
                case 3530753: {
                    if (!string3.equals("size")) break;
                    n2 = 1;
                    break;
                }
                case 3373707: {
                    if (!string3.equals("name")) break;
                    n2 = 0;
                }
            }
            switch (n2) {
                default: {
                    jsonReader.skipValue();
                    continue block12;
                }
                case 3: {
                    l4 = jsonReader.nextLong();
                    continue block12;
                }
                case 2: {
                    string2 = new String(Base64.decode(jsonReader.nextString(), 2), v.a);
                    continue block12;
                }
                case 1: {
                    l5 = jsonReader.nextLong();
                    continue block12;
                }
                case 0: 
            }
            string = jsonReader.nextString();
            Objects.requireNonNull((Object)string, "Null name");
        }
        jsonReader.endObject();
        String string4 = l4 == null ? " baseAddress" : "";
        if (l5 == null) {
            string4 = a.m((String)string4, (String)" size");
        }
        if (string == null) {
            string4 = a.m((String)string4, (String)" name");
        }
        if (string4.isEmpty()) {
            m m2 = new m(l4, l5, string, string2, null);
            return m2;
        }
        illegalStateException = new IllegalStateException(a.m((String)"Missing required properties:", (String)string4));
        throw illegalStateException;
    }
}

