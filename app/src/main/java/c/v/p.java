/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 */
package c.v;

import android.os.Build;

public class p {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    public static {
        boolean bl;
        int n2 = Build.VERSION.SDK_INT;
        a = bl = true;
        b = bl;
        if (n2 < 28) {
            bl = false;
        }
        c = bl;
    }
}

