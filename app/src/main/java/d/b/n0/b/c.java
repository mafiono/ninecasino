/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  d.b.n0.b.a
 *  d.b.n0.b.c$a
 *  java.lang.ClassLoader
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 */
package d.b.n0.b;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import d.b.n0.b.c;

public final class c
extends d.b.n0.b.a<c, Object> {
    public static final Parcelable.Creator<c> CREATOR = new a();
    @Deprecated
    public final String k;
    @Deprecated
    public final String l;
    @Deprecated
    public final Uri m;
    public final String n;

    public c(Parcel parcel) {
        super(parcel);
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readParcelable(Uri.class.getClassLoader());
        this.n = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeParcelable(this.m, 0);
        parcel.writeString(this.n);
    }
}

