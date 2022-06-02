/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.FilenameFilter
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.m.e.p;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

public class b
extends FileOutputStream {
    public static final FilenameFilter h = new FilenameFilter(){

        public boolean accept(File file, String string) {
            return string.endsWith(".cls_temp");
        }
    };
    public final String e;
    public File f;
    public boolean g = false;

    public b(File file, String string) {
        String string2;
        super(new File(file, d.a.b.a.a.m((String)string, (String)".cls_temp")));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file);
        this.e = string2 = d.a.b.a.a.o((StringBuilder)stringBuilder, (String)File.separator, (String)string);
        this.f = new File(d.a.b.a.a.m((String)string2, (String)".cls_temp"));
    }

    public void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.flush();
        super.close();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void close() {
        b b2 = this;
        synchronized (b2) {
            boolean bl = this.g;
            if (bl) {
                return;
            }
            this.g = true;
            this.flush();
            super.close();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.e);
            stringBuilder.append(".cls");
            File file = new File(stringBuilder.toString());
            if (this.f.renameTo(file)) {
                this.f = null;
                return;
            }
            String string = "";
            if (!file.exists()) {
                if (!this.f.exists()) {
                    string = " (source does not exist)";
                }
            } else {
                string = " (target already exists)";
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Could not rename temp file: ");
            stringBuilder2.append(this.f);
            stringBuilder2.append(" -> ");
            stringBuilder2.append(file);
            stringBuilder2.append(string);
            throw new IOException(stringBuilder2.toString());
        }
    }

}

