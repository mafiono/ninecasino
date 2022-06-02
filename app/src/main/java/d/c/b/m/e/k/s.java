/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.m.e.k;

import android.os.Build;
import d.c.b.m.e.k.t;
import d.c.b.m.e.p.a;
import d.c.b.m.e.p.c;

public class s
implements t.g {
    public final /* synthetic */ boolean a;

    public s(t t6, String string, String string2, boolean bl) {
        this.a = bl;
    }

    @Override
    public void a(c c3) {
        String string = Build.VERSION.RELEASE;
        String string2 = Build.VERSION.CODENAME;
        boolean bl = this.a;
        a a2 = a.a(string);
        a a3 = a.a(string2);
        c3.z(8, 2);
        c3.w(0 + c.f(1, 3) + c.e(2, a2) + c.e(3, a3) + c.a(4, bl));
        c3.u(1, 3);
        c3.t(2, a2);
        c3.t(3, a3);
        c3.s(4, bl);
    }
}

