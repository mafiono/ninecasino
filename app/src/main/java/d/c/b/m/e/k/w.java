/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Void
 *  java.util.concurrent.Callable
 */
package d.c.b.m.e.k;

import android.os.Bundle;
import d.c.b.m.e.i.a;
import d.c.b.m.e.k.t;
import java.util.concurrent.Callable;

public class w
implements Callable<Void> {
    public final /* synthetic */ long a;
    public final /* synthetic */ t b;

    public w(t t2, long l2) {
        this.b = t2;
        this.a = l2;
    }

    public Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        this.b.r.a("_ae", bundle);
        return null;
    }
}

