/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Environment
 *  android.util.Log
 *  d.a.b.a.a
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  d.c.b.m.e.k.y
 *  d.c.b.m.e.m.c
 *  d.c.b.m.e.m.j
 *  d.c.b.m.e.m.k
 *  d.c.b.m.e.m.k$b
 *  d.c.b.m.e.m.l
 *  d.c.b.m.e.m.m
 *  d.c.b.m.e.m.o
 *  d.c.b.m.e.m.r
 *  d.c.b.m.e.m.r$b
 *  d.c.b.m.e.m.s
 *  d.c.b.m.e.s.d
 *  d.c.b.o.i.d
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicInteger
 */
package d.c.b.m.e.k;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Environment;
import android.util.Log;
import d.a.b.a.a;
import d.c.b.m.e.b;
import d.c.b.m.e.k.b1;
import d.c.b.m.e.k.e;
import d.c.b.m.e.k.g;
import d.c.b.m.e.k.h;
import d.c.b.m.e.k.i0;
import d.c.b.m.e.k.j0;
import d.c.b.m.e.k.m0;
import d.c.b.m.e.k.t;
import d.c.b.m.e.k.w0;
import d.c.b.m.e.k.x0;
import d.c.b.m.e.k.y;
import d.c.b.m.e.k.z0;
import d.c.b.m.e.m.c;
import d.c.b.m.e.m.j;
import d.c.b.m.e.m.k;
import d.c.b.m.e.m.l;
import d.c.b.m.e.m.m;
import d.c.b.m.e.m.o;
import d.c.b.m.e.m.r;
import d.c.b.m.e.m.s;
import d.c.b.m.e.m.v;
import d.c.b.m.e.m.w;
import d.c.b.m.e.t.d;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class z
implements Callable<d.c.a.d.j.h<Void>> {
    public final /* synthetic */ Date a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ d.c.b.m.e.s.e d;
    public final /* synthetic */ t e;

    public z(t t2, Date date, Throwable throwable, Thread thread, d.c.b.m.e.s.e e2) {
        this.e = t2;
        this.a = date;
        this.b = throwable;
        this.c = thread;
        this.d = e2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public Object call() {
        d.c.b.m.e.p.c c2;
        void var112_100;
        d.c.b.m.e.p.b b2;
        block32 : {
            int n2;
            block30 : {
                b b3;
                block31 : {
                    int n3;
                    block34 : {
                        block33 : {
                            s s2;
                            Boolean bl;
                            b3 = b.a;
                            long l2 = this.a.getTime() / 1000L;
                            String string = this.e.i();
                            if (string == null) {
                                b3.d("Tried to write a fatal exception while no session was open.");
                                return d.c.a.d.b.a.l(null);
                            }
                            this.e.c.a();
                            x0 x02 = this.e.s;
                            Throwable throwable = this.b;
                            Thread thread = this.c;
                            String string2 = string.replaceAll("-", "");
                            Objects.requireNonNull((Object)x02);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Persisting fatal event for session ");
                            stringBuilder.append(string2);
                            b3.b(stringBuilder.toString());
                            j0 j02 = x02.a;
                            int n4 = j02.a.getResources().getConfiguration().orientation;
                            d.c.b.m.e.t.e e2 = new d.c.b.m.e.t.e(throwable, j02.d);
                            Long l3 = l2;
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = g.h(j02.c.d, j02.a);
                            if (runningAppProcessInfo != null) {
                                boolean bl2 = runningAppProcessInfo.importance != 100;
                                bl = bl2;
                            } else {
                                bl = null;
                            }
                            Boolean bl3 = bl;
                            Integer n5 = n4;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add((Object)j02.c(thread, e2.c, 4));
                            Iterator iterator = Thread.getAllStackTraces().entrySet().iterator();
                            while (iterator.hasNext()) {
                                Thread thread2;
                                Map.Entry entry = (Map.Entry)iterator.next();
                                Object object = entry.getKey();
                                Iterator iterator2 = iterator;
                                Thread thread3 = (Thread)object;
                                if (!thread3.equals(thread)) {
                                    thread2 = thread;
                                    arrayList.add((Object)j02.c(thread3, j02.d.a((StackTraceElement[])entry.getValue()), 0));
                                } else {
                                    thread2 = thread;
                                }
                                thread = thread2;
                                iterator = iterator2;
                            }
                            w w2 = new w(arrayList);
                            v.d.d.a.b.b b4 = j02.a(e2, 4, 8, 0);
                            Long l4 = 0L;
                            String string3 = l4 == null ? " address" : "";
                            if (!string3.isEmpty()) {
                                IllegalStateException illegalStateException = new IllegalStateException(a.m((String)"Missing required properties:", (String)string3));
                                throw illegalStateException;
                            }
                            o o2 = new o("0", "0", l4.longValue(), null);
                            Object[] arrobject = new v.d.d.a.b.a[1];
                            Long l5 = 0L;
                            Long l6 = 0L;
                            String string4 = j02.c.d;
                            Objects.requireNonNull((Object)string4, "Null name");
                            String string5 = j02.c.b;
                            String string6 = l5 == null ? " baseAddress" : "";
                            if (l6 == null) {
                                string6 = a.m((String)string6, (String)" size");
                            }
                            if (!string6.isEmpty()) throw new IllegalStateException(a.m((String)"Missing required properties:", (String)string6));
                            m m2 = new m(l5.longValue(), l6.longValue(), string4, string5, null);
                            arrobject[0] = m2;
                            w w3 = new w(Arrays.asList(arrobject));
                            l l7 = new l(w2, b4, (v.d.d.a.b.c)o2, w3, null);
                            String string7 = n5 == null ? " uiOrientation" : "";
                            if (!string7.isEmpty()) throw new IllegalStateException(a.m((String)"Missing required properties:", (String)string7));
                            int n6 = n5;
                            Object object = new k((v.d.d.a.b)l7, null, bl3, n6, null);
                            e e3 = t.a(j02.a);
                            Float f2 = e3.a;
                            Double d3 = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
                            int n7 = e3.b();
                            boolean bl4 = g.l(j02.a);
                            long l8 = g.o();
                            Context context = j02.a;
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                            long l9 = l8 - memoryInfo.availMem;
                            long l10 = g.a(Environment.getDataDirectory().getPath());
                            r.b b6 = new r.b();
                            b6.a = d3;
                            b6.b = n7;
                            b6.c = bl4;
                            b6.d = n4;
                            b6.e = l9;
                            b6.f = l10;
                            v.d.d.b b7 = b6.a();
                            String string8 = " timestamp";
                            String string9 = l3 == null ? string8 : "";
                            if (!string9.isEmpty()) throw new IllegalStateException(a.m((String)"Missing required properties:", (String)string9));
                            Long l11 = l3;
                            String string10 = x02.d.c.c();
                            if (string10 != null) {
                                s2 = new s(string10, null);
                            } else {
                                b3.b("No log data to include with this event.");
                                s2 = null;
                            }
                            Map map = Collections.unmodifiableMap(x02.e.b);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.ensureCapacity(map.size());
                            for (Map.Entry entry : map.entrySet()) {
                                String string11 = (String)entry.getKey();
                                Objects.requireNonNull((Object)string11, "Null key");
                                String string12 = (String)entry.getValue();
                                Objects.requireNonNull((Object)string12, "Null value");
                                arrayList2.add(new c(string11, string12, null));
                            }
                            Collections.sort(arrayList2, w0.a);
                            if (!arrayList2.isEmpty()) {
                                v.d.d.a.a a2 = object.e();
                                w w4 = new w(arrayList2);
                                k.b b8 = (k.b)a2;
                                b8.b = w4;
                                object = b8.a();
                            }
                            k k2 = object;
                            d.c.b.m.e.o.g g2 = x02.b;
                            if (l11 != null) {
                                string8 = "";
                            }
                            if (!string8.isEmpty()) throw new IllegalStateException(a.m((String)"Missing required properties:", (String)string8));
                            j j2 = new j(l11.longValue(), "crash", (v.d.d.a)k2, b7, (v.d.d.c)s2, null);
                            int n8 = ((d.c.b.m.e.s.d)g2.f).c().a().a;
                            File file = g2.h(string2);
                            Objects.requireNonNull((Object)d.c.b.m.e.o.g.i);
                            String string13 = ((d.c.b.o.i.d)d.c.b.m.e.m.x.h.a).a(j2);
                            int n9 = g2.a.getAndIncrement();
                            Locale locale = Locale.US;
                            Object[] arrobject2 = new Object[]{n9};
                            String string14 = a.n((String)"event", (String)String.format(locale, "%010d", arrobject2), (String)"_");
                            try {
                                d.c.b.m.e.o.g.l(new File(file, string14), string13);
                            }
                            catch (IOException iOException) {
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("Could not persist event for session ");
                                stringBuilder2.append(string2);
                                b3.c(stringBuilder2.toString(), iOException);
                            }
                            List<File> list = d.c.b.m.e.o.g.g(file, d.c.b.m.e.o.c.a);
                            Collections.sort(list, d.c.b.m.e.o.d.a);
                            int n10 = list.size();
                            for (File file2 : list) {
                                if (n10 <= n8) break;
                                d.c.b.m.e.o.g.k(file2);
                                --n10;
                            }
                            t t2 = this.e;
                            Thread thread4 = this.c;
                            Throwable throwable2 = this.b;
                            Objects.requireNonNull((Object)t2);
                            File file3 = t2.l();
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(string);
                            stringBuilder3.append("SessionCrash");
                            b2 = new d.c.b.m.e.p.b(file3, stringBuilder3.toString());
                            c2 = d.c.b.m.e.p.c.n(b2);
                            n2 = 4;
                            d.c.b.m.e.p.c c3 = c2;
                            try {
                                try {
                                    t2.x(c3, thread4, throwable2, l2, "crash", true);
                                    break block30;
                                }
                                catch (Exception exception) {
                                    break block31;
                                }
                            }
                            catch (Throwable throwable3) {
                                break block32;
                            }
                            catch (Throwable throwable4) {
                                break block33;
                            }
                            catch (Exception exception) {
                                n3 = 4;
                                break block34;
                            }
                            catch (Throwable throwable5) {
                                b2 = null;
                            }
                        }
                        c2 = null;
                        break block32;
                        catch (Exception exception) {
                            n3 = 4;
                            b2 = null;
                        }
                    }
                    n2 = n3;
                    c2 = null;
                }
                if (b3.a(6)) {
                    void var88_96;
                    Log.e("FirebaseCrashlytics", "An error occurred in the fatal exception logger", (Throwable)var88_96);
                }
            }
            g.g(c2, "Failed to flush to session begin file.");
            g.c(b2, "Failed to close fatal exception file output stream.");
            this.e.g(this.a.getTime());
            d.c.b.m.e.s.i.e e4 = ((d.c.b.m.e.s.d)this.d).c();
            int n11 = e4.a().a;
            Objects.requireNonNull((Object)e4.a());
            this.e.f(n11, false);
            t.a(this.e);
            t t4 = this.e;
            File file = t4.m();
            File file4 = t4.k();
            Comparator<File> comparator = t.A;
            ArrayList arrayList = new ArrayList();
            Object[] arrobject = file.listFiles();
            FilenameFilter filenameFilter = b1.a;
            Object[] arrobject3 = file4.listFiles(filenameFilter);
            if (arrobject == null) {
                arrobject = new File[]{};
            }
            if (arrobject3 == null) {
                arrobject3 = new File[]{};
            }
            arrayList.addAll(Arrays.asList(arrobject));
            arrayList.addAll(Arrays.asList(arrobject3));
            int n12 = 4 - b1.c((List<File>)arrayList, n2, comparator);
            int n13 = n12 - b1.b(t4.n(), filenameFilter, n12, comparator);
            b1.b(t4.l(), t.y, n13, comparator);
            if (!this.e.b.a()) {
                return d.c.a.d.b.a.l(null);
            }
            Executor executor = this.e.e.a;
            return ((d.c.b.m.e.s.d)this.d).a().p(executor, (d.c.a.d.j.g)new y(this, executor));
        }
        g.g(c2, "Failed to flush to session begin file.");
        g.c(b2, "Failed to close fatal exception file output stream.");
        throw var112_100;
    }
}

