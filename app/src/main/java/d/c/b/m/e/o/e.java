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

import java.io.File;
import java.util.Comparator;

public final class e
implements Comparator {
    public static final e a = new e();

    public int compare(Object object, Object object2) {
        File file = (File)object;
        File file2 = (File)object2;
        return file2.getName().compareTo(file.getName());
    }
}

