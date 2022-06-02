/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.c.s
 *  java.io.IOException
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.AssertionError
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.c;

import d.c.c.a0.z.o;
import d.c.c.c0.c;
import d.c.c.s;
import d.c.c.x;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public abstract class n {
    public s g() {
        if (this instanceof s) {
            return (s)this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Primitive: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c c2 = new c(stringWriter);
            c2.j = true;
            o.X.b(c2, this);
            String string = stringWriter.toString();
            return string;
        }
        catch (IOException iOException) {
            throw new AssertionError(iOException);
        }
    }
}

