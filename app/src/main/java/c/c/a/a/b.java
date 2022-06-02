/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  c.c.a.a.b$a
 *  c.c.a.a.c
 *  java.lang.Object
 *  java.lang.Thread
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 */
package c.c.a.a;

import android.os.Looper;
import c.c.a.a.b;
import c.c.a.a.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class b
extends c {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, (ThreadFactory)new a(this));

    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}

