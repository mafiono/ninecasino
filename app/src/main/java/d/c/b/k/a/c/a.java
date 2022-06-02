/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  d.c.a.d.g.f.h
 *  d.c.a.d.h.a.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 *  java.util.concurrent.Executor
 */
package d.c.b.k.a.c;

import android.content.Context;
import android.os.Bundle;
import d.c.a.d.g.f.h;
import d.c.b.c;
import d.c.b.k.a.b;
import d.c.b.k.a.d;
import d.c.b.k.a.e;
import d.c.b.l.f;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class a
implements f {
    public static final f a = new a();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(d.c.b.l.e e2) {
        c c3 = e2.a(c.class);
        Context context = e2.a(Context.class);
        d.c.b.p.d d3 = e2.a(d.c.b.p.d.class);
        Objects.requireNonNull((Object)c3, "null reference");
        Objects.requireNonNull((Object)context, "null reference");
        Objects.requireNonNull((Object)d3, "null reference");
        Objects.requireNonNull((Object)context.getApplicationContext(), "null reference");
        if (b.c != null) return b.c;
        Class<b> class_ = b.class;
        synchronized (b.class) {
            if (b.c != null) return b.c;
            Bundle bundle = new Bundle(1);
            if (c3.g()) {
                d3.b(d.c.b.a.class, e.e, d.a);
                bundle.putBoolean("dataCollectionDefaultEnabled", c3.f());
            }
            b.c = new b(h.a((Context)context, null, null, null, (Bundle)bundle).d);
            // ** MonitorExit[var11_5] (shouldn't be in output)
            return b.c;
        }
    }
}

