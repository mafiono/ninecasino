/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.m.e.k;

import android.os.Build;
import d.c.b.m.e.k.t;
import d.c.b.m.e.p.a;
import d.c.b.m.e.p.c;
import d.c.b.m.e.p.d;

public class u
implements t.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;

    public u(t t6, int n2, String string, int n3, long l4, long l5, boolean bl, int n4, String string2, String string3) {
        this.a = n2;
        this.b = n3;
        this.c = l4;
        this.d = l5;
        this.e = bl;
        this.f = n4;
    }

    @Override
    public void a(c c3) {
        int n2 = this.a;
        String string = Build.MODEL;
        int n3 = this.b;
        long l4 = this.c;
        long l5 = this.d;
        boolean bl = this.e;
        int n4 = this.f;
        String string2 = Build.MANUFACTURER;
        String string3 = Build.PRODUCT;
        a a2 = d.j(string);
        a a3 = d.j(string3);
        a a4 = d.j(string2);
        c3.z(9, 2);
        int n5 = 0 + c.f(3, n2);
        int n6 = a2 == null ? 0 : c.e(4, a2);
        int n7 = n5 + n6 + c.k(5, n3) + c.m(6, l4) + c.m(7, l5) + c.a(10, bl) + c.k(12, n4);
        int n8 = a4 == null ? 0 : c.e(13, a4);
        int n10 = n7 + n8;
        int n11 = a3 == null ? 0 : c.e(14, a3);
        c3.w(n10 + n11);
        c3.u(3, n2);
        c3.t(4, a2);
        c3.A(5, n3);
        c3.C(6, l4);
        c3.C(7, l5);
        c3.s(10, bl);
        c3.A(12, n4);
        if (a4 != null) {
            c3.t(13, a4);
        }
        if (a3 != null) {
            c3.t(14, a3);
        }
    }
}

