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

import d.c.b.m.e.m.d;
import d.c.b.m.e.m.v;
import d.c.b.m.e.m.w;

public final class d
extends v.c {
    public final w<v.c$a> a;
    public final String b;

    public d(w w3, String string, a a2) {
        this.a = w3;
        this.b = string;
    }

    @Override
    public w<v.c$a> a() {
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
        if (object instanceof v.c) {
            v.c c3 = (v.c)object;
            if (this.a.equals(c3.a())) {
                String string = this.b;
                String string2 = c3.b();
                return string == null ? string2 == null : string.equals(string2);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n2 = 1000003 * (1000003 ^ this.a.hashCode());
        String string = this.b;
        int n3 = string == null ? 0 : string.hashCode();
        return n2 ^ n3;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"FilesPayload{files=");
        stringBuilder.append(this.a);
        stringBuilder.append(", orgId=");
        return d.a.b.a.a.o((StringBuilder)stringBuilder, (String)this.b, (String)"}");
    }
}

