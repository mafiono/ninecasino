/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package d.c.b.w;

import java.util.concurrent.Executor;

public final class e
implements Executor {
    public static final Executor e = new e();

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

