/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.graphics.Outline
 *  android.view.View
 *  android.view.ViewOutlineProvider
 *  com.google.android.material.chip.Chip
 *  d.c.a.e.k.b
 */
package d.c.a.e.k;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import d.c.a.e.k.b;

public class a
extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public a(Chip chip) {
        this.a = chip;
    }

    @TargetApi(value=21)
    public void getOutline(View view, Outline outline) {
        b b2 = this.a.h;
        if (b2 != null) {
            b2.getOutline(outline);
            return;
        }
        outline.setAlpha(0.0f);
    }
}

