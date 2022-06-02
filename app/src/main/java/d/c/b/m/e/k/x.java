/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.h
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.Date
 *  java.util.concurrent.Callable
 */
package d.c.b.m.e.k;

import d.c.b.m.e.b;
import d.c.b.m.e.k.b1;
import d.c.b.m.e.k.h;
import d.c.b.m.e.k.l0;
import d.c.b.m.e.k.t;
import d.c.b.m.e.k.z;
import d.c.b.m.e.s.e;
import java.util.Date;
import java.util.concurrent.Callable;

public class x
implements l0.a {
    public final /* synthetic */ t a;

    public x(t t6) {
        this.a = t6;
    }

    public void a(e e2, Thread thread, Throwable throwable) {
        t t6;
        t t7 = t6 = this.a;
        synchronized (t7) {
            b b3 = b.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Crashlytics is handling uncaught exception \"");
            stringBuilder.append(throwable);
            stringBuilder.append("\" from thread ");
            stringBuilder.append(thread.getName());
            b3.b(stringBuilder.toString());
            Date date = new Date();
            h h2 = t6.e;
            z z3 = new z(t6, date, throwable, thread, e2);
            d.c.a.d.j.h<Void> h3 = h2.c(z3);
            try {
                b1.a(h3);
            }
            catch (Exception exception) {}
            return;
        }
    }
}

