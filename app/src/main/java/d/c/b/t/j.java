/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.d.j.i
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 */
package d.c.b.t;

import d.c.a.d.j.f0;
import d.c.a.d.j.i;
import d.c.b.t.a;
import d.c.b.t.l;
import d.c.b.t.n;
import d.c.b.t.o;
import d.c.b.t.p.d;
import java.util.Objects;

public class j
implements n {
    public final o a;
    public final i<l> b;

    public j(o o2, i<l> i2) {
        this.a = o2;
        this.b = i2;
    }

    @Override
    public boolean a(Exception exception) {
        this.b.a(exception);
        return true;
    }

    @Override
    public boolean b(d d3) {
        if (d3.j() && !this.a.d(d3)) {
            i<l> i2 = this.b;
            String string = d3.a();
            Objects.requireNonNull((Object)string, "Null token");
            Long l4 = d3.b();
            Long l5 = d3.g();
            String string2 = "";
            if (l4 == null) {
                string2 = d.a.b.a.a.m((String)string2, (String)" tokenExpirationTimestamp");
            }
            if (l5 == null) {
                string2 = d.a.b.a.a.m((String)string2, (String)" tokenCreationTimestamp");
            }
            if (string2.isEmpty()) {
                a a2 = new a(string, l4, l5, null);
                i.a.r(a2);
                return true;
            }
            throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)string2));
        }
        return false;
    }
}

