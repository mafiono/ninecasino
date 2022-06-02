/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Map
 *  java.util.Map$Entry
 */
package d.c.b.l;

import d.c.b.p.a;
import d.c.b.p.b;
import java.util.Map;

public final class r
implements Runnable {
    public final Map.Entry e;
    public final a f;

    public r(Map.Entry entry, a a2) {
        this.e = entry;
        this.f = a2;
    }

    public void run() {
        Map.Entry entry = this.e;
        a a2 = this.f;
        ((b)entry.getKey()).a(a2);
    }
}

