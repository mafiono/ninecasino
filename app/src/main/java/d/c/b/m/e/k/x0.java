/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.b.a
 *  d.c.a.b.c
 *  d.c.a.b.d
 *  d.c.a.b.f
 *  d.c.a.b.h
 *  d.c.a.d.j.a
 *  d.c.a.d.j.f0
 *  d.c.a.d.j.h
 *  d.c.a.d.j.i
 *  d.c.b.m.e.k.c
 *  d.c.b.m.e.k.v0
 *  d.c.b.m.e.r.a
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Objects
 *  java.util.concurrent.Executor
 */
package d.c.b.m.e.k;

import d.c.a.b.d;
import d.c.a.b.f;
import d.c.a.d.b.a;
import d.c.a.d.j.f0;
import d.c.a.d.j.i;
import d.c.b.m.e.b;
import d.c.b.m.e.k.c;
import d.c.b.m.e.k.j0;
import d.c.b.m.e.k.k0;
import d.c.b.m.e.k.n0;
import d.c.b.m.e.k.v0;
import d.c.b.m.e.k.z0;
import d.c.b.m.e.m.v;
import d.c.b.m.e.m.x.h;
import d.c.b.m.e.o.g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public class x0 {
    public final j0 a;
    public final g b;
    public final d.c.b.m.e.r.c c;
    public final d.c.b.m.e.l.b d;
    public final z0 e;

    public x0(j0 j02, g g2, d.c.b.m.e.r.c c2, d.c.b.m.e.l.b b2, z0 z02) {
        this.a = j02;
        this.b = g2;
        this.c = c2;
        this.d = b2;
        this.e = z02;
    }

    public d.c.a.d.j.h<Void> a(Executor executor, n0 n02) {
        v.e e2 = v.e.g;
        b b2 = b.a;
        if (n02 == n0.e) {
            b2.b("Send via DataTransport disabled. Removing DataTransport reports.");
            this.b.b();
            return a.l(null);
        }
        g g2 = this.b;
        List<File> list = g2.e();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (File file : g2.e()) {
            try {
                arrayList.add(new c(g.i.f(g.j(file)), file.getName()));
            }
            catch (IOException iOException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not load report file ");
                stringBuilder.append(file);
                stringBuilder.append("; deleting");
                b2.c(stringBuilder.toString(), iOException);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (k0 k02 : arrayList) {
            v v2 = k02.a();
            v.e e3 = v2.h() != null ? v.e.f : (v2.e() != null ? e2 : v.e.e);
            if (e3 == e2 && n02 != n0.g) {
                b2.b("Send native reports via DataTransport disabled. Removing DataTransport reports.");
                this.b.c(k02.b());
                continue;
            }
            d.c.b.m.e.r.c c2 = this.c;
            Objects.requireNonNull((Object)c2);
            v v3 = k02.a();
            i i2 = new i();
            c2.a.b((d.c.a.b.c)new d.c.a.b.a(null, (Object)v3, d.g), (d.c.a.b.h)new d.c.b.m.e.r.a(i2, k02));
            arrayList2.add((Object)i2.a.g(executor, (d.c.a.d.j.a)new v0(this)));
        }
        return a.B(arrayList2);
    }
}

