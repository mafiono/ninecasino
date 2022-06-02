/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  d.a.b.a.a
 *  d.c.a.e.b
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.a.e.r;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import d.a.b.a.a;
import d.c.a.e.b;

public final class j {
    public static final int[] a = new int[]{2130903225};
    public static final int[] b = new int[]{2130903228};

    public static void a(Context context, AttributeSet attributeSet, int n2, int n3) {
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, b.x, n2, n3);
        boolean bl = typedArray.getBoolean(1, false);
        typedArray.recycle();
        if (bl) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(2130903450, typedValue, true) || typedValue.type == 18 && typedValue.data == 0) {
                j.c(context, b, "Theme.MaterialComponents");
            }
        }
        j.c(context, a, "Theme.AppCompat");
    }

    public static /* varargs */ void b(Context context, AttributeSet attributeSet, int[] arrn, int n2, int n3, int ... arrn2) {
        IllegalArgumentException illegalArgumentException;
        boolean bl;
        TypedArray typedArray;
        block6 : {
            block8 : {
                block7 : {
                    typedArray = context.obtainStyledAttributes(attributeSet, b.x, n2, n3);
                    if (!typedArray.getBoolean(2, false)) {
                        typedArray.recycle();
                        return;
                    }
                    if (arrn2 == null || arrn2.length == 0) break block7;
                    TypedArray typedArray2 = context.obtainStyledAttributes(attributeSet, arrn, n2, n3);
                    int n4 = arrn2.length;
                    for (int i2 = 0; i2 < n4; ++i2) {
                        if (typedArray2.getResourceId(arrn2[i2], -1) != -1) continue;
                        typedArray2.recycle();
                        bl = false;
                        break block6;
                    }
                    typedArray2.recycle();
                    break block8;
                }
                int n5 = typedArray.getResourceId(0, -1);
                bl = false;
                if (n5 == -1) break block6;
            }
            bl = true;
        }
        typedArray.recycle();
        if (bl) {
            return;
        }
        illegalArgumentException = new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        throw illegalArgumentException;
    }

    public static void c(Context context, int[] arrn, String string) {
        IllegalArgumentException illegalArgumentException;
        boolean bl;
        block2 : {
            TypedArray typedArray = context.obtainStyledAttributes(arrn);
            for (int i2 = 0; i2 < arrn.length; ++i2) {
                if (typedArray.hasValue(i2)) continue;
                typedArray.recycle();
                bl = false;
                break block2;
            }
            typedArray.recycle();
            bl = true;
        }
        if (bl) {
            return;
        }
        illegalArgumentException = new IllegalArgumentException(a.n((String)"The style on this component requires your app theme to be ", (String)string, (String)" (or a descendant)."));
        throw illegalArgumentException;
    }

    public static /* varargs */ TypedArray d(Context context, AttributeSet attributeSet, int[] arrn, int n2, int n3, int ... arrn2) {
        j.a(context, attributeSet, n2, n3);
        j.b(context, attributeSet, arrn, n2, n3, arrn2);
        return context.obtainStyledAttributes(attributeSet, arrn, n2, n3);
    }
}

