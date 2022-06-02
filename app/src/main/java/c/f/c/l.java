/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewParent
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  c.f.c.c
 */
package c.f.c;

import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.f.c.c;

public abstract class l
extends c {
    public boolean k;
    public boolean l;

    public void e(AttributeSet attributeSet) {
        super.e(null);
    }

    public void k() {
    }

    public void onAttachedToWindow() {
        ViewParent viewParent;
        int n2 = Build.VERSION.SDK_INT;
        super.onAttachedToWindow();
        if ((this.k || this.l) && (viewParent = this.getParent()) != null && viewParent instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout)viewParent;
            int n3 = this.getVisibility();
            float f2 = n2 >= 21 ? this.getElevation() : 0.0f;
            for (int i2 = 0; i2 < this.f; ++i2) {
                View view = constraintLayout.d(this.e[i2]);
                if (view == null) continue;
                if (this.k) {
                    view.setVisibility(n3);
                }
                if (!this.l || !(f2 > 0.0f) || n2 < 21) continue;
                view.setTranslationZ(f2 + view.getTranslationZ());
            }
        }
    }

    public void setElevation(float f2) {
        View.super.setElevation(f2);
        this.c();
    }

    public void setVisibility(int n2) {
        View.super.setVisibility(n2);
        this.c();
    }
}

