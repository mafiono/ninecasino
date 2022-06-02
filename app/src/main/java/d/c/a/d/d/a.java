/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  d.c.a.d.d.m.m
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package d.c.a.d.d;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import d.c.a.d.d.m.m;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class a
implements ServiceConnection {
    public boolean a = false;
    public final BlockingQueue<IBinder> b = new LinkedBlockingQueue();

    public IBinder a(long l2, TimeUnit timeUnit) {
        m.g((String)"BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.a) {
            this.a = true;
            IBinder iBinder = this.b.poll(l2, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}

