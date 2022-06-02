/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  c.h.j.n
 *  c.h.j.n$b
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 */
package c.h.j;

import android.view.View;
import c.h.j.n;

public class q
extends n.b<Boolean> {
    public q(int n2, Class class_, int n3) {
        super(n2, class_, n3);
    }

    public Object b(View view) {
        return view.isAccessibilityHeading();
    }

    public void d(View view, Object object) {
        view.setAccessibilityHeading(((Boolean)object).booleanValue());
    }

    public boolean e(Object object, Object object2) {
        return true ^ this.a((Boolean)object, (Boolean)object2);
    }
}

