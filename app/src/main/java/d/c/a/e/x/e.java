/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  java.lang.Object
 *  java.util.Objects
 */
package d.c.a.e.x;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

public class e {
    public static e c;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new Handler.Callback(){

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean handleMessage(Message message) {
            Object object;
            if (message.what != 0) {
                return false;
            }
            e e2 = e.this;
            b b2 = (b)message.obj;
            Object object2 = object = e2.a;
            synchronized (object2) {
                if (b2 != null) {
                    return true;
                }
                Objects.requireNonNull((Object)b2);
                throw null;
            }
        }
    });

    public static class b {
    }

}

