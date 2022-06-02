/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  d.c.a.d.d.m.n.a
 */
package d.c.b.w;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d.c.a.d.b.a;
import d.c.b.w.u;

public final class t
extends d.c.a.d.d.m.n.a {
    public static final Parcelable.Creator<t> CREATOR = new u();
    public Bundle e;

    public t(Bundle bundle) {
        this.e = bundle;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = a.M(parcel, 20293);
        a.D(parcel, 2, this.e, false);
        a.q0(parcel, n3);
    }
}

