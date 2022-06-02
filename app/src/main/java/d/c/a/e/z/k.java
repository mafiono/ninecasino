/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.widget.AutoCompleteTextView
 *  android.widget.AutoCompleteTextView$OnDismissListener
 *  d.c.a.e.z.h
 *  java.lang.Object
 *  java.lang.System
 */
package d.c.a.e.z;

import android.widget.AutoCompleteTextView;
import d.c.a.e.z.h;

public class k
implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ h a;

    public k(h h2) {
        this.a = h2;
    }

    public void onDismiss() {
        h h2 = this.a;
        h2.i = true;
        h2.k = System.currentTimeMillis();
        h.f(this.a, false);
    }
}

