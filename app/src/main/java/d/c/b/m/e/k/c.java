/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 */
package d.c.b.m.e.k;

import d.a.b.a.a;
import d.c.b.m.e.k.k0;
import d.c.b.m.e.m.v;
import java.util.Objects;

public final class c
extends k0 {
    public final v a;
    public final String b;

    public c(v v3, String string) {
        Objects.requireNonNull((Object)v3, "Null report");
        this.a = v3;
        Objects.requireNonNull((Object)string, "Null sessionId");
        this.b = string;
    }

    @Override
    public v a() {
        return this.a;
    }

    @Override
    public String b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof k0) {
            k0 k02 = (k0)object;
            return this.a.equals(k02.a()) && this.b.equals(k02.b());
        }
        return false;
    }

    public int hashCode() {
        return 1000003 * (1000003 ^ this.a.hashCode()) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = a.d((String)"CrashlyticsReportWithSessionId{report=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sessionId=");
        return a.o((StringBuilder)stringBuilder, (String)this.b, (String)"}");
    }
}

