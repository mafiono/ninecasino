/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  com.google.firebase.iid.FirebaseInstanceId
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package d.c.b.r;

import android.content.SharedPreferences;
import com.google.firebase.iid.FirebaseInstanceId;
import d.c.a.d.b.a;
import d.c.a.d.j.g;
import d.c.a.d.j.h;
import d.c.b.r.p;
import d.c.b.r.q;
import d.c.b.r.w;

public final class l
implements g {
    public final FirebaseInstanceId a;
    public final String b;
    public final String c;
    public final String d;

    public l(FirebaseInstanceId firebaseInstanceId, String string, String string2, String string3) {
        this.a = firebaseInstanceId;
        this.b = string;
        this.c = string2;
        this.d = string3;
    }

    public final h a(Object object) {
        FirebaseInstanceId firebaseInstanceId = this.a;
        String string = this.b;
        String string2 = this.c;
        String string3 = this.d;
        String string4 = (String)object;
        w w3 = FirebaseInstanceId.i;
        String string5 = firebaseInstanceId.h();
        String string6 = firebaseInstanceId.c.a();
        w w5 = w3;
        synchronized (w5) {
            block4 : {
                String string7 = w.a.a(string4, string6, System.currentTimeMillis());
                if (string7 == null) break block4;
                SharedPreferences.Editor editor = w3.a.edit();
                editor.putString(w3.b(string5, string, string2), string7);
                editor.commit();
            }
            return a.l(new p(string3, string4));
        }
    }
}

