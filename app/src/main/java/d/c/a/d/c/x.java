/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  d.c.a.d.j.a
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 *  java.util.concurrent.Executor
 */
package d.c.a.d.c;

import android.os.Bundle;
import d.c.a.d.c.b0;
import d.c.a.d.c.c;
import d.c.a.d.c.y;
import d.c.a.d.j.a;
import d.c.a.d.j.g;
import d.c.a.d.j.h;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class x
implements a {
    public final c a;
    public final Bundle b;

    public x(c c2, Bundle bundle) {
        this.a = c2;
        this.b = bundle;
    }

    public final Object a(h h2) {
        c c2 = this.a;
        Bundle bundle = this.b;
        Objects.requireNonNull((Object)c2);
        if (!h2.n()) {
            return h2;
        }
        Bundle bundle2 = (Bundle)h2.j();
        boolean bl = bundle2 != null && bundle2.containsKey("google.messenger");
        if (!bl) {
            return h2;
        }
        return c2.b(bundle).p(b0.e, y.a);
    }
}

