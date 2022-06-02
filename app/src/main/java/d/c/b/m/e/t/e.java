/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.Throwable
 */
package d.c.b.m.e.t;

import d.c.b.m.e.t.d;

public class e {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final e d;

    public e(Throwable throwable, d d3) {
        this.a = throwable.getLocalizedMessage();
        this.b = throwable.getClass().getName();
        this.c = d3.a(throwable.getStackTrace());
        Throwable throwable2 = throwable.getCause();
        e e2 = throwable2 != null ? new e(throwable2, d3) : null;
        this.d = e2;
    }
}

