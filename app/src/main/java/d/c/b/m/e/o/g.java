/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.FileFilter
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.FilenameFilter
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.io.OutputStreamWriter
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.atomic.AtomicInteger
 */
package d.c.b.m.e.o;

import d.c.b.m.e.m.x.h;
import d.c.b.m.e.o.a;
import d.c.b.m.e.o.e;
import d.c.b.m.e.o.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class g {
    public static final Charset g = Charset.forName("UTF-8");
    public static final int h = 15;
    public static final h i = new h();
    public static final Comparator<? super File> j = e.a;
    public static final FilenameFilter k = f.a;
    public final AtomicInteger a = new AtomicInteger(0);
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final d.c.b.m.e.s.e f;

    public g(File file, d.c.b.m.e.s.e e2) {
        File file2 = new File(file, "report-persistence");
        this.b = new File(file2, "sessions");
        this.c = new File(file2, "priority-reports");
        this.d = new File(file2, "reports");
        this.e = new File(file2, "native-reports");
        this.f = e2;
    }

    public static /* varargs */ List<File> a(List<File> ... arrlist) {
        ArrayList arrayList = new ArrayList();
        int n2 = arrlist.length;
        int n3 = 0;
        int n4 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n4 += arrlist[i2].size();
        }
        arrayList.ensureCapacity(n4);
        int n5 = arrlist.length;
        while (n3 < n5) {
            arrayList.addAll(arrlist[n3]);
            ++n3;
        }
        return arrayList;
    }

    public static List<File> d(File file) {
        return g.f(file, null);
    }

    public static List<File> f(File file, FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        Object[] arrobject = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (arrobject != null) {
            return Arrays.asList((Object[])arrobject);
        }
        return Collections.emptyList();
    }

    public static List<File> g(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        Object[] arrobject = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        if (arrobject != null) {
            return Arrays.asList((Object[])arrobject);
        }
        return Collections.emptyList();
    }

    public static File i(File file) {
        boolean bl = file.exists() || file.mkdirs();
        if (bl) {
            return file;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not create directory ");
        stringBuilder.append(file);
        throw new IOException(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String j(File file) {
        String string;
        byte[] arrby = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int n2;
            while ((n2 = fileInputStream.read(arrby)) > 0) {
                byteArrayOutputStream.write(arrby, 0, n2);
            }
            string = new String(byteArrayOutputStream.toByteArray(), g);
        }
        catch (Throwable throwable) {
            try {
                fileInputStream.close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                throw throwable;
            }
        }
        fileInputStream.close();
        return string;
    }

    public static void k(File file) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            File[] arrfile = file.listFiles();
            int n2 = arrfile.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                g.k(arrfile[i2]);
            }
        }
        file.delete();
    }

    public static void l(File file, String string) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), g);
        try {
            outputStreamWriter.write(string);
        }
        catch (Throwable throwable) {
            try {
                outputStreamWriter.close();
            }
            catch (Throwable throwable2) {}
            throw throwable;
        }
        outputStreamWriter.close();
    }

    public void b() {
        Iterator iterator = ((ArrayList)this.e()).iterator();
        while (iterator.hasNext()) {
            ((File)iterator.next()).delete();
        }
    }

    public void c(String string) {
        a a2 = new a(string);
        List[] arrlist = new List[]{g.g(this.c, a2), g.g(this.e, a2), g.g(this.d, a2)};
        Iterator iterator = ((ArrayList)g.a(arrlist)).iterator();
        while (iterator.hasNext()) {
            ((File)iterator.next()).delete();
        }
    }

    public final List<File> e() {
        List[] arrlist = new List[2];
        List[] arrlist2 = new List[2];
        List<File> list = g.d(this.c);
        arrlist2[0] = list;
        arrlist2[1] = g.d(this.e);
        arrlist[0] = g.a(arrlist2);
        arrlist[1] = g.d(this.d);
        for (int i2 = 0; i2 < 2; ++i2) {
            Collections.sort(arrlist[i2], j);
        }
        return g.a(arrlist);
    }

    public final File h(String string) {
        return new File(this.b, string);
    }
}

