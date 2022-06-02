/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firebase.iid.FirebaseInstanceId
 *  com.google.firebase.messaging.FirebaseMessaging
 *  com.google.firebase.messaging.FirebaseMessaging$a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package d.c.b.w;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

public final class l
implements Runnable {
    public final FirebaseMessaging.a e;

    public l(FirebaseMessaging.a a2) {
        this.e = a2;
    }

    public final void run() {
        this.e.e.c.i();
    }
}

