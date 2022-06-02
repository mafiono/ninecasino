/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.StackTraceElement
 */
package d.c.b.m.e.t;

import d.c.b.m.e.t.b;
import d.c.b.m.e.t.d;

public class a
implements d {
    public final d[] a;
    public final b b;

    public /* varargs */ a(int n2, d ... arrd) {
        this.a = arrd;
        this.b = new b(n2);
    }

    @Override
    public StackTraceElement[] a(StackTraceElement[] arrstackTraceElement) {
        if (arrstackTraceElement.length <= 1024) {
            return arrstackTraceElement;
        }
        d[] arrd = this.a;
        int n2 = arrd.length;
        StackTraceElement[] arrstackTraceElement2 = arrstackTraceElement;
        for (int i2 = 0; i2 < n2; ++i2) {
            d d3 = arrd[i2];
            if (arrstackTraceElement2.length <= 1024) break;
            arrstackTraceElement2 = d3.a(arrstackTraceElement);
        }
        if (arrstackTraceElement2.length > 1024) {
            arrstackTraceElement2 = this.b.a(arrstackTraceElement2);
        }
        return arrstackTraceElement2;
    }
}

