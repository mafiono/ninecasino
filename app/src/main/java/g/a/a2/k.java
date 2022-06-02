/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.e.a
 *  g.a.a2.i
 *  g.a.a2.j
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package g.a.a2;

import d.c.a.e.a;
import g.a.a2.i;
import g.a.a2.j;

public final class k
extends i {
    public final Runnable g;

    public k(Runnable runnable, long l4, j j2) {
        super(l4, j2);
        this.g = runnable;
    }

    public void run() {
        try {
            this.g.run();
            return;
        }
        finally {
            this.f.d0();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Task[");
        stringBuilder.append(a.y((Object)this.g));
        stringBuilder.append('@');
        stringBuilder.append(a.F((Object)this.g));
        stringBuilder.append(", ");
        stringBuilder.append(this.e);
        stringBuilder.append(", ");
        stringBuilder.append((Object)this.f);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

