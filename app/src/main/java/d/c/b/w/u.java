/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  d.c.b.w.t
 *  java.lang.Object
 */
package d.c.b.w;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d.c.a.d.b.a;
import d.c.b.w.t;

public class u
implements Parcelable.Creator<t> {
    public Object createFromParcel(Parcel parcel) {
        int n2 = a.A(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < n2) {
            int n3 = parcel.readInt();
            if ((65535 & n3) != 2) {
                a.y(parcel, n3);
                continue;
            }
            bundle = a.d(parcel, n3);
        }
        a.i(parcel, n2);
        return new t(bundle);
    }

    public Object[] newArray(int n2) {
        return new t[n2];
    }
}

