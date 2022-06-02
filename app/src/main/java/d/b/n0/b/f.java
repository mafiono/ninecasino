/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  d.b.n0.b.a
 *  d.b.n0.b.e$a
 *  d.b.n0.b.f$a
 *  d.b.n0.b.h
 *  d.b.n0.b.h$a
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 */
package d.b.n0.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d.b.n0.b.e;
import d.b.n0.b.f;
import d.b.n0.b.h;

public final class f
extends d.b.n0.b.a<f, Object> {
    public static final Parcelable.Creator<f> CREATOR = new a();
    public final e k;
    public final String l;

    public f(Parcel parcel) {
        super(parcel);
        e.b b2 = new e.b();
        e e2 = parcel.readParcelable(e.class.getClassLoader());
        if (e2 != null) {
            b2.a.putAll((Bundle)e2.e.clone());
            String string = e2.e.getString("og:type");
            b2.a.putString("og:type", string);
        }
        this.k = new e(b2, null);
        this.l = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeParcelable((Parcelable)this.k, 0);
        parcel.writeString(this.l);
    }
}

