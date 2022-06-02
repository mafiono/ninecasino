/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 */
package d.c.b.l;

import java.util.Objects;

public final class o {
    public final Class<?> a;
    public final int b;
    public final int c;

    public o(Class<?> class_, int n2, int n3) {
        Objects.requireNonNull(class_, "Null dependency anInterface.");
        this.a = class_;
        this.b = n2;
        this.c = n3;
    }

    public boolean a() {
        return this.b == 2;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof o;
        boolean bl2 = false;
        if (bl) {
            o o2 = (o)object;
            Class<?> class_ = this.a;
            Class<?> class_2 = o2.a;
            bl2 = false;
            if (class_ == class_2) {
                int n2 = this.b;
                int n3 = o2.b;
                bl2 = false;
                if (n2 == n3) {
                    int n4 = this.c;
                    int n5 = o2.c;
                    bl2 = n4 == n5;
                }
            }
        }
        return bl2;
    }

    public int hashCode() {
        return 1000003 * (1000003 * (1000003 ^ this.a.hashCode()) ^ this.b) ^ this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Dependency{anInterface=");
        stringBuilder.append(this.a);
        stringBuilder.append(", type=");
        boolean bl = this.b;
        boolean bl2 = true;
        String string = bl == bl2 ? "required" : (!bl ? "optional" : "set");
        stringBuilder.append(string);
        stringBuilder.append(", direct=");
        if (this.c != 0) {
            bl2 = false;
        }
        stringBuilder.append(bl2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

