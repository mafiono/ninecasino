/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Message
 *  android.os.Messenger
 *  android.os.RemoteException
 *  android.util.Log
 *  android.util.SparseArray
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Queue
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package d.c.a.d.c;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import d.c.a.d.c.d;
import d.c.a.d.c.g;
import d.c.a.d.c.h;
import d.c.a.d.c.n;
import d.c.a.d.c.q;
import d.c.a.d.c.s;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class l
implements Runnable {
    public final h e;

    public l(h h2) {
        this.e = h2;
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
    public final void run() {
        var1_1 = this.e;
        do lbl-1000: // 3 sources:
        {
            var18_13 = var1_1;
            // MONITORENTER : var18_13
            if (var1_1.a != 2) {
                // MONITOREXIT : var18_13
                return;
            }
            if (var1_1.d.isEmpty()) {
                var1_1.c();
                // MONITOREXIT : var18_13
                return;
            }
            var3_2 = (s)var1_1.d.poll();
            var1_1.e.put(var3_2.a, (Object)var3_2);
            var1_1.f.b.schedule((Runnable)new n(var1_1, var3_2), 30L, TimeUnit.SECONDS);
            // MONITOREXIT : var18_13
            break;
        } while (true);
        {
            catch (Throwable var2_14) {}
            {
                // MONITOREXIT : var18_13
                throw var2_14;
            }
        }
        {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                var13_11 = String.valueOf((Object)var3_2);
                var14_12 = new StringBuilder(8 + var13_11.length());
                var14_12.append("Sending ");
                var14_12.append(var13_11);
                Log.d("MessengerIpcClient", (String)var14_12.toString());
            }
            var5_3 = var1_1.f.a;
            var6_4 = var1_1.b;
            var7_5 = Message.obtain();
            var7_5.what = var3_2.c;
            var7_5.arg1 = var3_2.a;
            var7_5.replyTo = var6_4;
            var8_6 = new Bundle();
            var8_6.putBoolean("oneWay", var3_2.d());
            var8_6.putString("pkg", var5_3.getPackageName());
            var8_6.putBundle("data", var3_2.d);
            var7_5.setData(var8_6);
            try {
                var10_8 = var1_1.c;
                var11_9 = var10_8.a;
                if (var11_9 != null) {
                    var11_9.send(var7_5);
                    continue;
                }
                var12_10 = var10_8.b;
                if (var12_10 == null) throw new IllegalStateException("Both messengers are null");
                var12_10.b(var7_5);
            }
            catch (RemoteException var9_7) {
                var1_1.a(2, var9_7.getMessage());
            }
            ** while (true)
        }
    }
}

