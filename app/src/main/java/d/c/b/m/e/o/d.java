/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Comparator
 */
package d.c.b.m.e.o;

import d.c.b.m.e.o.g;
import java.io.File;
import java.util.Comparator;

public final class d
implements Comparator {
    public static final d a = new d();

    public int compare(Object object, Object object2) {
        File file = (File)object;
        File file2 = (File)object2;
        String string = file.getName();
        int n2 = g.h;
        return string.substring(0, n2).compareTo(file2.getName().substring(0, n2));
    }
}

