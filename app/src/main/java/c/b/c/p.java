/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewParent
 *  androidx.appcompat.widget.ActionBarContextView
 *  c.h.j.n
 *  c.h.j.s
 *  c.h.j.t
 */
package c.b.c;

import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.ActionBarContextView;
import c.b.c.k;
import c.h.j.n;
import c.h.j.s;
import c.h.j.t;
import c.h.j.u;

public class p
extends u {
    public final /* synthetic */ k a;

    public p(k k2) {
        this.a = k2;
    }

    public void a(View view) {
        this.a.s.setAlpha(1.0f);
        this.a.v.d(null);
        this.a.v = null;
    }

    @Override
    public void b(View view) {
        this.a.s.setVisibility(0);
        this.a.s.sendAccessibilityEvent(32);
        if (this.a.s.getParent() instanceof View) {
            n.r((View) this.a.s.getParent());
        }
    }
}

