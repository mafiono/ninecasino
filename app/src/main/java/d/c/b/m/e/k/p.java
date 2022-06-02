/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Set
 */
package d.c.b.m.e.k;

import d.c.b.m.e.k.t;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Set;

public class p
implements FilenameFilter {
    public final /* synthetic */ Set a;

    public p(t t2, Set set) {
        this.a = set;
    }

    public boolean accept(File file, String string) {
        if (string.length() < 35) {
            return false;
        }
        return this.a.contains(string.substring(0, 35));
    }
}

