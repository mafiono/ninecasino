/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firebase.messaging.FirebaseMessaging
 *  com.google.firebase.messaging.FirebaseMessaging$a
 *  d.c.a.d.j.e
 *  java.lang.Object
 */
package d.c.b.w;

import com.google.firebase.messaging.FirebaseMessaging;
import d.c.a.d.j.e;
import d.c.b.w.b0;
import d.c.b.w.y;
import d.c.b.w.z;

public final class i
implements e {
    public final FirebaseMessaging a;

    public i(FirebaseMessaging firebaseMessaging) {
        this.a = firebaseMessaging;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(Object object) {
        boolean bl2;
        FirebaseMessaging firebaseMessaging = this.a;
        b0 b02 = (b0)object;
        if (!firebaseMessaging.d.b()) return;
        if (b02.h.a() == null) return;
        boolean bl = true;
        if (!bl) return;
        b0 b03 = b02;
        synchronized (b03) {
            bl2 = b02.g;
        }
        if (bl2) return;
        b02.g(0L);
    }
}

