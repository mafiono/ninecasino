/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.b.i.e.f$a
 *  d.c.a.b.i.e.l
 *  d.c.a.b.i.e.l$a
 *  d.c.a.b.i.e.o
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package d.c.a.b.i.e;

import d.c.a.b.i.e.f;
import d.c.a.b.i.e.l;
import d.c.a.b.i.e.o;
import java.util.Arrays;

public final class f
extends l {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final o g;

    public f(long l2, Integer n2, long l3, byte[] arrby, String string, long l4, o o2, a a2) {
        this.a = l2;
        this.b = n2;
        this.c = l3;
        this.d = arrby;
        this.e = string;
        this.f = l4;
        this.g = o2;
    }

    public Integer a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.c;
    }

    public o d() {
        return this.g;
    }

    public byte[] e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof l) {
            String string;
            byte[] arrby;
            Integer n2;
            byte[] arrby2;
            l l2 = (l)object;
            if (this.a == l2.b() && ((n2 = this.b) == null ? l2.a() == null : n2.equals((Object)l2.a())) && this.c == l2.c() && Arrays.equals(arrby = this.d, arrby2 = l2 instanceof f ? ((f)l2).d : l2.e()) && ((string = this.e) == null ? l2.f() == null : string.equals((Object)l2.f())) && this.f == l2.g()) {
                o o2 = this.g;
                o o3 = l2.d();
                return o2 == null ? o3 == null : o2.equals((Object) o3);
            }
            return false;
        }
        return false;
    }

    public String f() {
        return this.e;
    }

    public long g() {
        return this.f;
    }

    public int hashCode() {
        long l2 = this.a;
        int n2 = 1000003 * (1000003 ^ (int)(l2 ^ l2 >>> 32));
        Integer n3 = this.b;
        int n4 = n3 == null ? 0 : n3.hashCode();
        int n5 = 1000003 * (n2 ^ n4);
        long l3 = this.c;
        int n6 = 1000003 * (1000003 * (n5 ^ (int)(l3 ^ l3 >>> 32)) ^ Arrays.hashCode(this.d));
        String string = this.e;
        int n7 = string == null ? 0 : string.hashCode();
        int n8 = 1000003 * (n6 ^ n7);
        long l4 = this.f;
        int n9 = 1000003 * (n8 ^ (int)(l4 ^ l4 >>> 32));
        o o2 = this.g;
        int n10 = o2 == null ? 0 : o2.hashCode();
        return n9 ^ n10;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"LogEvent{eventTimeMs=");
        stringBuilder.append(this.a);
        stringBuilder.append(", eventCode=");
        stringBuilder.append(this.b);
        stringBuilder.append(", eventUptimeMs=");
        stringBuilder.append(this.c);
        stringBuilder.append(", sourceExtension=");
        stringBuilder.append(Arrays.toString(this.d));
        stringBuilder.append(", sourceExtensionJsonProto3=");
        stringBuilder.append(this.e);
        stringBuilder.append(", timezoneOffsetSeconds=");
        stringBuilder.append(this.f);
        stringBuilder.append(", networkConnectionInfo=");
        stringBuilder.append((Object)this.g);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends l.a {
        public Long a;
        public Integer b;
        public Long c;
        public byte[] d;
        public String e;
        public Long f;
        public o g;
    }

}

