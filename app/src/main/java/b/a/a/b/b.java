/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  b.a.a.b.a$a
 *  b.a.a.b.a$a$a
 *  b.a.a.b.b$b
 *  java.lang.Object
 *  java.lang.String
 */
package b.a.a.b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.b.a;
import b.a.a.b.b;

/*
 * Exception performing whole class analysis.
 */
@SuppressLint(value={"BanParcelableUsage"})
public class b
implements Parcelable {
    public static final Creator<b> CREATOR;
    public a e;

    public static {
        CREATOR = new Creator<b>(){

            public Object createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            public Object[] newArray(int n) {
                return new b[n];
            }
        };
    }

    public b(Parcel parcel) {
        IInterface iInterface;
        IBinder iBinder = parcel.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver")) != null && iInterface instanceof a ? (a)iInterface : new a.a(iBinder));
        this.e = object;
    }

    public void a(int n, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeToParcel(Parcel parcel, int n) {
        b b2 = this;
        synchronized (b2) {
            if (this.e == null) {
                this.e = new /* Unavailable Anonymous Inner Class!! */;
            }
            parcel.writeStrongBinder(this.e.asBinder());
            return;
        }
    }

}

