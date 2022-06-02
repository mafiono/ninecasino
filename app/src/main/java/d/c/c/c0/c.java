/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.io.Closeable
 *  java.io.Flushable
 *  java.io.IOException
 *  java.io.Writer
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Objects
 */
package d.c.c.c0;

import d.a.b.a.a;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

public class c
implements Closeable,
Flushable {
    public static final String[] m = new String[128];
    public static final String[] n;
    public final Writer e;
    public int[] f = new int[32];
    public int g = 0;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public boolean l;

    public static {
        for (int i2 = 0; i2 <= 31; ++i2) {
            String[] arrstring = m;
            Object[] arrobject = new Object[]{i2};
            arrstring[i2] = String.format("\\u%04x", arrobject);
        }
        String[] arrstring = m;
        arrstring[34] = "\\\"";
        arrstring[92] = "\\\\";
        arrstring[9] = "\\t";
        arrstring[8] = "\\b";
        arrstring[10] = "\\n";
        arrstring[13] = "\\r";
        arrstring[12] = "\\f";
        String[] arrstring2 = arrstring.clone();
        n = arrstring2;
        arrstring2[60] = "\\u003c";
        arrstring2[62] = "\\u003e";
        arrstring2[38] = "\\u0026";
        arrstring2[61] = "\\u003d";
        arrstring2[39] = "\\u0027";
    }

    public c(Writer writer) {
        this.J(6);
        this.i = ":";
        this.l = true;
        Objects.requireNonNull((Object)writer, "out == null");
        this.e = writer;
    }

    public c A(String string) {
        Objects.requireNonNull((Object)string, "name == null");
        if (this.k == null) {
            if (this.g != 0) {
                this.k = string;
                return this;
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new IllegalStateException();
    }

    public final void D() {
        if (this.h == null) {
            return;
        }
        this.e.write(10);
        int n2 = this.g;
        for (int i2 = 1; i2 < n2; ++i2) {
            this.e.write(this.h);
        }
    }

    public c F() {
        if (this.k != null) {
            if (this.l) {
                this.k0();
            } else {
                this.k = null;
                return this;
            }
        }
        this.a();
        this.e.write("null");
        return this;
    }

    public final int H() {
        int n2 = this.g;
        if (n2 != 0) {
            return this.f[n2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void J(int n2) {
        int n3 = this.g;
        int[] arrn = this.f;
        if (n3 == arrn.length) {
            this.f = Arrays.copyOf(arrn, n3 * 2);
        }
        int[] arrn2 = this.f;
        int n4 = this.g;
        this.g = n4 + 1;
        arrn2[n4] = n2;
    }

    public final void S(int n2) {
        this.f[-1 + this.g] = n2;
    }

    public final void V(String string) {
        String[] arrstring = m;
        this.e.write(34);
        int n2 = string.length();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2;
            char c2 = string.charAt(i2);
            if (c2 < '') {
                string2 = arrstring[c2];
                if (string2 == null) {
                    continue;
                }
            } else if (c2 == '\u2028') {
                string2 = "\\u2028";
            } else {
                if (c2 != '\u2029') continue;
                string2 = "\\u2029";
            }
            if (n3 < i2) {
                this.e.write(string, n3, i2 - n3);
            }
            this.e.write(string2);
            n3 = i2 + 1;
        }
        if (n3 < n2) {
            this.e.write(string, n3, n2 - n3);
        }
        this.e.write(34);
    }

    public final void a() {
        int n2 = this.H();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 4) {
                    if (n2 != 6) {
                        if (n2 == 7) {
                            if (!this.j) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.S(7);
                    return;
                }
                this.e.append(this.i);
                this.S(5);
                return;
            }
            this.e.append(',');
        } else {
            this.S(2);
        }
        this.D();
    }

    public c c0(long l2) {
        this.k0();
        this.a();
        this.e.write(Long.toString(l2));
        return this;
    }

    public void close() {
        this.e.close();
        int n2 = this.g;
        if (n2 <= 1 && (n2 != 1 || this.f[n2 - 1] == 7)) {
            this.g = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c d0(Boolean bl) {
        if (bl == null) {
            return this.F();
        }
        this.k0();
        this.a();
        Writer writer = this.e;
        String string = bl != false ? "true" : "false";
        writer.write(string);
        return this;
    }

    public c e() {
        this.k0();
        this.a();
        this.J(1);
        this.e.write(91);
        return this;
    }

    public void flush() {
        if (this.g != 0) {
            this.e.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c h0(Number number) {
        if (number == null) {
            return this.F();
        }
        this.k0();
        String string = number.toString();
        if (!this.j && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Numeric values must be finite, but was ");
            stringBuilder.append(number);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.a();
        this.e.append(string);
        return this;
    }

    public c i() {
        this.k0();
        this.a();
        this.J(3);
        this.e.write(123);
        return this;
    }

    public c i0(String string) {
        if (string == null) {
            return this.F();
        }
        this.k0();
        this.a();
        this.V(string);
        return this;
    }

    public c j0(boolean bl) {
        this.k0();
        this.a();
        Writer writer = this.e;
        String string = bl ? "true" : "false";
        writer.write(string);
        return this;
    }

    public final void k0() {
        block2 : {
            block5 : {
                block4 : {
                    int n2;
                    block3 : {
                        if (this.k == null) break block2;
                        n2 = this.H();
                        if (n2 != 5) break block3;
                        this.e.write(44);
                        break block4;
                    }
                    if (n2 != 3) break block5;
                }
                this.D();
                this.S(4);
                this.V(this.k);
                this.k = null;
                return;
            }
            throw new IllegalStateException("Nesting problem.");
        }
    }

    public final c m(int n2, int n3, char c2) {
        int n4 = this.H();
        if (n4 != n3 && n4 != n2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.k == null) {
            this.g = -1 + this.g;
            if (n4 == n3) {
                this.D();
            }
            this.e.write(c2);
            return this;
        }
        StringBuilder stringBuilder = a.d((String)"Dangling name: ");
        stringBuilder.append(this.k);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public c s() {
        this.m(1, 2, ']');
        return this;
    }

    public c u() {
        this.m(3, 5, '}');
        return this;
    }
}

