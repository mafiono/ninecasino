/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  d.c.a.d.d.p.b
 *  d.c.a.d.j.h
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.HashSet
 *  java.util.Set
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 *  java.util.regex.Pattern
 */
package d.c.b.y.q;

import android.util.Log;
import d.c.a.d.d.p.b;
import d.c.a.d.j.h;
import d.c.b.y.q.e;
import d.c.b.y.q.f;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public class m {
    public static final /* synthetic */ int e;
    public final Set<b<String, f>> a = new HashSet();
    public final Executor b;
    public final e c;
    public final e d;

    public static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public m(Executor executor, e e2, e e3) {
        this.b = executor;
        this.c = e2;
        this.d = e3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static f a(e e2) {
        void var3_8;
        e e3 = e2;
        synchronized (e3) {
            h<f> h2 = e2.c;
            if (h2 != null && h2.n()) {
                return (f)e2.c.j();
            }
        }
        try {
            return e.a(e2.b(), 5L, TimeUnit.SECONDS);
        }
        catch (TimeoutException timeoutException) {
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", (Throwable)var3_8);
        return null;
    }
}

