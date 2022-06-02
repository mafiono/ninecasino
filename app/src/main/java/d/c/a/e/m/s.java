/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Comparable
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.text.SimpleDateFormat
 *  java.util.Arrays
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.GregorianCalendar
 *  java.util.Locale
 *  java.util.TimeZone
 */
package d.c.a.e.m;

import android.os.Parcel;
import android.os.Parcelable;
import d.c.a.e.m.a0;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public final class s
implements Comparable<s>,
Parcelable {
    public static final Creator<s> CREATOR = new Creator<s>(){

        public Object createFromParcel(Parcel parcel) {
            return s.r(parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int n2) {
            return new s[n2];
        }
    };
    public final Calendar e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;

    public s(Calendar calendar) {
        Calendar calendar2;
        calendar.set(5, 1);
        this.e = calendar2 = a0.b(calendar);
        this.g = calendar2.get(2);
        this.h = calendar2.get(1);
        this.i = calendar2.getMaximum(7);
        this.j = calendar2.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(a0.c());
        this.f = simpleDateFormat.format(calendar2.getTime());
        this.k = calendar2.getTimeInMillis();
    }

    public static s r(int n2, int n3) {
        Calendar calendar = a0.e();
        calendar.set(1, n2);
        calendar.set(2, n3);
        return new s(calendar);
    }

    public static s s(long l2) {
        Calendar calendar = a0.e();
        calendar.setTimeInMillis(l2);
        return new s(calendar);
    }

    public static s t() {
        return new s(a0.d());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof s)) {
            return false;
        }
        s s2 = (s)object;
        return this.g == s2.g && this.h == s2.h;
    }

    public int hashCode() {
        Object[] arrobject = new Object[]{this.g, this.h};
        return Arrays.hashCode(arrobject);
    }

    public int q(s s2) {
        return this.e.compareTo(s2.e);
    }

    public int u() {
        int n2 = this.e.get(7) - this.e.getFirstDayOfWeek();
        if (n2 < 0) {
            n2 += this.i;
        }
        return n2;
    }

    public s v(int n2) {
        Calendar calendar = a0.b(this.e);
        calendar.add(2, n2);
        return new s(calendar);
    }

    public int w(s s2) {
        if (this.e instanceof GregorianCalendar) {
            return 12 * (s2.h - this.h) + (s2.g - this.g);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeInt(this.h);
        parcel.writeInt(this.g);
    }

}

