/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  d.c.a.d.j.i
 *  d.c.b.m.e.k.b0
 *  d.c.b.m.e.k.t$e
 *  d.c.b.m.e.k.t$k
 *  d.c.b.m.e.q.c.b
 *  d.c.b.m.e.q.c.d
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 */
package d.c.b.m.e.k;

import d.c.a.d.b.a;
import d.c.a.d.j.i;
import d.c.b.m.e.b;
import d.c.b.m.e.k.b0;
import d.c.b.m.e.k.h;
import d.c.b.m.e.k.l;
import d.c.b.m.e.k.m0;
import d.c.b.m.e.k.t;
import d.c.b.m.e.k.x0;
import d.c.b.m.e.o.g;
import d.c.b.m.e.q.b;
import d.c.b.m.e.q.c.c;
import d.c.b.m.e.q.c.d;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class c0
implements Callable<d.c.a.d.j.h<Void>> {
    public final /* synthetic */ Boolean a;
    public final /* synthetic */ t.e b;

    public c0(t.e e2, Boolean bl) {
        this.b = e2;
        this.a = bl;
    }

    public Object call() {
        IllegalStateException illegalStateException;
        b b2 = b.a;
        d.c.b.m.e.q.a a2 = this.b.c.m;
        Objects.requireNonNull((Object)a2);
        b2.b("Checking for crash reports...");
        File[] arrfile = (a2.a).a.q();
        File[] arrfile2 = (a2.a).a.m().listFiles();
        int n2 = 0;
        if (arrfile2 == null) {
            arrfile2 = new File[]{};
        }
        LinkedList linkedList = new LinkedList();
        if (arrfile != null) {
            for (File file : arrfile) {
                StringBuilder stringBuilder = d.a.b.a.a.d((String)"Found crash report ");
                stringBuilder.append(file.getPath());
                b2.b(stringBuilder.toString());
                linkedList.add(new d(file, Collections.emptyMap()));
            }
        }
        int n3 = arrfile2.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            linkedList.add(new d.c.b.m.e.q.c.b(arrfile2[i2]));
        }
        if (linkedList.isEmpty()) {
            b2.b("No reports found.");
        }
        if (!this.a.booleanValue()) {
            b2.b("Reports are being deleted.");
            t t2 = this.b.c;
            l l2 = l.a;
            File[] arrfile3 = t.r(t2.l(), l2);
            int n4 = arrfile3.length;
            while (n2 < n4) {
                arrfile3[n2].delete();
                ++n2;
            }
            Objects.requireNonNull(this.b.c.m);
            Iterator iterator = linkedList.iterator();
            while (iterator.hasNext()) {
                ((c)iterator.next()).remove();
            }
            this.b.c.s.b.b();
            this.b.c.w.b(null);
            return a.l(null);
        }
        b2.b("Reports are being sent.");
        boolean bl = this.a;
        m0 m02 = this.b.c.b;
        Objects.requireNonNull((Object)m02);
        if (bl) {
            m02.g.b(null);
            t.e e2 = this.b;
            Executor executor = e2.c.e.a;
            return e2.a.p(executor, (d.c.a.d.j.g)new b0(this, linkedList, bl, executor));
        }
        illegalStateException = new IllegalStateException("An invalid data collection token was used.");
        throw illegalStateException;
    }
}

