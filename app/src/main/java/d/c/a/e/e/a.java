/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  c.h.j.n
 *  c.h.j.x.d
 *  c.h.j.x.d$a
 *  com.google.android.material.behavior.SwipeDismissBehavior
 *  java.lang.Object
 *  java.util.Objects
 */
package d.c.a.e.e;

import android.view.View;
import c.h.j.n;
import c.h.j.x.d;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;

public class a
implements d {
    public final /* synthetic */ SwipeDismissBehavior a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    public boolean a(View view, d.a a2) {
        block4 : {
            boolean bl;
            block6 : {
                block5 : {
                    if (!this.a.B(view)) break block4;
                    boolean bl2 = view.getLayoutDirection() == 1;
                    int n2 = this.a.c;
                    if (n2 == 0 && bl2) break block5;
                    bl = false;
                    if (n2 != 1) break block6;
                    bl = false;
                    if (bl2) break block6;
                }
                bl = true;
            }
            int n3 = view.getWidth();
            if (bl) {
                n3 = -n3;
            }
            n.m((View)view, (int)n3);
            view.setAlpha(0.0f);
            Objects.requireNonNull((Object)this.a);
            return true;
        }
        return false;
    }
}

