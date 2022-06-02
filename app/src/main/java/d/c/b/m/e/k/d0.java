/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.m.e.k;

import android.content.Context;
import d.c.b.m.e.k.b;
import d.c.b.m.e.k.g;
import d.c.b.m.e.k.n0;
import d.c.b.m.e.k.t;
import d.c.b.m.e.n.c;
import d.c.b.m.e.q.a;
import d.c.b.m.e.q.b;
import d.c.b.m.e.q.d.d;

public class d0
implements b.b {
    public final /* synthetic */ t a;

    public d0(t t6) {
        this.a = t6;
    }

    public d.c.b.m.e.q.b a(d.c.b.m.e.s.i.b b3) {
        String string = b3.c;
        String string2 = b3.d;
        String string3 = b3.e;
        t t6 = this.a;
        Context context = t6.a;
        int n2 = g.m(context, "com.crashlytics.ApiEndpoint", "string");
        String string4 = n2 > 0 ? context.getString(n2) : "";
        d.c.b.m.e.q.d.a a2 = new d.c.b.m.e.q.d.a(new d.c.b.m.e.q.d.c(string4, string, t6.f, "17.3.0"), new d(string4, string2, t6.f, "17.3.0"));
        String string5 = this.a.i.a;
        n0 n02 = n0.g(b3);
        t t7 = this.a;
        d.c.b.m.e.q.b b4 = new d.c.b.m.e.q.b(string3, string5, n02, t7.m, a2, t7.n);
        return b4;
    }
}

