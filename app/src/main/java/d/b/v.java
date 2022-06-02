/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.util.Log
 *  d.b.g
 *  d.b.j0.w
 *  d.b.j0.w$b
 *  d.b.w
 *  d.b.y
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONObject
 */
package d.b;

import android.net.Uri;
import android.util.Log;
import d.b.g;
import d.b.j0.w;
import d.b.w;
import d.b.y;
import org.json.JSONObject;

public final class v
implements w.b {
    public void a(g g2) {
        String string = w.k;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Got unexpected exception: ");
        stringBuilder.append((Object)g2);
        Log.e(string, stringBuilder.toString());
    }

    public void b(JSONObject jSONObject) {
        String string = jSONObject.optString("id");
        if (string == null) {
            Log.w((String)w.k, "No user ID returned on Me request");
            return;
        }
        String string2 = jSONObject.optString("link");
        String string3 = jSONObject.optString("first_name");
        String string4 = jSONObject.optString("middle_name");
        String string5 = jSONObject.optString("last_name");
        String string6 = jSONObject.optString("name");
        Uri uri = string2 != null ? Uri.parse(string2) : null;
        w w2 = new w(string, string3, string4, string5, string6, uri);
        y.a().b(w2, true);
    }
}

