/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  d.b.b0
 *  d.b.c0
 *  d.b.o
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.util.HashMap
 *  java.util.Map
 */
package d.b;

import android.os.Handler;
import d.b.b0;
import d.b.c0;
import d.b.o;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class z
extends OutputStream
implements b0 {
    public final Map<o, c0> e = new HashMap();
    public final Handler f;
    public o g;
    public c0 h;
    public int i;

    public z(Handler handler) {
        this.f = handler;
    }

    public void a(o o2) {
        this.g = o2;
        c0 c02 = o2 != null ? this.e.get((Object)o2) : null;
        this.h = c02;
    }

    public void e(long l2) {
        if (this.h == null) {
            c0 c02;
            this.h = c02 = new c0(this.f, this.g);
            this.e.put((Object)this.g, (Object)c02);
        }
        c0 c03 = this.h;
        c03.f = l2 + c03.f;
        this.i = (int)(l2 + (long)this.i);
    }

    public void write(int n2) {
        this.e(1L);
    }

    public void write(byte[] arrby) {
        this.e(arrby.length);
    }

    public void write(byte[] arrby, int n2, int n3) {
        this.e(n3);
    }
}

