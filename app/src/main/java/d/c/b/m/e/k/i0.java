/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package d.c.b.m.e.k;

import d.a.b.a.a;
import d.c.b.m.e.b;
import d.c.b.m.e.o.h;
import java.io.File;
import java.io.IOException;

public class i0 {
    public final String a;
    public final h b;

    public i0(String string, h h2) {
        this.a = string;
        this.b = h2;
    }

    public boolean a() {
        try {
            boolean bl = this.b().createNewFile();
            return bl;
        }
        catch (IOException iOException) {
            b b2 = b.a;
            StringBuilder stringBuilder = a.d((String)"Error creating marker: ");
            stringBuilder.append(this.a);
            b2.e(stringBuilder.toString(), iOException);
            return false;
        }
    }

    public final File b() {
        return new File(this.b.a(), this.a);
    }
}

