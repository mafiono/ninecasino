/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  d.c.a.b.b
 *  d.c.a.b.g
 *  d.c.a.b.j.c$a
 *  d.c.a.b.j.d
 *  d.c.a.b.j.i
 *  d.c.a.b.j.i$a
 *  d.c.a.b.j.m
 *  d.c.a.b.j.o
 *  d.c.a.b.j.t.e
 *  d.c.a.b.j.t.h.m
 *  d.c.a.b.j.t.h.o
 *  d.c.a.b.j.t.h.q
 *  e.a.a
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Collections
 *  java.util.Objects
 *  java.util.Set
 *  java.util.concurrent.Executor
 */
package d.c.a.b.j;

import android.content.Context;
import d.c.a.b.g;
import d.c.a.b.j.b;
import d.c.a.b.j.c;
import d.c.a.b.j.d;
import d.c.a.b.j.i;
import d.c.a.b.j.j;
import d.c.a.b.j.t.e;
import d.c.a.b.j.t.h.m;
import d.c.a.b.j.t.h.o;
import d.c.a.b.j.t.h.q;
import d.c.a.b.j.v.a;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

public class n
implements d.c.a.b.j.m {
    public static volatile d.c.a.b.j.o e;
    public final a a;
    public final a b;
    public final e c;
    public final m d;

    public n(a a2, a a3, e e2, m m2, q q2) {
        this.a = a2;
        this.b = a3;
        this.c = e2;
        this.d = m2;
        q2.a.execute((Runnable)new o(q2));
    }

    public static n a() {
        d.c.a.b.j.o o2 = e;
        if (o2 != null) {
            return (n)((c)o2).p.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(Context context) {
        if (e != null) {
            return;
        }
        Class<n> class_ = n.class;
        synchronized (n.class) {
            if (e == null) {
                Objects.requireNonNull((Object)context);
                e = new c(context, null);
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return;
        }
    }

    public g c(d d2) {
        Set set;
        if (d2 instanceof d) {
            Objects.requireNonNull((Object)((d.c.a.b.i.a)d2));
            set = Collections.unmodifiableSet(d.c.a.b.i.a.f);
        } else {
            set = Collections.singleton(new d.c.a.b.b("proto"));
        }
        i.a a2 = i.a();
        Objects.requireNonNull(d2);
        a2.b("cct");
        byte[] arrby = ((d.c.a.b.i.a)d2).b();
        b.b b2 = (b.b)a2;
        b2.b = arrby;
        return new j((Set<d.c.a.b.b>)set, b2.a(), this);
    }
}

