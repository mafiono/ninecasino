/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  d.c.a.d.d.m.m
 *  d.c.a.d.d.m.n.a
 *  d.c.a.d.h.b.u9
 *  d.c.a.d.h.b.x9
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.a.d.h.b;

import android.os.Parcel;
import android.os.Parcelable;
import d.c.a.d.b.a;
import d.c.a.d.d.m.m;
import d.c.a.d.h.b.u9;
import d.c.a.d.h.b.x9;

public final class v9
extends d.c.a.d.d.m.n.a {
    public static final Parcelable.Creator<v9> CREATOR = new u9();
    public final int e;
    public final String f;
    public final long g;
    public final Long h;
    public final String i;
    public final String j;
    public final Double k;

    public v9(int n2, String string, long l2, Long l3, Float f2, String string2, String string3, Double d3) {
        this.e = n2;
        this.f = string;
        this.g = l2;
        this.h = l3;
        if (n2 == 1) {
            Double d4 = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
            this.k = d4;
        } else {
            this.k = d3;
        }
        this.i = string2;
        this.j = string3;
    }

    public v9(x9 x92) {
        this(x92.c, x92.d, x92.e, x92.b);
    }

    public v9(String string, long l2, Object object, String string2) {
        m.e((String)string);
        this.e = 2;
        this.f = string;
        this.g = l2;
        this.j = string2;
        if (object == null) {
            this.h = null;
            this.k = null;
            this.i = null;
            return;
        }
        if (object instanceof Long) {
            this.h = (Long)object;
            this.k = null;
            this.i = null;
            return;
        }
        if (object instanceof String) {
            this.h = null;
            this.k = null;
            this.i = (String)object;
            return;
        }
        if (object instanceof Double) {
            this.h = null;
            this.k = (Double)object;
            this.i = null;
            return;
        }
        throw new IllegalArgumentException("User attribute given of un-supported type");
    }

    public final Object q() {
        Long l2 = this.h;
        if (l2 != null) {
            return l2;
        }
        Double d3 = this.k;
        if (d3 != null) {
            return d3;
        }
        String string = this.i;
        return string;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = a.M(parcel, 20293);
        int n4 = this.e;
        a.r0(parcel, 1, 4);
        parcel.writeInt(n4);
        a.G(parcel, 2, this.f, false);
        long l2 = this.g;
        a.r0(parcel, 3, 8);
        parcel.writeLong(l2);
        Long l3 = this.h;
        if (l3 != null) {
            a.r0(parcel, 4, 8);
            parcel.writeLong(l3.longValue());
        }
        a.G(parcel, 6, this.i, false);
        a.G(parcel, 7, this.j, false);
        Double d3 = this.k;
        if (d3 != null) {
            a.r0(parcel, 8, 8);
            parcel.writeDouble(d3.doubleValue());
        }
        a.q0(parcel, n3);
    }
}

