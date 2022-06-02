/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.b.j.h
 *  java.lang.Object
 *  java.util.concurrent.Executor
 *  java.util.concurrent.Executors
 */
package d.c.a.b.j;

import d.c.a.b.j.h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class g
implements Object<Executor> {
    public Object get() {
        return new h((Executor)Executors.newSingleThreadExecutor());
    }
}

