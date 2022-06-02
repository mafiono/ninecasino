/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Objects
 */
package d.c.b.r;

import android.os.Bundle;
import android.util.Log;
import d.c.a.d.j.a;
import d.c.a.d.j.h;
import d.c.b.r.n;
import java.io.IOException;
import java.util.Objects;

public final class m
implements a {
    public final n a;

    public m(n n2) {
        this.a = n2;
    }

    public final Object a(h h2) {
        Objects.requireNonNull((Object)this.a);
        Bundle bundle = (Bundle)h2.k(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                String string4 = String.valueOf(bundle);
                StringBuilder stringBuilder = new StringBuilder(21 + string4.length());
                stringBuilder.append("Unexpected response: ");
                stringBuilder.append(string4);
                Log.w("FirebaseInstanceId", stringBuilder.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}

