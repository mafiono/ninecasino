/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.Executor
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package d.c.b.y;

import android.content.Context;
import d.c.b.c;
import d.c.b.y.q.e;
import d.c.b.y.q.k;
import d.c.b.y.q.m;
import d.c.b.y.q.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public class g {
    public final Context a;
    public final d.c.b.j.c b;
    public final Executor c;
    public final e d;
    public final e e;
    public final e f;
    public final k g;
    public final m h;
    public final n i;
    public final d.c.b.t.g j;

    public g(Context context, c c2, d.c.b.t.g g2, d.c.b.j.c c3, Executor executor, e e2, e e3, e e4, k k2, m m2, n n2) {
        this.a = context;
        this.j = g2;
        this.b = c3;
        this.c = executor;
        this.d = e2;
        this.e = e3;
        this.f = e4;
        this.g = k2;
        this.h = m2;
        this.i = n2;
    }

    public static List<Map<String, String>> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            Iterator iterator = jSONObject.keys();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                hashMap.put(string, jSONObject.getString(string));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }
}

