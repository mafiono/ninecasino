/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Objects
 *  org.json.JSONObject
 */
package d.c.b.m.e.s;

import d.c.b.m.e.k.y0;
import d.c.b.m.e.s.g;
import d.c.b.m.e.s.i.c;
import d.c.b.m.e.s.i.d;
import d.c.b.m.e.s.i.f;
import java.util.Objects;
import org.json.JSONObject;

public class b
implements g {
    public static long b(y0 y02, long l4, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        Objects.requireNonNull((Object)y02);
        return System.currentTimeMillis() + l4 * 1000L;
    }

    @Override
    public f a(y0 y02, JSONObject jSONObject) {
        int n2 = jSONObject.optInt("settings_version", 0);
        int n3 = jSONObject.optInt("cache_duration", 3600);
        JSONObject jSONObject2 = jSONObject.getJSONObject("app");
        String string = jSONObject2.getString("status");
        String string2 = jSONObject2.getString("url");
        String string3 = jSONObject2.getString("reports_url");
        String string4 = jSONObject2.getString("ndk_reports_url");
        boolean bl = jSONObject2.optBoolean("update_required", false);
        d.c.b.m.e.s.i.b b3 = new d.c.b.m.e.s.i.b(string, string2, string3, string4, bl);
        d d3 = new d(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 4);
        c c3 = new c(jSONObject.getJSONObject("features").optBoolean("collect_reports", true));
        long l4 = b.b(y02, n3, jSONObject);
        f f2 = new f(l4, b3, d3, c3, n2, n3);
        return f2;
    }
}

