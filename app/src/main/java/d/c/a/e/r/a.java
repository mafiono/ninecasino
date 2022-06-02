/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  c.h.j.a
 *  c.h.j.x.b
 *  com.google.android.material.internal.CheckableImageButton
 */
package d.c.a.e.r;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import c.h.j.x.b;
import com.google.android.material.internal.CheckableImageButton;

public class a
extends c.h.j.a {
    public final /* synthetic */ CheckableImageButton d;

    public a(CheckableImageButton checkableImageButton) {
        this.d = checkableImageButton;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.d.isChecked());
    }

    public void d(View view, b b3) {
        this.a.onInitializeAccessibilityNodeInfo(view, b3.a);
        boolean bl = this.d.h;
        b3.a.setCheckable(bl);
        boolean bl2 = this.d.isChecked();
        b3.a.setChecked(bl2);
    }
}

