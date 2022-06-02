/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.widget.AutoCompleteTextView
 *  d.c.a.e.z.h
 *  java.lang.Object
 */
package d.c.a.e.z;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import d.c.a.e.z.h;

public class j
implements View.OnTouchListener {
    public final /* synthetic */ AutoCompleteTextView e;
    public final /* synthetic */ h f;

    public j(h h2, AutoCompleteTextView autoCompleteTextView) {
        this.f = h2;
        this.e = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f.i()) {
                this.f.i = false;
            }
            h.g(this.f, this.e);
        }
        return false;
    }
}

