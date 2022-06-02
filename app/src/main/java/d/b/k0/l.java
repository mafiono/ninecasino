/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  d.b.g
 *  d.b.j0.w
 *  d.b.j0.w$b
 *  d.b.k0.o
 *  d.b.k0.o$d
 *  d.b.k0.o$e
 *  d.b.k0.t
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package d.b.k0;

import android.os.Bundle;
import d.b.g;
import d.b.j0.w;
import d.b.k0.k;
import d.b.k0.o;
import d.b.k0.t;
import org.json.JSONException;
import org.json.JSONObject;

public class l
implements w.b {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ o.d b;
    public final /* synthetic */ k c;

    public l(k k2, Bundle bundle, o.d d2) {
        this.c = k2;
        this.a = bundle;
        this.b = d2;
    }

    public void a(g g2) {
        o o2 = this.c.f;
        o2.c(o.e.b((o.d)o2.k, (String)"Caught exception", (String)g2.getMessage()));
    }

    public void b(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("id");
            this.a.putString("com.facebook.platform.extra.USER_ID", string);
            this.c.u(this.b, this.a);
            return;
        }
        catch (JSONException jSONException) {
            o o2 = this.c.f;
            o2.c(o.e.b((o.d)o2.k, (String)"Caught exception", (String)jSONException.getMessage()));
            return;
        }
    }
}

