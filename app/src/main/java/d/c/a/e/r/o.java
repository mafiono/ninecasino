/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.widget.ImageButton
 */
package d.c.a.e.r;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint(value={"AppCompatCustomView"})
public class o
extends ImageButton {
    public int e;

    public final void b(int n2, boolean bl) {
        super.setVisibility(n2);
        if (bl) {
            this.e = n2;
        }
    }

    public final int getUserSetVisibility() {
        return this.e;
    }

    public void setVisibility(int n2) {
        super.setVisibility(n2);
        this.e = n2;
    }
}

