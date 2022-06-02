/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.m.e.k;

import d.c.b.m.e.k.t;
import d.c.b.m.e.p.a;
import d.c.b.m.e.p.c;
import d.c.b.m.e.p.d;

public class r
implements t.g {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ t f;

    public r(t t6, String string, String string2, String string3, String string4, int n2) {
        this.f = t6;
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = n2;
    }

    @Override
    public void a(c c3) {
        String string = this.a;
        String string2 = this.b;
        String string3 = this.c;
        String string4 = this.d;
        int n2 = this.e;
        String string5 = this.f.q;
        a a2 = a.a(string);
        a a3 = a.a(string2);
        a a4 = a.a(string3);
        a a5 = a.a(string4);
        a a8 = string5 != null ? a.a(string5) : null;
        c3.z(7, 2);
        int n3 = 0 + c.e(1, a2) + c.e(2, a3) + c.e(3, a4) + c.e(6, a5);
        if (a8 != null) {
            n3 = n3 + c.e(8, d.b) + c.e(9, a8);
        }
        c3.w(n3 + c.f(10, n2));
        c3.t(1, a2);
        c3.t(2, a3);
        c3.t(3, a4);
        c3.t(6, a5);
        if (a8 != null) {
            c3.t(8, d.b);
            c3.t(9, a8);
        }
        c3.u(10, n2);
    }
}

