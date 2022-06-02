/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.coordinatorlayout.widget.CoordinatorLayout
 *  c.h.j.x.d
 *  c.h.j.x.d$a
 *  com.google.android.material.appbar.AppBarLayout
 *  com.google.android.material.appbar.AppBarLayout$BaseBehavior
 *  java.lang.Object
 */
package d.c.a.e.d;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.j.x.d;
import com.google.android.material.appbar.AppBarLayout;

public class c
implements d {
    public final /* synthetic */ CoordinatorLayout a;
    public final /* synthetic */ AppBarLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ AppBarLayout.BaseBehavior e;

    public c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int n2) {
        this.e = baseBehavior;
        this.a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = view;
        this.d = n2;
    }

    public boolean a(View view, d.a a2) {
        this.e.L(this.a, this.b, this.c, this.d, new int[]{0, 0});
        return true;
    }
}

