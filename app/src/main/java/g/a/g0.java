/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.e.a
 *  f.g
 *  f.k
 *  f.m.d
 *  f.m.f
 *  f.m.f$b
 *  f.o.b.i
 *  g.a.a2.i
 *  g.a.a2.j
 *  g.a.b0
 *  g.a.r
 *  g.a.u1
 *  g.a.v
 *  g.a.z0
 *  g.a.z1.d
 *  g.a.z1.o
 *  g.a.z1.q
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 */
package g.a;

import d.c.a.e.a;
import f.g;
import f.k;
import f.m.f;
import g.a.a2.i;
import g.a.a2.j;
import g.a.b0;
import g.a.r;
import g.a.u1;
import g.a.v;
import g.a.z0;
import g.a.z1.d;
import g.a.z1.o;
import g.a.z1.q;
import java.util.concurrent.CancellationException;

public abstract class g0<T>
extends i {
    public int g;

    public g0(int n2) {
        this.g = n2;
    }

    public void e(Object object, Throwable throwable) {
    }

    public abstract f.m.d<T> f();

    public Throwable h(Object object) {
        if (!(object instanceof r)) {
            object = null;
        }
        r r3 = (r)object;
        Throwable throwable = null;
        if (r3 != null) {
            throwable = r3.a;
        }
        return throwable;
    }

    public <T> T i(Object object) {
        return (T)object;
    }

    public final void l(Throwable throwable, Throwable throwable2) {
        if (throwable == null && throwable2 == null) {
            return;
        }
        if (throwable != null && throwable2 != null) {
            a.a((Throwable)throwable, (Throwable)throwable2);
        }
        if (throwable == null) {
            throwable = throwable2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fatal exception in coroutines machinery for ");
        stringBuilder.append(this);
        stringBuilder.append(". ");
        stringBuilder.append("Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        String string = stringBuilder.toString();
        f.o.b.i.c((Object)throwable);
        b0 b02 = new b0(string, throwable);
        a.J((f)this.f().d(), (Throwable)b02);
    }

    public abstract Object m();

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        block12 : {
            var1_1 /* !! */  = k.a;
            var2_2 = this.f;
            var5_3 = this.f();
            if (var5_3 == null) throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
            var6_4 = (d)var5_3;
            var7_5 = var6_4.k;
            var8_6 = var6_4.i;
            var9_7 = var7_5.d();
            var10_8 = q.b((f)var9_7, (Object)var8_6);
            var11_9 = var10_8 != q.a ? v.b((f.m.d)var7_5, (f)var9_7, (Object)var10_8) : null;
            {
                catch (Throwable var3_18) {
                    try {
                        var2_2.d0();
                    }
                    catch (Throwable var4_19) {
                        var1_1 /* !! */  = a.q((Throwable)var4_19);
                    }
                    this.l(var3_18, g.a((Object)var1_1 /* !! */ ));
                    return;
                }
            }
            var13_10 = var7_5.d();
            var14_11 = this.m();
            var15_12 = this.h(var14_11);
            var16_13 = var15_12 == null && a.N((int)this.g) != false ? (z0)var13_10.get((f.b)z0.d) : null;
            if (var16_13 != null && !var16_13.a()) {
                var19_14 = var16_13.s();
                this.e(var14_11, (Throwable)var19_14);
                var17_15 = a.q((Throwable)var19_14);
            } else {
                var17_15 = var15_12 != null ? a.q((Throwable)var15_12) : this.i(var14_11);
            }
            var7_5.g(var17_15);
            if (var11_9 == null) ** GOTO lbl35
            if (!var11_9.d0()) break block12;
lbl35: // 2 sources:
            q.a((f)var9_7, (Object)var10_8);
        }
        try {
            var2_2.d0();
        }
        catch (Throwable var18_16) {
            var1_1 /* !! */  = a.q((Throwable)var18_16);
        }
        this.l(null, g.a((Object)var1_1 /* !! */ ));
        return;
        catch (Throwable var12_17) {
            if (var11_9 == null) ** GOTO lbl48
            if (var11_9.d0() == false) throw var12_17;
lbl48: // 2 sources:
            q.a((f)var9_7, (Object)var10_8);
            throw var12_17;
        }
    }
}

