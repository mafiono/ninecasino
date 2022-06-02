/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  d.a.b.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 */
package d.c.b.m.e.m.x;

import android.util.JsonReader;
import d.a.b.a.a;
import d.c.b.m.e.m.p;
import d.c.b.m.e.m.w;
import d.c.b.m.e.m.x.g;
import d.c.b.m.e.m.x.h;
import java.util.Objects;

public final class d
implements h.a {
    public static final d a = new d();

    public Object a(JsonReader jsonReader) {
        IllegalStateException illegalStateException;
        jsonReader.beginObject();
        String string = null;
        Integer n2 = null;
        w w3 = null;
        block10 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            string2.hashCode();
            int n3 = -1;
            switch (string2.hashCode()) {
                default: {
                    break;
                }
                case 2125650548: {
                    if (!string2.equals("importance")) break;
                    n3 = 2;
                    break;
                }
                case 3373707: {
                    if (!string2.equals("name")) break;
                    n3 = 1;
                    break;
                }
                case -1266514778: {
                    if (!string2.equals("frames")) break;
                    n3 = 0;
                }
            }
            switch (n3) {
                default: {
                    jsonReader.skipValue();
                    continue block10;
                }
                case 2: {
                    n2 = jsonReader.nextInt();
                    continue block10;
                }
                case 1: {
                    string = jsonReader.nextString();
                    Objects.requireNonNull((Object)string, "Null name");
                    continue block10;
                }
                case 0: 
            }
            w3 = h.a(jsonReader, g.a);
        }
        jsonReader.endObject();
        String string3 = string == null ? " name" : "";
        if (n2 == null) {
            string3 = a.m((String)string3, (String)" importance");
        }
        if (w3 == null) {
            string3 = a.m((String)string3, (String)" frames");
        }
        if (string3.isEmpty()) {
            return new p(string, n2, w3, null);
        }
        illegalStateException = new IllegalStateException(a.m((String)"Missing required properties:", (String)string3));
        throw illegalStateException;
    }
}

