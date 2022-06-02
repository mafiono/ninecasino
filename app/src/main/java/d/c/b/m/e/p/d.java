/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package d.c.b.m.e.p;

import android.app.ActivityManager;
import d.c.b.m.e.p.a;
import d.c.b.m.e.p.c;
import d.c.b.m.e.t.e;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class d {
    public static final a a = d.c.b.m.e.p.a.a("0");
    public static final a b = d.c.b.m.e.p.a.a("Unity");

    public static int a(a a2, a a3) {
        int n2 = 0 + c.m(1, 0L) + c.m(2, 0L) + c.e(3, a2);
        if (a3 != null) {
            n2 += c.e(4, a3);
        }
        return n2;
    }

    public static int b(String string, String string2) {
        int n2 = c.e(1, d.c.b.m.e.p.a.a(string));
        if (string2 == null) {
            string2 = "";
        }
        return n2 + c.e(2, d.c.b.m.e.p.a.a(string2));
    }

    public static int c(e e2, int n2, int n3) {
        int n4 = 0 + c.e(1, d.c.b.m.e.p.a.a(e2.b));
        String string = e2.a;
        if (string != null) {
            n4 += c.e(3, d.c.b.m.e.p.a.a(string));
        }
        StackTraceElement[] arrstackTraceElement = e2.c;
        int n5 = arrstackTraceElement.length;
        for (int i2 = 0; i2 < n5; ++i2) {
            int n6 = d.h(arrstackTraceElement[i2], true);
            n4 += n6 + (c.j(4) + c.i(n6));
        }
        e e3 = e2.d;
        if (e3 != null) {
            int n7 = 0;
            if (n2 < n3) {
                int n8 = d.c(e3, n2 + 1, n3);
                return n4 + (n8 + (c.j(6) + c.i(n8)));
            }
            while (e3 != null) {
                e3 = e3.d;
                ++n7;
            }
            n4 += c.k(7, n7);
        }
        return n4;
    }

    public static int d() {
        a a2 = a;
        return 0 + c.e(1, a2) + c.e(2, a2) + c.m(3, 0L);
    }

    public static int e(e e2, Thread thread, StackTraceElement[] arrstackTraceElement, Thread[] arrthread, List<StackTraceElement[]> list, int n2, a a2, a a3) {
        int n3 = c.j(1);
        int n4 = d.i(thread, arrstackTraceElement, 4, true);
        int n5 = 0 + (n4 + (n3 + c.i(n4)));
        int n6 = arrthread.length;
        for (int i2 = 0; i2 < n6; ++i2) {
            int n7 = d.i(arrthread[i2], list.get(i2), 0, false);
            n5 += n7 + (n3 + c.i(n7));
        }
        int n8 = d.c(e2, 1, n2);
        int n9 = n5 + (n8 + (c.j(2) + c.i(n8)));
        int n10 = d.d();
        int n11 = n9 + (n10 + (c.j(3) + c.i(n10)));
        int n12 = d.a(a2, a3);
        return n11 + (n12 + (c.j(3) + c.i(n12)));
    }

    public static int f(e e2, Thread thread, StackTraceElement[] arrstackTraceElement, Thread[] arrthread, List<StackTraceElement[]> list, int n2, a a2, a a3, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int n3) {
        int n4 = d.e(e2, thread, arrstackTraceElement, arrthread, list, n2, a2, a3);
        boolean bl = true;
        int n5 = 0 + (n4 + (c.j((int)bl) + c.i(n4)));
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                int n6 = d.b((String)entry.getKey(), (String)entry.getValue());
                n5 += n6 + (c.j(2) + c.i(n6));
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance == 100) {
                bl = false;
            }
            n5 += c.a(3, bl);
        }
        return n5 + c.k(4, n3);
    }

    public static int g(Float f2, int n2, boolean bl, int n3, long l2, long l3) {
        int n4 = 0;
        if (f2 != null) {
            f2.floatValue();
            n4 = 0 + (4 + c.j(1));
        }
        return n4 + (c.j(2) + c.i(n2 << 1 ^ n2 >> 31)) + c.a(3, bl) + c.k(4, n3) + c.m(5, l2) + c.m(6, l3);
    }

    public static int h(StackTraceElement stackTraceElement, boolean bl) {
        long l2 = stackTraceElement.isNativeMethod() ? (long)Math.max(stackTraceElement.getLineNumber(), 0) : 0L;
        int n2 = 0 + c.m(1, l2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stackTraceElement.getClassName());
        stringBuilder.append(".");
        stringBuilder.append(stackTraceElement.getMethodName());
        int n3 = n2 + c.e(2, d.c.b.m.e.p.a.a(stringBuilder.toString()));
        if (stackTraceElement.getFileName() != null) {
            n3 += c.e(3, d.c.b.m.e.p.a.a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            n3 += c.m(4, stackTraceElement.getLineNumber());
        }
        int n4 = 0;
        if (bl) {
            n4 = 2;
        }
        return n3 + c.k(5, n4);
    }

    public static int i(Thread thread, StackTraceElement[] arrstackTraceElement, int n2, boolean bl) {
        int n3 = c.e(1, d.c.b.m.e.p.a.a(thread.getName())) + c.k(2, n2);
        int n4 = arrstackTraceElement.length;
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = d.h(arrstackTraceElement[i2], bl);
            n3 += n5 + (c.j(3) + c.i(n5));
        }
        return n3;
    }

    public static a j(String string) {
        if (string == null) {
            return null;
        }
        return d.c.b.m.e.p.a.a(string);
    }

    public static void k(c c2, int n2, StackTraceElement stackTraceElement, boolean bl) {
        c2.w(2 | n2 << 3);
        c2.w(d.h(stackTraceElement, bl));
        long l2 = stackTraceElement.isNativeMethod() ? (long)Math.max(stackTraceElement.getLineNumber(), 0) : 0L;
        c2.C(1, l2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stackTraceElement.getClassName());
        stringBuilder.append(".");
        stringBuilder.append(stackTraceElement.getMethodName());
        c2.t(2, d.c.b.m.e.p.a.a(stringBuilder.toString()));
        if (stackTraceElement.getFileName() != null) {
            c2.t(3, d.c.b.m.e.p.a.a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            c2.C(4, stackTraceElement.getLineNumber());
        }
        int n3 = 0;
        if (bl) {
            n3 = 4;
        }
        c2.A(5, n3);
    }

    public static void l(c c2, e e2, int n2, int n3, int n4) {
        c2.w(2 | n4 << 3);
        c2.w(d.c(e2, 1, n3));
        c2.t(1, d.c.b.m.e.p.a.a(e2.b));
        String string = e2.a;
        if (string != null) {
            c2.t(3, d.c.b.m.e.p.a.a(string));
        }
        StackTraceElement[] arrstackTraceElement = e2.c;
        int n5 = arrstackTraceElement.length;
        for (int i2 = 0; i2 < n5; ++i2) {
            d.k(c2, 4, arrstackTraceElement[i2], true);
        }
        e e3 = e2.d;
        if (e3 != null) {
            int n6 = 0;
            if (n2 < n3) {
                d.l(c2, e3, n2 + 1, n3, 6);
                return;
            }
            while (e3 != null) {
                e3 = e3.d;
                ++n6;
            }
            c2.A(7, n6);
        }
    }

    public static void m(c c2, Thread thread, StackTraceElement[] arrstackTraceElement, int n2, boolean bl) {
        c2.z(1, 2);
        c2.w(d.i(thread, arrstackTraceElement, n2, bl));
        c2.t(1, d.c.b.m.e.p.a.a(thread.getName()));
        c2.A(2, n2);
        int n3 = arrstackTraceElement.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            d.k(c2, 3, arrstackTraceElement[i2], bl);
        }
    }
}

