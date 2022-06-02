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

public final class a
implements FilenameFilter {
    public final String a;

    public a(String string) {
        this.a = string;
    }

    public boolean accept(File file, String string) {
        String string2 = this.a;
        return string.startsWith(string2);
    }
}

