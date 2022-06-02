/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Log
 *  c.e.a
 *  com.google.firebase.iid.FirebaseInstanceId
 *  d.a.b.a.a
 *  d.c.a.d.j.f0
 *  d.c.a.d.j.h
 *  d.c.a.d.j.i
 *  java.io.IOException
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayDeque
 *  java.util.Map
 *  java.util.Objects
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package d.c.b.w;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import d.c.a.d.b.a;
import d.c.a.d.j.f0;
import d.c.a.d.j.h;
import d.c.a.d.j.i;
import d.c.b.r.n;
import d.c.b.r.o;
import d.c.b.r.q;
import d.c.b.w.c0;
import d.c.b.w.w;
import d.c.b.w.x;
import d.c.b.w.y;
import d.c.b.w.z;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class b0 {
    public static final long i = TimeUnit.HOURS.toSeconds(8L);
    public static final /* synthetic */ int j;
    public final FirebaseInstanceId a;
    public final Context b;
    public final q c;
    public final n d;
    public final Map<String, ArrayDeque<i<Void>>> e = new c.e.a();
    public final ScheduledExecutorService f;
    public boolean g = false;
    public final z h;

    public b0(FirebaseInstanceId firebaseInstanceId, q q2, z z2, n n2, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.a = firebaseInstanceId;
        this.c = q2;
        this.h = z2;
        this.d = n2;
        this.b = context;
        this.f = scheduledExecutorService;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static <T> T a(h<T> h2) {
        void var3_4;
        T t2;
        try {
            t2 = a.b(h2, 30L, TimeUnit.SECONDS);
        }
        catch (TimeoutException timeoutException) {
            throw new IOException("SERVICE_NOT_AVAILABLE", (Throwable)var3_4);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        return t2;
        throw new IOException("SERVICE_NOT_AVAILABLE", (Throwable)var3_4);
        catch (ExecutionException executionException) {
            Throwable throwable = executionException.getCause();
            if (throwable instanceof IOException) throw (IOException)throwable;
            if (!(throwable instanceof RuntimeException)) throw new IOException((Throwable)executionException);
            throw (RuntimeException)throwable;
        }
    }

    public static boolean d() {
        return Log.isLoggable("FirebaseMessaging", 3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
        {
        }
    }

    public final void b(String string) {
        o o2 = (o)b0.a(this.a.f());
        n n2 = this.d;
        String string2 = o2.d();
        String string3 = o2.a();
        Objects.requireNonNull((Object)n2);
        Bundle bundle = new Bundle();
        String string4 = String.valueOf(string);
        String string5 = string4.length() != 0 ? "/topics/".concat(string4) : "/topics/";
        bundle.putString("gcm.topic", string5);
        String string6 = String.valueOf(string);
        String string7 = string6.length() != 0 ? "/topics/".concat(string6) : "/topics/";
        b0.a(n2.a(n2.b(string2, string3, string7, bundle)));
    }

    public final void c(String string) {
        o o2 = (o)b0.a(this.a.f());
        n n2 = this.d;
        String string2 = o2.d();
        String string3 = o2.a();
        Objects.requireNonNull((Object)n2);
        Bundle bundle = new Bundle();
        String string4 = String.valueOf(string);
        String string5 = string4.length() != 0 ? "/topics/".concat(string4) : "/topics/";
        bundle.putString("gcm.topic", string5);
        bundle.putString("delete", "1");
        String string6 = String.valueOf(string);
        String string7 = string6.length() != 0 ? "/topics/".concat(string6) : "/topics/";
        b0.a(n2.a(n2.b(string2, string3, string7, bundle)));
    }

    public void e(boolean bl) {
        b0 b02 = this;
        synchronized (b02) {
            this.g = bl;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public boolean f() {
        do lbl-1000: // 2 sources:
        {
            var40_24 = this;
            // MONITORENTER : var40_24
            var2_1 = this.h.a();
            var3_2 = 1;
            if (var2_1 == null) {
                if (b0.d()) {
                    Log.d("FirebaseMessaging", "topic sync succeeded");
                }
                // MONITOREXIT : var40_24
                return (boolean)var3_2;
            }
            // MONITOREXIT : var40_24
            break;
        } while (true);
        {
            catch (Throwable var1_28) {}
            {
                // MONITOREXIT : var40_24
                throw var1_28;
            }
        }
        {
            block29 : {
                try {
                    block32 : {
                        block33 : {
                            block30 : {
                                block31 : {
                                    var21_14 = var2_1.b;
                                    var22_15 = -1;
                                    var23_16 = var21_14.hashCode();
                                    if (var23_16 != 83) {
                                        if (var23_16 == 85 && var21_14.equals((Object)"U")) {
                                            var22_15 = 1;
                                        }
                                    } else {
                                        var24_17 = var21_14.equals((Object)"S");
                                        if (var24_17) {
                                            var22_15 = 0;
                                        }
                                    }
                                    if (var22_15 == 0) break block30;
                                    if (var22_15 == var3_2) break block31;
                                    if (!b0.d()) break block29;
                                    var35_22 = String.valueOf((Object)var2_1);
                                    var36_23 = new StringBuilder(24 + var35_22.length());
                                    var36_23.append("Unknown topic operation");
                                    var36_23.append(var35_22);
                                    var36_23.append(".");
                                    var30_20 = var36_23.toString();
                                    break block32;
                                }
                                this.c(var2_1.a);
                                if (!b0.d()) break block29;
                                var32_21 = var2_1.a;
                                var26_19 = new StringBuilder(35 + String.valueOf((Object)var32_21).length());
                                var26_19.append("Unsubscribe from topic: ");
                                var26_19.append(var32_21);
                                break block33;
                            }
                            this.b(var2_1.a);
                            if (!b0.d()) break block29;
                            var25_18 = var2_1.a;
                            var26_19 = new StringBuilder(31 + String.valueOf((Object)var25_18).length());
                            var26_19.append("Subscribe to topic: ");
                            var26_19.append(var25_18);
                        }
                        var26_19.append(" succeeded.");
                        var30_20 = var26_19.toString();
                    }
                    Log.d("FirebaseMessaging", (String)var30_20);
                }
                catch (IOException var5_3) {
                    if (!"SERVICE_NOT_AVAILABLE".equals(var5_3.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(var5_3.getMessage())) {
                        if (var5_3.getMessage() != null) throw var5_3;
                        var7_5 = "Topic operation failed without exception message. Will retry Topic operation.";
                    } else {
                        var6_4 = var5_3.getMessage();
                        var7_5 = d.a.b.a.a.i((int)d.a.b.a.a.b((String)var6_4, (int)53), (String)"Topic operation failed: ", (String)var6_4, (String)". Will retry Topic operation.");
                    }
                    Log.e("FirebaseMessaging", (String)var7_5);
                    return false;
                }
            }
            if (var3_2 == 0) {
                return false;
            }
            var41_25 = var9_6 = this.h;
            // MONITORENTER : var41_25
            var11_7 = var9_6.b;
            var12_8 = var2_1.c;
            var42_26 = var13_9 = var11_7.d;
            // MONITORENTER : var42_26
            if (var11_7.d.remove((Object)var12_8)) {
                var11_7.e.execute((Runnable)new w(var11_7));
            }
            // MONITOREXIT : var42_26
            // MONITOREXIT : var41_25
            var43_27 = var15_10 = this.e;
            // MONITORENTER : var43_27
            var17_11 = var2_1.c;
            if (this.e.containsKey((Object)var17_11)) {
                var18_12 = (ArrayDeque)this.e.get((Object)var17_11);
                var19_13 = (i)var18_12.poll();
                if (var19_13 != null) {
                    var19_13.a.r(null);
                }
                if (var18_12.isEmpty()) {
                    this.e.remove((Object)var17_11);
                }
            }
            // MONITOREXIT : var43_27
            ** while (true)
        }
    }

    public void g(long l2) {
        long l3 = Math.min(Math.max(30L, l2 << 1), i);
        c0 c02 = new c0(this, this.b, this.c, l3);
        this.f.schedule(c02, l2, TimeUnit.SECONDS);
        this.e(true);
    }
}

