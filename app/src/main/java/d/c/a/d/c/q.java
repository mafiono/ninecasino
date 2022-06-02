/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Messenger
 *  android.os.RemoteException
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.a.d.c;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import d.c.a.d.c.d;

public final class q {
    public final Messenger a;
    public final d b;

    public q(IBinder iBinder) {
        String string = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(string)) {
            this.a = new Messenger(iBinder);
            this.b = null;
            return;
        }
        if ("com.google.android.gms.iid.IMessengerCompat".equals(string)) {
            this.b = new d(iBinder);
            this.a = null;
            return;
        }
        String string2 = String.valueOf(string);
        String string3 = string2.length() != 0 ? "Invalid interface descriptor: ".concat(string2) : "Invalid interface descriptor: ";
        Log.w("MessengerIpcClient", string3);
        throw new RemoteException();
    }
}

