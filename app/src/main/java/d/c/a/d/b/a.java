/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.AppOpsManager
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.os.Binder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.os.Process
 *  android.text.TextUtils
 *  android.util.Log
 *  d.a.b.a.a
 *  d.c.a.d.d.i
 *  d.c.a.d.d.j
 *  d.c.a.d.d.m.m
 *  d.c.a.d.d.m.n.b
 *  d.c.a.d.d.n.a
 *  d.c.a.d.d.q.b
 *  d.c.a.d.d.q.c
 *  d.c.a.d.g.f.b5
 *  d.c.a.d.g.f.d2
 *  d.c.a.d.g.f.d7
 *  d.c.a.d.g.f.e5
 *  d.c.a.d.g.f.e6
 *  d.c.a.d.g.f.f7
 *  d.c.a.d.g.f.g6
 *  d.c.a.d.g.f.k6
 *  d.c.a.d.g.f.n4
 *  d.c.a.d.g.f.n7
 *  d.c.a.d.g.f.p7
 *  d.c.a.d.g.f.s3
 *  d.c.a.d.g.f.s6
 *  d.c.a.d.g.f.t3
 *  d.c.a.d.g.f.u4
 *  d.c.a.d.g.f.u4$c
 *  d.c.a.d.g.f.u4$d
 *  d.c.a.d.g.f.w4
 *  d.c.a.d.g.f.x4
 *  d.c.a.d.g.f.z3
 *  d.c.a.d.h.b.ka
 *  d.c.a.d.h.b.s3
 *  d.c.a.d.h.b.u3
 *  d.c.a.d.j.a
 *  d.c.a.d.j.b
 *  d.c.a.d.j.d
 *  d.c.a.d.j.e
 *  d.c.a.d.j.f0
 *  d.c.a.d.j.h
 *  d.c.a.d.j.h0
 *  d.c.a.d.j.j
 *  d.c.a.d.j.k
 *  d.c.a.d.j.l
 *  d.c.a.d.j.m
 *  d.c.a.d.j.n
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NoSuchMethodError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.lang.reflect.Method
 *  java.lang.reflect.Modifier
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 *  java.util.TreeSet
 *  java.util.concurrent.Callable
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package d.c.a.d.b;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import d.c.a.d.d.i;
import d.c.a.d.d.j;
import d.c.a.d.d.m.n.b;
import d.c.a.d.d.q.c;
import d.c.a.d.g.f.b5;
import d.c.a.d.g.f.d2;
import d.c.a.d.g.f.d7;
import d.c.a.d.g.f.e5;
import d.c.a.d.g.f.e6;
import d.c.a.d.g.f.f7;
import d.c.a.d.g.f.g6;
import d.c.a.d.g.f.k6;
import d.c.a.d.g.f.n4;
import d.c.a.d.g.f.n7;
import d.c.a.d.g.f.p7;
import d.c.a.d.g.f.s3;
import d.c.a.d.g.f.s6;
import d.c.a.d.g.f.t3;
import d.c.a.d.g.f.u4;
import d.c.a.d.g.f.w4;
import d.c.a.d.g.f.x4;
import d.c.a.d.g.f.z3;
import d.c.a.d.h.b.ka;
import d.c.a.d.h.b.u3;
import d.c.a.d.j.d;
import d.c.a.d.j.e;
import d.c.a.d.j.f0;
import d.c.a.d.j.h;
import d.c.a.d.j.h0;
import d.c.a.d.j.k;
import d.c.a.d.j.l;
import d.c.a.d.j.m;
import d.c.a.d.j.n;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class a {
    public static d.c.a.d.d.n.a a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static ka e;

    public static int A(Parcel parcel) {
        int n2 = parcel.readInt();
        int n3 = a.x(parcel, n2);
        int n4 = parcel.dataPosition();
        if ((65535 & n2) != 20293) {
            String string = String.valueOf(Integer.toHexString(n2));
            String string2 = string.length() != 0 ? "Expected object header. Got 0x".concat(string) : "Expected object header. Got 0x";
            throw new b(string2, parcel);
        }
        int n5 = n3 + n4;
        if (n5 >= n4 && n5 <= parcel.dataSize()) {
            return n5;
        }
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("Size read is invalid start=");
        stringBuilder.append(n4);
        stringBuilder.append(" end=");
        stringBuilder.append(n5);
        throw new b(stringBuilder.toString(), parcel);
    }

    public static h<Void> B(Collection<? extends h<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                Objects.requireNonNull(iterator.next(), "null tasks are not accepted");
            }
            f0 f02 = new f0();
            l l2 = new l(collection.size(), f02);
            Iterator iterator2 = collection.iterator();
            while (iterator2.hasNext()) {
                a.k0((h)iterator2.next(), (m)l2);
            }
            return f02;
        }
        return a.l(null);
    }

    public static /* varargs */ h<List<h<?>>> C(h<?> ... arrh) {
        if (arrh.length == 0) {
            return a.l(Collections.emptyList());
        }
        List list = Arrays.asList((Object[])arrh);
        if (list != null && !list.isEmpty()) {
            h<Void> h2 = a.B(list);
            n n2 = new n(list);
            return ((f0)h2).h(d.c.a.d.j.j.a, (d.c.a.d.j.a)n2);
        }
        return a.l(Collections.emptyList());
    }

    public static void D(Parcel parcel, int n2, Bundle bundle, boolean bl) {
        if (bundle == null) {
            if (bl) {
                a.r0(parcel, n2, 0);
            }
            return;
        }
        int n3 = a.M(parcel, n2);
        parcel.writeBundle(bundle);
        a.q0(parcel, n3);
    }

    public static void E(Parcel parcel, int n2, IBinder iBinder, boolean bl) {
        if (iBinder == null) {
            if (bl) {
                a.r0(parcel, n2, 0);
            }
            return;
        }
        int n3 = a.M(parcel, n2);
        parcel.writeStrongBinder(iBinder);
        a.q0(parcel, n3);
    }

    public static void F(Parcel parcel, int n2, Parcelable parcelable, int n3, boolean bl) {
        if (parcelable == null) {
            if (bl) {
                a.r0(parcel, n2, 0);
            }
            return;
        }
        int n4 = a.M(parcel, n2);
        parcelable.writeToParcel(parcel, n3);
        a.q0(parcel, n4);
    }

    public static void G(Parcel parcel, int n2, String string, boolean bl) {
        if (string == null) {
            if (bl) {
                a.r0(parcel, n2, 0);
            }
            return;
        }
        int n3 = a.M(parcel, n2);
        parcel.writeString(string);
        a.q0(parcel, n3);
    }

    public static <T extends Parcelable> void H(Parcel parcel, int n2, T[] arrT, int n3, boolean bl) {
        if (arrT == null) {
            if (bl) {
                a.r0(parcel, n2, 0);
            }
            return;
        }
        int n4 = a.M(parcel, n2);
        int n5 = arrT.length;
        parcel.writeInt(n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            T t2 = arrT[i2];
            if (t2 == null) {
                parcel.writeInt(0);
                continue;
            }
            a.g0(parcel, t2, n3);
        }
        a.q0(parcel, n4);
    }

    public static int I(int n2, byte[] arrby, int n3, int n4, s3 s32) {
        e5 e52;
        if (n2 >>> 3 != 0) {
            int n5 = n2 & 7;
            if (n5 != 0) {
                if (n5 != 1) {
                    if (n5 != 2) {
                        if (n5 != 3) {
                            if (n5 == 5) {
                                return n3 + 4;
                            }
                            throw e5.c();
                        }
                        int n6 = 4 | n2 & -8;
                        int n7 = 0;
                        while (n3 < n4) {
                            n3 = a.R(arrby, n3, s32);
                            n7 = s32.a;
                            if (n7 == n6) break;
                            n3 = a.I(n7, arrby, n3, n4, s32);
                        }
                        if (n3 <= n4 && n7 == n6) {
                            return n3;
                        }
                        throw e5.d();
                    }
                    return a.R(arrby, n3, s32) + s32.a;
                }
                return n3 + 8;
            }
            return a.o0(arrby, n3, s32);
        }
        e52 = e5.c();
        throw e52;
    }

    public static int J(int n2, byte[] arrby, int n3, int n4, b5<?> b52, s3 s32) {
        x4 x42 = (x4)b52;
        int n5 = a.R(arrby, n3, s32);
        do {
            x42.j(s32.a);
            if (n5 >= n4) break;
            int n6 = a.R(arrby, n5, s32);
            if (n2 != s32.a) break;
            n5 = a.R(arrby, n6, s32);
        } while (true);
        return n5;
    }

    public static int K(int n2, byte[] arrby, int n3, int n4, f7 f72, s3 s32) {
        e5 e52;
        if (n2 >>> 3 != 0) {
            int n5 = n2 & 7;
            if (n5 != 0) {
                if (n5 != 1) {
                    if (n5 != 2) {
                        if (n5 != 3) {
                            if (n5 == 5) {
                                f72.a(n2, (Object)a.Q(arrby, n3));
                                return n3 + 4;
                            }
                            throw e5.c();
                        }
                        f7 f73 = f7.c();
                        int n6 = 4 | n2 & -8;
                        int n7 = 0;
                        while (n3 < n4) {
                            int n8;
                            int n9 = a.R(arrby, n3, s32);
                            n7 = n8 = s32.a;
                            if (n8 != n6) {
                                int n10 = a.K(n7, arrby, n9, n4, f73, s32);
                                n7 = n8;
                                n3 = n10;
                                continue;
                            }
                            n3 = n9;
                            break;
                        }
                        if (n3 <= n4 && n7 == n6) {
                            f72.a(n2, (Object)f73);
                            return n3;
                        }
                        throw e5.d();
                    }
                    int n11 = a.R(arrby, n3, s32);
                    int n12 = s32.a;
                    if (n12 >= 0) {
                        if (n12 <= arrby.length - n11) {
                            t3 t32 = n12 == 0 ? t3.f : t3.l((byte[])arrby, (int)n11, (int)n12);
                            f72.a(n2, (Object)t32);
                            return n11 + n12;
                        }
                        throw e5.a();
                    }
                    throw e5.b();
                }
                f72.a(n2, (Object)a.p0(arrby, n3));
                return n3 + 8;
            }
            int n13 = a.o0(arrby, n3, s32);
            f72.a(n2, (Object)s32.b);
            return n13;
        }
        e52 = e5.c();
        throw e52;
    }

    public static int L(int n2, byte[] arrby, int n3, s3 s32) {
        byte by;
        int n4;
        int n5;
        block13 : {
            int n6;
            block11 : {
                int n7;
                byte by2;
                int n8;
                block12 : {
                    int n9;
                    block9 : {
                        byte by3;
                        block10 : {
                            byte by4;
                            block8 : {
                                n8 = n2 & 127;
                                n7 = n3 + 1;
                                by4 = arrby[n3];
                                if (by4 < 0) break block8;
                                n9 = by4 << 7;
                                break block9;
                            }
                            n5 = n8 | (by4 & 127) << 7;
                            n4 = n7 + 1;
                            by3 = arrby[n7];
                            if (by3 < 0) break block10;
                            n6 = by3 << 14;
                            break block11;
                        }
                        n8 = n5 | (by3 & 127) << 14;
                        n7 = n4 + 1;
                        by2 = arrby[n4];
                        if (by2 < 0) break block12;
                        n9 = by2 << 21;
                    }
                    s32.a = n8 | n9;
                    return n7;
                }
                n5 = n8 | (by2 & 127) << 21;
                n4 = n7 + 1;
                by = arrby[n7];
                if (by < 0) break block13;
                n6 = by << 28;
            }
            s32.a = n5 | n6;
            return n4;
        }
        int n10 = n5 | (by & 127) << 28;
        do {
            int n11 = n4 + 1;
            if (arrby[n4] >= 0) {
                s32.a = n10;
                return n11;
            }
            n4 = n11;
        } while (true);
    }

    public static int M(Parcel parcel, int n2) {
        parcel.writeInt(n2 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static int N(s6<?> s62, int n2, byte[] arrby, int n3, int n4, b5<?> b52, s3 s32) {
        int n5 = a.P(s62, arrby, n3, n4, s32);
        do {
            b52.add(s32.c);
            if (n5 >= n4) break;
            int n6 = a.R(arrby, n5, s32);
            if (n2 != s32.a) break;
            n5 = a.P(s62, arrby, n6, n4, s32);
        } while (true);
        return n5;
    }

    public static int O(s6 s62, byte[] arrby, int n2, int n3, int n4, s3 s32) {
        g6 g62 = (g6)s62;
        Object object = g62.k.b((Object)g62.e);
        int n5 = g62.m(object, arrby, n2, n3, n4, s32);
        g62.d(object);
        s32.c = object;
        return n5;
    }

    public static int P(s6 s62, byte[] arrby, int n2, int n3, s3 s32) {
        int n4 = n2 + 1;
        int n5 = arrby[n2];
        if (n5 < 0) {
            n4 = a.L(n5, arrby, n4, s32);
            n5 = s32.a;
        }
        int n6 = n4;
        if (n5 >= 0 && n5 <= n3 - n6) {
            Object object = s62.a();
            int n7 = n5 + n6;
            s62.i(object, arrby, n6, n7, s32);
            s62.d(object);
            s32.c = object;
            return n7;
        }
        throw e5.a();
    }

    public static int Q(byte[] arrby, int n2) {
        return 255 & arrby[n2] | (255 & arrby[n2 + 1]) << 8 | (255 & arrby[n2 + 2]) << 16 | (255 & arrby[n2 + 3]) << 24;
    }

    public static int R(byte[] arrby, int n2, s3 s32) {
        int n3 = n2 + 1;
        int n4 = arrby[n2];
        if (n4 >= 0) {
            s32.a = n4;
            return n3;
        }
        return a.L(n4, arrby, n3, s32);
    }

    public static int S(byte[] arrby, int n2, b5<?> b52, s3 s32) {
        e5 e52;
        x4 x42 = (x4)b52;
        int n3 = a.R(arrby, n2, s32);
        int n4 = n3 + s32.a;
        while (n3 < n4) {
            n3 = a.R(arrby, n3, s32);
            x42.j(s32.a);
        }
        if (n3 == n4) {
            return n3;
        }
        e52 = e5.a();
        throw e52;
    }

    public static <T> T T(Bundle bundle, String string, Class<T> class_, T t2) {
        Object object = bundle.get(string);
        if (object == null) {
            return t2;
        }
        if (class_.isAssignableFrom(object.getClass())) {
            return (T)object;
        }
        Object[] arrobject = new Object[]{string, class_.getCanonicalName(), object.getClass().getCanonicalName()};
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", arrobject));
    }

    public static <V> V U(d2<V> d22) {
        Object object;
        try {
            object = d22.a();
        }
        catch (SecurityException securityException) {
            long l2 = Binder.clearCallingIdentity();
            try {
                Object object2 = d22.a();
                return (V)object2;
            }
            finally {
                Binder.restoreCallingIdentity(l2);
            }
        }
        return (V)object;
    }

    public static <TResult> TResult V(h<TResult> h2) {
        if (h2.n()) {
            return (TResult)h2.j();
        }
        if (h2.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException((Throwable)h2.i());
    }

    /*
     * Exception decompiling
     */
    public static String W(Context var0, String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl25.1 : ACONST_NULL : trying to set 1 previously set to 0
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

    public static String X(t3 t32) {
        d7 d72 = new d7(t32);
        StringBuilder stringBuilder = new StringBuilder(t32.i());
        for (int i2 = 0; i2 < d72.a.i(); ++i2) {
            String string;
            block14 : {
                block10 : {
                    block11 : {
                        block12 : {
                            int n2;
                            block13 : {
                                n2 = d72.a.g(i2);
                                if (n2 == 34) break block10;
                                if (n2 == 39) break block11;
                                if (n2 == 92) break block12;
                                switch (n2) {
                                    default: {
                                        if (n2 < 32 || n2 > 126) break;
                                        break block13;
                                    }
                                    case 13: {
                                        string = "\\r";
                                        break block14;
                                    }
                                    case 12: {
                                        string = "\\f";
                                        break block14;
                                    }
                                    case 11: {
                                        string = "\\v";
                                        break block14;
                                    }
                                    case 10: {
                                        string = "\\n";
                                        break block14;
                                    }
                                    case 9: {
                                        string = "\\t";
                                        break block14;
                                    }
                                    case 8: {
                                        string = "\\b";
                                        break block14;
                                    }
                                    case 7: {
                                        string = "\\a";
                                        break block14;
                                    }
                                }
                                stringBuilder.append('\\');
                                stringBuilder.append((char)(48 + (3 & n2 >>> 6)));
                                stringBuilder.append((char)(48 + (7 & n2 >>> 3)));
                                n2 = 48 + (n2 & 7);
                            }
                            stringBuilder.append((char)n2);
                            continue;
                        }
                        string = "\\\\";
                        break block14;
                    }
                    string = "\\'";
                    break block14;
                }
                string = "\\\"";
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static final String Y(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (Character.isUpperCase(c2)) {
                stringBuilder.append("_");
            }
            stringBuilder.append(Character.toLowerCase(c2));
        }
        return stringBuilder.toString();
    }

    public static String Z(String string, String[] arrstring, String[] arrstring2) {
        int n2 = Math.min(arrstring.length, arrstring2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = arrstring[i2];
            boolean bl = string == null && string2 == null || (string != null && string.equals(string2));
            if (!bl) continue;
            return arrstring2[i2];
        }
        return null;
    }

    public static <TResult> TResult a(h<TResult> h2) {
        d.c.a.d.d.m.m.g((String)"Must not be called on the main application thread");
        d.c.a.d.d.m.m.i(h2, (Object)"Task must not be null");
        if (h2.m()) {
            return a.V(h2);
        }
        k k2 = new k(null);
        a.k0(h2, (m)k2);
        k2.a.await();
        return a.V(h2);
    }

    public static Set<String> a0(SQLiteDatabase sQLiteDatabase, String string) {
        HashSet hashSet = new HashSet();
        Cursor cursor = sQLiteDatabase.rawQuery(d.a.b.a.a.i((int)d.a.b.a.a.b((String)string, (int)22), (String)"SELECT * FROM ", (String)string, (String)" LIMIT 0"), null);
        try {
            Collections.addAll(hashSet, (Object[])cursor.getColumnNames());
            return hashSet;
        }
        finally {
            cursor.close();
        }
    }

    public static <TResult> TResult b(h<TResult> h2, long l2, TimeUnit timeUnit) {
        d.c.a.d.d.m.m.g((String)"Must not be called on the main application thread");
        d.c.a.d.d.m.m.i(h2, (Object)"Task must not be null");
        d.c.a.d.d.m.m.i((Object)timeUnit, (Object)"TimeUnit must not be null");
        if (h2.m()) {
            return a.V(h2);
        }
        k k2 = new k(null);
        a.k0(h2, (m)k2);
        if (k2.a.await(l2, timeUnit)) {
            return a.V(h2);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static void b0(byte by, byte by2, byte by3, byte by4, char[] arrc, int n2) {
        if (!(a.v0(by2) || (by << 28) + (by2 + 112) >> 30 != 0 || a.v0(by3) || a.v0(by4))) {
            int n3 = (by & 7) << 18 | (by2 & 63) << 12 | (by3 & 63) << 6 | by4 & 63;
            arrc[n2] = (char)(55232 + (n3 >>> 10));
            arrc[n2 + 1] = (char)(56320 + (n3 & 1023));
            return;
        }
        throw e5.e();
    }

    public static <TResult> h<TResult> c(Executor executor, Callable<TResult> callable) {
        d.c.a.d.d.m.m.i((Object)executor, (Object)"Executor must not be null");
        d.c.a.d.d.m.m.i(callable, (Object)"Callback must not be null");
        f0 f02 = new f0();
        executor.execute((Runnable)new h0(f02, callable));
        return f02;
    }

    public static void c0(byte by, byte by2, byte by3, char[] arrc, int n2) {
        if (!(a.v0(by2) || by == -32 && by2 < -96 || by == -19 && by2 >= -96 || a.v0(by3))) {
            arrc[n2] = (char)((by & 15) << 12 | (by2 & 63) << 6 | by3 & 63);
            return;
        }
        throw e5.e();
    }

    public static Bundle d(Parcel parcel, int n2) {
        int n3 = a.x(parcel, n2);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(n4 + n3);
        return bundle;
    }

    public static void d0(byte by, byte by2, char[] arrc, int n2) {
        if (by >= -62 && !a.v0(by2)) {
            arrc[n2] = (char)((by & 31) << 6 | by2 & 63);
            return;
        }
        throw e5.e();
    }

    public static <T extends Parcelable> T e(Parcel parcel, int n2, Parcelable.Creator<T> creator) {
        int n3 = a.x(parcel, n2);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        Parcelable parcelable = creator.createFromParcel(parcel);
        parcel.setDataPosition(n4 + n3);
        return (T)parcelable;
    }

    public static void e0(Bundle bundle, Object object) {
        if (object instanceof Double) {
            bundle.putDouble("value", ((Double)object).doubleValue());
            return;
        }
        if (object instanceof Long) {
            bundle.putLong("value", ((Long)object).longValue());
            return;
        }
        bundle.putString("value", object.toString());
    }

    public static String f(Parcel parcel, int n2) {
        int n3 = a.x(parcel, n2);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(n4 + n3);
        return string;
    }

    public static void f0(Parcel parcel, int n2, int n3) {
        int n4 = a.x(parcel, n2);
        if (n4 == n3) {
            return;
        }
        String string = Integer.toHexString(n4);
        StringBuilder stringBuilder = new StringBuilder(46 + String.valueOf(string).length());
        stringBuilder.append("Expected size ");
        stringBuilder.append(n3);
        stringBuilder.append(" got ");
        stringBuilder.append(n4);
        stringBuilder.append(" (0x");
        stringBuilder.append(string);
        stringBuilder.append(")");
        throw new b(stringBuilder.toString(), parcel);
    }

    public static ArrayList<String> g(Parcel parcel, int n2) {
        int n3 = a.x(parcel, n2);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        ArrayList arrayList = parcel.createStringArrayList();
        parcel.setDataPosition(n4 + n3);
        return arrayList;
    }

    public static <T extends Parcelable> void g0(Parcel parcel, T t2, int n2) {
        int n3 = parcel.dataPosition();
        parcel.writeInt(1);
        int n4 = parcel.dataPosition();
        t2.writeToParcel(parcel, n2);
        int n5 = parcel.dataPosition();
        parcel.setDataPosition(n3);
        parcel.writeInt(n5 - n4);
        parcel.setDataPosition(n5);
    }

    public static <T> T[] h(Parcel parcel, int n2, Parcelable.Creator<T> creator) {
        int n3 = a.x(parcel, n2);
        int n4 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        Object[] arrobject = parcel.createTypedArray(creator);
        parcel.setDataPosition(n4 + n3);
        return arrobject;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void h0(e6 var0, StringBuilder var1_1, int var2_2) {
        var3_3 = new HashMap();
        var4_4 = new HashMap();
        var5_5 = new TreeSet();
        for (Method var40_9 : var0.getClass().getDeclaredMethods()) {
            var4_4.put((Object)var40_9.getName(), (Object)var40_9);
            if (var40_9.getParameterTypes().length != 0) continue;
            var3_3.put((Object)var40_9.getName(), (Object)var40_9);
            if (!var40_9.getName().startsWith("get")) continue;
            var5_5.add((Object)var40_9.getName());
        }
        for (String var14_11 : var5_5) {
            block12 : {
                block19 : {
                    block13 : {
                        block18 : {
                            block17 : {
                                block16 : {
                                    block15 : {
                                        block14 : {
                                            block11 : {
                                                var15_12 = var14_11.startsWith("get") != false ? var14_11.substring(3) : var14_11;
                                                var16_13 = var15_12.endsWith("List");
                                                var17_14 = 1;
                                                if (!var16_13 || var15_12.endsWith("OrBuilderList") || var15_12.equals((Object)"List")) break block11;
                                                var36_33 = String.valueOf((Object)var15_12.substring(0, var17_14).toLowerCase());
                                                var37_34 = String.valueOf((Object)var15_12.substring(var17_14, -4 + var15_12.length()));
                                                var38_35 = var37_34.length() != 0 ? var36_33.concat(var37_34) : new String(var36_33);
                                                var39_36 = (Method)var3_3.get((Object)var14_11);
                                                if (var39_36 == null || !var39_36.getReturnType().equals(List.class)) break block11;
                                                var27_24 = a.Y(var38_35);
                                                var26_23 = u4.q((Method)var39_36, (Object)var0, (Object[])new Object[0]);
                                                break block12;
                                            }
                                            if (var15_12.endsWith("Map") && !var15_12.equals((Object)"Map")) {
                                                var32_29 = String.valueOf((Object)var15_12.substring(0, var17_14).toLowerCase());
                                                var33_30 = String.valueOf((Object)var15_12.substring(var17_14, var15_12.length() - 3));
                                                var34_31 = var33_30.length() != 0 ? var32_29.concat(var33_30) : new String(var32_29);
                                                var35_32 = (Method)var3_3.get((Object)var14_11);
                                                if (var35_32 != null && var35_32.getReturnType().equals(Map.class) && !var35_32.isAnnotationPresent(Deprecated.class) && Modifier.isPublic((int)var35_32.getModifiers())) {
                                                    a.l0(var1_1, var2_2, a.Y(var34_31), u4.q((Method)var35_32, (Object)var0, (Object[])new Object[0]));
                                                    continue;
                                                }
                                            }
                                            if (var4_4.get((Object)(var18_15 = var15_12.length() != 0 ? "set".concat(var15_12) : "set")) == null || var15_12.endsWith("Bytes") && var3_3.containsKey((Object)(var31_28 = (var30_27 = String.valueOf((Object)var15_12.substring(0, -5 + var15_12.length()))).length() != 0 ? "get".concat(var30_27) : "get"))) continue;
                                            var19_16 = String.valueOf((Object)var15_12.substring(0, var17_14).toLowerCase());
                                            var20_17 = String.valueOf((Object)var15_12.substring(var17_14));
                                            var21_18 = var20_17.length() != 0 ? var19_16.concat(var20_17) : new String(var19_16);
                                            var22_19 = var15_12.length() != 0 ? "get".concat(var15_12) : "get";
                                            var23_20 = (Method)var3_3.get((Object)var22_19);
                                            var24_21 = var15_12.length() != 0 ? "has".concat(var15_12) : "has";
                                            var25_22 = (Method)var3_3.get((Object)var24_21);
                                            if (var23_20 == null) continue;
                                            var26_23 = u4.q((Method)var23_20, (Object)var0, (Object[])new Object[0]);
                                            if (var25_22 != null) break block13;
                                            if (!(var26_23 instanceof Boolean)) break block14;
                                            if (((Boolean)var26_23).booleanValue()) ** GOTO lbl-1000
                                            ** GOTO lbl-1000
                                        }
                                        if (!(var26_23 instanceof Integer)) break block15;
                                        if ((Integer)var26_23 != 0) ** GOTO lbl-1000
                                        ** GOTO lbl-1000
                                    }
                                    if (!(var26_23 instanceof Float)) break block16;
                                    if (((Float)var26_23).floatValue() != 0.0f) ** GOTO lbl-1000
                                    ** GOTO lbl-1000
                                }
                                if (!(var26_23 instanceof Double)) break block17;
                                if ((Double)var26_23 != 0.0) ** GOTO lbl-1000
                                ** GOTO lbl-1000
                            }
                            if (!(var26_23 instanceof String)) break block18;
                            var29_26 = "";
                            ** GOTO lbl66
                        }
                        if (var26_23 instanceof t3) {
                            var29_26 = t3.f;
lbl66: // 2 sources:
                            var28_25 = var26_23.equals((Object)var29_26);
                        } else if (var26_23 instanceof e6 != false ? var26_23 == ((e6)var26_23).h() : var26_23 instanceof Enum != false && ((Enum)var26_23).ordinal() == 0) lbl-1000: // 5 sources:
                        {
                            var28_25 = true;
                        } else lbl-1000: // 5 sources:
                        {
                            var28_25 = false;
                        }
                        if (var28_25) {
                            var17_14 = 0;
                        }
                        break block19;
                    }
                    var17_14 = ((Boolean)u4.q((Method)var25_22, (Object)var0, (Object[])new Object[0])).booleanValue() ? 1 : 0;
                }
                if (var17_14 == 0) continue;
                var27_24 = a.Y(var21_18);
            }
            a.l0(var1_1, var2_2, var27_24, var26_23);
        }
        if (var0 instanceof u4.d && (var12_37 = ((u4.d)var0).zzc.l()).hasNext()) {
            (u4.c)((Map.Entry)var12_37.next()).getKey();
            throw new NoSuchMethodError();
        }
        var10_38 = ((u4)var0).zzb;
        var11_39 = 0;
        if (var10_38 == null) return;
        while (var11_39 < var10_38.a) {
            a.l0(var1_1, var2_2, String.valueOf((int)(var10_38.b[var11_39] >>> 3)), var10_38.c[var11_39]);
            ++var11_39;
        }
    }

    public static void i(Parcel parcel, int n2) {
        if (parcel.dataPosition() == n2) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(n2);
        throw new b(stringBuilder.toString(), parcel);
    }

    public static void i0(d.c.a.d.h.b.s3 s32, SQLiteDatabase sQLiteDatabase) {
        if (s32 != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                s32.i.a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                s32.i.a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                s32.i.a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                s32.i.a("Failed to turn on database write permission for owner");
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    public static boolean j(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    /*
     * Exception decompiling
     */
    public static void j0(d.c.a.d.h.b.s3 var0, SQLiteDatabase var1_1, String var2_2, String var3_3, String var4_4, String[] var5_5) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 10[FORLOOP]
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

    public static <TResult> h<TResult> k(Exception exception) {
        f0 f02 = new f0();
        f02.q(exception);
        return f02;
    }

    public static void k0(h<?> h2, m m2) {
        Executor executor = d.c.a.d.j.j.b;
        h2.e(executor, (e)m2);
        h2.d(executor, (d)m2);
        h2.a(executor, (d.c.a.d.j.b)m2);
    }

    public static <TResult> h<TResult> l(TResult TResult) {
        f0 f02 = new f0();
        f02.r(TResult);
        return f02;
    }

    public static final void l0(StringBuilder stringBuilder, int n2, String string, Object object) {
        if (object instanceof List) {
            Iterator iterator = ((List)object).iterator();
            while (iterator.hasNext()) {
                a.l0(stringBuilder, n2, string, iterator.next());
            }
            return;
        }
        if (object instanceof Map) {
            Iterator iterator = ((Map)object).entrySet().iterator();
            while (iterator.hasNext()) {
                a.l0(stringBuilder, n2, string, (Object) iterator.next());
            }
            return;
        }
        stringBuilder.append('\n');
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(string);
        if (object instanceof String) {
            stringBuilder.append(": \"");
            String string2 = (String)object;
            stringBuilder.append(a.X((t3)new z3(string2.getBytes(w4.a))));
            stringBuilder.append('\"');
            return;
        }
        if (object instanceof t3) {
            stringBuilder.append(": \"");
            stringBuilder.append(a.X((t3)object));
            stringBuilder.append('\"');
            return;
        }
        if (object instanceof u4) {
            stringBuilder.append(" {");
            a.h0((e6)((u4)object), stringBuilder, n2 + 2);
            stringBuilder.append("\n");
            while (n3 < n2) {
                stringBuilder.append(' ');
                ++n3;
            }
            stringBuilder.append("}");
            return;
        }
        if (object instanceof Map.Entry) {
            stringBuilder.append(" {");
            Map.Entry entry = (Map.Entry)object;
            int n5 = n2 + 2;
            a.l0(stringBuilder, n5, "key", entry.getKey());
            a.l0(stringBuilder, n5, "value", entry.getValue());
            stringBuilder.append("\n");
            while (n3 < n2) {
                stringBuilder.append(' ');
                ++n3;
            }
            stringBuilder.append("}");
            return;
        }
        stringBuilder.append(": ");
        stringBuilder.append(object.toString());
    }

    public static String m(PowerManager.WakeLock wakeLock, String string) {
        String string2;
        String string3 = String.valueOf(String.valueOf((long)Process.myPid() << 32 | (long)System.identityHashCode(wakeLock)));
        boolean bl = TextUtils.isEmpty(null);
        String string4 = null;
        if (bl) {
            string4 = "";
        }
        if ((string2 = String.valueOf(string4)).length() != 0) {
            return string3.concat(string2);
        }
        return string3;
    }

    public static boolean m0(byte by) {
        return by >= 0;
    }

    public static boolean n() {
        return Build.VERSION.SDK_INT >= 20;
    }

    public static void n0(Parcel parcel, int n2, int n3) {
        if (n2 == n3) {
            return;
        }
        String string = Integer.toHexString(n2);
        StringBuilder stringBuilder = new StringBuilder(46 + String.valueOf(string).length());
        stringBuilder.append("Expected size ");
        stringBuilder.append(n3);
        stringBuilder.append(" got ");
        stringBuilder.append(n2);
        stringBuilder.append(" (0x");
        stringBuilder.append(string);
        stringBuilder.append(")");
        throw new b(stringBuilder.toString(), parcel);
    }

    public static boolean o() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static int o0(byte[] arrby, int n2, s3 s32) {
        int n3 = n2 + 1;
        long l2 = arrby[n2];
        if (l2 >= 0L) {
            s32.b = l2;
            return n3;
        }
        long l3 = l2 & 127L;
        int n5 = n3 + 1;
        byte by = arrby[n3];
        long l4 = l3 | (long)(by & 127) << 7;
        int n6 = 7;
        while (by < 0) {
            int n7 = n5 + 1;
            byte by2 = arrby[n5];
            l4 |= (long)(by2 & 127) << (n6 += 7);
            by = by2;
            n5 = n7;
        }
        s32.b = l4;
        return n5;
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static long p0(byte[] arrby, int n2) {
        return 255L & (long)arrby[n2] | (255L & (long)arrby[n2 + 1]) << 8 | (255L & (long)arrby[n2 + 2]) << 16 | (255L & (long)arrby[n2 + 3]) << 24 | (255L & (long)arrby[n2 + 4]) << 32 | (255L & (long)arrby[n2 + 5]) << 40 | (255L & (long)arrby[n2 + 6]) << 48 | (255L & (long)arrby[n2 + 7]) << 56;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean q(Context context, int n2) {
        PackageInfo packageInfo;
        if (!a.z(context, n2, "com.google.android.gms")) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            if (!Log.isLoggable("UidVerifier", 3)) return false;
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
        j j2 = j.a((Context)context);
        Objects.requireNonNull(j2);
        if (packageInfo == null) {
            return false;
        }
        if (j.d((PackageInfo)packageInfo, (boolean)false)) {
            return true;
        }
        if (!j.d((PackageInfo)packageInfo, (boolean)true)) return false;
        if (i.a((Context)j2.a)) {
            return true;
        }
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        return false;
    }

    public static void q0(Parcel parcel, int n2) {
        int n3 = parcel.dataPosition();
        int n5 = n3 - n2;
        parcel.setDataPosition(n2 - 4);
        parcel.writeInt(n5);
        parcel.setDataPosition(n3);
    }

    @TargetApi(value=20)
    public static boolean r(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (b == null) {
            boolean bl = a.n() && packageManager.hasSystemFeature("android.hardware.type.watch");
            b = bl;
        }
        return b;
    }

    public static void r0(Parcel parcel, int n2, int n3) {
        if (n3 >= 65535) {
            parcel.writeInt(n2 | -65536);
            parcel.writeInt(n3);
            return;
        }
        parcel.writeInt(n2 | n3 << 16);
    }

    @TargetApi(value=26)
    public static boolean s(Context context) {
        block4 : {
            block5 : {
                if (!a.r(context)) break block4;
                boolean bl = Build.VERSION.SDK_INT >= 24;
                if (!bl) break block5;
                if (c == null) {
                    boolean bl2 = a.o() && context.getPackageManager().hasSystemFeature("cn.google");
                    c = bl2;
                }
                if (!c.booleanValue() || a.p()) break block4;
            }
            return true;
        }
        return false;
    }

    public static int s0(byte[] arrby, int n2, s3 s32) {
        int n3 = a.R(arrby, n2, s32);
        int n5 = s32.a;
        if (n5 >= 0) {
            if (n5 == 0) {
                s32.c = "";
                return n3;
            }
            s32.c = new String(arrby, n3, n5, w4.a);
            return n3 + n5;
        }
        throw e5.b();
    }

    public static boolean t(Parcel parcel, int n2) {
        a.f0(parcel, n2, 4);
        return parcel.readInt() != 0;
    }

    public static int t0(byte[] arrby, int n2, s3 s32) {
        int n3 = a.R(arrby, n2, s32);
        int n5 = s32.a;
        if (n5 >= 0) {
            if (n5 == 0) {
                s32.c = "";
                return n3;
            }
            s32.c = n7.a.c(arrby, n3, n5);
            return n3 + n5;
        }
        throw e5.b();
    }

    public static IBinder u(Parcel parcel, int n2) {
        int n3 = a.x(parcel, n2);
        int n5 = parcel.dataPosition();
        if (n3 == 0) {
            return null;
        }
        IBinder iBinder = parcel.readStrongBinder();
        parcel.setDataPosition(n5 + n3);
        return iBinder;
    }

    public static int u0(byte[] arrby, int n2, s3 s32) {
        int n3 = a.R(arrby, n2, s32);
        int n5 = s32.a;
        if (n5 >= 0) {
            if (n5 <= arrby.length - n3) {
                if (n5 == 0) {
                    s32.c = t3.f;
                    return n3;
                }
                s32.c = t3.l((byte[])arrby, (int)n3, (int)n5);
                return n3 + n5;
            }
            throw e5.a();
        }
        throw e5.b();
    }

    public static int v(Parcel parcel, int n2) {
        a.f0(parcel, n2, 4);
        return parcel.readInt();
    }

    public static boolean v0(byte by) {
        return by > -65;
    }

    public static long w(Parcel parcel, int n2) {
        a.f0(parcel, n2, 8);
        return parcel.readLong();
    }

    public static int x(Parcel parcel, int n2) {
        if ((n2 & -65536) != -65536) {
            return 65535 & n2 >> 16;
        }
        return parcel.readInt();
    }

    public static void y(Parcel parcel, int n2) {
        parcel.setDataPosition(a.x(parcel, n2) + parcel.dataPosition());
    }

    @TargetApi(value=19)
    public static boolean z(Context context, int n2, String string) {
        d.c.a.d.d.q.b b2 = c.a((Context)context);
        Objects.requireNonNull(b2);
        try {
            ((AppOpsManager)b2.a.getSystemService("appops")).checkPackage(n2, string);
            return true;
        }
        catch (SecurityException securityException) {
            return false;
        }
    }
}

