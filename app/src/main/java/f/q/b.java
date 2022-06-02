/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.l.g
 *  java.util.NoSuchElementException
 */
package f.q;

import f.l.g;
import java.util.NoSuchElementException;

public final class b
extends g {
    public final int e;
    public boolean f;
    public int g;
    public final int h;

    public b(int n2, int n3, int n4) {
        this.h = n4;
        this.e = n3;
        boolean bl = n4 > 0 ? n2 <= n3 : n2 >= n3;
        this.f = bl;
        if (!bl) {
            n2 = n3;
        }
        this.g = n2;
    }

    public int a() {
        int n2 = this.g;
        if (n2 == this.e) {
            if (this.f) {
                this.f = false;
                return n2;
            }
            throw new NoSuchElementException();
        }
        this.g = n2 + this.h;
        return n2;
    }

    public boolean hasNext() {
        return this.f;
    }
}

