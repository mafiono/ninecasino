/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.m.e.o;

import java.io.File;
import java.io.FilenameFilter;

public final class f
implements FilenameFilter {
    public static final f a = new f();

    public boolean accept(File file, String string) {
        return string.startsWith("event");
    }
}

