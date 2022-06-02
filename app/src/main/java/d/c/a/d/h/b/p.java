/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  d.a.b.a.a
 *  d.c.a.d.d.m.n.a
 *  d.c.a.d.h.b.o
 *  d.c.a.d.h.b.s
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 */
package d.c.a.d.h.b;

import android.os.Parcel;
import android.os.Parcelable;
import d.c.a.d.b.a;
import d.c.a.d.h.b.o;
import d.c.a.d.h.b.s;
import java.util.Objects;

public final class p
extends d.c.a.d.d.m.n.a {
    public static final Parcelable.Creator<p> CREATOR = new s();
    public final String e;
    public final o f;
    public final String g;
    public final long h;

    public p(p p2, long l2) {
        Objects.requireNonNull(p2, "null reference");
        this.e = p2.e;
        this.f = p2.f;
        this.g = p2.g;
        this.h = l2;
    }

    public p(String string, o o2, String string2, long l2) {
        this.e = string;
        this.f = o2;
        this.g = string2;
        this.h = l2;
    }

    public final String toString() {
        String string = this.g;
        String string2 = this.e;
        String string3 = String.valueOf((Object)this.f);
        return d.a.b.a.a.o((StringBuilder)d.a.b.a.a.c((int)(d.a.b.a.a.b((String)string2, (int)d.a.b.a.a.b((String)string, (int)21)) + string3.length()), (String)"origin=", (String)string, (String)",name=", (String)string2), (String)",params=", (String)string3);
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = a.M(parcel, 20293);
        a.G(parcel, 2, this.e, false);
        a.F(parcel, 3, (Parcelable)this.f, n2, false);
        a.G(parcel, 4, this.g, false);
        long l2 = this.h;
        a.r0(parcel, 5, 8);
        parcel.writeLong(l2);
        a.q0(parcel, n3);
    }
}

