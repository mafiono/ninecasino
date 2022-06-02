/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.h.b.i
 *  d.c.a.d.h.b.s3
 *  d.c.a.d.h.b.s7
 *  d.c.a.d.h.b.u3
 *  d.c.a.d.h.b.v5
 *  java.lang.String
 */
package d.c.a.d.h.b;

import d.c.a.d.h.b.i;
import d.c.a.d.h.b.s3;
import d.c.a.d.h.b.s7;
import d.c.a.d.h.b.u3;
import d.c.a.d.h.b.v5;

public final class r7
extends i {
    public final /* synthetic */ s7 e;

    public r7(s7 s72, v5 v52) {
        this.e = s72;
        super(v52);
    }

    public final void a() {
        s7 s72 = this.e;
        s72.b();
        if (!s72.B()) {
            return;
        }
        s72.i().n.a("Inactivity, disconnecting from the service");
        s72.D();
    }
}

