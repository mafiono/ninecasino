/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient
 *  d.a.b.a.a
 *  d.c.a.d.d.p.c
 *  d.c.b.y.h
 *  d.c.b.y.j
 *  d.c.b.y.k
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Random
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.TimeUnit
 */
package d.c.b.y.q;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import d.c.a.d.d.p.c;
import d.c.b.t.g;
import d.c.b.y.h;
import d.c.b.y.j;
import d.c.b.y.q.e;
import d.c.b.y.q.f;
import d.c.b.y.q.n;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class k {
    public static final long i = TimeUnit.HOURS.toSeconds(12L);
    public static final int[] j = new int[]{2, 4, 8, 16, 32, 64, 128, 256};
    public final g a;
    public final d.c.b.k.a.a b;
    public final Executor c;
    public final Random d;
    public final e e;
    public final ConfigFetchHttpClient f;
    public final n g;
    public final Map<String, String> h;

    public k(g g2, d.c.b.k.a.a a2, Executor executor, c c2, Random random, e e2, ConfigFetchHttpClient configFetchHttpClient, n n2, Map<String, String> map) {
        this.a = g2;
        this.b = a2;
        this.c = executor;
        this.d = random;
        this.e = e2;
        this.f = configFetchHttpClient;
        this.g = n2;
        this.h = map;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final a a(String var1_1, String var2_2, Date var3_3) {
        try {
            var18_4 = this.f.b();
            var19_5 = this.f;
            var20_6 = new HashMap();
            var21_7 = this.b;
            if (var21_7 != null) {
                for (Map.Entry var28_9 : var21_7.b(false).entrySet()) {
                    var20_6.put((Object) var28_9.getKey(), (Object)var28_9.getValue().toString());
                }
            }
            var23_10 = var19_5.fetch(var18_4, var1_1, var2_2, (Map)var20_6, this.g.a.getString("last_fetch_etag", null), this.h, var3_3);
            var24_11 = var23_10.c;
            if (var24_11 == null) ** GOTO lbl-1000
            var25_12 = this.g;
            var30_14 = var26_13 = var25_12.b;
            // MONITORENTER : var30_14
        }
        catch (d.c.b.y.k var4_15) {
            block19 : {
                block18 : {
                    var5_16 = var4_15.e;
                    var6_17 = var5_16 == 429 || var5_16 == 502 || var5_16 == 503 || var5_16 == 504;
                    if (var6_17) {
                        var12_18 = 1 + this.g.a().a;
                        var13_19 = TimeUnit.MINUTES;
                        var14_20 = k.j;
                        var15_21 = var13_19.toMillis((long)var14_20[-1 + Math.min((int)var12_18, (int)var14_20.length)]);
                        var17_22 = new Date(var15_21 / 2L + (long)this.d.nextInt((int)var15_21) + var3_3.getTime());
                        this.g.b(var12_18, var17_22);
                    }
                    var7_23 = this.g.a();
                    var8_24 = var4_15.e;
                    if (var7_23.a > 1) break block18;
                    var9_25 = false;
                    if (var8_24 != 429) break block19;
                }
                var9_25 = true;
            }
            if (var9_25) {
                var10_27 = new j(var7_23.b.getTime());
                throw var10_27;
            }
            if (var8_24 == 401) {
                var11_26 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                throw new d.c.b.y.k(var4_15.e, d.a.b.a.a.m((String)"Fetch failed: ", (String)var11_26), (Throwable)var4_15);
            }
            if (var8_24 == 403) {
                var11_26 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                throw new d.c.b.y.k(var4_15.e, d.a.b.a.a.m((String)"Fetch failed: ", (String)var11_26), (Throwable)var4_15);
            }
            if (var8_24 == 429) throw new h("The throttled response from the server was not handled correctly by the FRC SDK.");
            if (var8_24 == 500) {
                var11_26 = "There was an internal server error.";
                throw new d.c.b.y.k(var4_15.e, d.a.b.a.a.m((String)"Fetch failed: ", (String)var11_26), (Throwable)var4_15);
            }
            switch (var8_24) {
                default: {
                    var11_26 = "The server returned an unexpected error.";
                    throw new d.c.b.y.k(var4_15.e, d.a.b.a.a.m((String)"Fetch failed: ", (String)var11_26), (Throwable)var4_15);
                }
                case 502: 
                case 503: 
                case 504: 
            }
            var11_26 = "The server is unavailable. Please try again later.";
            throw new d.c.b.y.k(var4_15.e, d.a.b.a.a.m((String)"Fetch failed: ", (String)var11_26), (Throwable)var4_15);
        }
        var25_12.a.edit().putString("last_fetch_etag", var24_11).apply();
        // MONITOREXIT : var30_14
lbl-1000: // 2 sources:
        {
            this.g.b(0, n.e);
        }
        return var23_10;
    }

    public static class a {
        public final int a;
        public final f b;
        public final String c;

        public a(Date date, int n2, f f2, String string) {
            this.a = n2;
            this.b = f2;
            this.c = string;
        }
    }

}

