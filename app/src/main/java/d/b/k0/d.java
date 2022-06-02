/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.b.g
 *  d.b.i0.a.a
 *  d.b.j
 *  d.b.k0.c
 *  d.b.k0.c$d
 *  d.b.k0.o
 *  d.b.k0.o$d
 *  d.b.o
 *  d.b.o$c
 *  d.b.s
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package d.b.k0;

import d.b.g;
import d.b.i0.a.a;
import d.b.j;
import d.b.k0.c;
import d.b.k0.o;
import d.b.o;
import d.b.s;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class d
implements o.c {
    public final /* synthetic */ c a;

    public d(c c2) {
        this.a = c2;
    }

    public void a(s s2) {
        block9 : {
            c c2;
            block11 : {
                block10 : {
                    if (this.a.s0.get()) {
                        return;
                    }
                    j j2 = s2.c;
                    if (j2 == null) break block9;
                    int n2 = j2.h;
                    if (n2 == 1349152) break block10;
                    switch (n2) {
                        default: {
                            this.a.E0(j2.n);
                            return;
                        }
                        case 1349173: {
                            c2 = this.a;
                            break block11;
                        }
                        case 1349172: 
                        case 1349174: {
                            this.a.G0();
                            return;
                        }
                    }
                }
                if (this.a.v0 != null) {
                    a.a((String)this.a.v0.f);
                }
                c2 = this.a;
                o.d d2 = c2.y0;
                if (d2 != null) {
                    c2.I0(d2);
                    return;
                }
            }
            c2.D0();
            return;
        }
        try {
            JSONObject jSONObject = s2.b;
            c.A0((c)this.a, (String)jSONObject.getString("access_token"), (Long)jSONObject.getLong("expires_in"), (Long)jSONObject.optLong("data_access_expiration_time"));
            return;
        }
        catch (JSONException jSONException) {
            this.a.E0(new g((Throwable)jSONException));
            return;
        }
    }
}

