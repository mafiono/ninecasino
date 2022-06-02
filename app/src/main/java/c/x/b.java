/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.util.SparseIntArray
 *  d.a.b.a.a
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Method
 */
package c.x;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import c.x.a;
import java.lang.reflect.Method;

public class b
extends a {
    public final SparseIntArray d = new SparseIntArray();
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i = -1;
    public int j = 0;
    public int k = -1;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new c.e.a<String, Method>(), new c.e.a<String, Method>(), new c.e.a<String, Class>());
    }

    public b(Parcel parcel, int n2, int n3, String string, c.e.a<String, Method> a2, c.e.a<String, Method> a3, c.e.a<String, Class> a4) {
        super(a2, a3, a4);
        this.e = parcel;
        this.f = n2;
        this.g = n3;
        this.j = n2;
        this.h = string;
    }

    @Override
    public void a() {
        int n2 = this.i;
        if (n2 >= 0) {
            int n3 = this.d.get(n2);
            int n4 = this.e.dataPosition();
            int n5 = n4 - n3;
            this.e.setDataPosition(n3);
            this.e.writeInt(n5);
            this.e.setDataPosition(n4);
        }
    }

    @Override
    public a b() {
        Parcel parcel = this.e;
        int n2 = parcel.dataPosition();
        int n3 = this.j;
        if (n3 == this.f) {
            n3 = this.g;
        }
        b b2 = new b(parcel, n2, n3, d.a.b.a.a.o((StringBuilder)new StringBuilder(), (String)this.h, (String)"  "), this.a, this.b, this.c);
        return b2;
    }

    @Override
    public boolean f() {
        return this.e.readInt() != 0;
    }

    @Override
    public byte[] g() {
        int n2 = this.e.readInt();
        if (n2 < 0) {
            return null;
        }
        byte[] arrby = new byte[n2];
        this.e.readByteArray(arrby);
        return arrby;
    }

    @Override
    public CharSequence h() {
        return TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override
    public boolean i(int n2) {
        while (this.j < this.g) {
            int n3 = this.k;
            if (n3 == n2) {
                return true;
            }
            if (String.valueOf(n3).compareTo(String.valueOf(n2)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            int n4 = this.e.readInt();
            this.k = this.e.readInt();
            this.j = n4 + this.j;
        }
        return this.k == n2;
    }

    @Override
    public int j() {
        return this.e.readInt();
    }

    @Override
    public <T extends Parcelable> T l() {
        return this.e.readParcelable(b.class.getClassLoader());
    }

    @Override
    public String n() {
        return this.e.readString();
    }

    @Override
    public void p(int n2) {
        this.a();
        this.i = n2;
        this.d.put(n2, this.e.dataPosition());
        this.e.writeInt(0);
        this.e.writeInt(n2);
    }

    @Override
    public void q(boolean bl) {
        this.e.writeInt((int)bl);
    }

    @Override
    public void r(byte[] arrby) {
        if (arrby != null) {
            this.e.writeInt(arrby.length);
            this.e.writeByteArray(arrby);
            return;
        }
        this.e.writeInt(-1);
    }

    @Override
    public void s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override
    public void t(int n2) {
        this.e.writeInt(n2);
    }

    @Override
    public void u(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override
    public void v(String string) {
        this.e.writeString(string);
    }
}

