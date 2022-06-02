/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  c.b.h.m0
 *  c.b.h.n0
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 */
package c.b.h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import c.b.h.m0;
import c.b.h.n0;
import java.lang.ref.WeakReference;

public class v0
extends n0 {
    public final WeakReference<Context> b;

    public v0(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference(context);
    }

    public Drawable getDrawable(int n2) {
        Drawable drawable = this.a.getDrawable(n2);
        Context context = this.b.get();
        if (drawable != null && context != null) {
            m0.d().l(context, n2, drawable);
        }
        return drawable;
    }
}

