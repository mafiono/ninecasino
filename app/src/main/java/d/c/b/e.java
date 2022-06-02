/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import d.c.b.x.g;

public final class e
implements g {
    public static final e a = new e();

    public String a(Object object) {
        ApplicationInfo applicationInfo = ((Context)object).getApplicationInfo();
        if (applicationInfo != null && Build.VERSION.SDK_INT >= 24) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }
}

