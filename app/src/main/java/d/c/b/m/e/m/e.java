/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package d.c.b.m.e.m;

import d.c.b.m.e.m.e;
import d.c.b.m.e.m.v;
import java.util.Arrays;

public final class e
extends v.c$a {
    public final String a;
    public final byte[] b;

    public e(String string, byte[] arrby, a a2) {
        this.a = string;
        this.b = arrby;
    }

    @Override
    public byte[] a() {
        return this.b;
    }

    @Override
    public String b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.c$a) {
            byte[] arrby;
            byte[] arrby2;
            v.c$a c$a2 = (v.c$a)object;
            return this.a.equals((Object)c$a2.b()) && Arrays.equals(arrby = this.b, arrby2 = c$a2 instanceof e ? ((e)c$a2).b : c$a2.a());
        }
        return false;
    }

    public int hashCode() {
        return 1000003 * (1000003 ^ this.a.hashCode()) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"File{filename=");
        stringBuilder.append(this.a);
        stringBuilder.append(", contents=");
        stringBuilder.append(Arrays.toString(this.b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

