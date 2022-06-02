/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  d.c.a.d.g.f.b0
 *  d.c.a.d.g.f.h
 *  d.c.a.d.g.f.m
 *  d.c.a.d.h.a.a
 *  java.lang.Boolean
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ExecutorService
 */
package d.c.b.k.a;

import android.os.Bundle;
import d.c.a.d.g.f.b0;
import d.c.a.d.g.f.h;
import d.c.a.d.g.f.m;
import d.c.b.k.a.a;
import d.c.b.k.a.c.c;
import d.c.b.k.a.c.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

public class b
implements d.c.b.k.a.a {
    public static volatile d.c.b.k.a.a c;
    public final d.c.a.d.h.a.a a;
    public final Map<String, Object> b;

    public b(d.c.a.d.h.a.a a2) {
        Objects.requireNonNull(a2, "null reference");
        this.a = a2;
        this.b = new ConcurrentHashMap();
    }

    @Override
    public void a(String string, String string2, Object object) {
        if (!c.a(string)) {
            return;
        }
        if (!c.c(string, string2)) {
            return;
        }
        h h2 = this.a.a;
        Objects.requireNonNull(h2);
        b0 b02 = new b0(h2, string, string2, object, true);
        h2.c.execute((Runnable)b02);
    }

    @Override
    public Map<String, Object> b(boolean bl) {
        return this.a.a.b(null, null, bl);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void c(a.c var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl70 : ALOAD : trying to set 1 previously set to 0
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

    @Override
    public void clearConditionalUserProperty(String string, String string2, Bundle bundle) {
        h h2 = this.a.a;
        Objects.requireNonNull(h2);
        m m2 = new m(h2, string, null, null);
        h2.c.execute((Runnable)m2);
    }

    @Override
    public List<a.c> d(String string, String string2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.a.a.e(string, string2)) {
            Objects.requireNonNull((Object)bundle, "null reference");
            a.c c3 = new a.c();
            c3.a = d.c.a.d.b.a.T(bundle, "origin", String.class, null);
            c3.b = d.c.a.d.b.a.T(bundle, "name", String.class, null);
            c3.c = d.c.a.d.b.a.T(bundle, "value", Object.class, null);
            c3.d = d.c.a.d.b.a.T(bundle, "trigger_event_name", String.class, null);
            c3.e = d.c.a.d.b.a.T(bundle, "trigger_timeout", Long.class, 0L);
            c3.f = d.c.a.d.b.a.T(bundle, "timed_out_event_name", String.class, null);
            c3.g = d.c.a.d.b.a.T(bundle, "timed_out_event_params", Bundle.class, null);
            c3.h = d.c.a.d.b.a.T(bundle, "triggered_event_name", String.class, null);
            c3.i = d.c.a.d.b.a.T(bundle, "triggered_event_params", Bundle.class, null);
            c3.j = d.c.a.d.b.a.T(bundle, "time_to_live", Long.class, 0L);
            c3.k = d.c.a.d.b.a.T(bundle, "expired_event_name", String.class, null);
            c3.l = d.c.a.d.b.a.T(bundle, "expired_event_params", Bundle.class, null);
            c3.n = d.c.a.d.b.a.T(bundle, "active", Boolean.class, Boolean.FALSE);
            c3.m = d.c.a.d.b.a.T(bundle, "creation_timestamp", Long.class, 0L);
            c3.o = d.c.a.d.b.a.T(bundle, "triggered_timestamp", Long.class, 0L);
            arrayList.add((Object)c3);
        }
        return arrayList;
    }

    @Override
    public a.a e(String string, a.b b3) {
        Objects.requireNonNull(b3, "null reference");
        if (!c.a(string)) {
            return null;
        }
        boolean bl = !string.isEmpty() && this.b.containsKey(string) && this.b.get(string) != null;
        if (bl) {
            return null;
        }
        d.c.a.d.h.a.a a2 = this.a;
        Object object = "fiam".equals(string) ? new d.c.b.k.a.c.b(a2, b3) : (!"crash".equals(string) && !"clx".equals(string) ? null : new d(a2, b3));
        if (object != null) {
            this.b.put(string, object);
            return new a.a(this, string){};
        }
        return null;
    }

    @Override
    public void f(String string, String string2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (!c.a(string)) {
            return;
        }
        if (!c.b(string2, bundle2)) {
            return;
        }
        if (!c.d(string, string2, bundle2)) {
            return;
        }
        if ("clx".equals(string) && "_ae".equals(string2)) {
            bundle2.putLong("_r", 1L);
        }
        this.a.a.d(string, string2, bundle2, true, true, null);
    }

    @Override
    public int g(String string) {
        return this.a.a.h(string);
    }

}

