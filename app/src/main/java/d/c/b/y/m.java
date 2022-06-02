/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package d.c.b.y;

import d.c.b.y.g;
import d.c.b.y.o;
import java.util.concurrent.Callable;

public final class m
implements Callable {
    public final o a;

    public m(o o2) {
        this.a = o2;
    }

    public Object call() {
        return this.a.c();
    }
}

