/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  d.c.a.e.a
 *  java.lang.Object
 */
package d.c.a.e.o;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class a {
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;

    public a(Context context) {
        this.a = d.c.a.e.a.k0((Context)context, (int)2130903338, (boolean)false);
        this.b = d.c.a.e.a.z((Context)context, (int)2130903337, (int)0);
        this.c = d.c.a.e.a.z((Context)context, (int)2130903232, (int)0);
        this.d = context.getResources().getDisplayMetrics().density;
    }
}

