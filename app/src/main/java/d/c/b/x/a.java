/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 *  javax.annotation.Nonnull
 */
package d.c.b.x;

import d.c.b.x.e;
import java.util.Objects;
import javax.annotation.Nonnull;

public final class a
extends e {
    public final String a;
    public final String b;

    public a(String string, String string2) {
        Objects.requireNonNull((Object)string, "Null libraryName");
        this.a = string;
        Objects.requireNonNull((Object)string2, "Null version");
        this.b = string2;
    }

    @Nonnull
    @Override
    public String a() {
        return this.a;
    }

    @Nonnull
    @Override
    public String b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof e) {
            e e2 = (e)object;
            return this.a.equals(e2.a()) && this.b.equals(e2.b());
        }
        return false;
    }

    public int hashCode() {
        return 1000003 * (1000003 ^ this.a.hashCode()) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"LibraryVersion{libraryName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", version=");
        return d.a.b.a.a.o((StringBuilder)stringBuilder, (String)this.b, (String)"}");
    }
}

