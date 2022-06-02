/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.concurrent.atomic.AtomicLongArray
 */
package d.c.c;

import d.c.c.c0.a;
import d.c.c.c0.c;
import d.c.c.x;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

public class h
extends x<AtomicLongArray> {
    public final /* synthetic */ x a;

    public h(x x3) {
        this.a = x3;
    }

    @Override
    public Object a(a a2) {
        ArrayList arrayList = new ArrayList();
        a2.a();
        while (a2.F()) {
            arrayList.add(((Number)this.a.a(a2)).longValue());
        }
        a2.s();
        int n2 = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            atomicLongArray.set(i2, ((Long)arrayList.get(i2)).longValue());
        }
        return atomicLongArray;
    }

    @Override
    public void b(c c3, Object object) {
        AtomicLongArray atomicLongArray = (AtomicLongArray)object;
        c3.e();
        int n2 = atomicLongArray.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a.b(c3, atomicLongArray.get(i2));
        }
        c3.s();
    }
}

