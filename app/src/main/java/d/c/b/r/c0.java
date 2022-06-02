/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.c
 *  d.c.a.d.j.h
 *  java.lang.Object
 *  java.util.concurrent.ScheduledFuture
 */
package d.c.b.r;

import d.c.a.d.j.c;
import d.c.a.d.j.h;
import java.util.concurrent.ScheduledFuture;

public final class c0
implements c {
    public final ScheduledFuture a;

    public c0(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    public final void a(h h2) {
        this.a.cancel(false);
    }
}

