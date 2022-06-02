/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Locale
 *  java.util.Objects
 *  org.json.JSONObject
 */
package d.c.b.m.e.s;

import d.c.b.m.e.k.y0;
import d.c.b.m.e.s.g;
import d.c.b.m.e.s.i.b;
import d.c.b.m.e.s.i.c;
import d.c.b.m.e.s.i.d;
import d.c.b.m.e.s.i.f;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONObject;

public class h
implements g {
    @Override
    public f a(y0 y02, JSONObject jSONObject) {
        long l4;
        int n2 = jSONObject.optInt("settings_version", 0);
        int n3 = jSONObject.optInt("cache_duration", 3600);
        JSONObject jSONObject2 = jSONObject.getJSONObject("fabric");
        JSONObject jSONObject3 = jSONObject.getJSONObject("app");
        String string = jSONObject3.getString("status");
        boolean bl = "new".equals(string);
        String string2 = jSONObject2.getString("bundle_id");
        String string3 = jSONObject2.getString("org_id");
        String string4 = bl ? "https://update.crashlytics.com/spi/v1/platforms/android/apps" : String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", new Object[]{string2});
        String string5 = string4;
        Locale locale = Locale.US;
        String string6 = String.format(locale, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", new Object[]{string2});
        String string7 = String.format(locale, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", new Object[]{string2});
        boolean bl2 = jSONObject3.optBoolean("update_required", false);
        int n4 = jSONObject3.optInt("report_upload_variant", 0);
        int n5 = jSONObject3.optInt("native_report_upload_variant", 0);
        b b3 = new b(string, string5, string6, string7, string2, string3, bl2, n4, n5);
        d d3 = new d(8, 4);
        c c3 = new c(jSONObject.getJSONObject("features").optBoolean("collect_reports", true));
        long l5 = n3;
        if (jSONObject.has("expires_at")) {
            l4 = jSONObject.optLong("expires_at");
        } else {
            Objects.requireNonNull((Object)y02);
            l4 = System.currentTimeMillis() + l5 * 1000L;
        }
        f f2 = new f(l4, b3, d3, c3, n2, n3);
        return f2;
    }
}

