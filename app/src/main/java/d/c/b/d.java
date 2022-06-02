/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import d.c.b.x.g;

public final class d
implements g {
    public static final d a = new d();

    public String a(Object object) {
        ApplicationInfo applicationInfo = ((Context)object).getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }
}

