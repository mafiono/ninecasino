/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.m.e.u;

import android.content.Context;
import android.content.res.Resources;
import d.c.b.m.e.b;
import d.c.b.m.e.k.g;

public class a {
    public final Context a;
    public boolean b = false;
    public String c;

    public a(Context context) {
        this.a = context;
    }

    public String a() {
        String string;
        if (!this.b) {
            String string2;
            Context context = this.a;
            int n2 = g.m(context, "com.google.firebase.crashlytics.unity_version", "string");
            if (n2 != 0) {
                string2 = context.getResources().getString(n2);
                b b2 = b.a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unity Editor version is: ");
                stringBuilder.append(string2);
                b2.b(stringBuilder.toString());
            } else {
                string2 = null;
            }
            this.c = string2;
            this.b = true;
        }
        if ((string = this.c) != null) {
            return string;
        }
        return null;
    }
}

