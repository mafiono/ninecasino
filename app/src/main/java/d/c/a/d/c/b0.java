/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package d.c.a.d.c;

import java.util.concurrent.Executor;

public final class b0
implements Executor {
    public static final Executor e = new b0();

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

