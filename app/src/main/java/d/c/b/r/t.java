/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package d.c.b.r;

import android.util.Pair;
import d.c.a.d.j.a;
import d.c.a.d.j.h;
import d.c.b.r.o;
import d.c.b.r.u;
import java.util.Map;

public final class t
implements a {
    public final u a;
    public final Pair b;

    public t(u u4, Pair pair) {
        this.a = u4;
        this.b = pair;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(h h2) {
        u u4 = this.a;
        Pair pair = this.b;
        u u6 = u4;
        synchronized (u6) {
            u4.b.remove((Object)pair);
            return h2;
        }
    }
}

