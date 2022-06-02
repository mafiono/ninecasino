/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  d.b.a0$a
 *  d.b.b0
 *  d.b.c0
 *  d.b.j0.y
 *  d.b.k
 *  d.b.o
 *  d.b.r
 *  d.b.r$a
 *  java.io.FilterOutputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.atomic.AtomicLong
 */
package d.b;

import android.os.Handler;
import d.b.a0;
import d.b.b0;
import d.b.c0;
import d.b.j0.y;
import d.b.k;
import d.b.o;
import d.b.r;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class a0
extends FilterOutputStream
implements b0 {
    public final Map<o, c0> e;
    public final r f;
    public final long g;
    public long h;
    public long i;
    public long j;
    public c0 k;

    public a0(OutputStream outputStream, r r2, Map<o, c0> map, long l2) {
        super(outputStream);
        this.f = r2;
        this.e = map;
        this.j = l2;
        y.e();
        this.g = k.h.get();
    }

    public void a(o o2) {
        c0 c02 = o2 != null ? this.e.get((Object)o2) : null;
        this.k = c02;
    }

    public void close() {
        super.close();
        Iterator iterator = this.e.values().iterator();
        while (iterator.hasNext()) {
            ((c0)iterator.next()).a();
        }
        this.i();
    }

    public final void e(long l2) {
        long l3;
        c0 c02 = this.k;
        if (c02 != null) {
            long l4;
            c02.d = l4 = l2 + c02.d;
            if (l4 >= c02.e + c02.c || l4 >= c02.f) {
                c02.a();
            }
        }
        this.h = l3 = l2 + this.h;
        if (l3 >= this.i + this.g || l3 >= this.j) {
            this.i();
        }
    }

    public final void i() {
        if (this.h > this.i) {
            for (r.a a2 : this.f.h) {
                if (!(a2 instanceof r.b)) continue;
                r r2 = this.f;
                Handler handler = r2.e;
                r.b b2 = (r.b)a2;
                if (handler == null) {
                    b2.b(r2, this.h, this.j);
                    continue;
                }
                handler.post((Runnable)new a(this, b2));
            }
            this.i = this.h;
        }
    }

    public void write(int n2) {
        this.out.write(n2);
        this.e(1L);
    }

    public void write(byte[] arrby) {
        this.out.write(arrby);
        this.e(arrby.length);
    }

    public void write(byte[] arrby, int n2, int n3) {
        this.out.write(arrby, n2, n3);
        this.e(n3);
    }
}

