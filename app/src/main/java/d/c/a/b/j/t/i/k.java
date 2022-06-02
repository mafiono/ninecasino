/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  d.c.a.b.b
 *  d.c.a.b.j.e
 *  d.c.a.b.j.f
 *  d.c.a.b.j.f$a
 *  d.c.a.b.j.i
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package d.c.a.b.j.t.i;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import d.c.a.b.j.a;
import d.c.a.b.j.e;
import d.c.a.b.j.f;
import d.c.a.b.j.i;
import d.c.a.b.j.t.i.b;
import d.c.a.b.j.t.i.l;
import d.c.a.b.j.t.i.t;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class k
implements t.b {
    public final t a;
    public final List b;
    public final i c;

    public k(t t2, List list, i i2) {
        this.a = t2;
        this.b = list;
        this.c = i2;
    }

    public Object a(Object object) {
        t t2 = this.a;
        List list = this.b;
        i i2 = this.c;
        Cursor cursor = (Cursor)object;
        while (cursor.moveToNext()) {
            long l2 = cursor.getLong(0);
            boolean bl = cursor.getInt(7) != 0;
            a.b b2 = new a.b();
            b2.f = new HashMap();
            b2.f(cursor.getString(1));
            b2.e(cursor.getLong(2));
            b2.g(cursor.getLong(3));
            if (bl) {
                String string = cursor.getString(4);
                d.c.a.b.b b3 = string == null ? t.i : new d.c.a.b.b(string);
                b2.d(new e(b3, cursor.getBlob(5)));
            } else {
                String string = cursor.getString(4);
                d.c.a.b.b b4 = string == null ? t.i : new d.c.a.b.b(string);
                SQLiteDatabase sQLiteDatabase = t2.e();
                String[] arrstring = new String[]{"bytes"};
                String[] arrstring2 = new String[]{String.valueOf(l2)};
                b2.d(new e(b4, (byte[])t.A(sQLiteDatabase.query("event_payloads", arrstring, "event_id = ?", arrstring2, null, null, "sequence_num"), l.a)));
            }
            if (!cursor.isNull(6)) {
                b2.b = cursor.getInt(6);
            }
            list.add(new b(l2, i2, b2.b()));
        }
        return null;
    }
}

