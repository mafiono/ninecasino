/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Paint
 *  d.c.a.e.a
 *  d.c.a.e.b
 *  d.c.a.e.m.g
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.a.e.m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import d.c.a.e.a;
import d.c.a.e.b;
import d.c.a.e.m.g;

public final class c {
    public final d.c.a.e.m.b a;
    public final d.c.a.e.m.b b;
    public final d.c.a.e.m.b c;
    public final d.c.a.e.m.b d;
    public final d.c.a.e.m.b e;
    public final d.c.a.e.m.b f;
    public final d.c.a.e.m.b g;
    public final Paint h;

    public c(Context context) {
        Paint paint;
        TypedArray typedArray = context.obtainStyledAttributes(a.l0((Context)context, (int)2130903584, (String)g.class.getCanonicalName()), b.k);
        this.a = d.c.a.e.m.b.a(context, typedArray.getResourceId(3, 0));
        this.g = d.c.a.e.m.b.a(context, typedArray.getResourceId(1, 0));
        this.b = d.c.a.e.m.b.a(context, typedArray.getResourceId(2, 0));
        this.c = d.c.a.e.m.b.a(context, typedArray.getResourceId(4, 0));
        ColorStateList colorStateList = a.B((Context)context, (TypedArray)typedArray, (int)5);
        this.d = d.c.a.e.m.b.a(context, typedArray.getResourceId(7, 0));
        this.e = d.c.a.e.m.b.a(context, typedArray.getResourceId(6, 0));
        this.f = d.c.a.e.m.b.a(context, typedArray.getResourceId(8, 0));
        this.h = paint = new Paint();
        paint.setColor(colorStateList.getDefaultColor());
        typedArray.recycle();
    }
}

