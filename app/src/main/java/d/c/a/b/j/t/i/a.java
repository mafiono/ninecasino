/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.b.j.t.i.a$a
 *  d.c.a.b.j.t.i.d
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.a.b.j.t.i;

import d.c.a.b.j.t.i.a;
import d.c.a.b.j.t.i.d;

public final class a
extends d {
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;

    public a(long l2, int n2, int n3, long l3, int n4, a a2) {
        this.b = l2;
        this.c = n2;
        this.d = n3;
        this.e = l3;
        this.f = n4;
    }

    public int a() {
        return this.d;
    }

    public long b() {
        return this.e;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.f;
    }

    public long e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof d) {
            d d2 = (d)object;
            return this.b == d2.e() && this.c == d2.c() && this.d == d2.a() && this.e == d2.b() && this.f == d2.d();
        }
        return false;
    }

    public int hashCode() {
        long l2 = this.b;
        int n2 = 1000003 * (1000003 * (1000003 * (1000003 ^ (int)(l2 ^ l2 >>> 32)) ^ this.c) ^ this.d);
        long l3 = this.e;
        return 1000003 * (n2 ^ (int)(l3 ^ l3 >>> 32)) ^ this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"EventStoreConfig{maxStorageSizeInBytes=");
        stringBuilder.append(this.b);
        stringBuilder.append(", loadBatchSize=");
        stringBuilder.append(this.c);
        stringBuilder.append(", criticalSectionEnterTimeoutMs=");
        stringBuilder.append(this.d);
        stringBuilder.append(", eventCleanUpAge=");
        stringBuilder.append(this.e);
        stringBuilder.append(", maxBlobByteSizePerRow=");
        stringBuilder.append(this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

