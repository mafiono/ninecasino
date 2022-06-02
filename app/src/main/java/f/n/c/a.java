/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.n.a
 *  f.o.b.i
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.n.c;

import f.o.b.i;

public class a
extends f.n.a {
    public void a(Throwable throwable, Throwable throwable2) {
        i.e((Object)throwable, (String)"cause");
        i.e((Object)throwable2, (String)"exception");
        throwable.addSuppressed(throwable2);
    }
}

