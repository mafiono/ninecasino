/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient
 *  d.c.a.d.d.p.b
 *  d.c.a.d.d.p.c
 *  d.c.a.d.d.p.d
 *  d.c.a.d.j.h
 *  d.c.b.y.n
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Random
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 */
package d.c.b.y;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import d.c.a.d.b.a;
import d.c.a.d.d.p.b;
import d.c.a.d.d.p.d;
import d.c.a.d.j.h;
import d.c.b.c;
import d.c.b.i;
import d.c.b.y.g;
import d.c.b.y.m;
import d.c.b.y.n;
import d.c.b.y.q.e;
import d.c.b.y.q.f;
import d.c.b.y.q.k;
import d.c.b.y.q.q;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class o {
    public static final Random j = new Random();
    public final Map<String, g> a;
    public final Context b;
    public final ExecutorService c;
    public final c d;
    public final d.c.b.t.g e;
    public final d.c.b.j.c f;
    public final d.c.b.k.a.a g;
    public final String h;
    public Map<String, String> i;

    public o(Context context, c c2, d.c.b.t.g g2, d.c.b.j.c c3, d.c.b.k.a.a a2) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = context;
        this.c = executorService;
        this.d = c2;
        this.e = g2;
        this.f = c3;
        this.g = a2;
        c2.a();
        this.h = c2.c.b;
        a.c((Executor)executorService, new m(this));
    }

    public static boolean e(c c2) {
        c2.a();
        return c2.b.equals("[DEFAULT]");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public g a(c var1_1, String var2_2, d.c.b.t.g var3_3, d.c.b.j.c var4_4, Executor var5_5, e var6_6, e var7_7, e var8_8, k var9_9, d.c.b.y.q.m var10_10, d.c.b.y.q.n var11_11) {
        block4 : {
            var22_12 = this;
            // MONITORENTER : var22_12
            if (this.a.containsKey(var2_2)) break block4;
            var14_13 = this.b;
            if (!var2_2.equals("firebase")) ** GOTO lbl-1000
            var1_1.a();
            if (var1_1.b.equals("[DEFAULT]")) {
                var15_14 = true;
            } else lbl-1000: // 2 sources:
            {
                var15_14 = false;
            }
            var16_15 = var15_14 != false ? var4_4 : null;
            var17_16 = new g(var14_13, var1_1, var3_3, var16_15, var5_5, var6_6, var7_7, var8_8, var9_9, var10_10, var11_11);
            var7_7.b();
            var17_16.f.b();
            var17_16.d.b();
            this.a.put((Object)var2_2, (Object)var17_16);
        }
        var13_17 = (g)this.a.get(var2_2);
        // MONITOREXIT : var22_12
        return var13_17;
    }

    public final e b(String string, String string2) {
        Object[] arrobject = new Object[]{"frc", this.h, string, string2};
        String string3 = String.format("%s_%s_%s_%s.json", arrobject);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Context context = this.b;
        Class<d.c.b.y.q.o> class_ = d.c.b.y.q.o.class;
        synchronized (d.c.b.y.q.o.class) {
            Map<String, d.c.b.y.q.o> map = d.c.b.y.q.o.c;
            if (!map.containsKey(string3)) {
                map.put((Object)string3, (Object)new d.c.b.y.q.o(context, string3));
            }
            d.c.b.y.q.o o2 = map.get(string3);
            // ** MonitorExit[var18_7] (shouldn't be in output)
            Class<e> class_2 = e.class;
            synchronized (e.class) {
                String string4 = o2.b;
                Map<String, e> map2 = e.d;
                if (!map2.containsKey(string4)) {
                    map2.put((Object)string4, (Object)new e(executorService, o2));
                }
                e e2 = map2.get(string4);
                // ** MonitorExit[var19_10] (shouldn't be in output)
                return e2;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public g c() {
        o o2 = this;
        synchronized (o2) {
            Set<b<String, f>> set;
            e e2 = this.b("firebase", "fetch");
            e e3 = this.b("firebase", "activate");
            e e4 = this.b("firebase", "defaults");
            d.c.b.y.q.n n2 = new d.c.b.y.q.n(this.b.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", this.h, "firebase", "settings"}), 0));
            d.c.b.y.q.m m2 = new d.c.b.y.q.m(this.c, e3, e4);
            c c2 = this.d;
            d.c.b.k.a.a a2 = this.g;
            c2.a();
            q q2 = c2.b.equals("[DEFAULT]") && a2 != null ? new q(a2) : null;
            if (q2 == null) return this.a(this.d, "firebase", this.e, this.f, this.c, e2, e3, e4, this.d("firebase", e2, n2), m2, n2);
            n n3 = new n(q2);
            Set<b<String, f>> set2 = set = m2.a;
            synchronized (set2) {
                m2.a.add((Object)n3);
                return this.a(this.d, "firebase", this.e, this.f, this.c, e2, e3, e4, this.d("firebase", e2, n2), m2, n2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public k d(String string, e e2, d.c.b.y.q.n n2) {
        o o2 = this;
        synchronized (o2) {
            d.c.b.t.g g2 = this.e;
            d.c.b.k.a.a a2 = o.e(this.d) ? this.g : null;
            d.c.b.k.a.a a3 = a2;
            ExecutorService executorService = this.c;
            d d3 = d.a;
            Random random = j;
            c c2 = this.d;
            c2.a();
            String string2 = c2.c.a;
            c c3 = this.d;
            c3.a();
            String string3 = c3.c.b;
            ConfigFetchHttpClient configFetchHttpClient = new ConfigFetchHttpClient(this.b, string3, string2, string, n2.a.getLong("fetch_timeout_in_seconds", 60L), n2.a.getLong("fetch_timeout_in_seconds", 60L));
            return new k(g2, a3, (Executor)executorService, (d.c.a.d.d.p.c)d3, random, e2, configFetchHttpClient, n2, this.i);
        }
    }
}

