/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Number
 *  java.lang.Object
 *  java.util.concurrent.atomic.AtomicLong
 */
package d.c.c;

import d.c.c.c0.a;
import d.c.c.c0.c;
import d.c.c.x;
import java.util.concurrent.atomic.AtomicLong;

public class g
extends x<AtomicLong> {
    public final /* synthetic */ x a;

    public g(x x3) {
        this.a = x3;
    }

    @Override
    public Object a(a a2) {
        return new AtomicLong(((Number)this.a.a(a2)).longValue());
    }

    @Override
    public void b(c c3, Object object) {
        AtomicLong atomicLong = (AtomicLong)object;
        this.a.b(c3, atomicLong.get());
    }
}

