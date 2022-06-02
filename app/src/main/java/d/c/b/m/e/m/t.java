/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.m.e.m;

import d.c.b.m.e.m.t;
import d.c.b.m.e.m.v;

public final class t
extends v.d$e {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public t(int n2, String string, String string2, boolean bl, a a2) {
        this.a = n2;
        this.b = string;
        this.c = string2;
        this.d = bl;
    }

    @Override
    public String a() {
        return this.c;
    }

    @Override
    public int b() {
        return this.a;
    }

    @Override
    public String c() {
        return this.b;
    }

    @Override
    public boolean d() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.d$e) {
            v.d$e d$e2 = (v.d$e)object;
            return this.a == d$e2.b() && this.b.equals((Object)d$e2.c()) && this.c.equals((Object)d$e2.a()) && this.d == d$e2.d();
        }
        return false;
    }

    public int hashCode() {
        int n2 = 1000003 * (1000003 * (1000003 * (1000003 ^ this.a) ^ this.b.hashCode()) ^ this.c.hashCode());
        int n3 = this.d ? 1231 : 1237;
        return n2 ^ n3;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"OperatingSystem{platform=");
        stringBuilder.append(this.a);
        stringBuilder.append(", version=");
        stringBuilder.append(this.b);
        stringBuilder.append(", buildVersion=");
        stringBuilder.append(this.c);
        stringBuilder.append(", jailbroken=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

