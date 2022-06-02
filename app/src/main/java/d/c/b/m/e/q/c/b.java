/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package d.c.b.m.e.q.c;

import d.a.b.a.a;
import d.c.b.m.e.q.c.c;
import java.io.File;
import java.util.Map;

public class b
implements c {
    public final File a;

    public b(File file) {
        this.a = file;
    }

    @Override
    public Map<String, String> a() {
        return null;
    }

    @Override
    public File[] b() {
        return this.a.listFiles();
    }

    @Override
    public String c() {
        return null;
    }

    @Override
    public String d() {
        return this.a.getName();
    }

    @Override
    public c.a e() {
        return c.a.f;
    }

    @Override
    public File f() {
        return null;
    }

    @Override
    public void remove() {
        d.c.b.m.e.b b3 = d.c.b.m.e.b.a;
        for (File file : this.b()) {
            StringBuilder stringBuilder = a.d((String)"Removing native report file at ");
            stringBuilder.append(file.getPath());
            b3.b(stringBuilder.toString());
            file.delete();
        }
        StringBuilder stringBuilder = a.d((String)"Removing native report directory at ");
        stringBuilder.append(this.a);
        b3.b(stringBuilder.toString());
        this.a.delete();
    }
}

