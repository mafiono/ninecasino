/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.a
 *  d.c.a.d.j.f0
 *  d.c.a.d.j.h
 *  d.c.a.d.j.i
 *  d.c.b.m.e.k.d1$a
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Callable
 */
package d.c.b.m.e.k;

import d.c.a.d.j.f0;
import d.c.a.d.j.h;
import d.c.a.d.j.i;
import d.c.b.m.e.k.d1;
import java.util.concurrent.Callable;

public class d1
implements Runnable {
    public final /* synthetic */ Callable e;
    public final /* synthetic */ i f;

    public d1(Callable callable, i i2) {
        this.e = callable;
        this.f = i2;
    }

    public void run() {
        try {
            ((h)this.e.call()).f((d.c.a.d.j.a)new a(this));
            return;
        }
        catch (Exception exception) {
            this.f.a.q(exception);
            return;
        }
    }
}

