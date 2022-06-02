/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.m;

import android.os.Bundle;
import d.c.b.k.a.a;
import d.c.b.m.e.i.b;

public class a
implements a.b {
    public b a;
    public b b;

    public void a(int n2, Bundle bundle) {
        d.c.b.m.e.b b3 = d.c.b.m.e.b.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Received Analytics message: ");
        stringBuilder.append(n2);
        stringBuilder.append(" ");
        stringBuilder.append(bundle);
        b3.b(stringBuilder.toString());
        String string = bundle.getString("name");
        if (string != null) {
            b b4;
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ((b4 = "clx".equals(bundle2.getString("_o")) ? this.a : this.b) == null) {
                return;
            }
            b4.b(string, bundle2);
        }
    }
}

