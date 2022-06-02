/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayInputStream
 *  java.io.Flushable
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package d.c.b.m.e.p;

import java.io.ByteArrayInputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;

public final class c
implements Flushable {
    public final byte[] e;
    public final int f;
    public int g;
    public final OutputStream h;

    public c(OutputStream outputStream, byte[] arrby) {
        this.h = outputStream;
        this.e = arrby;
        this.g = 0;
        this.f = arrby.length;
    }

    public static int a(int n2, boolean bl) {
        return 1 + c.j(n2);
    }

    public static int e(int n2, d.c.b.m.e.p.a a2) {
        return c.j(n2) + (c.i(a2.a.length) + a2.a.length);
    }

    public static int f(int n2, int n3) {
        int n4 = c.j(n2);
        int n5 = n3 >= 0 ? c.i(n3) : 10;
        return n4 + n5;
    }

    public static int i(int n2) {
        if ((n2 & -128) == 0) {
            return 1;
        }
        if ((n2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & n2) == 0) {
            return 3;
        }
        if ((n2 & -268435456) == 0) {
            return 4;
        }
        return 5;
    }

    public static int j(int n2) {
        return c.i(0 | n2 << 3);
    }

    public static int k(int n2, int n3) {
        return c.j(n2) + c.i(n3);
    }

    public static int m(int n2, long l2) {
        int n3 = c.j(n2);
        int n4 = (-128L & l2) == 0L ? 1 : ((-16384L & l2) == 0L ? 2 : ((-2097152L & l2) == 0L ? 3 : ((-268435456L & l2) == 0L ? 4 : ((-34359738368L & l2) == 0L ? 5 : ((-4398046511104L & l2) == 0L ? 6 : ((-562949953421312L & l2) == 0L ? 7 : ((-72057594037927936L & l2) == 0L ? 8 : ((l2 & Long.MIN_VALUE) == 0L ? 9 : 10))))))));
        return n3 + n4;
    }

    public static c n(OutputStream outputStream) {
        return new c(outputStream, new byte[4096]);
    }

    public void A(int n2, int n3) {
        this.w(0 | n2 << 3);
        this.w(n3);
    }

    public void C(int n2, long l2) {
        this.w(0 | n2 << 3);
        this.y(l2);
    }

    public void flush() {
        if (this.h != null) {
            this.r();
        }
    }

    public final void r() {
        OutputStream outputStream = this.h;
        if (outputStream != null) {
            outputStream.write(this.e, 0, this.g);
            this.g = 0;
            return;
        }
        throw new a();
    }

    public void s(int n2, boolean bl) {
        this.w(0 | n2 << 3);
        this.v((int)bl);
    }

    public void t(int n2, d.c.b.m.e.p.a a2) {
        IllegalStateException illegalStateException;
        int n3;
        this.w(2 | n2 << 3);
        this.w(a2.a.length);
        byte[] arrby = a2.a;
        int n4 = arrby.length;
        int n5 = this.f;
        int n6 = this.g;
        int n7 = n5 - n6;
        if (n7 >= n4) {
            System.arraycopy(arrby, 0, this.e, n6, n4);
            this.g = n4 + this.g;
            return;
        }
        System.arraycopy(arrby, 0, this.e, n6, n7);
        int n8 = n7 + 0;
        this.g = this.f;
        this.r();
        if (n3 <= this.f) {
            byte[] arrby2 = this.e;
            System.arraycopy(a2.a, n8, arrby2, 0, n3);
            this.g = n3;
            return;
        }
        long l2 = n8;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a2.a);
        if (l2 == byteArrayInputStream.skip(l2)) {
            int n9;
            for (n3 = n4 - n7; n3 > 0; n3 -= n9) {
                int n10 = Math.min(n3, this.f);
                n9 = byteArrayInputStream.read(this.e, 0, n10);
                if (n9 == n10) {
                    this.h.write(this.e, 0, n9);
                    continue;
                }
                throw new IllegalStateException("Read failed.");
            }
            return;
        }
        illegalStateException = new IllegalStateException("Skip failed.");
        throw illegalStateException;
    }

    public void u(int n2, int n3) {
        this.w(0 | n2 << 3);
        if (n3 >= 0) {
            this.w(n3);
            return;
        }
        this.y(n3);
    }

    public void v(int n2) {
        byte by = (byte)n2;
        if (this.g == this.f) {
            this.r();
        }
        byte[] arrby = this.e;
        int n3 = this.g;
        this.g = n3 + 1;
        arrby[n3] = by;
    }

    public void w(int n2) {
        do {
            if ((n2 & -128) == 0) {
                this.v(n2);
                return;
            }
            this.v(128 | n2 & 127);
            n2 >>>= 7;
        } while (true);
    }

    public void y(long l2) {
        do {
            if ((-128L & l2) == 0L) {
                this.v((int)l2);
                return;
            }
            this.v(128 | 127 & (int)l2);
            l2 >>>= 7;
        } while (true);
    }

    public void z(int n2, int n3) {
        this.w(n3 | n2 << 3);
    }

    public static class a
    extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

}

