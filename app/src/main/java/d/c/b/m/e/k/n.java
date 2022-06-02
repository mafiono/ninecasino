/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Void
 *  java.util.concurrent.Callable
 */
package d.c.b.m.e.k;

import d.c.b.m.e.k.t;
import java.util.concurrent.Callable;

public class n
implements Callable<Void> {
    public final /* synthetic */ t a;

    public n(t t2) {
        this.a = t2;
    }

    public Object call() {
        t.a(this.a);
        return null;
    }
}

