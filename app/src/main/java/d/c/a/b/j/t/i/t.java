/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabaseLockedException
 *  android.database.sqlite.SQLiteStatement
 *  android.os.SystemClock
 *  android.util.Base64
 *  d.a.b.a.a
 *  d.b.g0.a
 *  d.c.a.b.b
 *  d.c.a.b.d
 *  d.c.a.b.j.f
 *  d.c.a.b.j.i
 *  d.c.a.b.j.t.i.c
 *  d.c.a.b.j.t.i.d
 *  d.c.a.b.j.t.i.h
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package d.c.a.b.j.t.i;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import android.util.Base64;
import d.c.a.b.j.f;
import d.c.a.b.j.t.i.h;
import d.c.a.b.j.t.i.i;
import d.c.a.b.j.t.i.j;
import d.c.a.b.j.t.i.m;
import d.c.a.b.j.t.i.n;
import d.c.a.b.j.t.i.o;
import d.c.a.b.j.t.i.p;
import d.c.a.b.j.t.i.q;
import d.c.a.b.j.t.i.r;
import d.c.a.b.j.t.i.s;
import d.c.a.b.j.t.i.t;
import d.c.a.b.j.t.i.z;
import d.c.a.b.j.u.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class t
implements d.c.a.b.j.t.i.c,
b {
    public static final d.c.a.b.b i = new d.c.a.b.b("proto");
    public final z e;
    public final d.c.a.b.j.v.a f;
    public final d.c.a.b.j.v.a g;
    public final d.c.a.b.j.t.i.d h;

    public t(d.c.a.b.j.v.a a2, d.c.a.b.j.v.a a3, d.c.a.b.j.t.i.d d2, z z2) {
        this.e = z2;
        this.f = a2;
        this.g = a3;
        this.h = d2;
    }

    public static <T> T A(Cursor cursor, b<Cursor, T> b2) {
        try {
            T t2 = b2.a(cursor);
            return t2;
        }
        finally {
            cursor.close();
        }
    }

    public static String u(Iterable<h> iterable) {
        StringBuilder stringBuilder = new StringBuilder("(");
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(((h)iterator.next()).b());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(',');
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public Iterable<h> C(d.c.a.b.j.i i2) {
        return (Iterable)this.m(new j(this, i2));
    }

    public void G(Iterable<h> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
        stringBuilder.append(t.u(iterable));
        String string = stringBuilder.toString();
        SQLiteDatabase sQLiteDatabase = this.e();
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.compileStatement(string).execute();
            sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
            sQLiteDatabase.setTransactionSuccessful();
            return;
        }
        finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public void O(d.c.a.b.j.i i2, long l2) {
        this.m(new i(l2, i2));
    }

    @Override
    public <T> T a(a<T> a2) {
        SQLiteDatabase sQLiteDatabase = this.e();
        this.s(new m(sQLiteDatabase), n.a);
        try {
            T t2 = a2.execute();
            sQLiteDatabase.setTransactionSuccessful();
            return t2;
        }
        finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public void close() {
        this.e.close();
    }

    public SQLiteDatabase e() {
        z z2 = this.e;
        z2.getClass();
        return (SQLiteDatabase)this.s(new o(z2), r.a);
    }

    public h e0(d.c.a.b.j.i i2, f f2) {
        Object[] arrobject = new Object[]{i2.d(), f2.g(), i2.b()};
        d.b.g0.a.b((String)"SQLiteEventStore", (String)"Storing event with priority=%s, name=%s for destination %s", (Object[])arrobject);
        long l2 = (Long)this.m(new s(this, i2, f2));
        if (l2 < 1L) {
            return null;
        }
        return new d.c.a.b.j.t.i.b(l2, i2, f2);
    }

    public int f() {
        long l2 = this.f.a() - this.h.b();
        SQLiteDatabase sQLiteDatabase = this.e();
        sQLiteDatabase.beginTransaction();
        try {
            String[] arrstring = new String[]{String.valueOf(l2)};
            Integer n2 = sQLiteDatabase.delete("events", "timestamp_ms < ?", arrstring);
            sQLiteDatabase.setTransactionSuccessful();
            return n2;
        }
        finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public Iterable<d.c.a.b.j.i> f0() {
        SQLiteDatabase sQLiteDatabase = this.e();
        sQLiteDatabase.beginTransaction();
        try {
            List list = (List)t.A(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), p.a);
            sQLiteDatabase.setTransactionSuccessful();
            return list;
        }
        finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final Long i(SQLiteDatabase sQLiteDatabase, d.c.a.b.j.i i2) {
        Cursor cursor;
        Long l2;
        block5 : {
            StringBuilder stringBuilder = new StringBuilder("backend_name = ? and priority = ?");
            Object[] arrobject = new String[]{i2.b(), String.valueOf(d.c.a.b.j.w.a.a(i2.d()))};
            ArrayList arrayList = new ArrayList(Arrays.asList(arrobject));
            if (i2.c() != null) {
                stringBuilder.append(" and extras = ?");
                arrayList.add(Base64.encodeToString((byte[])i2.c(), 0));
            }
            cursor = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, stringBuilder.toString(), (String[])arrayList.toArray(new String[0]), null, null, null);
            if (cursor.moveToNext()) break block5;
            l2 = null;
        }
        l2 = cursor.getLong(0);
        return l2;
        finally {
            cursor.close();
        }
    }

    public void k(Iterable<h> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"DELETE FROM events WHERE _id in ");
        stringBuilder.append(t.u(iterable));
        String string = stringBuilder.toString();
        this.e().compileStatement(string).execute();
    }

    public final <T> T m(b<SQLiteDatabase, T> b2) {
        SQLiteDatabase sQLiteDatabase = this.e();
        sQLiteDatabase.beginTransaction();
        try {
            T t2 = b2.a(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return t2;
        }
        finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long r(d.c.a.b.j.i i2) {
        SQLiteDatabase sQLiteDatabase = this.e();
        String[] arrstring = new String[]{i2.b(), String.valueOf(d.c.a.b.j.w.a.a(i2.d()))};
        Cursor cursor = sQLiteDatabase.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", arrstring);
        try {
            long l2 = cursor.moveToNext() ? cursor.getLong(0) : 0L;
            Long l3 = l2;
            return l3;
        }
        finally {
            cursor.close();
        }
    }

    public final <T> T s(d<T> d2, b<Throwable, T> b2) {
        long l2 = this.g.a();
        do {
            T t2;
            try {
                t2 = d2.a();
            }
            catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
                if (this.g.a() >= l2 + (long)this.h.a()) {
                    return b2.a(sQLiteDatabaseLockedException);
                }
                SystemClock.sleep(50L);
                continue;
            }
            return t2;
            break;
        } while (true);
    }

    public boolean z(d.c.a.b.j.i i2) {
        SQLiteDatabase sQLiteDatabase = this.e();
        sQLiteDatabase.beginTransaction();
        try {
            Boolean bl;
            Long l2 = this.i(sQLiteDatabase, i2);
            if (l2 == null) {
                bl = Boolean.FALSE;
            } else {
                SQLiteDatabase sQLiteDatabase2 = this.e();
                String[] arrstring = new String[]{l2.toString()};
                bl = (Boolean)t.A(sQLiteDatabase2.rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", arrstring), q.a);
            }
            sQLiteDatabase.setTransactionSuccessful();
            return bl;
        }
        finally {
            sQLiteDatabase.endTransaction();
        }
    }

}

