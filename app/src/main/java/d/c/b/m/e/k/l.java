/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.m.e.k;

import java.io.File;
import java.io.FilenameFilter;

public final class l
implements FilenameFilter {
    public static final l a = new l();

    public boolean accept(File file, String string) {
        return string.startsWith(".ae");
    }
}

