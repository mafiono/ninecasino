/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.c.a0.o
 *  d.c.c.a0.z.a
 *  d.c.c.a0.z.b
 *  d.c.c.a0.z.c
 *  d.c.c.a0.z.d
 *  d.c.c.a0.z.g
 *  d.c.c.a0.z.h
 *  d.c.c.a0.z.j
 *  d.c.c.a0.z.k
 *  d.c.c.a0.z.l
 *  d.c.c.a0.z.p
 *  d.c.c.a0.z.q
 *  d.c.c.c
 *  d.c.c.e
 *  d.c.c.f
 *  d.c.c.g
 *  d.c.c.h
 *  d.c.c.i$a
 *  d.c.c.o
 *  d.c.c.v
 *  d.c.c.w
 *  java.io.EOFException
 *  java.io.IOException
 *  java.io.Reader
 *  java.io.StringReader
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.lang.reflect.Type
 *  java.math.BigDecimal
 *  java.math.BigInteger
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.atomic.AtomicLong
 *  java.util.concurrent.atomic.AtomicLongArray
 */
package d.c.c;

import d.c.c.a0.z.b;
import d.c.c.a0.z.c;
import d.c.c.a0.z.d;
import d.c.c.a0.z.g;
import d.c.c.a0.z.h;
import d.c.c.a0.z.j;
import d.c.c.a0.z.k;
import d.c.c.a0.z.l;
import d.c.c.a0.z.o;
import d.c.c.a0.z.p;
import d.c.c.a0.z.q;
import d.c.c.e;
import d.c.c.f;
import d.c.c.i;
import d.c.c.v;
import d.c.c.w;
import d.c.c.x;
import d.c.c.y;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class i {
    public static final d.c.c.b0.a<?> l = new d.c.c.b0.a(Object.class);
    public final ThreadLocal<Map<d.c.c.b0.a<?>, a<?>>> a;
    public final Map<d.c.c.b0.a<?>, x<?>> b;
    public final d.c.c.a0.g c;
    public final d d;
    public final List<y> e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final List<y> j;
    public final List<y> k;

    public i() {
        d d3;
        d.c.c.a0.g g2;
        d.c.c.a0.o o2 = d.c.c.a0.o.g;
        d.c.c.c c2 = d.c.c.c.e;
        Map map = Collections.emptyMap();
        List list = Collections.emptyList();
        List list2 = Collections.emptyList();
        List list3 = Collections.emptyList();
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        this.c = g2 = new d.c.c.a0.g(map);
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = list;
        this.k = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(o.Y);
        arrayList.add((Object)h.b);
        arrayList.add(o2);
        arrayList.addAll(list3);
        arrayList.add(o.D);
        arrayList.add(o.m);
        arrayList.add(o.g);
        arrayList.add(o.i);
        arrayList.add(o.k);
        x<Number> x2 = o.t;
        arrayList.add(new q(Long.TYPE, Long.class, x2));
        arrayList.add(new q(Double.TYPE, Double.class, new e(this)));
        arrayList.add(new q(Float.TYPE, Float.class, new f(this)));
        arrayList.add(o.x);
        arrayList.add(o.o);
        arrayList.add(o.q);
        arrayList.add(new p(AtomicLong.class, new w(new d.c.c.g(x2))));
        arrayList.add(new p(AtomicLongArray.class, new w(new d.c.c.h(x2))));
        arrayList.add(o.s);
        arrayList.add(o.z);
        arrayList.add(o.F);
        arrayList.add(o.H);
        arrayList.add(new p(BigDecimal.class, o.B));
        arrayList.add(new p(BigInteger.class, o.C));
        arrayList.add(o.J);
        arrayList.add(o.L);
        arrayList.add(o.P);
        arrayList.add(o.R);
        arrayList.add(o.W);
        arrayList.add(o.N);
        arrayList.add(o.d);
        arrayList.add(c.b);
        arrayList.add(o.U);
        arrayList.add(l.b);
        arrayList.add((Object)k.b);
        arrayList.add(o.S);
        arrayList.add(d.c.c.a0.z.a.c);
        arrayList.add(o.b);
        arrayList.add(new b(g2));
        arrayList.add(new g(g2, false));
        this.d = d3 = new d(g2);
        arrayList.add(d3);
        arrayList.add(o.Z);
        arrayList.add(new j(g2, c2, o2, d3));
        this.e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d3) {
        if (!Double.isNaN(d3) && !Double.isInfinite(d3)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d3);
        stringBuilder.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T> T b(String string, Class<T> object) {
        EOFException eOFException2;
        Throwable throwable2;
        boolean bl;
        block21 : {
            boolean bl2;
            Object var8_6;
            Class class_;
            d.c.c.c0.a a2 = new d.c.c.c0.a(new StringReader(string));
            a2.f = bl = this.i;
            a2.f = bl2 = true;
            try {
                try {
                    a2.n0();
                    bl2 = false;
                    var8_6 = this.c(new d.c.c.b0.a(object)).a(a2);
                }
                catch (AssertionError assertionError) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("AssertionError (GSON 2.8.6): ");
                    stringBuilder.append(assertionError.getMessage());
                    AssertionError assertionError2 = new AssertionError(stringBuilder.toString());
                    assertionError2.initCause(assertionError);
                    throw assertionError2;
                }
                catch (IOException iOException) {
                    throw new v(iOException);
                }
                catch (IllegalStateException illegalStateException) {
                    throw new v(illegalStateException);
                }
                catch (EOFException eOFException2) {
                    if (!bl2) break block21;
                    var8_6 = null;
                }
            }
            catch (Throwable throwable2) {}
            a2.f = bl;
            if (var8_6 != null) {
                try {
                    if (a2.n0() != d.c.c.c0.b.n) throw new d.c.c.o("JSON document was not fully consumed.");
                }
                catch (IOException iOException) {
                    throw new d.c.c.o(iOException);
                }
                catch (d.c.c.c0.d d3) {
                    throw new v(d3);
                }
            }
            if (object == Integer.TYPE) {
                class_ = Integer.class;
                return (T)class_.cast(var8_6);
            }
            if (object == Float.TYPE) {
                class_ = Float.class;
                return (T)class_.cast(var8_6);
            }
            if (object == Byte.TYPE) {
                class_ = Byte.class;
                return (T)class_.cast(var8_6);
            }
            if (object == Double.TYPE) {
                class_ = Double.class;
                return (T)class_.cast(var8_6);
            }
            if (object == Long.TYPE) {
                class_ = Long.class;
                return (T)class_.cast(var8_6);
            }
            if (object == Character.TYPE) {
                class_ = Character.class;
                return (T)class_.cast(var8_6);
            }
            if (object == Boolean.TYPE) {
                class_ = Boolean.class;
                return (T)class_.cast(var8_6);
            }
            if (object == Short.TYPE) {
                class_ = Short.class;
                return (T)class_.cast(var8_6);
            }
            if (object == Void.TYPE) {
                object = Void.class;
            }
            class_ = object;
            return (T)class_.cast(var8_6);
        }
        throw new v(eOFException2);
        a2.f = bl;
        throw throwable2;
    }

    /*
     * Exception decompiling
     */
    public <T> x<T> c(d.c.c.b0.a<T> var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[WHILELOOP]], but top level block is 1[TRYBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
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

    public <T> x<T> d(y y2, d.c.c.b0.a<T> a2) {
        IllegalArgumentException illegalArgumentException;
        if (!this.e.contains(y2)) {
            y2 = this.d;
        }
        boolean bl = false;
        for (y y3 : this.e) {
            if (!bl) {
                if (y3 != y2) continue;
                bl = true;
                continue;
            }
            x<T> x2 = y3.b(this, a2);
            if (x2 == null) continue;
            return x2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GSON cannot serialize ");
        stringBuilder.append(a2);
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{serializeNulls:");
        stringBuilder.append(this.f);
        stringBuilder.append(",factories:");
        stringBuilder.append(this.e);
        stringBuilder.append(",instanceCreators:");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

