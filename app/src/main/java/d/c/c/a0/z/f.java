/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.Writer
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 */
package d.c.c.a0.z;

import d.c.c.a0.s;
import d.c.c.a0.z.f;
import d.c.c.c0.c;
import d.c.c.k;
import d.c.c.n;
import d.c.c.p;
import d.c.c.q;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class f
extends c {
    public static final Writer r = new Writer(){

        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] arrc, int n2, int n3) {
            throw new AssertionError();
        }
    };
    public static final d.c.c.s s = new d.c.c.s("closed");
    public final List<n> o = new ArrayList();
    public String p;
    public n q = p.a;

    public f() {
        super(r);
    }

    @Override
    public c A(String string) {
        if (!this.o.isEmpty() && this.p == null) {
            if (this.l0() instanceof q) {
                this.p = string;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override
    public c F() {
        this.m0(p.a);
        return this;
    }

    @Override
    public c c0(long l4) {
        this.m0(new d.c.c.s(l4));
        return this;
    }

    @Override
    public void close() {
        if (this.o.isEmpty()) {
            this.o.add(s);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override
    public c d0(Boolean bl) {
        if (bl == null) {
            this.m0(p.a);
            return this;
        }
        this.m0(new d.c.c.s(bl));
        return this;
    }

    @Override
    public c e() {
        k k4 = new k();
        this.m0(k4);
        this.o.add(k4);
        return this;
    }

    @Override
    public void flush() {
    }

    @Override
    public c h0(Number number) {
        double d3;
        if (number == null) {
            this.m0(p.a);
            return this;
        }
        if (!this.j && (Double.isNaN(d3 = number.doubleValue()) || Double.isInfinite(d3))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append(number);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.m0(new d.c.c.s(number));
        return this;
    }

    @Override
    public c i() {
        q q4 = new q();
        this.m0(q4);
        this.o.add(q4);
        return this;
    }

    @Override
    public c i0(String string) {
        if (string == null) {
            this.m0(p.a);
            return this;
        }
        this.m0(new d.c.c.s(string));
        return this;
    }

    @Override
    public c j0(boolean bl) {
        this.m0(new d.c.c.s(bl));
        return this;
    }

    public final n l0() {
        List<n> list = this.o;
        return list.get(-1 + list.size());
    }

    public final void m0(n n2) {
        if (this.p != null) {
            if (!(n2 instanceof p) || this.l) {
                q q4 = (q)this.l0();
                String string = this.p;
                q4.a.put(string, n2);
            }
            this.p = null;
            return;
        }
        if (this.o.isEmpty()) {
            this.q = n2;
            return;
        }
        n n3 = this.l0();
        if (n3 instanceof k) {
            ((k)n3).e.add(n2);
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public c s() {
        if (!this.o.isEmpty() && this.p == null) {
            if (this.l0() instanceof k) {
                List<n> list = this.o;
                list.remove(-1 + list.size());
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override
    public c u() {
        if (!this.o.isEmpty() && this.p == null) {
            if (this.l0() instanceof q) {
                List<n> list = this.o;
                list.remove(-1 + list.size());
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}

