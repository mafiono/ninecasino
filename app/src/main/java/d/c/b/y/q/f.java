/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Date
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package d.c.b.y.q;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public class f {
    public static final Date f = new Date(0L);
    public JSONObject a;
    public JSONObject b;
    public Date c;
    public JSONArray d;
    public JSONObject e;

    public f(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.e = jSONObject2;
        this.a = jSONObject3;
    }

    public static f a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return new f(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof f)) {
            return false;
        }
        f f2 = (f)object;
        return this.a.toString().equals(f2.toString());
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}

