/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.k.b.a0
 *  c.k.b.n
 *  d.b.j0.w
 *  d.b.k0.c
 *  d.b.k0.h$a
 *  d.b.k0.o
 *  d.b.k0.o$d
 *  d.b.k0.t
 *  java.lang.String
 *  java.util.Map
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 */
package d.b.k0;

import android.os.Parcel;
import android.os.Parcelable;
import c.k.b.a0;
import c.k.b.n;
import d.b.j0.w;
import d.b.k0.c;
import d.b.k0.h;
import d.b.k0.o;
import d.b.k0.t;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class h
extends t {
    public static final Parcelable.Creator<h> CREATOR = new a();
    public static ScheduledThreadPoolExecutor g;

    public h(Parcel parcel) {
        super(parcel);
    }

    public h(o o2) {
        super(o2);
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return "device_auth";
    }

    public int t(o.d d2) {
        n n2 = this.f.e();
        if (n2 != null && !n2.isFinishing()) {
            c c2 = new c();
            c2.z0(n2.m(), "login_with_facebook");
            c2.I0(d2);
        }
        return 1;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        w.L((Parcel)parcel, (Map)this.e);
    }
}

