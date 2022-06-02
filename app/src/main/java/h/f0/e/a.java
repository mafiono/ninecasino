/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.f0.c
 *  h.f0.e.c
 *  i.a0
 *  i.f
 *  i.g
 *  i.h
 *  i.z
 *  java.io.IOException
 *  java.lang.Object
 *  java.util.concurrent.TimeUnit
 */
package h.f0.e;

import h.f0.e.b;
import h.f0.e.c;
import i.a0;
import i.f;
import i.g;
import i.h;
import i.z;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class a
implements z {
    public boolean e;
    public final /* synthetic */ h f;
    public final /* synthetic */ c g;
    public final /* synthetic */ g h;

    public a(b b3, h h2, c c3, g g2) {
        this.f = h2;
        this.g = c3;
        this.h = g2;
    }

    public void close() {
        if (!this.e && !h.f0.c.k((z)this, (int)100, (TimeUnit)TimeUnit.MILLISECONDS)) {
            this.e = true;
            this.g.a();
        }
        this.f.close();
    }

    public long read(f f2, long l4) {
        long l5;
        block3 : {
            block4 : {
                try {
                    l5 = this.f.read(f2, l4);
                    if (l5 != -1L) break block3;
                    if (this.e) break block4;
                }
                catch (IOException iOException) {
                    if (!this.e) {
                        this.e = true;
                        this.g.a();
                    }
                    throw iOException;
                }
                this.e = true;
                this.h.close();
            }
            return -1L;
        }
        f2.m(this.h.b(), f2.f - l5, l5);
        this.h.p();
        return l5;
    }

    public a0 timeout() {
        return this.f.timeout();
    }
}

