/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.m.e.o;

import android.content.Context;
import d.c.b.m.e.b;
import java.io.File;

public class h {
    public final Context a;

    public h(Context context) {
        this.a = context;
    }

    public File a() {
        File file = new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics");
        b b2 = b.a;
        if (!file.exists()) {
            if (file.mkdirs()) {
                return file;
            }
            b2.f("Couldn't create file");
            file = null;
        }
        return file;
    }
}

