/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package d.c.b.y.q;

import java.util.concurrent.Executor;

public final class d
implements Executor {
    public static final d e = new d();

    public void execute(Runnable runnable) {
        runnable.run();
    }
}

