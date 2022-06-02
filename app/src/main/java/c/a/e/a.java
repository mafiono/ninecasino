/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  d.a.b.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.a.e;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint(value={"BanParcelableUsage"})
public final class a
implements Parcelable {
    public static final Creator<a> CREATOR = new Creator<a>(){

        public Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public Object[] newArray(int n) {
            return new a[n];
        }
    };
    public final int e;
    public final Intent f;

    public a(int n, Intent intent) {
        this.e = n;
        this.f = intent;
    }

    public a(Parcel parcel) {
        this.e = parcel.readInt();
        Intent intent = parcel.readInt() == 0 ? null : Intent.CREATOR.createFromParcel(parcel);
        this.f = intent;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"ActivityResult{resultCode=");
        int n = this.e;
        String string = n != -1 ? (n != 0 ? String.valueOf(n) : "RESULT_CANCELED") : "RESULT_OK";
        stringBuilder.append(string);
        stringBuilder.append(", data=");
        stringBuilder.append(this.f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeInt(this.e);
        int n2 = this.f == null ? 0 : 1;
        parcel.writeInt(n2);
        Intent intent = this.f;
        if (intent != null) {
            intent.writeToParcel(parcel, n);
        }
    }

}

