/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 *  d.c.a.b.j.t.i.v
 *  d.c.a.b.j.t.i.w
 *  d.c.a.b.j.t.i.x
 *  d.c.a.b.j.t.i.y
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 */
package d.c.a.b.j.t.i;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import d.c.a.b.j.t.i.v;
import d.c.a.b.j.t.i.w;
import d.c.a.b.j.t.i.x;
import d.c.a.b.j.t.i.y;
import java.util.Arrays;
import java.util.List;

public final class z
extends SQLiteOpenHelper {
    public static final List<a> g = Arrays.asList((Object[])new a[]{v.a, w.a, x.a, y.a});
    public final int e;
    public boolean f = false;

    public z(Context context, String string, int n2) {
        super(context, string, null, n2);
        this.e = n2;
    }

    public final void a(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        IllegalArgumentException illegalArgumentException;
        List<a> list = g;
        if (n3 <= list.size()) {
            while (n2 < n3) {
                g.get(n2).a(sQLiteDatabase);
                ++n2;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Migration from ");
        stringBuilder.append(n2);
        stringBuilder.append(" to ");
        stringBuilder.append(n3);
        stringBuilder.append(" was requested, but cannot be performed. Only ");
        stringBuilder.append(list.size());
        stringBuilder.append(" migrations are provided");
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int n2 = this.e;
        if (!this.f) {
            this.onConfigure(sQLiteDatabase);
        }
        this.a(sQLiteDatabase, 0, n2);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        if (!this.f) {
            this.onConfigure(sQLiteDatabase);
        }
        this.a(sQLiteDatabase, 0, n3);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f) {
            this.onConfigure(sQLiteDatabase);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        if (!this.f) {
            this.onConfigure(sQLiteDatabase);
        }
        this.a(sQLiteDatabase, n2, n3);
    }

    public interface a {
        void a(SQLiteDatabase var1);
    }

}

