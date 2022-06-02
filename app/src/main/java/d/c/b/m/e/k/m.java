/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Void
 *  java.util.concurrent.Callable
 */
package d.c.b.m.e.k;

import d.c.b.m.e.k.t;
import d.c.b.m.e.l.a;
import d.c.b.m.e.l.b;
import java.util.concurrent.Callable;

public class m
implements Callable<Void> {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ t c;

    public m(t t2, long l2, String string) {
        this.c = t2;
        this.a = l2;
        this.b = string;
    }

    public Object call() {
        if (!this.c.p()) {
            b b2 = this.c.l;
            long l2 = this.a;
            String string = this.b;
            b2.c.d(l2, string);
        }
        return null;
    }
}

