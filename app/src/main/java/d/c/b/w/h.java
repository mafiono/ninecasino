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

public final class h
implements Runnable {
    public final FirebaseMessaging e;
    public final FirebaseInstanceId f;

    public h(FirebaseMessaging firebaseMessaging, FirebaseInstanceId firebaseInstanceId) {
        this.e = firebaseMessaging;
        this.f = firebaseInstanceId;
    }

    public final void run() {
        FirebaseMessaging firebaseMessaging = this.e;
        FirebaseInstanceId firebaseInstanceId = this.f;
        if (firebaseMessaging.d.b()) {
            firebaseInstanceId.i();
        }
    }
}

