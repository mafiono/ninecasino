/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.c.a0.s.d
 *  java.io.Reader
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package d.c.c.a0.z;

import d.c.c.a0.s;
import d.c.c.a0.s.d;
import d.c.c.a0.z.e;
import d.c.c.c0.b;
import d.c.c.k;
import d.c.c.n;
import d.c.c.p;
import d.c.c.q;
import d.c.c.s;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class e
extends d.c.c.c0.a {
    public static final Object y;
    public Object[] u;
    public int v;
    public String[] w;
    public int[] x;

    public static {
        new Reader(){

            public void close() {
                throw new AssertionError();
            }

            public int read(char[] arrc, int n2, int n3) {
                throw new AssertionError();
            }
        };
        y = new Object();
    }

    @Override
    private String J() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)" at path ");
        stringBuilder.append(this.D());
        return stringBuilder.toString();
    }

    @Override
    public String D() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        for (int i2 = 0; i2 < this.v; ++i2) {
            Object[] arrobject = this.u;
            if (arrobject[i2] instanceof k) {
                if (!(arrobject[++i2] instanceof Iterator)) continue;
                stringBuilder.append('[');
                stringBuilder.append(this.x[i2]);
                stringBuilder.append(']');
                continue;
            }
            if (!(arrobject[i2] instanceof q) || !(arrobject[++i2] instanceof Iterator)) continue;
            stringBuilder.append('.');
            String[] arrstring = this.w;
            if (arrstring[i2] == null) continue;
            stringBuilder.append(arrstring[i2]);
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean F() {
        b b3 = this.n0();
        return b3 != b.h && b3 != b.f;
    }

    @Override
    public boolean S() {
        this.u0(b.l);
        boolean bl = ((s)this.w0()).h();
        int n2 = this.v;
        if (n2 > 0) {
            int[] arrn = this.x;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return bl;
    }

    @Override
    public double V() {
        b b3;
        b b4 = this.n0();
        if (b4 != (b3 = b.k) && b4 != b.j) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append(b3);
            stringBuilder.append(" but was ");
            stringBuilder.append(b4);
            stringBuilder.append(this.J());
            throw new IllegalStateException(stringBuilder.toString());
        }
        s s4 = (s)this.v0();
        double d3 = s4.a instanceof Number ? s4.i().doubleValue() : Double.parseDouble((String)s4.j());
        if (!this.f && (Double.isNaN(d3) || Double.isInfinite(d3))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append(d3);
            throw new NumberFormatException(stringBuilder.toString());
        }
        this.w0();
        int n2 = this.v;
        if (n2 > 0) {
            int[] arrn = this.x;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return d3;
    }

    @Override
    public void a() {
        this.u0(b.e);
        this.x0(((k)this.v0()).iterator());
        this.x[-1 + this.v] = 0;
    }

    @Override
    public int c0() {
        b b3;
        b b4 = this.n0();
        if (b4 != (b3 = b.k) && b4 != b.j) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append(b3);
            stringBuilder.append(" but was ");
            stringBuilder.append(b4);
            stringBuilder.append(this.J());
            throw new IllegalStateException(stringBuilder.toString());
        }
        s s4 = (s)this.v0();
        int n2 = s4.a instanceof Number ? s4.i().intValue() : Integer.parseInt((String)s4.j());
        this.w0();
        int n3 = this.v;
        if (n3 > 0) {
            int[] arrn = this.x;
            int n4 = n3 - 1;
            arrn[n4] = 1 + arrn[n4];
        }
        return n2;
    }

    @Override
    public void close() {
        Object[] arrobject = new Object[]{y};
        this.u = arrobject;
        this.v = 1;
    }

    @Override
    public long d0() {
        b b3;
        b b4 = this.n0();
        if (b4 != (b3 = b.k) && b4 != b.j) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append(b3);
            stringBuilder.append(" but was ");
            stringBuilder.append(b4);
            stringBuilder.append(this.J());
            throw new IllegalStateException(stringBuilder.toString());
        }
        s s4 = (s)this.v0();
        long l4 = s4.a instanceof Number ? s4.i().longValue() : Long.parseLong((String)s4.j());
        this.w0();
        int n2 = this.v;
        if (n2 > 0) {
            int[] arrn = this.x;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return l4;
    }

    @Override
    public void e() {
        this.u0(b.g);
        this.x0(new d<Map.Entry<K, V>>((s.b)((q)this.v0()).a.entrySet()){

            public Object next() {
                return ((d.c.c.a0.s$d)((Object)this)).a();
            }
        });
    }

    @Override
    public String h0() {
        String string;
        this.u0(b.i);
        Map.Entry entry = (Map.Entry)((Iterator)this.v0()).next();
        this.w[-1 + this.v] = string = (String)entry.getKey();
        this.x0(entry.getValue());
        return string;
    }

    @Override
    public void j0() {
        this.u0(b.m);
        this.w0();
        int n2 = this.v;
        if (n2 > 0) {
            int[] arrn = this.x;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
    }

    @Override
    public String l0() {
        b b3;
        b b4 = this.n0();
        if (b4 != (b3 = b.j) && b4 != b.k) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append(b3);
            stringBuilder.append(" but was ");
            stringBuilder.append(b4);
            stringBuilder.append(this.J());
            throw new IllegalStateException(stringBuilder.toString());
        }
        String string = ((s)this.w0()).j();
        int n2 = this.v;
        if (n2 > 0) {
            int[] arrn = this.x;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
        return string;
    }

    @Override
    public b n0() {
        if (this.v == 0) {
            return b.n;
        }
        Object object = this.v0();
        if (object instanceof Iterator) {
            boolean bl = this.u[-2 + this.v] instanceof q;
            Iterator iterator = (Iterator)object;
            if (iterator.hasNext()) {
                if (bl) {
                    return b.i;
                }
                this.x0(iterator.next());
                return this.n0();
            }
            if (bl) {
                return b.h;
            }
            return b.f;
        }
        if (object instanceof q) {
            return b.g;
        }
        if (object instanceof k) {
            return b.e;
        }
        if (object instanceof s) {
            Object object2 = ((s)object).a;
            if (object2 instanceof String) {
                return b.j;
            }
            if (object2 instanceof Boolean) {
                return b.l;
            }
            if (object2 instanceof Number) {
                return b.k;
            }
            throw new AssertionError();
        }
        if (object instanceof p) {
            return b.m;
        }
        if (object == y) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new AssertionError();
    }

    @Override
    public void s() {
        this.u0(b.f);
        this.w0();
        this.w0();
        int n2 = this.v;
        if (n2 > 0) {
            int[] arrn = this.x;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
    }

    @Override
    public void s0() {
        if (this.n0() == b.i) {
            this.h0();
            this.w[-2 + this.v] = "null";
        } else {
            this.w0();
            int n2 = this.v;
            if (n2 > 0) {
                this.w[n2 - 1] = "null";
            }
        }
        int n3 = this.v;
        if (n3 > 0) {
            int[] arrn = this.x;
            int n4 = n3 - 1;
            arrn[n4] = 1 + arrn[n4];
        }
    }

    @Override
    public String toString() {
        return e.class.getSimpleName();
    }

    @Override
    public void u() {
        this.u0(b.h);
        this.w0();
        this.w0();
        int n2 = this.v;
        if (n2 > 0) {
            int[] arrn = this.x;
            int n3 = n2 - 1;
            arrn[n3] = 1 + arrn[n3];
        }
    }

    public final void u0(b b3) {
        if (this.n0() == b3) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(b3);
        stringBuilder.append(" but was ");
        stringBuilder.append(this.n0());
        stringBuilder.append(this.J());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final Object v0() {
        return this.u[-1 + this.v];
    }

    public final Object w0() {
        int n2;
        Object[] arrobject = this.u;
        this.v = n2 = -1 + this.v;
        Object object = arrobject[n2];
        arrobject[n2] = null;
        return object;
    }

    public final void x0(Object object) {
        int n2 = this.v;
        Object[] arrobject = this.u;
        if (n2 == arrobject.length) {
            int n3 = n2 * 2;
            this.u = Arrays.copyOf(arrobject, n3);
            this.x = Arrays.copyOf(this.x, n3);
            this.w = (String[])Arrays.copyOf((Object[])this.w, n3);
        }
        Object[] arrobject2 = this.u;
        int n4 = this.v;
        this.v = n4 + 1;
        arrobject2[n4] = object;
    }
}

