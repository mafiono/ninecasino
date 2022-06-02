/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  d.c.a.e.m.e
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Calendar
 */
package d.c.a.e.m;

import android.os.Parcel;
import android.os.Parcelable;
import d.c.a.e.m.a0;
import d.c.a.e.m.e;
import d.c.a.e.m.s;
import java.util.Arrays;
import java.util.Calendar;

public final class a
implements Parcelable {
    public static final Creator<a> CREATOR = new Creator<a>(){

        public Object createFromParcel(Parcel parcel) {
            s s2 = parcel.readParcelable(s.class.getClassLoader());
            s s3 = parcel.readParcelable(s.class.getClassLoader());
            s s4 = parcel.readParcelable(s.class.getClassLoader());
            c c2 = parcel.readParcelable(c.class.getClassLoader());
            a a2 = new a(s2, s3, s4, c2, null);
            return a2;
        }

        public Object[] newArray(int n2) {
            return new a[n2];
        }
    };
    public final s e;
    public final s f;
    public final s g;
    public final c h;
    public final int i;
    public final int j;

    public a(s s2, s s3, s s4, c c2, a a2) {
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.h = c2;
        if (s2.e.compareTo(s4.e) <= 0) {
            if (s4.e.compareTo(s3.e) <= 0) {
                this.j = 1 + s2.w(s3);
                this.i = 1 + (s3.h - s2.h);
                return;
            }
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        throw new IllegalArgumentException("start Month cannot be after current Month");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        return this.e.equals(a2.e) && this.f.equals(a2.f) && this.g.equals(a2.g) && this.h.equals(a2.h);
    }

    public int hashCode() {
        Object[] arrobject = new Object[]{this.e, this.f, this.g, this.h};
        return Arrays.hashCode(arrobject);
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeParcelable(this.h, 0);
    }

    public static final class b {
        public static final long e = a0.a(s.r(1900, 0).k);
        public static final long f = a0.a(s.r(2100, 11).k);
        public long a = e;
        public long b = f;
        public Long c;
        public c d = new e(Long.MIN_VALUE);

        public b(a a2) {
            this.a = a2.e.k;
            this.b = a2.f.k;
            this.c = a2.g.k;
            this.d = a2.h;
        }
    }

    public interface c
    extends Parcelable {
        boolean k(long var1);
    }

}

