/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.b.d
 *  d.c.a.b.j.b$a
 *  d.c.a.b.j.i
 *  d.c.a.b.j.i$a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Objects
 */
package d.c.a.b.j;

import d.c.a.b.d;
import d.c.a.b.j.b;
import d.c.a.b.j.i;
import java.util.Arrays;
import java.util.Objects;

public final class b
extends i {
    public final String a;
    public final byte[] b;
    public final d c;

    public b(String string, byte[] arrby, d d2, a a2) {
        this.a = string;
        this.b = arrby;
        this.c = d2;
    }

    public String b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    public d d() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof i) {
            byte[] arrby;
            byte[] arrby2;
            i i2 = (i)object;
            return this.a.equals((Object)i2.b()) && Arrays.equals(arrby = this.b, arrby2 = i2 instanceof b ? ((b)i2).b : i2.c()) && this.c.equals((Object)i2.d());
        }
        return false;
    }

    public int hashCode() {
        return 1000003 * (1000003 * (1000003 ^ this.a.hashCode()) ^ Arrays.hashCode(this.b)) ^ this.c.hashCode();
    }

    public static final class b
    extends i.a {
        public String a;
        public byte[] b;
        public d c;

        public i a() {
            String string = this.a == null ? " backendName" : "";
            if (this.c == null) {
                string = d.a.b.a.a.m((String)string, (String)" priority");
            }
            if (string.isEmpty()) {
                return new b(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)string));
        }

        public i.a b(String string) {
            Objects.requireNonNull((Object)string, "Null backendName");
            this.a = string;
            return this;
        }

        public i.a c(d d2) {
            Objects.requireNonNull(d2, "Null priority");
            this.c = d2;
            return this;
        }
    }

}

