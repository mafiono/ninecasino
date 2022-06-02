/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  java.lang.Object
 */
package d.c.a.e.r;

import android.os.Build;
import android.view.View;

public final class l
implements View.OnAttachStateChangeListener {
    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
            return;
        }
        view.requestFitSystemWindows();
    }

    public void onViewDetachedFromWindow(View view) {
    }
}

