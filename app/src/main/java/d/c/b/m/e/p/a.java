/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package d.c.b.m.e.p;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public final class a {
    public final byte[] a;
    public volatile int b = 0;

    public a(byte[] arrby) {
        this.a = arrby;
    }

    public static a a(String string) {
        a a2 = new a(string.getBytes(StandardCharsets.UTF_8));
        return a2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        byte[] arrby = this.a;
        int n2 = arrby.length;
        byte[] arrby2 = a2.a;
        if (n2 != arrby2.length) {
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrby[i2] == arrby2[i2]) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        int n2 = this.b;
        if (n2 == 0) {
            byte[] arrby = this.a;
            int n3 = arrby.length;
            int n4 = n3;
            for (int i2 = 0; i2 < n3; ++i2) {
                n4 = n4 * 31 + arrby[i2];
            }
            n2 = n4 == 0 ? 1 : n4;
            this.b = n2;
        }
        return n2;
    }
}

