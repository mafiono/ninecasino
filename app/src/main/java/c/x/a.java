/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable
 *  c.e.a
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Package
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package c.x;

import android.os.Parcelable;
import c.x.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {
    public final c.e.a<String, Method> a;
    public final c.e.a<String, Method> b;
    public final c.e.a<String, Class> c;

    public a(c.e.a<String, Method> a2, c.e.a<String, Method> a3, c.e.a<String, Class> a4) {
        this.a = a2;
        this.b = a3;
        this.c = a4;
    }

    public abstract void a();

    public abstract a b();

    public final Class c(Class<? extends c> class_) {
        Class class_2 = this.c.getOrDefault(class_.getName(), null);
        if (class_2 == null) {
            String string = class_.getPackage().getName();
            Object[] arrobject = new Object[]{string, class_.getSimpleName()};
            class_2 = Class.forName(String.format("%s.%sParcelizer", arrobject), false, class_.getClassLoader());
            this.c.put((Object)class_.getName(), (Object)class_2);
        }
        return class_2;
    }

    public final Method d(String string) {
        Method method = this.a.getOrDefault(string, null);
        if (method == null) {
            System.currentTimeMillis();
            method = Class.forName(string, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            this.a.put((Object)string, (Object)method);
        }
        return method;
    }

    public final Method e(Class class_) {
        Method method = this.b.getOrDefault(class_.getName(), null);
        if (method == null) {
            Class class_2 = this.c((Class<? extends c>)class_);
            System.currentTimeMillis();
            method = class_2.getDeclaredMethod("write", class_, a.class);
            this.b.put((Object)class_.getName(), (Object)method);
        }
        return method;
    }

    public abstract boolean f();

    public abstract byte[] g();

    public abstract CharSequence h();

    public abstract boolean i(int var1);

    public abstract int j();

    public int k(int n2, int n3) {
        if (!this.i(n3)) {
            return n2;
        }
        return this.j();
    }

    public abstract <T extends Parcelable> T l();

    public <T extends Parcelable> T m(T t2, int n2) {
        if (!this.i(n2)) {
            return t2;
        }
        return this.l();
    }

    public abstract String n();

    public <T extends c> T o() {
        c c2;
        String string = this.n();
        if (string == null) {
            return null;
        }
        a a2 = this.b();
        try {
            c2 = (c)this.d(string).invoke(null, new Object[]{a2});
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            if (invocationTargetException.getCause() instanceof RuntimeException) {
                throw (RuntimeException)invocationTargetException.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException);
        }
        return (T)c2;
    }

    public abstract void p(int var1);

    public abstract void q(boolean var1);

    public abstract void r(byte[] var1);

    public abstract void s(CharSequence var1);

    public abstract void t(int var1);

    public abstract void u(Parcelable var1);

    public abstract void v(String var1);

    public void w(c c2) {
        Class class_;
        if (c2 == null) {
            this.v(null);
            return;
        }
        try {
            class_ = this.c(c2.getClass());
        }
        catch (ClassNotFoundException classNotFoundException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c2.getClass().getSimpleName());
            stringBuilder.append(" does not have a Parcelizer");
            throw new RuntimeException(stringBuilder.toString(), classNotFoundException);
        }
        this.v(class_.getName());
        a a2 = this.b();
        try {
            this.e(c2.getClass()).invoke(null, c2, a2);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            if (invocationTargetException.getCause() instanceof RuntimeException) {
                throw (RuntimeException)invocationTargetException.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException);
        }
        a2.a();
        return;
    }
}

