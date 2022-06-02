/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.a.d.c;

import android.os.Bundle;
import d.c.a.d.b.a;
import d.c.a.d.j.g;
import d.c.a.d.j.h;

public final class y
implements g {
    public static final g a = new y();

    public final h a(Object object) {
        Bundle bundle = (Bundle)object;
        boolean bl = bundle != null && bundle.containsKey("google.messenger");
        if (bl) {
            bundle = null;
        }
        return a.l(bundle);
    }
}

