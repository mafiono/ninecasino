/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  java.lang.Object
 *  java.util.concurrent.CountDownLatch
 */
package d.c.b.m.e.k;

import d.c.a.d.j.a;
import d.c.a.d.j.h;
import java.util.concurrent.CountDownLatch;

public final class a1
implements a {
    public final CountDownLatch a;

    public a1(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public Object a(h h2) {
        CountDownLatch countDownLatch = this.a;
        countDownLatch.countDown();
        return null;
    }
}

