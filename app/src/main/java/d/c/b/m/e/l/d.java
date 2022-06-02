/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Object
 */
package d.c.b.m.e.l;

import d.c.b.m.e.l.c;
import d.c.b.m.e.l.e;
import java.io.InputStream;

public class d
implements c.d {
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ int[] b;

    public d(e e2, byte[] arrby, int[] arrn) {
        this.a = arrby;
        this.b = arrn;
    }

    @Override
    public void a(InputStream inputStream, int n2) {
        try {
            inputStream.read(this.a, this.b[0], n2);
            int[] arrn = this.b;
            arrn[0] = n2 + arrn[0];
            return;
        }
        finally {
            inputStream.close();
        }
    }
}

