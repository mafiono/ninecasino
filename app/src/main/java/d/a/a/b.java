/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.a.a
 *  d.a.a.a$a
 *  d.a.a.b$a$a
 *  d.c.a.e.a
 *  f.k
 *  f.m.d
 *  f.m.j.a
 *  g.a.y1.a
 *  g.a.y1.b
 *  g.a.y1.e
 *  g.a.y1.f
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package d.a.a;

import d.a.a.a;
import d.a.a.b;
import f.k;
import f.m.d;
import g.a.y1.e;
import g.a.y1.f;

public final class b
implements g.a.y1.a<a.a> {
    public final /* synthetic */ g.a.y1.a e;

    public b(g.a.y1.a a2) {
        this.e = a2;
    }

    public Object a(final g.a.y1.b b2, d d2) {
        e e2 = d.a.a.a.a;
        g.a.y1.b<a.a> b3 = new g.a.y1.b<a.a>(this){

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Lifted jumps to return sites
             */
            public Object f(Object var1_1, d var2_2) {
                var3_3 = k.a;
                if (!(var2_2 instanceof a)) ** GOTO lbl-1000
                var4_4 = (a)var2_2;
                var10_5 = var4_4.i;
                if ((var10_5 & Integer.MIN_VALUE) != 0) {
                    var4_4.i = var10_5 + Integer.MIN_VALUE;
                } else lbl-1000: // 2 sources:
                {
                    var4_4 = new a(this, var2_2);
                }
                var5_6 = var4_4.h;
                var6_7 = f.m.j.a.e;
                var7_8 = var4_4.i;
                if (var7_8 != 0) {
                    if (var7_8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    d.c.a.e.a.v0((Object)var5_6);
                    return var3_3;
                }
                d.c.a.e.a.v0((Object)var5_6);
                var8_9 = b2;
                var9_10 = var1_1 != null;
                if (Boolean.valueOf((boolean)var9_10) == false) return var3_3;
                var4_4.i = 1;
                if (var8_9.f(var1_1, (d)var4_4) != var6_7) return var3_3;
                return var6_7;
            }
        };
        Object object = ((f)e2).a((g.a.y1.b)b3, d2);
        if (object == f.m.j.a.e) {
            return object;
        }
        return k.a;
    }

}

