/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  g.a.i1
 *  g.a.u0
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package g.a;

import d.a.b.a.a;
import g.a.i1;
import g.a.u0;

public final class l0
implements u0 {
    public final boolean e;

    public l0(boolean bl) {
        this.e = bl;
    }

    public boolean a() {
        return this.e;
    }

    public i1 b() {
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = a.d((String)"Empty{");
        String string = this.e ? "Active" : "New";
        stringBuilder.append(string);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

