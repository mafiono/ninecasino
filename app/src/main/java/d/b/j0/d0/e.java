/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.b.d0
 *  d.b.g0.a
 *  d.b.j0.d0.j.a
 *  d.b.j0.d0.j.b
 *  d.b.j0.d0.j.d
 *  d.b.j0.j
 *  d.b.j0.j$b
 *  d.b.j0.w
 *  d.b.o
 *  d.b.o$c
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 *  org.json.JSONArray
 */
package d.b.j0.d0;

import d.b.d0;
import d.b.j0.d0.j.a;
import d.b.j0.d0.j.b;
import d.b.j0.d0.j.c;
import d.b.j0.d0.j.d;
import d.b.j0.j;
import d.b.j0.w;
import d.b.o;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;

public final class e
implements j.b {
    public void a(boolean bl) {
        if (bl && d0.c()) {
            if (w.x()) {
                return;
            }
            File file = d.b.g0.a.g();
            int n2 = 0;
            File[] arrfile = file == null ? new File[0] : file.listFiles((FilenameFilter)new d());
            ArrayList arrayList = new ArrayList();
            int n3 = arrfile.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                a a2 = new a(arrfile[i2]);
                boolean bl2 = a2.b != null && a2.c != null;
                if (!bl2) continue;
                arrayList.add(a2);
            }
            Collections.sort(arrayList, new b());
            JSONArray jSONArray = new JSONArray();
            while (n2 < arrayList.size() && n2 < 1000) {
                jSONArray.put(arrayList.get(n2));
                ++n2;
            }
            d.b.g0.a.m((String)"error_reports", (JSONArray)jSONArray, (o.c)new c(arrayList));
        }
    }
}

