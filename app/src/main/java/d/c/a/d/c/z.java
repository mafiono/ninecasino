/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  c.e.h
 *  d.c.a.d.j.c
 *  d.c.a.d.j.h
 *  d.c.a.d.j.i
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.ScheduledFuture
 */
package d.c.a.d.c;

import android.os.Bundle;
import c.e.h;
import d.c.a.d.c.c;
import d.c.a.d.j.i;
import java.util.concurrent.ScheduledFuture;

public final class z
implements d.c.a.d.j.c {
    public final c a;
    public final String b;
    public final ScheduledFuture c;

    public z(c c2, String string, ScheduledFuture scheduledFuture) {
        this.a = c2;
        this.b = string;
        this.c = scheduledFuture;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(d.c.a.d.j.h h2) {
        h<String, i<Bundle>> h3;
        c c2 = this.a;
        String string = this.b;
        ScheduledFuture scheduledFuture = this.c;
        h<String, i<Bundle>> h4 = h3 = c2.a;
        synchronized (h4) {
            c2.a.remove((Object)string);
        }
        scheduledFuture.cancel(false);
    }
}

