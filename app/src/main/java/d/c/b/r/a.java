/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package d.c.b.r;

import java.util.concurrent.Executor;

public final class a
implements Executor {
    public static final Executor e = new a();

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

