/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.math.BigInteger
 *  java.util.Objects
 */
package d.c.c;

import d.c.c.a0.r;
import d.c.c.n;
import java.math.BigInteger;
import java.util.Objects;

public final class s
extends n {
    public final Object a;

    public s(Boolean bl) {
        Objects.requireNonNull((Object)bl);
        this.a = bl;
    }

    public s(Number number) {
        Objects.requireNonNull((Object)number);
        this.a = number;
    }

    public s(String string) {
        Objects.requireNonNull((Object)string);
        this.a = string;
    }

    public static boolean k(s s4) {
        Number number;
        Object object = s4.a;
        return object instanceof Number && ((number = (Number)object) instanceof BigInteger || number instanceof Long || number instanceof Integer || number instanceof Short || number instanceof Byte);
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return bl;
        }
        if (object != null) {
            if (s.class != object.getClass()) {
                return false;
            }
            s s4 = (s)object;
            if (this.a == null) {
                if (s4.a == null) {
                    return bl;
                }
                return false;
            }
            if (s.k(this) && s.k(s4)) {
                if (this.i().longValue() == s4.i().longValue()) {
                    return bl;
                }
                return false;
            }
            Object object2 = this.a;
            if (object2 instanceof Number && s4.a instanceof Number) {
                double d3;
                double d4 = this.i().doubleValue();
                if (d4 != (d3 = s4.i().doubleValue())) {
                    if (Double.isNaN(d4) && Double.isNaN(d3)) {
                        return bl;
                    }
                    bl = false;
                }
                return bl;
            }
            return object2.equals(s4.a);
        }
        return false;
    }

    public boolean h() {
        Object object = this.a;
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        return Boolean.parseBoolean(this.j());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int hashCode() {
        long l4;
        if (this.a == null) {
            return 31;
        }
        if (s.k(this)) {
            l4 = this.i().longValue();
            do {
                return (int)(l4 ^ l4 >>> 32);
                break;
            } while (true);
        }
        Object object = this.a;
        if (!(object instanceof Number)) return object.hashCode();
        l4 = Double.doubleToLongBits(this.i().doubleValue());
        return (int)(l4 ^ l4 >>> 32);
    }

    public Number i() {
        Object object = this.a;
        if (object instanceof String) {
            return new r((String)this.a);
        }
        return (Number)object;
    }

    public String j() {
        Object object = this.a;
        if (object instanceof Number) {
            return this.i().toString();
        }
        if (object instanceof Boolean) {
            return object.toString();
        }
        return (String)object;
    }
}

