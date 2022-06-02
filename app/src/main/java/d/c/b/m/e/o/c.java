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

public final class c
implements FilenameFilter {
    public static final c a = new c();

    public boolean accept(File file, String string) {
        return string.startsWith("event") && !string.endsWith("_");
    }
}

