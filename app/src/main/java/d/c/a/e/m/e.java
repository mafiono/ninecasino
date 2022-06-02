/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.util.Arrays
 */
package d.c.a.e.m;

import android.os.Parcel;
import android.os.Parcelable;
import d.c.a.e.m.a;
import d.c.a.e.m.e;
import java.util.Arrays;

public class e
implements a.c {
    public static final Creator<e> CREATOR = new Creator<e>(){

        public Object createFromParcel(Parcel parcel) {
            return new e(parcel.readLong(), null);
        }

        public Object[] newArray(int n2) {
            return new e[n2];
        }
    };
    public final long e;

    public e(long l4) {
        this.e = l4;
    }

    public e(long l4, a a2) {
        this.e = l4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        e e2 = (e)object;
        return this.e == e2.e;
    }

    public int hashCode() {
        Object[] arrobject = new Object[]{this.e};
        return Arrays.hashCode(arrobject);
    }

    @Override
    public boolean k(long l4) {
        return l4 >= this.e;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeLong(this.e);
    }
}

