/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.concurrent.Executor
 */
package d.c.b.r;

import android.content.Context;
import android.content.Intent;
import d.c.a.d.b.a;
import d.c.a.d.j.h;
import d.c.b.r.e;
import d.c.b.r.f;
import d.c.b.r.g;
import java.util.concurrent.Executor;

public final class c
implements d.c.a.d.j.a {
    public final Context a;
    public final Intent b;

    public c(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    public final Object a(h h2) {
        Context context = this.a;
        Intent intent = this.b;
        if (a.p()) {
            if ((Integer)h2.j() != 402) {
                return h2;
            }
            h<Integer> h3 = f.a(context, intent);
            h2 = h3.g(g.e, e.a);
        }
        return h2;
    }
}

