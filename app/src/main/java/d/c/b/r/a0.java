/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Binder
 *  android.os.Process
 *  android.util.Log
 *  d.c.a.d.j.c
 *  d.c.a.d.j.h
 *  d.c.b.r.z
 *  d.c.b.w.g$a
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
package d.c.b.r;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import d.c.a.d.j.c;
import d.c.a.d.j.h;
import d.c.b.r.d0;
import d.c.b.r.g;
import d.c.b.r.z;
import d.c.b.w.g;
import java.util.concurrent.Executor;

public class a0
extends Binder {
    public final a a;

    public a0(a a2) {
        this.a = a2;
    }

    public void a(d0.a a2) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
            }
            a a3 = this.a;
            Intent intent = a2.a;
            h h2 = d.c.b.w.g.access$000(((g.a)a3).a, intent);
            h2.c(g.e, (c)new z(a2));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }

    public interface a {
    }

}

