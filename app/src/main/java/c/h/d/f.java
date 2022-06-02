/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.os.CancellationSignal
 *  android.util.Log
 *  c.h.d.j
 *  c.h.g.e
 *  c.h.g.e$c
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Array
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.nio.ByteBuffer
 *  java.util.List
 */
package c.h.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import c.h.c.b.c;
import c.h.d.j;
import c.h.g.e;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

public class f
extends j {
    public static final Class<?> b;
    public static final Constructor<?> c;
    public static final Method d;
    public static final Method e;

    public static {
        Method method;
        Constructor constructor;
        Class class_;
        Method method2;
        block3 : {
            void var1_12;
            constructor = null;
            try {
                Method method3;
                class_ = Class.forName("android.graphics.FontFamily");
                Constructor constructor2 = class_.getConstructor();
                Class class_2 = Integer.TYPE;
                Class[] arrclass = new Class[]{ByteBuffer.class, class_2, List.class, class_2, Boolean.TYPE};
                method2 = class_.getMethod("addFontWeightStyle", arrclass);
                Object object = Array.newInstance(class_, 1);
                Class[] arrclass2 = new Class[]{object.getClass()};
                method = method3 = Typeface.class.getMethod("createFromFamiliesWithDefault", arrclass2);
                constructor = constructor2;
                break block3;
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            Log.e("TypefaceCompatApi24Impl", (String)var1_12.getClass().getName(), (Throwable)var1_12);
            class_ = null;
            method = null;
            method2 = null;
        }
        c = constructor;
        b = class_;
        d = method2;
        e = method;
    }

    public static boolean h(Object object, ByteBuffer byteBuffer, int n2, int n3, boolean bl) {
        try {
            Method method = d;
            Object[] arrobject = new Object[]{byteBuffer, n2, null, n3, bl};
            boolean bl2 = (Boolean)method.invoke(object, arrobject);
            return bl2;
        }
        catch (IllegalAccessException | InvocationTargetException throwable) {
            return false;
        }
    }

    public static Typeface i(Object object) {
        try {
            Object object2 = Array.newInstance(b, 1);
            Array.set(object2, 0, object);
            Typeface typeface = (Typeface)e.invoke(null, new Object[]{object2});
            return typeface;
        }
        catch (IllegalAccessException | InvocationTargetException throwable) {
            return null;
        }
    }

    /*
     * Exception decompiling
     */
    public Typeface a(Context var1, c var2, Resources var3, int var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl82 : ALOAD : trying to set 1 previously set to 0
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

    /*
     * Exception decompiling
     */
    public Typeface b(Context var1, CancellationSignal var2, e.c[] var3, int var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl11 : ALOAD : trying to set 1 previously set to 0
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

