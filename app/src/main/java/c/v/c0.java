/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.WindowId
 *  java.lang.Object
 */
package c.v;

import android.view.View;
import android.view.WindowId;
import c.v.d0;

public class c0
implements d0 {
    public final WindowId a;

    public c0(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object object) {
        return object instanceof c0 && ((c0)object).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

