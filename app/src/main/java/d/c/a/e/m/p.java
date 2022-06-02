/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  com.google.android.material.internal.CheckableImageButton
 *  d.c.a.e.m.o
 *  java.lang.Object
 */
package d.c.a.e.m;

import android.view.View;
import android.widget.Button;
import com.google.android.material.internal.CheckableImageButton;
import d.c.a.e.m.d;
import d.c.a.e.m.o;

public class p
implements View.OnClickListener {
    public final /* synthetic */ o e;

    public p(o o2) {
        this.e = o2;
    }

    public void onClick(View view) {
        o o2 = this.e;
        o2.E0.setEnabled(o2.t0.l());
        this.e.C0.toggle();
        o o3 = this.e;
        o3.E0(o3.C0);
        this.e.C0();
    }
}

