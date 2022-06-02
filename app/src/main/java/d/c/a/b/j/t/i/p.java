/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.util.Base64
 *  d.c.a.b.d
 *  d.c.a.b.j.i
 *  d.c.a.b.j.i$a
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package d.c.a.b.j.t.i;

import android.database.Cursor;
import android.util.Base64;
import d.c.a.b.d;
import d.c.a.b.j.b;
import d.c.a.b.j.i;
import d.c.a.b.j.t.i.t;
import d.c.a.b.j.w.a;
import java.util.ArrayList;

public final class p
implements t.b {
    public static final p a = new p();

    public Object a(Object object) {
        Cursor cursor = (Cursor)object;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            i.a a2 = i.a();
            a2.b(cursor.getString(1));
            a2.c(a.b(cursor.getInt(2)));
            String string = cursor.getString(3);
            byte[] arrby = string == null ? null : Base64.decode(string, 0);
            b.b b2 = (b.b)a2;
            b2.b = arrby;
            arrayList.add((Object)b2.a());
        }
        return arrayList;
    }
}

