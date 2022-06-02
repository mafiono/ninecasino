/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.f
 *  f.o.a.p
 *  f.o.b.i
 *  f.s.b
 *  f.t.a$a
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 */
package f.t;

import f.f;
import f.o.a.p;
import f.o.b.i;
import f.q.c;
import f.s.b;
import f.t.a;
import java.util.Iterator;

public final class a
implements b<c> {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final p<CharSequence, Integer, f<Integer, Integer>> d;

    public a(CharSequence charSequence, int n2, int n3, p<? super CharSequence, ? super Integer, f<Integer, Integer>> p2) {
        i.e((Object)charSequence, (String)"input");
        i.e(p2, (String)"getNextMatch");
        this.a = charSequence;
        this.b = n2;
        this.c = n3;
        this.d = p2;
    }

    public Iterator<c> iterator() {
        return new a(this);
    }
}

