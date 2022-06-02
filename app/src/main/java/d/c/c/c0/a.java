/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.c.c0.a$a
 *  java.io.Closeable
 *  java.io.EOFException
 *  java.io.IOException
 *  java.io.Reader
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Arrays
 *  java.util.Objects
 */
package d.c.c.c0;

import d.c.c.a0.q;
import d.c.c.c0.a;
import d.c.c.c0.b;
import d.c.c.c0.d;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class a
implements Closeable {
    public static final char[] t = ")]}'\n".toCharArray();
    public final Reader e;
    public boolean f = false;
    public final char[] g = new char[1024];
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public long m;
    public int n;
    public String o;
    public int[] p;
    public int q;
    public String[] r;
    public int[] s;

    public static {
        q.a = new a();
    }

    public a(Reader reader) {
        int[] arrn = new int[32];
        this.p = arrn;
        this.q = 0;
        this.q = 0 + 1;
        arrn[0] = 6;
        this.r = new String[32];
        this.s = new int[32];
        Objects.requireNonNull((Object)reader, "in == null");
        this.e = reader;
    }

    public final boolean A(int n2) {
        Reader reader;
        int n3;
        int n4;
        char[] arrc = this.g;
        int n5 = this.k;
        int n6 = this.h;
        this.k = n5 - n6;
        int n7 = this.i;
        if (n7 != n6) {
            int n8;
            this.i = n8 = n7 - n6;
            System.arraycopy(arrc, n6, arrc, 0, n8);
        } else {
            this.i = 0;
        }
        this.h = 0;
        while ((n3 = (reader = this.e).read(arrc, n4 = this.i, arrc.length - n4)) != -1) {
            int n9;
            int n10;
            this.i = n9 = n3 + this.i;
            if (this.j == 0 && (n10 = this.k) == 0 && n9 > 0 && arrc[0] == '\ufeff') {
                this.h = 1 + this.h;
                this.k = n10 + 1;
                ++n2;
            }
            if (n9 < n2) continue;
            return true;
        }
        return false;
    }

    public String D() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        int n2 = this.q;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = this.p[i2];
            if (n3 != 1 && n3 != 2) {
                if (n3 != 3 && n3 != 4 && n3 != 5) continue;
                stringBuilder.append('.');
                String[] arrstring = this.r;
                if (arrstring[i2] == null) continue;
                stringBuilder.append(arrstring[i2]);
                continue;
            }
            stringBuilder.append('[');
            stringBuilder.append(this.s[i2]);
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    public boolean F() {
        int n2 = this.l;
        if (n2 == 0) {
            n2 = this.m();
        }
        return n2 != 2 && n2 != 4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean H(char var1_1) {
        if (var1_1 == '\t') return false;
        if (var1_1 == '\n') return false;
        if (var1_1 == '\f') return false;
        if (var1_1 == '\r') return false;
        if (var1_1 == ' ') return false;
        if (var1_1 == '#') ** GOTO lbl-1000
        if (var1_1 == ',') return false;
        if (var1_1 == '/' || var1_1 == '=') ** GOTO lbl-1000
        if (var1_1 == '{') return false;
        if (var1_1 == '}') return false;
        if (var1_1 == ':') return false;
        if (var1_1 == ';') ** GOTO lbl-1000
        switch (var1_1) {
            default: {
                return true;
            }
            case '\\': lbl-1000: // 4 sources:
            {
                this.i();
            }
            case '[': 
            case ']': 
        }
        return false;
    }

    public String J() {
        int n2 = 1 + this.j;
        int n3 = 1 + (this.h - this.k);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at line ");
        stringBuilder.append(n2);
        stringBuilder.append(" column ");
        stringBuilder.append(n3);
        stringBuilder.append(" path ");
        stringBuilder.append(this.D());
        return stringBuilder.toString();
    }

    public boolean S() {
        int n2 = this.l;
        if (n2 == 0) {
            n2 = this.m();
        }
        if (n2 == 5) {
            this.l = 0;
            int[] arrn = this.s;
            int n3 = this.q - 1;
            arrn[n3] = 1 + arrn[n3];
            return true;
        }
        if (n2 == 6) {
            this.l = 0;
            int[] arrn = this.s;
            int n4 = this.q - 1;
            arrn[n4] = 1 + arrn[n4];
            return false;
        }
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Expected a boolean but was ");
        stringBuilder.append(this.n0());
        stringBuilder.append(this.J());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public double V() {
        block5 : {
            String string;
            block8 : {
                int n2;
                block6 : {
                    block7 : {
                        block4 : {
                            n2 = this.l;
                            if (n2 == 0) {
                                n2 = this.m();
                            }
                            if (n2 == 15) {
                                this.l = 0;
                                int[] arrn = this.s;
                                int n3 = -1 + this.q;
                                arrn[n3] = 1 + arrn[n3];
                                return this.m;
                            }
                            if (n2 != 16) break block4;
                            this.o = new String(this.g, this.h, this.n);
                            this.h += this.n;
                            break block5;
                        }
                        if (n2 == 8 || n2 == 9) break block6;
                        if (n2 != 10) break block7;
                        string = this.m0();
                        break block8;
                    }
                    if (n2 != 11) {
                        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Expected a double but was ");
                        stringBuilder.append(this.n0());
                        stringBuilder.append(this.J());
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    break block5;
                }
                char c2 = n2 == 8 ? '\'' : '\"';
                string = this.k0(c2);
            }
            this.o = string;
        }
        this.l = 11;
        double d3 = Double.parseDouble(this.o);
        if (!this.f && (Double.isNaN(d3) || Double.isInfinite(d3))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append(d3);
            stringBuilder.append(this.J());
            throw new d(stringBuilder.toString());
        }
        this.o = null;
        this.l = 0;
        int[] arrn = this.s;
        int n4 = -1 + this.q;
        arrn[n4] = 1 + arrn[n4];
        return d3;
    }

    public void a() {
        int n2 = this.l;
        if (n2 == 0) {
            n2 = this.m();
        }
        if (n2 == 3) {
            this.o0(1);
            this.s[this.q - 1] = 0;
            this.l = 0;
            return;
        }
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Expected BEGIN_ARRAY but was ");
        stringBuilder.append(this.n0());
        stringBuilder.append(this.J());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /*
     * Exception decompiling
     */
    public int c0() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl161.1 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    public void close() {
        this.l = 0;
        this.p[0] = 8;
        this.q = 1;
        this.e.close();
    }

    /*
     * Exception decompiling
     */
    public long d0() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl132.1 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    public void e() {
        int n2 = this.l;
        if (n2 == 0) {
            n2 = this.m();
        }
        if (n2 == 1) {
            this.o0(3);
            this.l = 0;
            return;
        }
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Expected BEGIN_OBJECT but was ");
        stringBuilder.append(this.n0());
        stringBuilder.append(this.J());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public String h0() {
        block8 : {
            String string;
            block5 : {
                char c2;
                block7 : {
                    int n2;
                    block6 : {
                        block4 : {
                            n2 = this.l;
                            if (n2 == 0) {
                                n2 = this.m();
                            }
                            if (n2 != 14) break block4;
                            string = this.m0();
                            break block5;
                        }
                        if (n2 != 12) break block6;
                        c2 = '\'';
                        break block7;
                    }
                    if (n2 != 13) break block8;
                    c2 = '\"';
                }
                string = this.k0(c2);
            }
            this.l = 0;
            this.r[-1 + this.q] = string;
            return string;
        }
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Expected a name but was ");
        stringBuilder.append(this.n0());
        stringBuilder.append(this.J());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void i() {
        if (this.f) {
            return;
        }
        this.t0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int i0(boolean var1_1) {
        var2_2 = this.g;
        block0 : do {
            var3_3 = this.h;
            do {
                var4_4 = this.i;
                do {
                    var5_5 = 1;
                    if (var3_3 == var4_4) {
                        this.h = var3_3;
                        if (!this.A(var5_5)) {
                            if (!var1_1) {
                                return -1;
                            }
                            var16_15 = d.a.b.a.a.d((String)"End of input");
                            var16_15.append(this.J());
                            throw new EOFException(var16_15.toString());
                        }
                        var3_3 = this.h;
                        var4_4 = this.i;
                    }
                    var6_6 = var3_3 + 1;
                    var7_7 = var2_2[var3_3];
                    if (var7_7 == '\n') {
                        this.j = var5_5 + this.j;
                        this.k = var6_6;
                    } else if (var7_7 != ' ' && var7_7 != '\r' && var7_7 != '\t') {
                        if (var7_7 == '/') {
                            this.h = var6_6;
                            if (var6_6 == var4_4) {
                                this.h = var6_6 - 1;
                                var15_14 = this.A(2);
                                this.h = var5_5 + this.h;
                                if (!var15_14) {
                                    return var7_7;
                                }
                            }
                            this.i();
                            var8_8 = this.h;
                            var9_9 = var2_2[var8_8];
                            if (var9_9 == '*') break;
                            if (var9_9 != '/') {
                                return var7_7;
                            }
                            this.h = var8_8 + 1;
                        } else {
                            this.h = var6_6;
                            if (var7_7 != '#') return var7_7;
                            this.i();
                        }
                        this.r0();
                        continue block0;
                    }
                    var3_3 = var6_6;
                } while (true);
                this.h = var8_8 + 1;
                block3 : do {
                    block18 : {
                        if (2 + this.h > this.i && !this.A(2)) {
                            var5_5 = 0;
                            break;
                        }
                        var10_10 = this.g;
                        var11_11 = this.h;
                        var12_12 = var10_10[var11_11];
                        if (var12_12 != '\n') break block18;
                        this.j = var5_5 + this.j;
                        this.k = var11_11 + 1;
                        ** GOTO lbl63
                    }
                    for (var13_13 = 0; var13_13 < 2; ++var13_13) {
                        if (this.g[var13_13 + this.h] == "*/".charAt(var13_13)) continue;
lbl63: // 2 sources:
                        this.h = var5_5 + this.h;
                        continue block3;
                    }
                    break;
                } while (true);
                if (var5_5 == 0) {
                    this.t0("Unterminated comment");
                    throw null;
                }
                var3_3 = 2 + this.h;
            } while (true);
            break;
        } while (true);
    }

    public void j0() {
        int n2 = this.l;
        if (n2 == 0) {
            n2 = this.m();
        }
        if (n2 == 7) {
            this.l = 0;
            int[] arrn = this.s;
            int n3 = -1 + this.q;
            arrn[n3] = 1 + arrn[n3];
            return;
        }
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Expected null but was ");
        stringBuilder.append(this.n0());
        stringBuilder.append(this.J());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final String k0(char c2) {
        char[] arrc = this.g;
        StringBuilder stringBuilder = null;
        block0 : do {
            int n2 = this.h;
            int n3 = this.i;
            int n4 = n2;
            while (n2 < n3) {
                int n5 = n2 + 1;
                char c3 = arrc[n2];
                if (c3 == c2) {
                    this.h = n5;
                    int n6 = n5 - n4 - 1;
                    if (stringBuilder == null) {
                        return new String(arrc, n4, n6);
                    }
                    stringBuilder.append(arrc, n4, n6);
                    return stringBuilder.toString();
                }
                if (c3 == '\\') {
                    this.h = n5;
                    int n7 = n5 - n4 - 1;
                    if (stringBuilder == null) {
                        stringBuilder = new StringBuilder(Math.max(2 * (n7 + 1), 16));
                    }
                    stringBuilder.append(arrc, n4, n7);
                    stringBuilder.append(this.p0());
                    continue block0;
                }
                if (c3 == '\n') {
                    this.j = 1 + this.j;
                    this.k = n5;
                }
                n2 = n5;
            }
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder(Math.max(2 * (n2 - n4), 16));
            }
            stringBuilder.append(arrc, n4, n2 - n4);
            this.h = n2;
            if (!this.A(1)) break;
        } while (true);
        this.t0("Unterminated string");
        throw null;
    }

    public String l0() {
        block11 : {
            String string;
            block5 : {
                int n2;
                block10 : {
                    block9 : {
                        block8 : {
                            char c2;
                            block7 : {
                                block6 : {
                                    block4 : {
                                        n2 = this.l;
                                        if (n2 == 0) {
                                            n2 = this.m();
                                        }
                                        if (n2 != 10) break block4;
                                        string = this.m0();
                                        break block5;
                                    }
                                    if (n2 != 8) break block6;
                                    c2 = '\'';
                                    break block7;
                                }
                                if (n2 != 9) break block8;
                                c2 = '\"';
                            }
                            string = this.k0(c2);
                            break block5;
                        }
                        if (n2 != 11) break block9;
                        string = this.o;
                        this.o = null;
                        break block5;
                    }
                    if (n2 != 15) break block10;
                    string = Long.toString(this.m);
                    break block5;
                }
                if (n2 != 16) break block11;
                string = new String(this.g, this.h, this.n);
                this.h += this.n;
            }
            this.l = 0;
            int[] arrn = this.s;
            int n3 = -1 + this.q;
            arrn[n3] = 1 + arrn[n3];
            return string;
        }
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Expected a string but was ");
        stringBuilder.append(this.n0());
        stringBuilder.append(this.J());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int m() {
        block51 : {
            block41 : {
                block43 : {
                    block44 : {
                        block45 : {
                            block46 : {
                                block47 : {
                                    block50 : {
                                        block48 : {
                                            block49 : {
                                                block33 : {
                                                    block31 : {
                                                        block38 : {
                                                            block42 : {
                                                                block35 : {
                                                                    block39 : {
                                                                        block40 : {
                                                                            block37 : {
                                                                                block36 : {
                                                                                    block34 : {
                                                                                        block32 : {
                                                                                            var1_1 = this.p;
                                                                                            var2_2 = this.q;
                                                                                            var3_3 = var1_1[var2_2 - 1];
                                                                                            if (var3_3 != 1) break block32;
                                                                                            var1_1[var2_2 - 1] = 2;
                                                                                            break block33;
                                                                                        }
                                                                                        if (var3_3 != 2) break block34;
                                                                                        var48_4 = this.i0(true);
                                                                                        if (var48_4 != 44) {
                                                                                            if (var48_4 != 59) {
                                                                                                if (var48_4 == 93) {
                                                                                                    this.l = 4;
                                                                                                    return 4;
                                                                                                }
                                                                                                this.t0("Unterminated array");
                                                                                                throw null;
                                                                                            }
                                                                                            this.i();
                                                                                        }
                                                                                        break block33;
                                                                                    }
                                                                                    if (var3_3 == 3 || var3_3 == 5) break block35;
                                                                                    if (var3_3 != 4) break block36;
                                                                                    var1_1[var2_2 - 1] = 5;
                                                                                    var44_5 = this.i0(true);
                                                                                    if (var44_5 != 58) {
                                                                                        if (var44_5 != 61) {
                                                                                            this.t0("Expected ':'");
                                                                                            throw null;
                                                                                        }
                                                                                        this.i();
                                                                                        if ((this.h < this.i || this.A(1)) && (var46_6 = this.g)[var47_7 = this.h] == '>') {
                                                                                            this.h = var47_7 + 1;
                                                                                        }
                                                                                    }
                                                                                    break block33;
                                                                                }
                                                                                if (var3_3 != 6) break block37;
                                                                                if (!this.f) break block31;
                                                                                this.i0(true);
                                                                                this.h = var40_8 = this.h - 1;
                                                                                var41_9 = a.t;
                                                                                if (var40_8 + var41_9.length > this.i && !this.A(var41_9.length)) break block31;
                                                                                break block38;
                                                                            }
                                                                            if (var3_3 != 7) break block39;
                                                                            if (this.i0(false) != -1) break block40;
                                                                            var5_12 = 17;
                                                                            break block41;
                                                                        }
                                                                        this.i();
                                                                        --this.h;
                                                                        break block33;
                                                                    }
                                                                    if (var3_3 == 8) throw new IllegalStateException("JsonReader is closed");
                                                                    break block33;
                                                                }
                                                                var1_1[var2_2 - 1] = 4;
                                                                if (var3_3 == 5 && (var8_36 = this.i0(true)) != 44) {
                                                                    if (var8_36 != 59) {
                                                                        if (var8_36 == 125) {
                                                                            this.l = 2;
                                                                            return 2;
                                                                        }
                                                                        this.t0("Unterminated object");
                                                                        throw null;
                                                                    }
                                                                    this.i();
                                                                }
                                                                if ((var4_37 = this.i0(true)) == 34) break block42;
                                                                if (var4_37 == 39) ** GOTO lbl77
                                                                if (var4_37 != 125) {
                                                                    this.i();
                                                                    --this.h;
                                                                    if (!this.H((char)var4_37)) {
                                                                        this.t0("Expected name");
                                                                        throw null;
                                                                    }
                                                                    var5_12 = 14;
                                                                } else {
                                                                    if (var3_3 != 5) {
                                                                        this.l = 2;
                                                                        return 2;
                                                                    }
                                                                    this.t0("Expected name");
                                                                    throw null;
lbl77: // 1 sources:
                                                                    this.i();
                                                                    var5_12 = 12;
                                                                }
                                                                break block41;
                                                            }
                                                            var5_12 = 13;
                                                            break block41;
                                                        }
                                                        for (var42_10 = 0; var42_10 < (var43_11 = a.t).length; ++var42_10) {
                                                            if (this.g[var42_10 + this.h] == var43_11[var42_10]) {
                                                                continue;
                                                            }
                                                            break block31;
                                                        }
                                                        this.h += var43_11.length;
                                                    }
                                                    this.p[this.q - 1] = 7;
                                                }
                                                var10_13 = this.i0(true);
                                                if (var10_13 == 34) break block43;
                                                if (var10_13 == 39) break block44;
                                                if (var10_13 == 44 || var10_13 == 59) break block45;
                                                if (var10_13 == 91) break block46;
                                                if (var10_13 == 93) break block47;
                                                if (var10_13 == 123) {
                                                    this.l = 1;
                                                    return 1;
                                                }
                                                this.h = var12_14 = this.h - 1;
                                                var13_15 = this.g[var12_14];
                                                if (var13_15 == 't' || var13_15 == 'T') break block48;
                                                if (var13_15 == 'f' || var13_15 == 'F') break block49;
                                                if (var13_15 != 'n' && var13_15 != 'N') ** GOTO lbl-1000
                                                var14_16 = "null";
                                                var15_17 = "NULL";
                                                var16_18 = 7;
                                                break block50;
                                            }
                                            var14_16 = "false";
                                            var15_17 = "FALSE";
                                            var16_18 = 6;
                                            break block50;
                                        }
                                        var14_16 = "true";
                                        var15_17 = "TRUE";
                                        var16_18 = 5;
                                    }
                                    var17_19 = var14_16.length();
                                    break block51;
                                }
                                if (var3_3 != 1) break block45;
                                var5_12 = 4;
                                break block41;
                            }
                            var5_12 = 3;
                            break block41;
                        }
                        if (var3_3 != 1 && var3_3 != 2) {
                            this.t0("Unexpected value");
                            throw null;
                        }
                        this.i();
                        --this.h;
                        var5_12 = 7;
                        break block41;
                    }
                    this.i();
                    var5_12 = 8;
                    break block41;
                }
                var5_12 = 9;
            }
lbl144: // 2 sources:
            do {
                this.l = var5_12;
                return var5_12;
                break;
            } while (true);
        }
        for (var18_20 = 1; var18_20 < var17_19; ++var18_20) {
            if (!(var18_20 + this.h >= this.i && !this.A(var18_20 + 1) || (var38_21 = this.g[var18_20 + this.h]) != var14_16.charAt(var18_20) && var38_21 != var15_17.charAt(var18_20))) {
                continue;
            }
            ** GOTO lbl-1000
        }
        if ((var17_19 + this.h < this.i || this.A(var17_19 + 1)) && this.H(this.g[var17_19 + this.h])) lbl-1000: // 3 sources:
        {
            var16_18 = 0;
        } else {
            this.h = var17_19 + this.h;
            this.l = var16_18;
        }
        if (var16_18 != 0) {
            return var16_18;
        }
        var19_22 = this.g;
        var20_23 = this.h;
        var21_24 = this.i;
        var24_26 = var22_25 = 0L;
        var26_27 = 0;
        var27_28 = 0;
        var28_29 = true;
        var29_30 = false;
        block3 : do {
            block63 : {
                block67 : {
                    block55 : {
                        block56 : {
                            block66 : {
                                block57 : {
                                    block58 : {
                                        block65 : {
                                            block64 : {
                                                block54 : {
                                                    block59 : {
                                                        block62 : {
                                                            block60 : {
                                                                block61 : {
                                                                    block52 : {
                                                                        block53 : {
                                                                            if (var20_23 + var26_27 != var21_24) break block52;
                                                                            if (var26_27 == var19_22.length) break block53;
                                                                            if (!this.A(var26_27 + 1)) break block54;
                                                                            var20_23 = this.h;
                                                                            var21_24 = this.i;
                                                                            break block52;
                                                                        }
lbl175: // 8 sources:
                                                                        do {
                                                                            var33_35 = 0;
                                                                            break block3;
                                                                            break;
                                                                        } while (true);
                                                                    }
                                                                    if ((var30_31 = var19_22[var20_23 + var26_27]) == '+') break block55;
                                                                    if (var30_31 == 'E' || var30_31 == 'e') break block56;
                                                                    if (var30_31 == '-') break block57;
                                                                    if (var30_31 == '.') break block58;
                                                                    if (var30_31 < '0' || var30_31 > '9') break block59;
                                                                    if (var27_28 == 1 || var27_28 == 0) break block60;
                                                                    if (var27_28 != 2) break block61;
                                                                    if (var24_26 == var22_25) ** GOTO lbl175
                                                                    var35_33 = 10L * var24_26 - (long)(var30_31 - 48);
                                                                    var37_34 = var24_26 > -922337203685477580L || var24_26 == -922337203685477580L && var35_33 < var24_26;
                                                                    var28_29 &= var37_34;
                                                                    var24_26 = var35_33;
                                                                    break block62;
                                                                }
                                                                if (var27_28 == 3) {
                                                                    var27_28 = 4;
                                                                } else if (var27_28 == 5 || var27_28 == 6) {
                                                                    var27_28 = 7;
                                                                }
                                                                break block62;
                                                            }
                                                            var24_26 = -(var30_31 - 48);
                                                            var27_28 = 2;
                                                        }
                                                        var31_32 = 0L;
                                                        break block63;
                                                    }
                                                    if (this.H(var30_31)) ** GOTO lbl175
                                                }
                                                if (var27_28 != 2 || !var28_29 || var24_26 == Long.MIN_VALUE && !var29_30 || var24_26 == 0L && var29_30) break block64;
                                                if (!var29_30) {
                                                    var24_26 = -var24_26;
                                                }
                                                this.m = var24_26;
                                                this.h = var26_27 + this.h;
                                                var33_35 = 15;
                                                break block65;
                                            }
                                            if (var27_28 != 2 && var27_28 != 4 && var27_28 != 7) ** GOTO lbl175
                                            this.n = var26_27;
                                            var33_35 = 16;
                                        }
                                        this.l = var33_35;
                                        break;
                                    }
                                    var31_32 = var22_25;
                                    if (var27_28 != 2) ** GOTO lbl175
                                    var27_28 = 3;
                                    break block63;
                                }
                                var31_32 = var22_25;
                                if (var27_28 != 0) break block66;
                                var27_28 = 1;
                                var29_30 = true;
                                break block63;
                            }
                            if (var27_28 != 5) ** GOTO lbl175
                            break block67;
                        }
                        var31_32 = var22_25;
                        if (var27_28 != 2 && var27_28 != 4) ** GOTO lbl175
                        var27_28 = 5;
                        break block63;
                    }
                    var31_32 = var22_25;
                    if (var27_28 != 5) ** continue;
                }
                var27_28 = 6;
            }
            ++var26_27;
            var22_25 = var31_32;
        } while (true);
        if (var33_35 != 0) {
            return var33_35;
        }
        if (!this.H(this.g[this.h])) {
            this.t0("Expected value");
            throw null;
        }
        this.i();
        var5_12 = 10;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public final String m0() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous
        // org.benf.cfr.reader.b.a.a.b.as.a(SwitchReplacer.java:478)
        // org.benf.cfr.reader.b.a.a.b.as.a(SwitchReplacer.java:61)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:372)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    public b n0() {
        int n2 = this.l;
        if (n2 == 0) {
            n2 = this.m();
        }
        switch (n2) {
            default: {
                throw new AssertionError();
            }
            case 17: {
                return b.n;
            }
            case 15: 
            case 16: {
                return b.k;
            }
            case 12: 
            case 13: 
            case 14: {
                return b.i;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return b.j;
            }
            case 7: {
                return b.m;
            }
            case 5: 
            case 6: {
                return b.l;
            }
            case 4: {
                return b.f;
            }
            case 3: {
                return b.e;
            }
            case 2: {
                return b.h;
            }
            case 1: 
        }
        return b.g;
    }

    public final void o0(int n2) {
        int n3 = this.q;
        int[] arrn = this.p;
        if (n3 == arrn.length) {
            int n4 = n3 * 2;
            this.p = Arrays.copyOf(arrn, n4);
            this.s = Arrays.copyOf(this.s, n4);
            this.r = (String[])Arrays.copyOf((Object[])this.r, n4);
        }
        int[] arrn2 = this.p;
        int n5 = this.q;
        this.q = n5 + 1;
        arrn2[n5] = n2;
    }

    public final char p0() {
        char c2;
        block7 : {
            int n2;
            block6 : {
                block8 : {
                    block9 : {
                        block10 : {
                            block11 : {
                                block12 : {
                                    block13 : {
                                        int n3;
                                        if (this.h == this.i && !this.A(1)) {
                                            this.t0("Unterminated escape sequence");
                                            throw null;
                                        }
                                        char[] arrc = this.g;
                                        int n4 = this.h;
                                        this.h = n2 = n4 + 1;
                                        c2 = arrc[n4];
                                        if (c2 == '\n') break block6;
                                        if (c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\') break block7;
                                        if (c2 == 'b') break block8;
                                        if (c2 == 'f') break block9;
                                        if (c2 == 'n') break block10;
                                        if (c2 == 'r') break block11;
                                        if (c2 == 't') break block12;
                                        if (c2 != 'u') break block13;
                                        if (n2 + 4 > this.i && !this.A(4)) {
                                            this.t0("Unterminated escape sequence");
                                            throw null;
                                        }
                                        char c3 = '\u0000';
                                        int n5 = n3 + 4;
                                        for (n3 = this.h; n3 < n5; ++n3) {
                                            block18 : {
                                                int n6;
                                                char c4;
                                                block15 : {
                                                    int n7;
                                                    block17 : {
                                                        char c5;
                                                        block16 : {
                                                            block14 : {
                                                                c5 = this.g[n3];
                                                                c4 = (char)(c3 << 4);
                                                                if (c5 < '0' || c5 > '9') break block14;
                                                                n6 = c5 - 48;
                                                                break block15;
                                                            }
                                                            if (c5 < 'a' || c5 > 'f') break block16;
                                                            n7 = c5 - 97;
                                                            break block17;
                                                        }
                                                        if (c5 < 'A' || c5 > 'F') break block18;
                                                        n7 = c5 - 65;
                                                    }
                                                    n6 = n7 + 10;
                                                }
                                                c3 = (char)(n6 + c4);
                                                continue;
                                            }
                                            StringBuilder stringBuilder = d.a.b.a.a.d((String)"\\u");
                                            stringBuilder.append(new String(this.g, this.h, 4));
                                            throw new NumberFormatException(stringBuilder.toString());
                                        }
                                        this.h = 4 + this.h;
                                        return c3;
                                    }
                                    this.t0("Invalid escape sequence");
                                    throw null;
                                }
                                return '\t';
                            }
                            return '\r';
                        }
                        return '\n';
                    }
                    return '\f';
                }
                return '\b';
            }
            this.j = 1 + this.j;
            this.k = n2;
        }
        return c2;
    }

    public final void q0(char c2) {
        char[] arrc = this.g;
        block0 : do {
            int n2 = this.h;
            int n3 = this.i;
            while (n2 < n3) {
                int n4 = n2 + 1;
                char c3 = arrc[n2];
                if (c3 == c2) {
                    this.h = n4;
                    return;
                }
                if (c3 == '\\') {
                    this.h = n4;
                    this.p0();
                    continue block0;
                }
                if (c3 == '\n') {
                    this.j = 1 + this.j;
                    this.k = n4;
                }
                n2 = n4;
            }
            this.h = n2;
            if (!this.A(1)) break;
        } while (true);
        this.t0("Unterminated string");
        throw null;
    }

    public final void r0() {
        while (this.h < this.i || this.A(1)) {
            int n2;
            char[] arrc = this.g;
            int n3 = this.h;
            this.h = n2 = n3 + 1;
            char c2 = arrc[n3];
            if (c2 == '\n') {
                this.j = 1 + this.j;
                this.k = n2;
                return;
            }
            if (c2 != '\r') continue;
        }
    }

    public void s() {
        int n2 = this.l;
        if (n2 == 0) {
            n2 = this.m();
        }
        if (n2 == 4) {
            int n3;
            this.q = n3 = -1 + this.q;
            int[] arrn = this.s;
            int n4 = n3 - 1;
            arrn[n4] = 1 + arrn[n4];
            this.l = 0;
            return;
        }
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Expected END_ARRAY but was ");
        stringBuilder.append(this.n0());
        stringBuilder.append(this.J());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void s0() {
        var1_1 = 0;
        do {
            block12 : {
                block14 : {
                    block17 : {
                        block15 : {
                            block16 : {
                                block13 : {
                                    block11 : {
                                        block10 : {
                                            block9 : {
                                                if ((var2_2 = this.l) == 0) {
                                                    var2_2 = this.m();
                                                }
                                                if (var2_2 != 3) break block9;
                                                this.o0(1);
                                                break block10;
                                            }
                                            if (var2_2 != 1) break block11;
                                            this.o0(3);
                                        }
                                        ++var1_1;
                                        break block12;
                                    }
                                    if (var2_2 != 4 && var2_2 != 2) break block13;
                                    --this.q;
                                    --var1_1;
                                    break block12;
                                }
                                if (var2_2 == 14 || var2_2 == 10) break block14;
                                if (var2_2 == 8 || var2_2 == 12) break block15;
                                if (var2_2 == 9 || var2_2 == 13) break block16;
                                if (var2_2 == 16) {
                                    this.h += this.n;
                                }
                                break block12;
                            }
                            var9_6 = 34;
                            break block17;
                        }
                        var9_6 = 39;
                    }
                    this.q0((char)var9_6);
                    break block12;
                }
                block5 : do {
                    var3_3 = 0;
                    block6 : while ((var4_4 = var3_3 + this.h) < this.i) {
                        block18 : {
                            var8_5 = this.g[var4_4];
                            if (var8_5 == '\t' || var8_5 == '\n' || var8_5 == '\f' || var8_5 == '\r' || var8_5 == ' ') break block18;
                            if (var8_5 == '#') ** GOTO lbl-1000
                            if (var8_5 == ',') break block18;
                            if (var8_5 == '/' || var8_5 == '=') ** GOTO lbl-1000
                            if (var8_5 == '{' || var8_5 == '}' || var8_5 == ':') break block18;
                            if (var8_5 == ';') ** GOTO lbl-1000
                            switch (var8_5) {
                                default: {
                                    ++var3_3;
                                    continue block6;
                                }
                                case '\\': lbl-1000: // 4 sources:
                                {
                                    this.i();
                                }
                                case '[': 
                                case ']': 
                            }
                        }
                        this.h = var3_3 + this.h;
                        break block5;
                    }
                    this.h = var4_4;
                } while (this.A(1));
            }
            this.l = 0;
        } while (var1_1 != 0);
        var5_7 = this.s;
        var6_8 = this.q;
        var7_9 = var6_8 - 1;
        var5_7[var7_9] = 1 + var5_7[var7_9];
        this.r[var6_8 - 1] = "null";
    }

    public final IOException t0(String string) {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)string);
        stringBuilder.append(this.J());
        throw new d(stringBuilder.toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(this.J());
        return stringBuilder.toString();
    }

    public void u() {
        int n2 = this.l;
        if (n2 == 0) {
            n2 = this.m();
        }
        if (n2 == 2) {
            int n3;
            this.q = n3 = -1 + this.q;
            this.r[n3] = null;
            int[] arrn = this.s;
            int n4 = n3 - 1;
            arrn[n4] = 1 + arrn[n4];
            this.l = 0;
            return;
        }
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Expected END_OBJECT but was ");
        stringBuilder.append(this.n0());
        stringBuilder.append(this.J());
        throw new IllegalStateException(stringBuilder.toString());
    }
}

