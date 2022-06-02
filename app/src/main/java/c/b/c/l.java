/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.WindowInsets
 *  c.h.d.b
 *  c.h.j.k
 *  c.h.j.w
 *  c.h.j.w$c
 *  java.lang.Object
 */
package c.b.c;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import c.b.c.k;
import c.h.d.b;
import c.h.j.w;

public class l
implements c.h.j.k {
    public final /* synthetic */ k a;

    public l(k k2) {
        this.a = k2;
    }

    public w a(View view, w w2) {
        int n2;
        WindowInsets windowInsets;
        WindowInsets windowInsets2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = w2.d();
        if (n4 != (n2 = this.a.X(w2, null))) {
            int n5 = w2.b();
            int n6 = w2.c();
            int n7 = w2.a();
            w.c c2 = n3 >= 29 ? new w.b(w2) : (n3 >= 20 ? new w.a(w2) : new w.c(w2));
            c2.c(b.a((int)n5, (int)n2, (int)n6, (int)n7));
            w2 = c2.a();
        }
        if (n3 >= 21 && (windowInsets = w2.g()) != null && !(windowInsets2 = view.onApplyWindowInsets(windowInsets)).equals(windowInsets)) {
            w2 = new w(windowInsets2);
        }
        return w2;
    }
}

