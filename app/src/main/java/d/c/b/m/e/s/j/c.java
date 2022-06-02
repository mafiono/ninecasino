/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  org.json.JSONObject
 */
package d.c.b.m.e.s.j;

import d.c.b.m.e.b;
import d.c.b.m.e.k.a;
import d.c.b.m.e.k.r0;
import d.c.b.m.e.k.s0;
import d.c.b.m.e.s.i.g;
import d.c.b.m.e.s.j.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class c
extends a
implements d {
    public b f;

    public c(String string, String string2, d.c.b.m.e.n.c c3) {
        d.c.b.m.e.n.a a2 = d.c.b.m.e.n.a.e;
        b b3 = b.a;
        super(string, string2, c3, a2);
        this.f = b3;
    }

    public final d.c.b.m.e.n.b d(d.c.b.m.e.n.b b3, g g2) {
        this.e(b3, "X-CRASHLYTICS-GOOGLE-APP-ID", g2.a);
        this.e(b3, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        this.e(b3, "X-CRASHLYTICS-API-CLIENT-VERSION", "17.3.0");
        this.e(b3, "Accept", "application/json");
        this.e(b3, "X-CRASHLYTICS-DEVICE-MODEL", g2.b);
        this.e(b3, "X-CRASHLYTICS-OS-BUILD-VERSION", g2.c);
        this.e(b3, "X-CRASHLYTICS-OS-DISPLAY-VERSION", g2.d);
        this.e(b3, "X-CRASHLYTICS-INSTALLATION-ID", ((r0)g2.e).b());
        return b3;
    }

    public final void e(d.c.b.m.e.n.b b3, String string, String string2) {
        if (string2 != null) {
            b3.d.put((Object)string, (Object)string2);
        }
    }

    public final Map<String, String> f(g g2) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", g2.h);
        hashMap.put("display_version", g2.g);
        hashMap.put("source", Integer.toString(g2.i));
        String string = g2.f;
        if (!d.c.b.m.e.k.g.r(string)) {
            hashMap.put("instance", string);
        }
        return hashMap;
    }

    public JSONObject g(d.c.b.m.e.n.d d3) {
        int n2 = d3.a;
        b b3 = this.f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Settings result was: ");
        stringBuilder.append(n2);
        b3.b(stringBuilder.toString());
        boolean bl = n2 == 200 || n2 == 201 || n2 == 202 || n2 == 203;
        if (bl) {
            String string = d3.b;
            try {
                JSONObject jSONObject = new JSONObject(string);
                return jSONObject;
            }
            catch (Exception exception) {
                b b4 = this.f;
                StringBuilder stringBuilder2 = d.a.b.a.a.d((String)"Failed to parse settings JSON from ");
                stringBuilder2.append(this.a);
                b4.c(stringBuilder2.toString(), exception);
                b b6 = this.f;
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Settings response ");
                stringBuilder3.append(string);
                b6.b(stringBuilder3.toString());
                return null;
            }
        }
        b b7 = this.f;
        StringBuilder stringBuilder4 = d.a.b.a.a.d((String)"Failed to retrieve settings from ");
        stringBuilder4.append(this.a);
        b7.d(stringBuilder4.toString());
        return null;
    }
}

