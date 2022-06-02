/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  d.c.a.d.d.p.c
 *  d.c.a.d.d.p.d
 *  d.c.a.d.g.f.fc
 *  d.c.a.d.g.f.h
 *  d.c.a.d.g.f.j
 *  d.c.a.d.g.f.m
 *  d.c.a.d.g.f.p
 *  d.c.a.d.g.f.q
 *  d.c.a.d.g.f.r
 *  d.c.a.d.g.f.s
 *  d.c.a.d.g.f.t
 *  d.c.a.d.g.f.u
 *  d.c.a.d.g.f.x
 *  d.c.a.d.h.b.d7
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  java.util.Random
 *  java.util.concurrent.ExecutorService
 */
package d.c.b.k;

import android.os.Bundle;
import d.c.a.d.d.p.d;
import d.c.a.d.g.f.fc;
import d.c.a.d.g.f.h;
import d.c.a.d.g.f.j;
import d.c.a.d.g.f.m;
import d.c.a.d.g.f.p;
import d.c.a.d.g.f.q;
import d.c.a.d.g.f.r;
import d.c.a.d.g.f.s;
import d.c.a.d.g.f.t;
import d.c.a.d.g.f.u;
import d.c.a.d.g.f.x;
import d.c.a.d.h.b.d7;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutorService;

public final class c
implements d7 {
    public final /* synthetic */ h a;

    public c(h h2) {
        this.a = h2;
    }

    public final String a() {
        h h2 = this.a;
        Objects.requireNonNull(h2);
        fc fc2 = new fc();
        t t6 = new t(h2, fc2);
        h2.c.execute((Runnable)t6);
        return fc2.K(500L);
    }

    public final String b() {
        h h2 = this.a;
        Objects.requireNonNull(h2);
        fc fc2 = new fc();
        x x3 = new x(h2, fc2);
        h2.c.execute((Runnable)x3);
        return fc2.K(500L);
    }

    public final String c() {
        h h2 = this.a;
        Objects.requireNonNull(h2);
        fc fc2 = new fc();
        r r3 = new r(h2, fc2);
        h2.c.execute((Runnable)r3);
        return fc2.K(50L);
    }

    public final String d() {
        h h2 = this.a;
        Objects.requireNonNull(h2);
        fc fc2 = new fc();
        s s4 = new s(h2, fc2);
        h2.c.execute((Runnable)s4);
        return fc2.K(500L);
    }

    public final long e() {
        h h2 = this.a;
        Objects.requireNonNull(h2);
        fc fc2 = new fc();
        u u4 = new u(h2, fc2);
        h2.c.execute((Runnable)u4);
        Long l4 = (Long)fc.J((Bundle)fc2.L(500L), Long.class);
        if (l4 == null) {
            int n2;
            long l5 = System.nanoTime();
            Objects.requireNonNull((d)h2.b);
            long l6 = new Random(l5 ^ System.currentTimeMillis()).nextLong();
            h2.f = n2 = 1 + h2.f;
            return l6 + (long)n2;
        }
        return l4;
    }

    public final void f(Bundle bundle) {
        h h2 = this.a;
        Objects.requireNonNull(h2);
        j j2 = new j(h2, bundle);
        h2.c.execute((Runnable)j2);
    }

    public final void g(String string) {
        h h2 = this.a;
        Objects.requireNonNull(h2);
        q q4 = new q(h2, string);
        h2.c.execute((Runnable)q4);
    }

    public final List<Bundle> h(String string, String string2) {
        return this.a.e(string, string2);
    }

    public final int i(String string) {
        return this.a.h(string);
    }

    public final void j(String string, String string2, Bundle bundle) {
        h h2 = this.a;
        Objects.requireNonNull(h2);
        m m2 = new m(h2, string, string2, bundle);
        h2.c.execute((Runnable)m2);
    }

    public final void k(String string) {
        h h2 = this.a;
        Objects.requireNonNull(h2);
        p p2 = new p(h2, string);
        h2.c.execute((Runnable)p2);
    }

    public final Map<String, Object> l(String string, String string2, boolean bl) {
        return this.a.b(string, string2, bl);
    }

    public final void m(String string, String string2, Bundle bundle) {
        this.a.d(string, string2, bundle, true, true, null);
    }
}

