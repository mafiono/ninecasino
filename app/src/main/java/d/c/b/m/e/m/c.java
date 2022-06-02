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

import d.c.b.m.e.m.c;
import d.c.b.m.e.m.v;

public final class c
extends v.b {
    public final String a;
    public final String b;

    public c(String string, String string2, a a2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public String b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.b) {
            v.b b3 = (v.b)object;
            return this.a.equals(b3.a()) && this.b.equals(b3.b());
        }
        return false;
    }

    public int hashCode() {
        return 1000003 * (1000003 ^ this.a.hashCode()) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"CustomAttribute{key=");
        stringBuilder.append(this.a);
        stringBuilder.append(", value=");
        return d.a.b.a.a.o((StringBuilder)stringBuilder, (String)this.b, (String)"}");
    }
}

