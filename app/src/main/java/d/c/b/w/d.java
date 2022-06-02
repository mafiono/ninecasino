/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  d.c.a.d.j.i
 *  java.lang.Object
 *  java.lang.Runnable
 */
package d.c.b.w;

import android.content.Intent;
import d.c.a.d.j.i;
import d.c.b.w.g;

public final class d
implements Runnable {
    public final g e;
    public final Intent f;
    public final i g;

    public d(g g2, Intent intent, i i2) {
        this.e = g2;
        this.f = intent;
        this.g = i2;
    }

    public final void run() {
        this.e.lambda$processIntent$0$EnhancedIntentService(this.f, this.g);
    }
}

