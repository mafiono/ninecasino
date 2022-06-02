/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.ScheduledExecutorService
 */
package d.c.a.d.c;

import android.os.IBinder;
import android.os.RemoteException;
import d.c.a.d.c.g;
import d.c.a.d.c.h;
import d.c.a.d.c.l;
import d.c.a.d.c.q;
import java.util.concurrent.ScheduledExecutorService;

public final class m
implements Runnable {
    public final h e;
    public final IBinder f;

    public m(h h2, IBinder iBinder) {
        this.e = h2;
        this.f = iBinder;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        var1_1 = this.e;
        var2_2 = this.f;
        var5_3 = var1_1;
        // MONITORENTER : var5_3
        if (var2_2 != null) ** GOTO lbl10
        var1_1.a(0, "Null service connection");
        // MONITOREXIT : var5_3
        return;
lbl10: // 1 sources:
        try {
            var1_1.c = new q(var2_2);
        }
        catch (RemoteException var3_4) {
            var1_1.a(0, var3_4.getMessage());
            // MONITOREXIT : var5_3
            return;
        }
        var1_1.a = 2;
        var1_1.f.b.execute((Runnable)new l(var1_1));
        // MONITOREXIT : var5_3
        return;
    }
}

