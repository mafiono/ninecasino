/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Method
 */
package d.c.c.a0;

import d.c.c.a0.y;
import java.lang.reflect.Method;

public class u
extends y {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Object b;

    public u(Method method, Object object) {
        this.a = method;
        this.b = object;
    }

    @Override
    public <T> T b(Class<T> class_) {
        y.a(class_);
        return (T)this.a.invoke(this.b, new Object[]{class_});
    }
}

