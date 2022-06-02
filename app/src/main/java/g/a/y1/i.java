/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.e.a
 *  f.k
 *  f.m.d
 *  f.m.f
 *  f.m.k.a.c
 *  f.o.b.i
 *  g.a.y1.b
 *  g.a.y1.i$a
 *  g.a.y1.j.h
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Objects
 */
package g.a.y1;

import f.k;
import f.m.d;
import f.m.f;
import f.m.k.a.c;
import g.a.y1.b;
import g.a.y1.i;
import g.a.y1.j.h;
import java.util.Objects;

public final class i<T>
implements b<T> {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object a(d<? super k> var1_1) {
        if (!(var1_1 instanceof a)) ** GOTO lbl-1000
        var2_2 = (a)var1_1;
        var10_3 = var2_2.i;
        if ((var10_3 & Integer.MIN_VALUE) != 0) {
            var2_2.i = var10_3 + Integer.MIN_VALUE;
        } else lbl-1000: // 2 sources:
        {
            var2_2 = new a(this, var1_1);
        }
        var3_4 = var2_2.h;
        var4_5 = var2_2.i;
        if (var4_5 != 0) {
            if (var4_5 != 1) {
                if (var4_5 != 2) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                d.c.a.e.a.v0((Object)var3_4);
                return k.a;
            }
            var6_6 = (h)var2_2.l;
            var8_7 = (i)var2_2.k;
            d.c.a.e.a.v0((Object)var3_4);
            Objects.requireNonNull(var8_7);
            return k.a;
        }
        d.c.a.e.a.v0((Object)var3_4);
        var5_8 = var2_2.g;
        f.o.b.i.c((Object)var5_8);
        var6_6 = new h(null, var5_8);
        try {
            var2_2.k = this;
            var2_2.l = var6_6;
            var2_2.i = 1;
            throw null;
        }
        catch (Throwable var7_9) {
            throw var7_9;
        }
        finally {
            var6_6.n();
        }
    }

    public Object f(T t6, d<? super k> d3) {
        throw null;
    }
}

