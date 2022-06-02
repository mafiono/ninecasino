/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  com.google.firebase.FirebaseCommonRegistrar
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.FirebaseCommonRegistrar;

public final class g
implements d.c.b.x.g {
    public static final g a = new g();

    public String a(Object object) {
        Context context = (Context)object;
        String string = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (string != null) {
            return FirebaseCommonRegistrar.a((String)string);
        }
        return "";
    }
}

