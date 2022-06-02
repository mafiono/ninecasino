/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.o.b.i
 *  f.p.b
 *  f.p.b$a
 *  f.p.c
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Random
 */
package f.p;

import f.o.b.i;
import f.p.b;
import f.p.c;
import java.util.Random;

public abstract class a
extends c {
    public int a() {
        Object object = ((b)this).c.get();
        i.d((Object)object, (String)"implStorage.get()");
        return ((Random)object).nextInt();
    }
}

