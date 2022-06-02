/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.accessibility.AccessibilityNodeInfo
 *  c.h.j.a
 *  c.h.j.x.b
 *  d.c.a.e.m.g
 *  java.lang.CharSequence
 *  java.lang.String
 */
package d.c.a.e.m;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import c.h.j.a;
import c.h.j.x.b;
import d.c.a.e.m.g;

public class i
extends a {
    public final /* synthetic */ g d;

    public i(g g2) {
        this.d = g2;
    }

    public void d(View view, b b3) {
        g g2;
        int n2;
        this.a.onInitializeAccessibilityNodeInfo(view, b3.a);
        if (this.d.i0.getVisibility() == 0) {
            g2 = this.d;
            n2 = 2131624069;
        } else {
            g2 = this.d;
            n2 = 2131624067;
        }
        b3.k((CharSequence)g2.y(n2));
    }
}

