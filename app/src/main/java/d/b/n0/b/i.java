/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  d.b.n0.b.d
 *  d.b.n0.b.i$a
 *  java.lang.ClassLoader
 *  java.lang.String
 */
package d.b.n0.b;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d.b.n0.b.d;
import d.b.n0.b.i;

public final class i
extends d {
    public static final Parcelable.Creator<i> CREATOR = new a();
    public final Bitmap f;
    public final Uri g;
    public final boolean h;
    public final String i;

    public i(Parcel parcel) {
        super(parcel);
        this.f = parcel.readParcelable(Bitmap.class.getClassLoader());
        this.g = parcel.readParcelable(Uri.class.getClassLoader());
        boolean bl = parcel.readByte() != 0;
        this.h = bl;
        this.i = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeBundle(this.e);
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeByte((byte)(this.h ? 1 : 0));
        parcel.writeString(this.i);
    }
}

