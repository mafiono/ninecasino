/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  d.c.a.e.m.g
 *  java.lang.Object
 */
package d.c.a.e.m;

import android.view.View;
import d.c.a.e.m.g;

public class k
implements View.OnClickListener {
    public final /* synthetic */ g e;

    public k(g g2) {
        this.e = g2;
    }

    public void onClick(View view) {
        g g2 = this.e;
        g.e e2 = g.e.e;
        g.e e3 = g2.d0;
        g.e e4 = g.e.f;
        if (e3 == e4) {
            g2.z0(e2);
            return;
        }
        if (e3 == e2) {
            g2.z0(e4);
        }
    }
}

