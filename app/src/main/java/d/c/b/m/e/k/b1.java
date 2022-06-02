/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  d.c.a.e.a
 *  d.c.b.m.e.k.a1
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package d.c.b.m.e.k;

import android.os.Looper;
import d.c.a.d.j.h;
import d.c.b.m.e.k.a1;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class b1 {
    public static final FilenameFilter a = new FilenameFilter(){

        public boolean accept(File file, String string) {
            return true;
        }
    };
    public static final ExecutorService b = d.c.a.e.a.e((String)"awaitEvenIfOnMainThread task continuation executor");

    public static <T> T a(h<T> h2) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        h2.g((Executor)b, (d.c.a.d.j.a)new a1(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (h2.n()) {
            return (T)h2.j();
        }
        if (!h2.l()) {
            if (h2.m()) {
                throw new IllegalStateException((Throwable)h2.i());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }

    public static int b(File file, FilenameFilter filenameFilter, int n2, Comparator<File> comparator) {
        Object[] arrobject = file.listFiles(filenameFilter);
        if (arrobject == null) {
            return 0;
        }
        return b1.c((List<File>)Arrays.asList(arrobject), n2, comparator);
    }

    public static int c(List<File> list, int n2, Comparator<File> comparator) {
        int n3 = list.size();
        Collections.sort(list, comparator);
        for (File file : list) {
            if (n3 <= n2) {
                return n3;
            }
            b1.d(file);
            --n3;
        }
        return n3;
    }

    public static void d(File file) {
        if (file.isDirectory()) {
            File[] arrfile = file.listFiles();
            int n2 = arrfile.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                b1.d(arrfile[i2]);
            }
        }
        file.delete();
    }

}

