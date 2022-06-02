/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.t;

import d.c.b.t.a;
import d.c.b.t.l;

public final class a
extends l {
    public final String a;
    public final long b;
    public final long c;

    public a(String string, long l4, long l5, a a2) {
        this.a = string;
        this.b = l4;
        this.c = l5;
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public long b() {
        return this.c;
    }

    @Override
    public long c() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof l) {
            l l4 = (l)object;
            return this.a.equals(l4.a()) && this.b == l4.c() && this.c == l4.b();
        }
        return false;
    }

    public int hashCode() {
        int n2 = 1000003 * (1000003 ^ this.a.hashCode());
        long l4 = this.b;
        int n3 = 1000003 * (n2 ^ (int)(l4 ^ l4 >>> 32));
        long l5 = this.c;
        return n3 ^ (int)(l5 ^ l5 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"InstallationTokenResult{token=");
        stringBuilder.append(this.a);
        stringBuilder.append(", tokenExpirationTimestamp=");
        stringBuilder.append(this.b);
        stringBuilder.append(", tokenCreationTimestamp=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

