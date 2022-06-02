/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Color
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.a.e.u;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

public class b {
    public static final boolean a;
    public static final int[] b;
    public static final String c;

    public static {
        boolean bl = Build.VERSION.SDK_INT >= 21;
        a = bl;
        b = new int[]{16842910, 16842919};
        c = b.class.getSimpleName();
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int n2 = Build.VERSION.SDK_INT;
            if (n2 >= 22 && n2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(b, 0)) != 0) {
                Log.w(c, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean b(int[] arrn) {
        int n2 = arrn.length;
        boolean bl = false;
        boolean bl2 = false;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = arrn[i2];
            if (n3 == 16842910) {
                bl = true;
                continue;
            }
            if (n3 != 16842908 && n3 != 16842919 && n3 != 16843623) continue;
            bl2 = true;
        }
        boolean bl3 = false;
        if (!bl) return bl3;
        bl3 = false;
        if (!bl2) return bl3;
        return true;
    }
}

