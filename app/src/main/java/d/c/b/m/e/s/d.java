/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.util.Log
 *  d.a.b.a.a
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  d.c.a.d.j.i
 *  h.r
 *  java.io.File
 *  java.io.FileWriter
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.Map
 *  java.util.Objects
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicReference
 *  org.json.JSONObject
 */
package d.c.b.m.e.s;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import d.c.a.d.j.f0;
import d.c.a.d.j.i;
import d.c.b.m.e.k.m0;
import d.c.b.m.e.k.y0;
import d.c.b.m.e.o.h;
import d.c.b.m.e.s.b;
import d.c.b.m.e.s.c;
import d.c.b.m.e.s.e;
import d.c.b.m.e.s.f;
import d.c.b.m.e.s.i.g;
import h.r;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class d
implements e {
    public final Context a;
    public final g b;
    public final f c;
    public final y0 d;
    public final d.c.b.m.e.s.a e;
    public final d.c.b.m.e.s.j.d f;
    public final m0 g;
    public final AtomicReference<d.c.b.m.e.s.i.e> h;
    public final AtomicReference<i<d.c.b.m.e.s.i.b>> i;

    public d(Context context, g g2, y0 y02, f f2, d.c.b.m.e.s.a a2, d.c.b.m.e.s.j.d d3, m0 m02) {
        AtomicReference atomicReference;
        this.h = atomicReference = new AtomicReference();
        this.i = new AtomicReference((Object)new i());
        this.a = context;
        this.b = g2;
        this.d = y02;
        this.c = f2;
        this.e = a2;
        this.f = d3;
        this.g = m02;
        JSONObject jSONObject = new JSONObject();
        d.c.b.m.e.s.i.d d4 = new d.c.b.m.e.s.i.d(jSONObject.optInt("max_custom_exception_events", 8), 4);
        d.c.b.m.e.s.i.c c3 = new d.c.b.m.e.s.i.c(jSONObject.optBoolean("collect_reports", true));
        long l4 = b.b(y02, 3600L, jSONObject);
        d.c.b.m.e.s.i.f f3 = new d.c.b.m.e.s.i.f(l4, null, d4, c3, 0, 3600);
        atomicReference.set(f3);
    }

    public d.c.a.d.j.h<d.c.b.m.e.s.i.b> a() {
        return ((i)this.i.get()).a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final d.c.b.m.e.s.i.f b(c c3) {
        d.c.b.m.e.b b3;
        String string;
        block14 : {
            block15 : {
                d.c.b.m.e.s.i.f f2;
                block13 : {
                    boolean bl;
                    long l4;
                    d.c.b.m.e.s.i.f f3;
                    block12 : {
                        b3 = d.c.b.m.e.b.a;
                        try {
                            boolean bl2 = c.f.equals((Object)c3);
                            f2 = null;
                            if (bl2) return f2;
                            JSONObject jSONObject = this.e.a();
                            if (jSONObject == null) break block12;
                            f3 = this.c.a(jSONObject);
                            if (f3 != null) {
                                this.e(jSONObject, "Loaded cached settings: ");
                                Objects.requireNonNull((Object)this.d);
                                l4 = System.currentTimeMillis();
                            }
                            boolean bl3 = b3.a(6);
                            f2 = null;
                            if (!bl3) return f2;
                            {
                                Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", null);
                                return null;
                            }
                        }
                        catch (Exception exception) {
                            f2 = null;
                            break block13;
                        }
                    }
                    string = "No cached settings data found.";
                    break block14;
                    if (!c.g.equals((Object)c3) && (bl = f3.d < l4)) break block15;
                    try {
                        b3.b("Returning cached settings.");
                        return f3;
                    }
                    catch (Exception exception) {
                        f2 = f3;
                    }
                }
                if (!b3.a(6)) return f2;
                {
                    void var3_12;
                    Log.e("FirebaseCrashlytics", "Failed to get cached settings", (Throwable)var3_12);
                }
                return f2;
            }
            string = "Cached settings have expired.";
        }
        b3.b(string);
        return null;
    }

    public d.c.b.m.e.s.i.e c() {
        return this.h.get();
    }

    public d.c.a.d.j.h<Void> d(c c3, Executor executor) {
        d.c.b.m.e.s.i.f f2;
        if (true == d.c.b.m.e.k.g.n(this.a).getString("existing_instance_identifier", "").equals(this.b.f) && (f2 = this.b(c3)) != null) {
            this.h.set(f2);
            ((i)this.i.get()).b((Object)f2.a);
            return d.c.a.d.b.a.l(null);
        }
        d.c.b.m.e.s.i.f f3 = this.b(c.g);
        if (f3 != null) {
            this.h.set(f3);
            ((i)this.i.get()).b((Object)f3.a);
        }
        return this.g.b().p(executor, (d.c.a.d.j.g)new d.c.a.d.j.g<Void, Void>(){

            /*
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            public d.c.a.d.j.h a(Object object) {
                FileWriter fileWriter;
                void var18_25;
                block12 : {
                    FileWriter fileWriter2;
                    block14 : {
                        JSONObject jSONObject;
                        d.c.b.m.e.s.i.f f2;
                        block11 : {
                            d.c.b.m.e.b b8;
                            block13 : {
                                (Void)object;
                                d d3 = d.this;
                                d.c.b.m.e.s.j.d d4 = d3.f;
                                g g2 = d3.b;
                                d.c.b.m.e.s.j.c c3 = (d.c.b.m.e.s.j.c)d4;
                                Objects.requireNonNull((Object)c3);
                                try {
                                    Map<String, String> map = c3.f(g2);
                                    d.c.b.m.e.n.b b3 = c3.c(map);
                                    c3.d(b3, g2);
                                    d.c.b.m.e.b b4 = c3.f;
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Requesting settings from ");
                                    stringBuilder.append(c3.a);
                                    b4.b(stringBuilder.toString());
                                    d.c.b.m.e.b b6 = c3.f;
                                    StringBuilder stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append("Settings query params were: ");
                                    stringBuilder2.append(map);
                                    b6.b(stringBuilder2.toString());
                                    d.c.b.m.e.n.d d5 = b3.a();
                                    d.c.b.m.e.b b7 = c3.f;
                                    StringBuilder stringBuilder3 = new StringBuilder();
                                    stringBuilder3.append("Settings request ID: ");
                                    stringBuilder3.append(d5.c.c("X-REQUEST-ID"));
                                    b7.b(stringBuilder3.toString());
                                    jSONObject = c3.g(d5);
                                }
                                catch (IOException iOException) {
                                    if (c3.f.a(6)) {
                                        Log.e("FirebaseCrashlytics", "Settings request failed.", iOException);
                                    }
                                    jSONObject = null;
                                }
                                if (jSONObject == null) return d.c.a.d.b.a.l(null);
                                f2 = d.this.c.a(jSONObject);
                                d.c.b.m.e.s.a a2 = d.this.e;
                                long l4 = f2.d;
                                Objects.requireNonNull((Object)a2);
                                b8 = d.c.b.m.e.b.a;
                                b8.b("Writing settings to cache file...");
                                jSONObject.put("expires_at", l4);
                                fileWriter = new FileWriter(new File(new h(a2.a).a(), "com.crashlytics.settings.json"));
                                try {
                                    fileWriter.write(jSONObject.toString());
                                    fileWriter.flush();
                                    break block11;
                                }
                                catch (Throwable throwable) {
                                    break block12;
                                }
                                catch (Exception exception) {
                                    break block13;
                                }
                                catch (Throwable throwable) {
                                    fileWriter2 = null;
                                    break block14;
                                }
                                catch (Exception exception) {
                                    fileWriter = null;
                                }
                            }
                            try {
                                void var16_28;
                                if (!b8.a(6)) break block11;
                                Log.e("FirebaseCrashlytics", "Failed to cache settings", (Throwable)var16_28);
                            }
                            catch (Throwable throwable) {
                                fileWriter2 = fileWriter;
                            }
                        }
                        d.c.b.m.e.k.g.c(fileWriter, "Failed to close settings writer.");
                        d.this.e(jSONObject, "Loaded settings: ");
                        d d6 = d.this;
                        String string = d6.b.f;
                        SharedPreferences.Editor editor = d.c.b.m.e.k.g.n(d6.a).edit();
                        editor.putString("existing_instance_identifier", string);
                        editor.apply();
                        d.this.h.set(f2);
                        ((i)d.this.i.get()).b((Object)f2.a);
                        i i2 = new i();
                        i2.b((Object)f2.a);
                        d.this.i.set((Object)i2);
                        return d.c.a.d.b.a.l(null);
                    }
                    fileWriter = fileWriter2;
                }
                d.c.b.m.e.k.g.c(fileWriter, "Failed to close settings writer.");
                throw var18_25;
            }
        });
    }

    public final void e(JSONObject jSONObject, String string) {
        d.c.b.m.e.b b3 = d.c.b.m.e.b.a;
        StringBuilder stringBuilder = d.a.b.a.a.d((String)string);
        stringBuilder.append(jSONObject.toString());
        b3.b(stringBuilder.toString());
    }

}

