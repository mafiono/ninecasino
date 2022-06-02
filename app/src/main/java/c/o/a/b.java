/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.e.i
 *  c.h.b.g
 *  c.n.a0
 *  c.n.k
 *  c.n.w
 *  c.n.x
 *  c.n.z
 *  c.o.a.a
 *  c.o.a.b$a
 *  d.a.b.a.a
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.HashMap
 *  java.util.Objects
 */
package c.o.a;

import c.e.i;
import c.h.b.g;
import c.n.a0;
import c.n.k;
import c.n.w;
import c.n.x;
import c.n.y;
import c.n.z;
import c.o.a.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Objects;

public class b
extends c.o.a.a {
    public final k a;
    public final b b;

    public b(k k2, a0 a02) {
        this.a = k2;
        x x2 = c.o.a.b.b.c;
        String string = b.class.getCanonicalName();
        if (string != null) {
            String string2 = d.a.b.a.a.m((String)"androidx.lifecycle.ViewModelProvider.DefaultKey:", (String)string);
            w w2 = (w)a02.a.get((Object)string2);
            if ((Object) w2 instanceof b) {
                if (x2 instanceof z) {
                    (z)x2;
                }
            } else {
                b b2 = x2 instanceof y ? ((y)x2).a(string2, b.class) : (x2).a(b.class);
                w2 = b2;
                w w3 = (w)a02.a.put((Object)string2, (Object)w2);
                if (w3 != null) {
                    w3.a();
                }
            }
            this.b = (b)w2;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Deprecated
    public void a(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        b b2 = this.b;
        if (b2.b.h() > 0) {
            printWriter.print(string);
            printWriter.println("Loaders:");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("    ");
            String string2 = stringBuilder.toString();
            if (b2.b.h() <= 0) {
                return;
            }
            a a2 = b2.b.i(0);
            printWriter.print(string);
            printWriter.print("  #");
            printWriter.print(b2.b.f(0));
            printWriter.print(": ");
            printWriter.println(a2.toString());
            printWriter.print(string2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println(null);
            printWriter.print(string2);
            printWriter.print("mLoader=");
            printWriter.println(null);
            throw null;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        g.c((Object)this.a, (StringBuilder)stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public static class b
    extends w {
        public static final x c = new x(){

            public <T extends w> T a(Class<T> class_) {
                return (T)((Object)new b());
            }
        };
        public i<c.o.a.b$a> b = new i();

        public void a() {
            if (this.b.h() <= 0) {
                i<c.o.a.b$a> i2 = this.b;
                int n2 = i2.g;
                Object[] arrobject = i2.f;
                for (int i3 = 0; i3 < n2; ++i3) {
                    arrobject[i3] = null;
                }
                i2.g = 0;
                return;
            }
            Objects.requireNonNull((Object)(this.b.i(0)));
            throw null;
        }

    }

}

