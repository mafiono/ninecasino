/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.b.m.e.k.p0$a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.atomic.AtomicLong
 */
package d.c.b.m.e.k;

import d.c.b.m.e.k.p0;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public class p0
implements ThreadFactory {
    public final /* synthetic */ String a;
    public final /* synthetic */ AtomicLong b;

    public p0(String string, AtomicLong atomicLong) {
        this.a = string;
        this.b = atomicLong;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = Executors.defaultThreadFactory().newThread((Runnable)new a(this, runnable));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(this.b.getAndIncrement());
        thread.setName(stringBuilder.toString());
        return thread;
    }
}

