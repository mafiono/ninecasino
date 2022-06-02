/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.b.d0
 *  d.b.d0$b
 *  d.b.e0.z.b
 *  d.b.e0.z.b$b
 *  d.b.e0.z.k
 *  d.b.e0.z.k$a
 *  d.b.j0.d0.i.a
 *  d.b.j0.l
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package d.b.e0.z;

import d.b.d0;
import d.b.e0.z.b;
import d.b.e0.z.k;
import d.b.j0.d0.i.a;
import d.b.j0.l;

public final class c
implements k.a {
    public final /* synthetic */ l a;
    public final /* synthetic */ String b;

    public c(l l2, String string) {
        this.a = l2;
        this.b = string;
    }

    public void a() {
        boolean bl;
        boolean bl2;
        boolean bl3;
        block9 : {
            l l2 = this.a;
            bl2 = true;
            bl3 = l2 != null && l2.g;
            if (!a.b(d0.class)) {
                try {
                    d0.e();
                    bl = d0.g.a();
                    break block9;
                }
                catch (Throwable throwable) {
                    a.a((Throwable)throwable, d0.class);
                }
            }
            bl = false;
        }
        if (!bl) {
            bl2 = false;
        }
        if (bl3 && bl2) {
            boolean bl4 = a.b(b.class);
            b.b b2 = null;
            if (bl4) {
                b2 = null;
            } else {
                try {
                    b2 = b.h;
                }
                catch (Throwable throwable) {
                    a.a((Throwable)throwable, b.class);
                }
            }
            String string = this.b;
            (b2).a(string);
        }
    }
}

