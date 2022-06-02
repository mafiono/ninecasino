/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.util.EnumSet
 */
package d.c.c.a0;

import d.a.b.a.a;
import d.c.c.a0.g;
import d.c.c.a0.t;
import d.c.c.o;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

public class j
implements t<T> {
    public final /* synthetic */ Type a;

    public j(g g2, Type type) {
        this.a = type;
    }

    @Override
    public T a() {
        Type type = this.a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType)type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T)EnumSet.noneOf(type2);
            }
            StringBuilder stringBuilder = a.d((String)"Invalid EnumSet type: ");
            stringBuilder.append(this.a);
            throw new o(stringBuilder.toString());
        }
        StringBuilder stringBuilder = a.d((String)"Invalid EnumSet type: ");
        stringBuilder.append(this.a);
        throw new o(stringBuilder.toString());
    }
}

