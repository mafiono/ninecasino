/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.os.CancellationSignal
 *  android.os.ParcelFileDescriptor
 *  android.util.Log
 *  c.h.b.g
 *  c.h.c.b.d
 *  c.h.d.j
 *  c.h.g.e
 *  c.h.g.e$c
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Array
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package c.h.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import c.h.b.g;
import c.h.c.b.c;
import c.h.c.b.d;
import c.h.d.j;
import c.h.g.e;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class e
extends j {
    public static Class<?> b;
    public static Constructor<?> c;
    public static Method d;
    public static Method e;
    public static boolean f;

    public static boolean h(Object object, String string, int n2, boolean bl) {
        void var4_9;
        e.j();
        try {
            Method method = d;
            Object[] arrobject = new Object[]{string, n2, bl};
            boolean bl2 = (Boolean)method.invoke(object, arrobject);
            return bl2;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var4_9);
    }

    public static void j() {
        Method method;
        Method method2;
        Class class_;
        Constructor constructor;
        block4 : {
            void var1_11;
            if (f) {
                return;
            }
            f = true;
            constructor = null;
            try {
                Method method3;
                class_ = Class.forName("android.graphics.FontFamily");
                Constructor constructor2 = class_.getConstructor();
                Class[] arrclass = new Class[]{String.class, Integer.TYPE, Boolean.TYPE};
                method = class_.getMethod("addFontWeightStyle", arrclass);
                Object object = Array.newInstance(class_, 1);
                Class[] arrclass2 = new Class[]{object.getClass()};
                method2 = method3 = Typeface.class.getMethod("createFromFamiliesWithDefault", arrclass2);
                constructor = constructor2;
                break block4;
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            Log.e("TypefaceCompatApi21Impl", (String)var1_11.getClass().getName(), (Throwable)var1_11);
            method2 = null;
            class_ = null;
            method = null;
        }
        c = constructor;
        b = class_;
        d = method;
        e = method2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Typeface a(Context context, c c2, Resources resources, int n2) {
        d[] arrd;
        int n3;
        void var11_18;
        Object object;
        block15 : {
            void var5_22;
            e.j();
            try {
                object = c.newInstance();
                arrd = c2.a;
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (InstantiationException instantiationException) {
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
            n3 = arrd.length;
            break block15;
            RuntimeException runtimeException = new RuntimeException((Throwable)var5_22);
            throw runtimeException;
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            d d2;
            File file;
            block14 : {
                d2 = arrd[i2];
                file = g.A((Context)context);
                if (file == null) {
                    return null;
                }
                boolean bl = g.l((File)file, (Resources)resources, (int)d2.f);
                if (bl) break block14;
                file.delete();
                return null;
            }
            try {
                boolean bl = e.h(object, file.getPath(), d2.b, d2.c);
                if (bl) continue;
                return null;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
                return null;
            }
            finally {
                file.delete();
            }
        }
        e.j();
        try {
            Object object2 = Array.newInstance(b, 1);
            Array.set(object2, 0, object);
            return (Typeface)e.invoke(null, new Object[]{object2});
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new RuntimeException((Throwable)var11_18);
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var11_18);
    }

    /*
     * Exception decompiling
     */
    public Typeface b(Context var1_1, CancellationSignal var2_2, e.c[] var3_3, int var4_4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 4 blocks at once
        // org.benf.cfr.reader.b.a.a.j.b(Op04StructuredStatement.java:409)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:487)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public final File i(ParcelFileDescriptor var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl30.1 : ACONST_NULL : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }
}

