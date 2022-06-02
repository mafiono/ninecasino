/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.b.j
 *  d.b.n0.a.a
 *  d.b.n0.a.a$c
 *  d.b.o
 *  d.b.o$c
 *  d.b.s
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package d.b.n0.a;

import d.b.j;
import d.b.n0.a.a;
import d.b.o;
import d.b.s;
import org.json.JSONException;
import org.json.JSONObject;

public class b
implements o.c {
    public final /* synthetic */ a a;

    public b(a a2) {
        this.a = a2;
    }

    public void a(s s2) {
        a a2;
        j j2 = s2.c;
        if (j2 != null) {
            a a3 = this.a;
            a3.B0(j2);
            return;
        }
        JSONObject jSONObject = s2.b;
        a.c c2 = new a.c();
        try {
            c2.e = jSONObject.getString("user_code");
            c2.f = jSONObject.getLong("expires_in");
            a2 = this.a;
        }
        catch (JSONException jSONException) {
            a a4 = this.a;
            j j3 = new j(0, "", "Malformed server response");
            a4.B0(j3);
            return;
        }
        a2.C0(c2);
    }
}

