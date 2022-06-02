/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  d.c.a.d.d.m.m
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.w;

import android.content.Intent;
import d.c.a.d.d.m.m;

public final class n {
    public final String a;
    public final Intent b;

    public n(String string, Intent intent) {
        m.f((String)string, (Object)"evenType must be non-null");
        this.a = string;
        m.i((Object)intent, (Object)"intent must be non-null");
        this.b = intent;
    }

    public static final class b {
        public final n a;

        public b(n n2) {
            this.a = n2;
        }
    }

}

