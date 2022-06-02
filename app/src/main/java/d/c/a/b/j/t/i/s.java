/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteStatement
 *  android.util.Base64
 *  d.c.a.b.b
 *  d.c.a.b.d
 *  d.c.a.b.j.e
 *  d.c.a.b.j.f
 *  d.c.a.b.j.i
 *  d.c.a.b.j.t.i.d
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package d.c.a.b.j.t.i;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Base64;
import d.c.a.b.b;
import d.c.a.b.j.e;
import d.c.a.b.j.f;
import d.c.a.b.j.i;
import d.c.a.b.j.t.i.d;
import d.c.a.b.j.t.i.t;
import d.c.a.b.j.w.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public final class s
implements t.b {
    public final t a;
    public final i b;
    public final f c;

    public s(t t2, i i2, f f2) {
        this.a = t2;
        this.b = i2;
        this.c = f2;
    }

    public Object a(Object object) {
        long l2;
        t t2 = this.a;
        i i2 = this.b;
        f f2 = this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase)object;
        long l3 = t2.e().compileStatement("PRAGMA page_count").simpleQueryForLong() * t2.e().compileStatement("PRAGMA page_size").simpleQueryForLong();
        long l4 = t2.h.e();
        int n2 = 1;
        boolean bl = l3 >= l4;
        if (bl) {
            return -1L;
        }
        Long l5 = t2.i(sQLiteDatabase, i2);
        if (l5 != null) {
            l2 = l5;
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", i2.b());
            contentValues.put("priority", Integer.valueOf((int)a.a(i2.d())));
            contentValues.put("next_request_ms", Integer.valueOf(0));
            if (i2.c() != null) {
                contentValues.put("extras", Base64.encodeToString((byte[])i2.c(), 0));
            }
            l2 = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        int n3 = t2.h.d();
        byte[] arrby = f2.d().b;
        boolean bl2 = arrby.length <= n3;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(l2));
        contentValues.put("transport_name", f2.g());
        contentValues.put("timestamp_ms", Long.valueOf((long)f2.e()));
        contentValues.put("uptime_ms", Long.valueOf((long)f2.h()));
        contentValues.put("payload_encoding", f2.d().a.a);
        contentValues.put("code", f2.c());
        contentValues.put("num_attempts", Integer.valueOf(0));
        contentValues.put("inline", Boolean.valueOf(bl2));
        byte[] arrby2 = bl2 ? arrby : new byte[0];
        contentValues.put("payload", arrby2);
        long l6 = sQLiteDatabase.insert("events", null, contentValues);
        if (!bl2) {
            double d2 = arrby.length;
            double d3 = n3;
            Double.isNaN(d2);
            Double.isNaN(d3);
            Double.isNaN(d2);
            Double.isNaN(d3);
            int n4 = (int)Math.ceil(d2 / d3);
            while (n2 <= n4) {
                byte[] arrby3 = Arrays.copyOfRange(arrby, n3 * (n2 - 1), Math.min(n2 * n3, arrby.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(l6));
                contentValues2.put("sequence_num", Integer.valueOf(n2));
                contentValues2.put("bytes", arrby3);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
                ++n2;
            }
        }
        for (Map.Entry entry : Collections.unmodifiableMap((Map)f2.b()).entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(l6));
            contentValues3.put("name", (String)entry.getKey());
            contentValues3.put("value", (String)entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return l6;
    }
}

