/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.JsonWriter
 *  java.io.IOException
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package d.c.b.o.i;

import android.util.JsonWriter;
import d.c.b.o.a;
import d.c.b.o.i.e;
import d.c.b.o.i.f;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

public class d
implements a {
    public final /* synthetic */ e a;

    public d(e e2) {
        this.a = e2;
    }

    public String a(Object object) {
        StringWriter stringWriter;
        stringWriter = new StringWriter();
        try {
            this.b(object, stringWriter);
        }
        catch (IOException iOException) {}
        return stringWriter.toString();
    }

    public void b(Object object, Writer writer) {
        e e2 = this.a;
        f f2 = new f(writer, e2.a, e2.b, e2.c, e2.d);
        f2.g(object, false);
        f2.i();
        f2.b.flush();
    }
}

