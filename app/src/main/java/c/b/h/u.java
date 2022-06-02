/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.view.View
 *  c.b.g.i.p
 *  c.b.h.g0
 *  c.b.h.v$d
 *  c.b.h.v$f
 */
package c.b.h;

import android.annotation.SuppressLint;
import android.view.View;
import c.b.g.i.p;
import c.b.h.g0;
import c.b.h.v;

public class u
extends g0 {
    public final /* synthetic */ v.d n;
    public final /* synthetic */ v o;

    public u(v v2, View view, v.d d2) {
        this.o = v2;
        this.n = d2;
        super(view);
    }

    public p b() {
        return this.n;
    }

    @SuppressLint(value={"SyntheticAccessor"})
    public boolean c() {
        if (!this.o.getInternalPopup().b()) {
            this.o.b();
        }
        return true;
    }
}

