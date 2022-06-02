/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.q.a
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.q;

import f.q.a;

public final class c
extends a
implements Object<Integer> {
    public static final c h = new c(1, 0);
    public static final c i;

    public c(int n2, int n3) {
        super(n2, n3, 1);
    }

    public boolean equals(Object object) {
        block2 : {
            block3 : {
                if (!(object instanceof c)) break block2;
                if (this.isEmpty() && ((c)object).isEmpty()) break block3;
                int n2 = this.e;
                c c3 = (c)object;
                if (n2 != c3.e || this.f != c3.f) break block2;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.isEmpty()) {
            return -1;
        }
        return 31 * this.e + this.f;
    }

    public boolean isEmpty() {
        return this.e > this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.e);
        stringBuilder.append("..");
        stringBuilder.append(this.f);
        return stringBuilder.toString();
    }
}

