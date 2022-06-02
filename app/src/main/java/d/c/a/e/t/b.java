/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.TypedArray
 *  android.graphics.Typeface
 *  android.os.Handler
 *  android.text.TextPaint
 *  android.util.Log
 *  android.util.TypedValue
 *  c.h.c.b.g
 *  c.h.c.b.h
 *  d.a.b.a.a
 *  d.c.a.e.a
 *  d.c.a.e.b
 *  d.c.a.e.t.b$a
 *  d.c.a.e.t.c
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package d.c.a.e.t;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import c.h.c.b.g;
import c.h.c.b.h;
import d.c.a.e.t.b;
import d.c.a.e.t.c;
import d.c.a.e.t.d;

public class b {
    public final float a;
    public final ColorStateList b;
    public final int c;
    public final int d;
    public final String e;
    public final ColorStateList f;
    public final float g;
    public final float h;
    public final float i;
    public final int j;
    public boolean k = false;
    public Typeface l;

    public b(Context context, int n2) {
        TypedArray typedArray = context.obtainStyledAttributes(n2, d.c.a.e.b.u);
        this.a = typedArray.getDimension(0, 0.0f);
        this.b = d.c.a.e.a.B((Context)context, (TypedArray)typedArray, (int)3);
        d.c.a.e.a.B((Context)context, (TypedArray)typedArray, (int)4);
        d.c.a.e.a.B((Context)context, (TypedArray)typedArray, (int)5);
        this.c = typedArray.getInt(2, 0);
        this.d = typedArray.getInt(1, 1);
        int n3 = 12;
        if (!typedArray.hasValue(n3)) {
            n3 = 10;
        }
        this.j = typedArray.getResourceId(n3, 0);
        this.e = typedArray.getString(n3);
        typedArray.getBoolean(14, false);
        this.f = d.c.a.e.a.B((Context)context, (TypedArray)typedArray, (int)6);
        this.g = typedArray.getFloat(7, 0.0f);
        this.h = typedArray.getFloat(8, 0.0f);
        this.i = typedArray.getFloat(9, 0.0f);
        typedArray.recycle();
    }

    public final void a() {
        String string;
        if (this.l == null && (string = this.e) != null) {
            this.l = Typeface.create(string, this.c);
        }
        if (this.l == null) {
            int n2 = this.d;
            Typeface typeface = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE) : Typeface.SERIF) : Typeface.SANS_SERIF;
            this.l = typeface;
            this.l = Typeface.create(this.l, this.c);
        }
    }

    public void b(Context context, d d2) {
        this.a();
        int n2 = this.j;
        if (n2 == 0) {
            this.k = true;
        }
        if (this.k) {
            d2.b(this.l, true);
            return;
        }
        try {
            a a2 = new a(this, d2);
            if (context.isRestricted()) {
                a2.a(-4, null);
                return;
            }
            h.d((Context)context, (int)n2, (TypedValue)new TypedValue(), (int)0, (g)a2, null, (boolean)false);
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = d.a.b.a.a.d((String)"Error loading font ");
            stringBuilder.append(this.e);
            Log.d("TextAppearance", stringBuilder.toString(), exception);
            this.k = true;
            d2.a(-3);
            return;
        }
        catch (Resources.NotFoundException notFoundException) {
            this.k = true;
            d2.a(1);
            return;
        }
    }

    public void c(Context context, TextPaint textPaint, d d2) {
        this.a();
        this.d(textPaint, this.l);
        this.b(context, new c(this, textPaint, d2));
        ColorStateList colorStateList = this.b;
        int n2 = colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216;
        textPaint.setColor(n2);
        float f2 = this.i;
        float f3 = this.g;
        float f4 = this.h;
        ColorStateList colorStateList2 = this.f;
        int n3 = colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0;
        textPaint.setShadowLayer(f2, f3, f4, n3);
    }

    public void d(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int n2 = this.c & (-1 ^ typeface.getStyle());
        boolean bl = (n2 & 1) != 0;
        textPaint.setFakeBoldText(bl);
        float f2 = (n2 & 2) != 0 ? -0.25f : 0.0f;
        textPaint.setTextSkewX(f2);
        textPaint.setTextSize(this.a);
    }
}

