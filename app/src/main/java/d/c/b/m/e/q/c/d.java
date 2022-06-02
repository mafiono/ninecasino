/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package d.c.b.m.e.q.c;

import d.a.b.a.a;
import d.c.b.m.e.b;
import d.c.b.m.e.q.c.c;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class d
implements c {
    public final File a;
    public final File[] b;
    public final Map<String, String> c;

    public d(File file, Map<String, String> map) {
        this.a = file;
        this.b = new File[]{file};
        this.c = new HashMap(map);
    }

    @Override
    public Map<String, String> a() {
        return Collections.unmodifiableMap(this.c);
    }

    @Override
    public File[] b() {
        return this.b;
    }

    @Override
    public String c() {
        return this.a.getName();
    }

    @Override
    public String d() {
        String string = this.c();
        return string.substring(0, string.lastIndexOf(46));
    }

    @Override
    public c.a e() {
        return c.a.e;
    }

    @Override
    public File f() {
        return this.a;
    }

    @Override
    public void remove() {
        b b3 = b.a;
        StringBuilder stringBuilder = a.d((String)"Removing report at ");
        stringBuilder.append(this.a.getPath());
        b3.b(stringBuilder.toString());
        this.a.delete();
    }
}

