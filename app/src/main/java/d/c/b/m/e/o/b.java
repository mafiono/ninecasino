/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileFilter
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.m.e.o;

import java.io.File;
import java.io.FileFilter;

public final class b
implements FileFilter {
    public final String a;

    public b(String string) {
        this.a = string;
    }

    public boolean accept(File file) {
        String string = this.a;
        return file.isDirectory() && !file.getName().equals(string);
    }
}

