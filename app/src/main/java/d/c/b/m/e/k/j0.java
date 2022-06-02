/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  d.a.b.a.a
 *  d.c.b.m.e.k.r0
 *  d.c.b.m.e.m.n
 *  d.c.b.m.e.m.p
 *  d.c.b.m.e.m.q
 *  d.c.b.m.e.m.q$b
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Objects
 */
package d.c.b.m.e.k;

import android.content.Context;
import d.a.b.a.a;
import d.c.b.m.e.k.b;
import d.c.b.m.e.k.r0;
import d.c.b.m.e.m.n;
import d.c.b.m.e.m.p;
import d.c.b.m.e.m.q;
import d.c.b.m.e.m.v;
import d.c.b.m.e.m.w;
import d.c.b.m.e.t.d;
import d.c.b.m.e.t.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class j0 {
    public static final String e;
    public static final Map<String, Integer> f;
    public final Context a;
    public final r0 b;
    public final b c;
    public final d d;

    public static {
        HashMap hashMap;
        e = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"17.3.0"});
        f = hashMap = new HashMap();
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public j0(Context context, r0 r02, b b2, d d3) {
        this.a = context;
        this.b = r02;
        this.c = b2;
        this.d = d3;
    }

    public final v.d.d.a.b.b a(e e2, int n2, int n3, int n4) {
        IllegalStateException illegalStateException;
        String string;
        String string2 = e2.b;
        String string3 = e2.a;
        StackTraceElement[] arrstackTraceElement = e2.c;
        if (arrstackTraceElement == null) {
            arrstackTraceElement = new StackTraceElement[]{};
        }
        e e3 = e2.d;
        int n5 = 0;
        if (n4 >= n3) {
            e e4 = e3;
            while (e4 != null) {
                e4 = e4.d;
                ++n5;
            }
        }
        Objects.requireNonNull((Object)string2, "Null type");
        w<v.d.d.a.b.d.a> w2 = new w<v.d.d.a.b.d.a>(this.b(arrstackTraceElement, n2));
        Integer n6 = n5;
        v.d.d.a.b.b b2 = null;
        if (e3 != null) {
            b2 = null;
            if (n5 == 0) {
                b2 = this.a(e3, n2, n3, n4 + 1);
            }
        }
        if ((string = n6 == null ? " overflowCount" : "").isEmpty()) {
            n n7 = new n(string2, string3, w2, b2, n6.intValue(), null);
            return n7;
        }
        illegalStateException = new IllegalStateException(a.m((String)"Missing required properties:", (String)string));
        throw illegalStateException;
    }

    public final w<v.d.d.a.b.d.a> b(StackTraceElement[] arrstackTraceElement, int n2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : arrstackTraceElement) {
            q.b b2 = new q.b();
            b2.e = n2;
            boolean bl = stackTraceElement.isNativeMethod();
            long l2 = 0L;
            long l3 = bl ? Math.max(stackTraceElement.getLineNumber(), l2) : l2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(stackTraceElement.getClassName());
            stringBuilder.append(".");
            stringBuilder.append(stackTraceElement.getMethodName());
            String string = stringBuilder.toString();
            String string2 = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                l2 = stackTraceElement.getLineNumber();
            }
            b2.a = l3;
            Objects.requireNonNull((Object)string, "Null symbol");
            b2.b = string;
            b2.c = string2;
            b2.d = l2;
            arrayList.add((Object)b2.a());
        }
        return new w<v.d.d.a.b.d.a>((List<v.d.d.a.b.d.a>)arrayList);
    }

    public final v.d.d.a.b.d c(Thread thread, StackTraceElement[] arrstackTraceElement, int n2) {
        String string = thread.getName();
        Objects.requireNonNull((Object)string, "Null name");
        Integer n3 = n2;
        w<v.d.d.a.b.d.a> w2 = new w<v.d.d.a.b.d.a>(this.b(arrstackTraceElement, n2));
        String string2 = n3 == null ? " importance" : "";
        if (string2.isEmpty()) {
            return new p(string, n3.intValue(), w2, null);
        }
        throw new IllegalStateException(a.m((String)"Missing required properties:", (String)string2));
    }
}

