/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package d.c.a.d.c;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import d.c.a.d.c.d;

public final class e
implements Parcelable.Creator<d> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new d(parcel.readStrongBinder());
    }

    public final /* synthetic */ Object[] newArray(int n2) {
        return new d[n2];
    }
}

