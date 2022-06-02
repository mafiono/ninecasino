/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$ClassLoaderCreator
 *  android.os.Parcelable$Creator
 *  c.e.h
 *  c.j.a.a
 *  d.a.b.a.a
 *  java.lang.ClassLoader
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package d.c.a.e.y;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c.e.h;
import d.c.a.e.y.a;

public class a
extends c.j.a.a {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.ClassLoaderCreator<a>(){

        public Object createFromParcel(Parcel parcel) {
            return new a(parcel, null, null);
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        public Object[] newArray(int n2) {
            return new a[n2];
        }
    };
    public final h<String, Bundle> g;

    public a(Parcel parcel, ClassLoader classLoader, a a2) {
        super(parcel, classLoader);
        int n2 = parcel.readInt();
        String[] arrstring = new String[n2];
        parcel.readStringArray(arrstring);
        Object[] arrobject = new Bundle[n2];
        parcel.readTypedArray(arrobject, Bundle.CREATOR);
        this.g = new h(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            this.g.put((Object)arrstring[i2], arrobject[i2]);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"ExtendableSavedState{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" states=");
        stringBuilder.append(this.g);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeParcelable(this.e, n2);
        int n3 = this.g.g;
        parcel.writeInt(n3);
        String[] arrstring = new String[n3];
        Bundle[] arrbundle = new Bundle[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            arrstring[i2] = (String)this.g.h(i2);
            arrbundle[i2] = (Bundle)this.g.k(i2);
        }
        parcel.writeStringArray(arrstring);
        parcel.writeTypedArray((Parcelable[])arrbundle, 0);
    }
}

