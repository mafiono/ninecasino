/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.b.b
 *  d.c.a.b.c
 *  d.c.a.b.d
 *  d.c.a.b.e
 *  d.c.a.b.f
 *  d.c.a.b.h
 *  d.c.a.b.j.e
 *  d.c.a.b.j.f
 *  d.c.a.b.j.f$a
 *  d.c.a.b.j.i
 *  d.c.a.b.j.i$a
 *  d.c.a.b.j.m
 *  d.c.a.b.j.t.e
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Objects
 */
package d.c.a.b.j;

import d.c.a.b.c;
import d.c.a.b.d;
import d.c.a.b.e;
import d.c.a.b.f;
import d.c.a.b.h;
import d.c.a.b.j.a;
import d.c.a.b.j.b;
import d.c.a.b.j.f;
import d.c.a.b.j.i;
import d.c.a.b.j.k;
import d.c.a.b.j.m;
import d.c.a.b.j.n;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class l<T>
implements f<T> {
    public final i a;
    public final String b;
    public final d.c.a.b.b c;
    public final e<T, byte[]> d;
    public final m e;

    public l(i i2, String string, d.c.a.b.b b2, e<T, byte[]> e2, m m2) {
        this.a = i2;
        this.b = string;
        this.c = b2;
        this.d = e2;
        this.e = m2;
    }

    public void a(c<T> c2) {
        this.b(c2, k.a);
    }

    public void b(c<T> c2, h h2) {
        m m2 = this.e;
        i i2 = this.a;
        Objects.requireNonNull(i2, "Null transportContext");
        Objects.requireNonNull(c2, (String)"Null event");
        String string = this.b;
        Objects.requireNonNull((Object)string, "Null transportName");
        e<T, byte[]> e2 = this.d;
        Objects.requireNonNull(e2, "Null transformer");
        d.c.a.b.b b2 = this.c;
        Objects.requireNonNull(b2, "Null encoding");
        n n2 = (n)m2;
        d.c.a.b.j.t.e e3 = n2.c;
        d d2 = c2.c();
        i.a a2 = i.a();
        a2.b(i2.b());
        a2.c(d2);
        byte[] arrby = i2.c();
        b.b b3 = (b.b)a2;
        b3.b = arrby;
        i i3 = b3.a();
        a.b b4 = new a.b();
        b4.f = new HashMap();
        b4.e(n2.a.a());
        b4.g(n2.b.a());
        b4.f(string);
        b4.d(new d.c.a.b.j.e(b2, (byte[])e2.a(c2.b())));
        b4.b = c2.a();
        e3.a(i3, b4.b(), h2);
    }
}

