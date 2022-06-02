/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 */
package d.c.a.e.l;

import android.os.Build;

public class c {
    public static final int a;

    /*
     * Enabled aggressive block sorting
     */
    public static {
        int n2 = Build.VERSION.SDK_INT >= 21 ? 2 : 1;
        a = n2;
    }
}

