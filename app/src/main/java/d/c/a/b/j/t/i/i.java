/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.sqlite.SQLiteDatabase
 *  d.c.a.b.d
 *  d.c.a.b.j.i
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.a.b.j.t.i;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import d.c.a.b.d;
import d.c.a.b.j.t.i.t;
import d.c.a.b.j.w.a;

public final class i
implements t.b {
    public final long a;
    public final d.c.a.b.j.i b;

    public i(long l2, d.c.a.b.j.i i2) {
        this.a = l2;
        this.b = i2;
    }

    public Object a(Object object) {
        long l2 = this.a;
        d.c.a.b.j.i i2 = this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase)object;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(l2));
        String[] arrstring = new String[]{i2.b(), String.valueOf((int)a.a(i2.d()))};
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", arrstring) < 1) {
            contentValues.put("backend_name", i2.b());
            contentValues.put("priority", Integer.valueOf((int)a.a(i2.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}

