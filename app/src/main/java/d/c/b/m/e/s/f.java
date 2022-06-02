/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.b.m.e.s.b
 *  d.c.b.m.e.s.h
 *  d.c.b.m.e.s.i.f
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONObject
 */
package d.c.b.m.e.s;

import d.c.b.m.e.k.y0;
import d.c.b.m.e.s.b;
import d.c.b.m.e.s.h;
import org.json.JSONObject;

public class f {
    public final y0 a;

    public f(y0 y02) {
        this.a = y02;
    }

    public d.c.b.m.e.s.i.f a(JSONObject jSONObject) {
        Object object = jSONObject.getInt("settings_version") != 3 ? new b() : new h();
        return object.a(this.a, jSONObject);
    }
}

