/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.util.Log
 *  d.c.a.d.j.h
 *  d.c.b.m.e.k.r0
 *  d.c.b.m.e.s.d
 *  d.c.b.m.e.s.j.b
 *  d.c.b.m.e.s.j.e
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 *  java.util.concurrent.Executor
 */
package d.c.b.m.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import d.c.b.m.e.k.g;
import d.c.b.m.e.k.m0;
import d.c.b.m.e.k.o0;
import d.c.b.m.e.k.r0;
import d.c.b.m.e.n.c;
import d.c.b.m.e.s.d;
import d.c.b.m.e.s.i.a;
import d.c.b.m.e.s.i.b;
import d.c.b.m.e.s.j.e;
import java.util.Objects;
import java.util.concurrent.Executor;

public class h {
    public final c a = new c();
    public final d.c.b.c b;
    public final Context c;
    public PackageManager d;
    public String e;
    public PackageInfo f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public r0 l;
    public m0 m;

    public h(d.c.b.c c2, Context context, r0 r02, m0 m02) {
        this.b = c2;
        this.c = context;
        this.l = r02;
        this.m = m02;
    }

    public static void a(h h2, b b2, String string, d d3, Executor executor, boolean bl) {
        block8 : {
            d.c.b.m.e.b b3;
            block9 : {
                d.c.b.m.e.s.c c2;
                block7 : {
                    block6 : {
                        Objects.requireNonNull((Object)h2);
                        b3 = d.c.b.m.e.b.a;
                        c2 = d.c.b.m.e.s.c.f;
                        if (!"new".equals(b2.a)) break block6;
                        a a2 = h2.b(b2.e, string);
                        if (new d.c.b.m.e.s.j.b(h2.c(), b2.b, h2.a, "17.3.0").d(a2, bl)) break block7;
                        if (b3.a(6)) {
                            Log.e("FirebaseCrashlytics", "Failed to create app with Crashlytics service.", null);
                            return;
                        }
                        break block8;
                    }
                    if (!"configured".equals(b2.a)) break block9;
                }
                d3.d(c2, executor);
                return;
            }
            if (b2.f) {
                b3.b("Server says an update is required - forcing a full App update.");
                a a3 = h2.b(b2.e, string);
                new e(h2.c(), b2.b, h2.a, "17.3.0").d(a3, bl);
            }
        }
    }

    public final a b(String string, String string2) {
        String string3 = g.k(this.c);
        String[] arrstring = new String[]{string3, string2, this.h, this.g};
        String string4 = g.e(arrstring);
        int n2 = o0.g(this.i).e;
        String string5 = this.l.c;
        a a2 = new a(string, string2, string5, this.h, this.g, string4, this.j, n2, this.k, "0");
        return a2;
    }

    public String c() {
        Context context = this.c;
        int n2 = g.m(context, "com.crashlytics.ApiEndpoint", "string");
        if (n2 > 0) {
            return context.getString(n2);
        }
        return "";
    }
}

