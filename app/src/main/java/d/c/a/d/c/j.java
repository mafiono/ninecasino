/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package d.c.a.d.c;

import d.c.a.d.c.h;

public final class j
implements Runnable {
    public final h e;

    public j(h h2) {
        this.e = h2;
    }

    public final void run() {
        h h2;
        h h3 = h2 = this.e;
        synchronized (h3) {
            if (h2.a == 1) {
                h2.a(1, "Timed out while binding");
            }
            return;
        }
    }
}

