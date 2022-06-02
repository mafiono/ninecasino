/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Void
 *  java.util.concurrent.Callable
 */
package d.c.b.m.e.k;

import d.c.b.m.e.k.h;
import java.util.concurrent.Callable;

public class i
implements Callable<Void> {
    public final /* synthetic */ Runnable a;

    public i(h h2, Runnable runnable) {
        this.a = runnable;
    }

    public Object call() {
        this.a.run();
        return null;
    }
}

