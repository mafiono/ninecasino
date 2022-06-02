/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  d.c.a.b.j.f
 *  d.c.a.b.j.f$a
 *  d.c.a.b.j.i
 *  d.c.a.b.j.t.i.d
 *  d.c.a.b.j.t.i.h
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.Objects
 *  java.util.Set
 */
package d.c.a.b.j.t.i;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import d.c.a.b.j.f;
import d.c.a.b.j.i;
import d.c.a.b.j.t.i.b;
import d.c.a.b.j.t.i.d;
import d.c.a.b.j.t.i.h;
import d.c.a.b.j.t.i.k;
import d.c.a.b.j.t.i.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;

public final class j
implements t.b {
    public final t a;
    public final i b;

    public j(t t2, i i2) {
        this.a = t2;
        this.b = i2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object a(Object object) {
        HashMap hashMap;
        ArrayList arrayList;
        block9 : {
            t t2 = this.a;
            i i2 = this.b;
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase)object;
            Objects.requireNonNull((Object)t2);
            arrayList = new ArrayList();
            Long l2 = t2.i(sQLiteDatabase, i2);
            if (l2 != null) {
                String[] arrstring = new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"};
                String[] arrstring2 = new String[]{l2.toString()};
                t.A(sQLiteDatabase.query("events", arrstring, "context_id = ?", arrstring2, null, null, null, String.valueOf((int)t2.h.c())), new k(t2, arrayList, i2));
            }
            hashMap = new HashMap();
            StringBuilder stringBuilder = new StringBuilder("event_id IN (");
            for (int i3 = 0; i3 < arrayList.size(); ++i3) {
                stringBuilder.append(((h)arrayList.get(i3)).b());
                if (i3 >= arrayList.size() - 1) continue;
                stringBuilder.append(',');
            }
            stringBuilder.append(')');
            Cursor cursor = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, stringBuilder.toString(), null, null, null, null);
            while (cursor.moveToNext()) {
                long l3 = cursor.getLong(0);
                Set set = (Set)hashMap.get(l3);
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(l3, set);
                }
                set.add(new Object(cursor.getString(1), cursor.getString(2), null){
                    public final String a;
                    public final String b;
                    {
                        this.a = string;
                        this.b = string2;
                    }
                });
            }
            break block9;
            finally {
                cursor.close();
            }
        }
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            h h2 = (h)listIterator.next();
            if (!hashMap.containsKey((Object)h2.b())) continue;
            f.a a2 = h2.a().i();
            for (t.c c2 : (Set)hashMap.get((Object)h2.b())) {
                a2.a(c2.a, c2.b);
            }
            listIterator.set(new b(h2.b(), h2.c(), a2.b()));
        }
        return arrayList;
    }
}

