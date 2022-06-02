/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.widget.TextView
 *  c.h.b.g
 *  d.c.a.e.a
 *  d.c.a.e.b
 *  d.c.a.e.w.a
 *  d.c.a.e.w.g
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.a.e.m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import d.c.a.e.a;
import d.c.a.e.w.c;
import d.c.a.e.w.g;
import d.c.a.e.w.j;

public final class b {
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final j f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int n2, j j2, Rect rect) {
        c.h.b.g.f((int)rect.left);
        c.h.b.g.f((int)rect.top);
        c.h.b.g.f((int)rect.right);
        c.h.b.g.f((int)rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = n2;
        this.f = j2;
    }

    public static b a(Context context, int n2) {
        boolean bl = n2 != 0;
        if (bl) {
            TypedArray typedArray = context.obtainStyledAttributes(n2, d.c.a.e.b.l);
            Rect rect = new Rect(typedArray.getDimensionPixelOffset(0, 0), typedArray.getDimensionPixelOffset(2, 0), typedArray.getDimensionPixelOffset(1, 0), typedArray.getDimensionPixelOffset(3, 0));
            ColorStateList colorStateList = a.B((Context)context, (TypedArray)typedArray, (int)4);
            ColorStateList colorStateList2 = a.B((Context)context, (TypedArray)typedArray, (int)9);
            ColorStateList colorStateList3 = a.B((Context)context, (TypedArray)typedArray, (int)7);
            int n3 = typedArray.getDimensionPixelSize(8, 0);
            j j2 = j.a(context, typedArray.getResourceId(5, 0), typedArray.getResourceId(6, 0), new d.c.a.e.w.a((float)false)).a();
            typedArray.recycle();
            b b2 = new b(colorStateList, colorStateList2, colorStateList3, n3, j2, rect);
            return b2;
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    public void b(TextView textView) {
        g g2 = new g();
        g g3 = new g();
        g2.setShapeAppearanceModel(this.f);
        g3.setShapeAppearanceModel(this.f);
        g2.p(this.c);
        g2.s((float)this.e, this.d);
        textView.setTextColor(this.b);
        Object object = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.b.withAlpha(30), g2, g3) : g2;
        Rect rect = this.a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable)object, rect.left, rect.top, rect.right, rect.bottom);
        textView.setBackground(insetDrawable);
    }
}

