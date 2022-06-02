/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.r;

import android.content.Intent;
import android.util.Log;
import d.c.b.r.d0;

public final class b0
implements Runnable {
    public final d0.a e;

    public b0(d0.a a2) {
        this.e = a2;
    }

    public final void run() {
        d0.a a2 = this.e;
        String string = a2.a.getAction();
        StringBuilder stringBuilder = new StringBuilder(61 + String.valueOf(string).length());
        stringBuilder.append("Service took too long to process intent: ");
        stringBuilder.append(string);
        stringBuilder.append(" App may get closed.");
        Log.w("FirebaseInstanceId", stringBuilder.toString());
        a2.a();
    }
}

