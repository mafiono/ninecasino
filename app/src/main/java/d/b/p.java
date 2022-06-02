/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.b.o
 *  d.b.o$d
 *  java.lang.Object
 *  java.lang.String
 *  java.net.URLEncoder
 *  java.util.ArrayList
 *  java.util.Locale
 */
package d.b;

import d.b.o;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;

public class p
implements o.d {
    public final /* synthetic */ ArrayList a;

    public p(o o2, ArrayList arrayList) {
        this.a = arrayList;
    }

    public void a(String string, String string2) {
        ArrayList arrayList = this.a;
        Locale locale = Locale.US;
        Object[] arrobject = new Object[]{string, URLEncoder.encode(string2, "UTF-8")};
        arrayList.add(String.format(locale, "%s=%s", arrobject));
    }
}

