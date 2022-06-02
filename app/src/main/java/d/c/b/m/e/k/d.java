/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  java.lang.Object
 *  java.lang.Runnable
 */
package d.c.b.m.e.k;

import android.os.Process;

public abstract class d
implements Runnable {
    public abstract void a();

    public final void run() {
        Process.setThreadPriority(10);
        this.a();
    }
}

