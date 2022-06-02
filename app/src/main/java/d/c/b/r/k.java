/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.c
 *  d.c.a.d.j.h
 *  java.lang.Object
 *  java.util.concurrent.CountDownLatch
 */
package d.c.b.r;

import d.c.a.d.j.c;
import d.c.a.d.j.h;
import java.util.concurrent.CountDownLatch;

public final class k
implements c {
    public final CountDownLatch a;

    public k(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final void a(h h2) {
        CountDownLatch countDownLatch = this.a;
        countDownLatch.countDown();
    }
}

