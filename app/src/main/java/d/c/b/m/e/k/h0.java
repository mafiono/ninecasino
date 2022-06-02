/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
package d.c.b.m.e.k;

import d.c.b.m.e.a;
import d.c.b.m.e.b;
import d.c.b.m.e.k.g0;
import d.c.b.m.e.k.i0;
import d.c.b.m.e.k.t;
import java.io.File;
import java.util.concurrent.Callable;

public class h0
implements Callable<Boolean> {
    public final /* synthetic */ g0 a;

    public h0(g0 g02) {
        this.a = g02;
    }

    public Object call() {
        t t2 = this.a.g;
        boolean bl = t2.c.b().exists();
        boolean bl2 = true;
        if (!bl) {
            String string = t2.i();
            if (string == null || !t2.o.e(string)) {
                bl2 = false;
            }
        } else {
            b.a.b("Found previous crash marker.");
            t2.c.b().delete();
        }
        return bl2;
    }
}

