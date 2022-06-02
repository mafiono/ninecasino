/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  d.c.a.d.d.p.b
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 *  org.json.JSONObject
 */
package d.c.b.y;

import android.os.Bundle;
import d.c.a.d.d.p.b;
import d.c.b.k.a.a;
import d.c.b.y.q.f;
import d.c.b.y.q.q;
import java.util.Objects;
import org.json.JSONObject;

public final class n
implements b {
    public final q a;

    public n(q q4) {
        this.a = q4;
    }

    public void a(Object object, Object object2) {
        q q4 = this.a;
        String string = (String)object;
        f f2 = (f)object2;
        Objects.requireNonNull((Object)q4);
        JSONObject jSONObject = f2.e;
        if (jSONObject.length() < 1) {
            return;
        }
        JSONObject jSONObject2 = f2.b;
        if (jSONObject2.length() < 1) {
            return;
        }
        JSONObject jSONObject3 = jSONObject.optJSONObject(string);
        if (jSONObject3 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_fpid", jSONObject3.optString("personalizationId"));
        bundle.putString("_fpct", jSONObject2.optString(string));
        q4.a.f("fp", "_fpc", bundle);
    }
}

