/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  java.lang.Object
 *  java.lang.System
 *  java.util.ArrayList
 */
package d.c.a.b.j.t.i;

import android.database.Cursor;
import d.c.a.b.j.t.i.t;
import java.util.ArrayList;

public final class l
implements t.b {
    public static final l a = new l();

    public Object a(Object object) {
        Cursor cursor = (Cursor)object;
        ArrayList arrayList = new ArrayList();
        int n2 = 0;
        while (cursor.moveToNext()) {
            byte[] arrby = cursor.getBlob(0);
            arrayList.add(arrby);
            n2 += arrby.length;
        }
        byte[] arrby = new byte[n2];
        int n3 = 0;
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            byte[] arrby2 = (byte[])arrayList.get(i2);
            System.arraycopy(arrby2, 0, arrby, n3, arrby2.length);
            n3 += arrby2.length;
        }
        return arrby;
    }
}

