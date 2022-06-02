/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package d.c.b.y;

import android.content.Context;
import android.util.Log;
import d.c.a.d.j.h;
import d.c.b.j.c;
import d.c.b.y.g;
import d.c.b.y.q.e;
import d.c.b.y.q.f;
import d.c.b.y.q.o;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

public final class a
implements d.c.a.d.j.a {
    public final g a;

    public a(g g2) {
        this.a = g2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public Object a(h h2) {
        e e2;
        o o2;
        boolean bl;
        g g2 = this.a;
        Objects.requireNonNull((Object)g2);
        if (!h2.n()) {
            bl = false;
            return bl;
        }
        e e3 = e2 = g2.d;
        // MONITORENTER : e3
        e2.c = d.c.a.d.b.a.l(null);
        // MONITOREXIT : e3
        o o5 = o2 = e2.b;
        // MONITORENTER : o5
        o2.a.deleteFile(o2.b);
        // MONITOREXIT : o5
        if (h2.j() != null) {
            JSONArray jSONArray = ((f)h2.j()).d;
            if (g2.b != null) {
                try {
                    List<Map<String, String>> list = g.a(jSONArray);
                    g2.b.c(list);
                }
                catch (d.c.b.j.a a2) {
                    Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", a2);
                }
                catch (JSONException jSONException) {
                    Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", jSONException);
                }
            }
        } else {
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
        }
        bl = true;
        return bl;
    }
}

