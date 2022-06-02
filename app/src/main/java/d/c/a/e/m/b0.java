/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  d.c.a.e.m.c0
 *  d.c.a.e.m.g
 *  java.lang.Object
 */
package d.c.a.e.m;

import android.view.View;
import d.c.a.e.m.a;
import d.c.a.e.m.c0;
import d.c.a.e.m.g;
import d.c.a.e.m.s;

public class b0
implements View.OnClickListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ c0 f;

    public b0(c0 c02, int n2) {
        this.f = c02;
        this.e = n2;
    }

    public void onClick(View view) {
        s s2 = s.r(this.e, this.f.c.c0.g);
        a a2 = this.f.c.b0;
        if (s2.q(a2.e) < 0) {
            s2 = a2.e;
        } else if (s2.q(a2.f) > 0) {
            s2 = a2.f;
        }
        this.f.c.y0(s2);
        this.f.c.z0(g.e.e);
    }
}

