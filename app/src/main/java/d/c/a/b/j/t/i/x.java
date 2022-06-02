/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.a.b.j.t.i;

import android.database.sqlite.SQLiteDatabase;
import d.c.a.b.j.t.i.z;

public final class x
implements z.a {
    public static final x a = new x();

    @Override
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}

