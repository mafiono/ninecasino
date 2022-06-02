/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.util.Log
 *  com.google.firebase.iid.FirebaseInstanceId
 *  d.c.a.d.j.h
 *  java.io.IOException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.ExecutorService
 *  javax.annotation.Nullable
 */
package d.c.b.r;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import d.c.b.c;
import d.c.b.r.f;
import d.c.b.r.h;
import d.c.b.r.q;
import d.c.b.r.v;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import javax.annotation.Nullable;

public class x
implements Runnable {
    public final long e;
    public final PowerManager.WakeLock f;
    public final FirebaseInstanceId g;
    public ExecutorService h = h.a();

    public x(FirebaseInstanceId firebaseInstanceId, long l2) {
        PowerManager.WakeLock wakeLock;
        this.g = firebaseInstanceId;
        this.e = l2;
        this.f = wakeLock = ((PowerManager)this.a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        wakeLock.setReferenceCounted(false);
    }

    public Context a() {
        c c2 = this.g.b;
        c2.a();
        return c2.a;
    }

    public final void b(String string) {
        c c2 = this.g.b;
        c2.a();
        if ("[DEFAULT]".equals(c2.b)) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                c c3 = this.g.b;
                c3.a();
                String string2 = String.valueOf(c3.b);
                String string3 = string2.length() != 0 ? "Invoking onNewToken for app: ".concat(string2) : "Invoking onNewToken for app: ";
                Log.d("FirebaseInstanceId", string3);
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", string);
            new f(this.a(), this.h).b(intent);
        }
    }

    public boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager)this.a().getSystemService("connectivity");
        NetworkInfo networkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return networkInfo != null && networkInfo.isConnected();
    }

    /*
     * Exception decompiling
     */
    public boolean d() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl89 : LDC : trying to set 0 previously set to 1
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @SuppressLint(value={"Wakelock"})
    public void run() {
        block12 : {
            block11 : {
                block10 : {
                    block9 : {
                        if (v.a().c(this.a())) {
                            this.f.acquire();
                        }
                        this.g.n(true);
                        if (this.g.c.d()) break block9;
                        this.g.n(false);
                        if (v.a().c(this.a()) == false) return;
                        this.f.release();
                        return;
                    }
                    if (!v.a().b(this.a()) || this.c()) break block10;
                    new a(this).a();
                    if (v.a().c(this.a()) == false) return;
                    this.f.release();
                    return;
                }
                if (this.d()) {
                    this.g.n(false);
                    break block11;
                }
                this.g.o(this.e);
            }
            if (v.a().c(this.a()) == false) return;
lbl25: // 2 sources:
            do {
                this.f.release();
                return;
                break;
            } while (true);
            {
                catch (Throwable var8_1) {
                    break block12;
                }
                catch (IOException var1_2) {}
                {
                    var2_3 = var1_2.getMessage();
                    var3_4 = new StringBuilder(93 + String.valueOf((Object)var2_3).length());
                    var3_4.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                    var3_4.append(var2_3);
                    var3_4.append(". Won't retry the operation.");
                    Log.e("FirebaseInstanceId", (String)var3_4.toString());
                    this.g.n(false);
                }
                if (v.a().c(this.a()) == false) return;
                ** continue;
            }
        }
        if (v.a().c(this.a()) == false) throw var8_1;
        this.f.release();
        throw var8_1;
    }

    public static class a
    extends BroadcastReceiver {
        @Nullable
        public x a;

        public a(x x2) {
            this.a = x2;
        }

        public void a() {
            if (FirebaseInstanceId.l()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            this.a.a().registerReceiver(this, intentFilter);
        }

        public void onReceive(Context context, Intent intent) {
            x x2 = this.a;
            if (x2 == null) {
                return;
            }
            if (!x2.c()) {
                return;
            }
            if (FirebaseInstanceId.l()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            x x3 = this.a;
            x3.g.d((Runnable)x3, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }

}

