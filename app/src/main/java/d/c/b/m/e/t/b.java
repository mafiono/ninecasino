/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.System
 */
package d.c.b.m.e.t;

import d.c.b.m.e.t.d;

public class b
implements d {
    public final int a;

    public b(int n2) {
        this.a = n2;
    }

    @Override
    public StackTraceElement[] a(StackTraceElement[] arrstackTraceElement) {
        int n2 = arrstackTraceElement.length;
        int n3 = this.a;
        if (n2 <= n3) {
            return arrstackTraceElement;
        }
        int n4 = n3 / 2;
        int n5 = n3 - n4;
        StackTraceElement[] arrstackTraceElement2 = new StackTraceElement[n3];
        System.arraycopy(arrstackTraceElement, 0, arrstackTraceElement2, 0, n5);
        System.arraycopy(arrstackTraceElement, arrstackTraceElement.length - n4, arrstackTraceElement2, n5, n4);
        return arrstackTraceElement2;
    }
}

