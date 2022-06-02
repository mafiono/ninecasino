/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  d.c.a.d.j.h
 *  d.c.b.m.e.k.r0
 *  d.c.b.m.e.s.d
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Future
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package d.c.b.m.e.k;

import android.content.Context;
import android.util.Log;
import d.c.b.c;
import d.c.b.m.e.k.e0;
import d.c.b.m.e.k.h;
import d.c.b.m.e.k.i;
import d.c.b.m.e.k.i0;
import d.c.b.m.e.k.m0;
import d.c.b.m.e.k.o;
import d.c.b.m.e.k.r0;
import d.c.b.m.e.k.t;
import d.c.b.m.e.s.d;
import d.c.b.m.e.s.e;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class g0 {
    public final Context a;
    public final c b;
    public final m0 c;
    public final long d;
    public i0 e;
    public i0 f;
    public t g;
    public final r0 h;
    public final d.c.b.m.e.j.a i;
    public final d.c.b.m.e.i.a j;
    public ExecutorService k;
    public h l;
    public d.c.b.m.e.a m;

    public g0(c c2, r0 r02, d.c.b.m.e.a a2, m0 m02, d.c.b.m.e.j.a a3, d.c.b.m.e.i.a a4, ExecutorService executorService) {
        this.b = c2;
        this.c = m02;
        c2.a();
        this.a = c2.a;
        this.h = r02;
        this.m = a2;
        this.i = a3;
        this.j = a4;
        this.k = executorService;
        this.l = new h(executorService);
        this.d = System.currentTimeMillis();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static d.c.a.d.j.h a(g0 g02, e e2) {
        Throwable throwable22222;
        block10 : {
            Object object;
            block9 : {
                d.c.b.m.e.b b2 = d.c.b.m.e.b.a;
                g02.l.a();
                g02.e.a();
                b2.b("Initialization marker file created.");
                t t2 = g02.g;
                h h2 = t2.e;
                h2.b(new i(h2, new o(t2)));
                g02.i.a(new e0(g02));
                d d3 = (d)e2;
                try {
                    d.c.b.m.e.s.i.e e3 = d3.c();
                    if (!e3.b().a) {
                        b2.b("Collection of crash reports disabled in Crashlytics settings.");
                        object = d.c.a.d.b.a.k(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    } else {
                        if (!g02.g.h(e3.a().a)) {
                            b2.b("Could not finalize previous sessions.");
                        }
                        object = g02.g.u(1.0f, d3.a());
                    }
                    break block9;
                }
                catch (Throwable throwable22222) {
                    break block10;
                }
                catch (Exception exception) {
                    if (b2.a(6)) {
                        Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", exception);
                    }
                    object = d.c.a.d.b.a.k(exception);
                }
            }
            g02.c();
            return object;
        }
        g02.c();
        throw throwable22222;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void b(final e e2) {
        d.c.b.m.e.b b2 = d.c.b.m.e.b.a;
        Runnable runnable = new Runnable(){

            public void run() {
                g0.a(g0.this, e2);
            }
        };
        Future future = this.k.submit(runnable);
        b2.b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            future.get(4L, TimeUnit.SECONDS);
            return;
        }
        catch (TimeoutException timeoutException) {
            void var5_6;
            String string;
            block4 : {
                if (!b2.a(6)) return;
                string = "Crashlytics timed out during initialization.";
                break block4;
                catch (ExecutionException executionException) {
                    if (!b2.a(6)) return;
                    string = "Problem encountered during Crashlytics initialization.";
                    break block4;
                }
                catch (InterruptedException interruptedException) {
                    if (!b2.a(6)) return;
                    string = "Crashlytics was interrupted during initialization.";
                }
            }
            Log.e("FirebaseCrashlytics", string, (Throwable)var5_6);
            return;
        }
    }

    public void c() {
        this.l.b(new Callable<Boolean>(){

            public Object call() {
                d.c.b.m.e.b b2 = d.c.b.m.e.b.a;
                try {
                    boolean bl = g0.this.e.b().delete();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Initialization marker file removed: ");
                    stringBuilder.append(bl);
                    b2.b(stringBuilder.toString());
                    Boolean bl2 = bl;
                    return bl2;
                }
                catch (Exception exception) {
                    if (b2.a(6)) {
                        Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", exception);
                    }
                    return Boolean.FALSE;
                }
            }
        });
    }

}

