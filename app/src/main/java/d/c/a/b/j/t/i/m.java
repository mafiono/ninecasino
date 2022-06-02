/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  java.lang.Object
 */
package d.c.a.b.j.t.i;

import android.database.sqlite.SQLiteDatabase;
import d.c.a.b.j.t.i.t;

public final class m
implements t.d {
    public final SQLiteDatabase a;

    public m(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public Object a() {
        SQLiteDatabase sQLiteDatabase = this.a;
        sQLiteDatabase.beginTransaction();
        return null;
    }
}

