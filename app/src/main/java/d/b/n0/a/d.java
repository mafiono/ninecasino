/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  d.b.g
 *  d.b.j0.w
 *  d.b.n0.a.c
 *  d.b.n0.a.c$a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package d.b.n0.a;

import android.net.Uri;
import d.b.g;
import d.b.j0.w;
import d.b.n0.a.c;
import d.b.n0.b.i;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
implements c.a {
    public JSONObject a(i i2) {
        Uri uri = i2.g;
        if (w.z((Uri)uri)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", uri.toString());
                return jSONObject;
            }
            catch (JSONException jSONException) {
                throw new g("Unable to attach images", (Throwable)jSONException);
            }
        }
        throw new g("Only web images may be used in OG objects shared via the web dialog");
    }
}

