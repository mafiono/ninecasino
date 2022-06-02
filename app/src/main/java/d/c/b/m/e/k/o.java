/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashSet
 *  java.util.Objects
 *  java.util.Set
 */
package d.c.b.m.e.k;

import d.c.b.m.e.b;
import d.c.b.m.e.k.p;
import d.c.b.m.e.k.t;
import java.io.File;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class o
implements Runnable {
    public final /* synthetic */ t e;

    public o(t t2) {
        this.e = t2;
    }

    public void run() {
        t t2 = this.e;
        t.i i2 = new t.i();
        File[] arrfile = t.r(t2.l(), i2);
        Objects.requireNonNull((Object)t2);
        b b2 = b.a;
        HashSet hashSet = new HashSet();
        int n2 = arrfile.length;
        int n3 = 0;
        for (int i3 = 0; i3 < n2; ++i3) {
            File file = arrfile[i3];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Found invalid session part file: ");
            stringBuilder.append(file);
            b2.b(stringBuilder.toString());
            hashSet.add(t.o(file));
        }
        if (hashSet.isEmpty()) {
            return;
        }
        p p2 = new p(t2, hashSet);
        File[] arrfile2 = t.r(t2.l(), p2);
        int n4 = arrfile2.length;
        while (n3 < n4) {
            File file = arrfile2[n3];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Deleting invalid session file: ");
            stringBuilder.append(file);
            b2.b(stringBuilder.toString());
            file.delete();
            ++n3;
        }
    }
}

