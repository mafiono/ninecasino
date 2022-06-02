/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firebase.messaging.FirebaseMessaging
 *  com.google.firebase.messaging.FirebaseMessaging$a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package d.c.b.w;

import com.google.firebase.messaging.FirebaseMessaging;
import d.c.b.p.a;
import d.c.b.p.b;
import d.c.b.w.l;
import java.util.concurrent.Executor;

public final class k
implements b {
    public final FirebaseMessaging.a a;

    public k(FirebaseMessaging.a a2) {
        this.a = a2;
    }

    public final void a(a a2) {
        FirebaseMessaging.a a3 = this.a;
        if (a3.b()) {
            a3.e.e.execute((Runnable)new l(a3));
        }
    }
}

