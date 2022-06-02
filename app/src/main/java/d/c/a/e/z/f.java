/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  com.google.android.material.textfield.TextInputLayout
 */
package d.c.a.e.z;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import d.c.a.e.z.m;

public class f
extends m {
    public f(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    @Override
    public void a() {
        this.a.setEndIconOnClickListener(null);
        this.a.setEndIconOnLongClickListener(null);
    }
}

