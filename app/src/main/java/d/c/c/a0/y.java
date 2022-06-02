/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Modifier
 */
package d.c.c.a0;

import d.a.b.a.a;
import java.lang.reflect.Modifier;

public abstract class y {
    public static void a(Class<?> class_) {
        int n2 = class_.getModifiers();
        if (!Modifier.isInterface(n2)) {
            if (!Modifier.isAbstract(n2)) {
                return;
            }
            StringBuilder stringBuilder = a.d((String)"Abstract class can't be instantiated! Class name: ");
            stringBuilder.append(class_.getName());
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = a.d((String)"Interface can't be instantiated! Interface name: ");
        stringBuilder.append(class_.getName());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public abstract <T> T b(Class<T> var1);
}

