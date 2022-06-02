/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Handler
 *  android.view.LayoutInflater
 *  c.h.b.g
 *  c.k.b.a0
 *  c.k.b.m
 *  c.k.b.n
 *  c.k.b.t
 *  java.lang.Object
 */
package c.k.b;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import c.h.b.g;
import c.k.b.a0;
import c.k.b.b0;
import c.k.b.m;
import c.k.b.n;
import c.k.b.t;

public abstract class x<E>
extends t {
    public final Activity e;
    public final Context f;
    public final Handler g;
    public final a0 h;

    public x(n n2) {
        Handler handler = new Handler();
        this.h = new b0();
        this.e = n2;
        g.g((Object)n2, (Object)"context == null");
        this.f = n2;
        g.g((Object)handler, (Object)"handler == null");
        this.g = handler;
    }

    public abstract E i();

    public abstract LayoutInflater j();

    public abstract boolean k(m var1);

    public abstract void l();
}

