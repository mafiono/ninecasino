/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.os.Handler
 *  c.h.c.b.g
 *  c.h.g.e
 *  c.h.g.e$d
 *  c.h.g.f
 *  c.h.g.f$c
 *  java.lang.Object
 */
package c.h.g;

import android.graphics.Typeface;
import android.os.Handler;
import c.h.c.b.g;
import c.h.g.e;
import c.h.g.f;

public class c
implements f.c<e.d> {
    public final /* synthetic */ g a;
    public final /* synthetic */ Handler b;

    public c(g g2, Handler handler) {
        this.a = g2;
        this.b = handler;
    }

    public void a(Object object) {
        g g2;
        int n2;
        e.d d2 = (e.d)object;
        if (d2 == null) {
            g2 = this.a;
            n2 = 1;
        } else {
            n2 = d2.b;
            if (n2 == 0) {
                this.a.b(d2.a, this.b);
                return;
            }
            g2 = this.a;
        }
        g2.a(n2, this.b);
    }
}

