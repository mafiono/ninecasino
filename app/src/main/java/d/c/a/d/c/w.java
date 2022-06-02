/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  d.c.a.d.j.i
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package d.c.a.d.c;

import android.util.Log;
import d.c.a.d.j.i;
import java.io.IOException;

public final class w
implements Runnable {
    public final i e;

    public w(i i2) {
        this.e = i2;
    }

    public final void run() {
        if (this.e.a((Exception) new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }
}

