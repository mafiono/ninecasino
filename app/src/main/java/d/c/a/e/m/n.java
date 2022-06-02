/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.accessibility.AccessibilityNodeInfo
 *  c.h.j.a
 *  c.h.j.x.b
 *  com.google.android.material.datepicker.MaterialCalendarGridView
 *  java.lang.Object
 */
package d.c.a.e.m;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import c.h.j.a;
import c.h.j.x.b;
import com.google.android.material.datepicker.MaterialCalendarGridView;

public class n
extends a {
    public n(MaterialCalendarGridView materialCalendarGridView) {
    }

    public void d(View view, b b3) {
        this.a.onInitializeAccessibilityNodeInfo(view, b3.a);
        b3.i(null);
    }
}

