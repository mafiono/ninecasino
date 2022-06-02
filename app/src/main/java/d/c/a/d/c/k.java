/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.util.Log
 *  android.util.SparseArray
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 */
package d.c.a.d.c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import d.c.a.d.c.h;
import d.c.a.d.c.r;
import d.c.a.d.c.s;
import java.util.Objects;

public final class k
implements Handler.Callback {
    public final h a;

    public k(h h2) {
        this.a = h2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean handleMessage(Message message) {
        s s2;
        h h2 = this.a;
        Objects.requireNonNull((Object)h2);
        int n2 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder stringBuilder = new StringBuilder(41);
            stringBuilder.append("Received response to request: ");
            stringBuilder.append(n2);
            Log.d("MessengerIpcClient", stringBuilder.toString());
        }
        h h3 = h2;
        synchronized (h3) {
            s2 = h2.e.get(n2);
            if (s2 == null) {
                StringBuilder stringBuilder = new StringBuilder(50);
                stringBuilder.append("Received response for unknown request: ");
                stringBuilder.append(n2);
                Log.w("MessengerIpcClient", stringBuilder.toString());
                return true;
            }
            h2.e.remove(n2);
            h2.c();
        }
        Bundle bundle = message.getData();
        if (bundle.getBoolean("unsupported", false)) {
            s2.b(new r(4, "Not supported by GmsCore"));
            return true;
        }
        s2.a(bundle);
        return true;
    }
}

