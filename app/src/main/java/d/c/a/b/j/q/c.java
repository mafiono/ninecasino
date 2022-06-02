/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  d.a.b.a.a
 *  d.c.a.b.j.q.h
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 */
package d.c.a.b.j.q;

import android.content.Context;
import d.a.b.a.a;
import d.c.a.b.j.q.h;
import java.util.Objects;

public final class c
extends h {
    public final Context a;
    public final d.c.a.b.j.v.a b;
    public final d.c.a.b.j.v.a c;
    public final String d;

    public c(Context context, d.c.a.b.j.v.a a2, d.c.a.b.j.v.a a3, String string) {
        Objects.requireNonNull((Object)context, "Null applicationContext");
        this.a = context;
        Objects.requireNonNull((Object)a2, "Null wallClock");
        this.b = a2;
        Objects.requireNonNull((Object)a3, "Null monotonicClock");
        this.c = a3;
        Objects.requireNonNull((Object)string, "Null backendName");
        this.d = string;
    }

    public Context a() {
        return this.a;
    }

    public String b() {
        return this.d;
    }

    public d.c.a.b.j.v.a c() {
        return this.c;
    }

    public d.c.a.b.j.v.a d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof h) {
            h h2 = (h)object;
            return this.a.equals((Object)h2.a()) && this.b.equals((Object)h2.d()) && this.c.equals((Object)h2.c()) && this.d.equals((Object)h2.b());
        }
        return false;
    }

    public int hashCode() {
        return 1000003 * (1000003 * (1000003 * (1000003 ^ this.a.hashCode()) ^ this.b.hashCode()) ^ this.c.hashCode()) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = a.d((String)"CreationContext{applicationContext=");
        stringBuilder.append(this.a);
        stringBuilder.append(", wallClock=");
        stringBuilder.append(this.b);
        stringBuilder.append(", monotonicClock=");
        stringBuilder.append(this.c);
        stringBuilder.append(", backendName=");
        return a.o((StringBuilder)stringBuilder, (String)this.d, (String)"}");
    }
}

