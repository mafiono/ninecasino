/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.text.TextUtils
 *  d.c.a.d.d.m.m
 *  d.c.a.d.j.h
 *  d.c.a.d.j.i
 *  d.c.b.l.k
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package d.c.b.t;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import d.c.a.d.j.f0;
import d.c.b.i;
import d.c.b.t.b;
import d.c.b.t.c;
import d.c.b.t.d;
import d.c.b.t.e;
import d.c.b.t.f;
import d.c.b.t.g;
import d.c.b.t.j;
import d.c.b.t.k;
import d.c.b.t.l;
import d.c.b.t.m;
import d.c.b.t.n;
import d.c.b.t.o;
import d.c.b.t.p.a;
import d.c.b.t.p.c;
import d.c.b.t.p.d;
import d.c.b.x.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f
implements g {
    public static final Object l = new Object();
    public static final ThreadFactory m = new ThreadFactory(){
        public final java.util.concurrent.atomic.AtomicInteger a;
        {
            this.a = new java.util.concurrent.atomic.AtomicInteger(1);
        }

        public Thread newThread(Runnable runnable) {
            Object[] arrobject = new Object[]{this.a.getAndIncrement()};
            return new Thread(runnable, String.format("firebase-installations-executor-%d", arrobject));
        }
    };
    public final d.c.b.c a;
    public final d.c.b.t.q.c b;
    public final d.c.b.t.p.c c;
    public final o d;
    public final d.c.b.t.p.b e;
    public final m f;
    public final Object g;
    public final ExecutorService h;
    public final ExecutorService i;
    public String j;
    public final List<n> k;

    public f(d.c.b.c c3, d.c.b.s.a<h> a2, d.c.b.s.a<d.c.b.q.d> a3) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = m;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        c3.a();
        d.c.b.t.q.c c4 = new d.c.b.t.q.c(c3.a, a2, a3);
        d.c.b.t.p.c c6 = new d.c.b.t.p.c(c3);
        o o2 = o.c();
        d.c.b.t.p.b b3 = new d.c.b.t.p.b(c3);
        m m2 = new m();
        this.g = new Object();
        this.k = new ArrayList();
        this.a = c3;
        this.b = c4;
        this.c = c6;
        this.d = o2;
        this.e = b3;
        this.f = m2;
        this.h = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), threadFactory);
        this.i = threadPoolExecutor2;
    }

    public static f g() {
        d.c.b.c c3 = o.c.b.c.b();
        o.c.a.d.d.m.m.b((boolean)true, (Object)"Null is not a valid value of FirebaseApp.");
        c3.a();
        return (f)c3.d.a(g.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public d.c.a.d.j.h<l> a(boolean bl) {
        Object object;
        this.i();
        d.c.a.d.j.i i2 = new d.c.a.d.j.i();
        j j2 = new j(this.d, (d.c.a.d.j.i<l>)i2);
        Object object2 = object = this.g;
        synchronized (object2) {
            this.k.add(j2);
        }
        f0 f02 = i2.a;
        this.h.execute(new d(this, bl));
        return f02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(boolean bl) {
        b b3;
        d.c.b.t.p.d d3;
        block9 : {
            Object object;
            Object object2 = object = l;
            synchronized (object2) {
                d.c.b.c c3 = this.a;
                c3.a();
                b3 = b.a(c3.a, "generatefid.lock");
                d3 = this.c.b();
                if (d3.i()) {
                    String string = this.j(d3);
                    d.c.b.t.p.c c4 = this.c;
                    a.b b4 = (a.b)d3.k();
                    b4.a = string;
                    b4.b(c.a.g);
                    d3 = b4.a();
                    c4.a(d3);
                }
                // MONITOREXIT [1, 4] lbl16 : w: MONITOREXIT : var14_3
                if (!bl) break block9;
            }
            a.b b6 = (a.b)d3.k();
            b6.c = null;
            d3 = b6.a();
        }
        this.m(d3);
        this.i.execute(new e(this, bl));
        return;
        {
            finally {
                if (b3 != null) {
                    b3.b();
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final d.c.b.t.p.d c(d.c.b.t.p.d var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl237.1 : ALOAD : trying to set 1 previously set to 0
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public d.c.a.d.j.h<String> d() {
        Object object;
        this.i();
        f f2 = this;
        // MONITORENTER : f2
        String string = this.j;
        // MONITOREXIT : f2
        if (string != null) {
            return o.c.a.d.b.a.l(string);
        }
        d.c.a.d.j.i i2 = new d.c.a.d.j.i();
        k k4 = new k((d.c.a.d.j.i<String>)i2);
        Object object2 = object = this.g;
        // MONITORENTER : object2
        this.k.add(k4);
        // MONITOREXIT : object2
        f0 f02 = i2.a;
        this.h.execute(new c(this));
        return f02;
    }

    public String e() {
        d.c.b.c c3 = this.a;
        c3.a();
        return c3.c.a;
    }

    public String f() {
        d.c.b.c c3 = this.a;
        c3.a();
        return c3.c.b;
    }

    public String h() {
        d.c.b.c c3 = this.a;
        c3.a();
        return c3.c.g;
    }

    public final void i() {
        o.c.a.d.d.m.m.f((String)this.f(), (Object)"Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.c.a.d.d.m.m.f((String)this.h(), (Object)"Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.c.a.d.d.m.m.f((String)this.e(), (Object)"Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String string = this.f();
        o.c.a.d.d.m.m.b((boolean)string.contains(":"), (Object)"Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String string2 = this.e();
        o.c.a.d.d.m.m.b((boolean)o.c.matcher(string2).matches(), (Object)"Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final String j(d.c.b.t.p.d d3) {
        SharedPreferences sharedPreferences;
        boolean bl;
        SharedPreferences sharedPreferences2;
        d.c.b.c c3 = this.a;
        c3.a();
        if (!c3.b.equals("CHIME_ANDROID_SDK")) {
            if (!this.a.g()) return this.f.a();
        }
        if (!(bl = ((d.c.b.t.p.a)d3).c == c.a.e)) {
            return this.f.a();
        }
        d.c.b.t.p.b b3 = this.e;
        SharedPreferences sharedPreferences3 = sharedPreferences = b3.a;
        // MONITORENTER : sharedPreferences3
        SharedPreferences sharedPreferences4 = sharedPreferences2 = b3.a;
        // MONITORENTER : sharedPreferences4
        String string = b3.a.getString("|S|id", null);
        // MONITOREXIT : sharedPreferences4
        if (string == null) {
            string = b3.a();
        }
        // MONITOREXIT : sharedPreferences3
        if (!TextUtils.isEmpty(string)) return string;
        return this.f.a();
    }

    /*
     * Exception decompiling
     */
    public final d.c.b.t.p.d k(d.c.b.t.p.d var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(Exception exception) {
        Object object;
        Object object2 = object = this.g;
        synchronized (object2) {
            Iterator iterator = this.k.iterator();
            while (iterator.hasNext()) {
                if (!((n)iterator.next()).a(exception)) continue;
                iterator.remove();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m(d.c.b.t.p.d d3) {
        Object object;
        Object object2 = object = this.g;
        synchronized (object2) {
            Iterator iterator = this.k.iterator();
            while (iterator.hasNext()) {
                if (!((n)iterator.next()).b(d3)) continue;
                iterator.remove();
            }
            return;
        }
    }
}

