/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.c.a.a.c
 *  java.lang.Class
 */
package c.c.a.a;

import c.c.a.a.b;
import c.c.a.a.c;

public class a
extends c {
    public static volatile a c;
    public c a;
    public c b;

    public a() {
        b b2 = new b();
        this.b = b2;
        this.a = b2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a b() {
        if (c != null) {
            return c;
        }
        Class<a> class_ = a.class;
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
            // ** MonitorExit[var1] (shouldn't be in output)
            return c;
        }
    }

    public boolean a() {
        return this.a.a();
    }
}

