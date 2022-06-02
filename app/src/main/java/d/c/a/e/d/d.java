/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  c.h.j.x.d
 *  c.h.j.x.d$a
 *  com.google.android.material.appbar.AppBarLayout
 *  com.google.android.material.appbar.AppBarLayout$BaseBehavior
 *  java.lang.Object
 */
package d.c.a.e.d;

import android.view.View;
import c.h.j.x.d;
import com.google.android.material.appbar.AppBarLayout;

public class d
implements c.h.j.x.d {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ boolean b;

    public d(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean bl) {
        this.a = appBarLayout;
        this.b = bl;
    }

    public boolean a(View view, d.a a2) {
        this.a.setExpanded(this.b);
        return true;
    }
}

