/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firebase.iid.FirebaseInstanceId
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.r;

import com.google.firebase.iid.FirebaseInstanceId;
import d.c.a.d.j.a;
import d.c.a.d.j.h;

public final class i
implements a {
    public final FirebaseInstanceId a;
    public final String b;
    public final String c;

    public i(FirebaseInstanceId firebaseInstanceId, String string, String string2) {
        this.a = firebaseInstanceId;
        this.b = string;
        this.c = string2;
    }

    public final Object a(h h2) {
        return this.a.m(this.b, this.c);
    }
}

