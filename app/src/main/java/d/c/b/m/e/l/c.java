/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.b.m.e.l.c$a
 *  java.io.Closeable
 *  java.io.File
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.RandomAccessFile
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.AssertionError
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.channels.FileChannel
 *  java.nio.channels.WritableByteChannel
 *  java.util.NoSuchElementException
 *  java.util.Objects
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package d.c.b.m.e.l;

import d.c.b.m.e.l.c;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class c
implements Closeable {
    public static final Logger k = Logger.getLogger(c.class.getName());
    public final RandomAccessFile e;
    public int f;
    public int g;
    public b h;
    public b i;
    public final byte[] j = new byte[16];

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public c(File file) {
        RandomAccessFile randomAccessFile;
        int n2;
        if (!file.exists()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(file.getPath());
            stringBuilder.append(".tmp");
            File file2 = new File(stringBuilder.toString());
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rwd");
            randomAccessFile2.setLength(4096L);
            randomAccessFile2.seek(0L);
            byte[] arrby = new byte[16];
            int[] arrn = new int[]{4096, 0, 0, 0};
            int n3 = 0;
            for (int i2 = 0; i2 < 4; n3 += 4, ++i2) {
                c.d0(arrby, n3, arrn[i2]);
            }
            randomAccessFile2.write(arrby);
            if (!file2.renameTo(file)) throw new IOException("Rename failed!");
        }
        this.e = randomAccessFile = new RandomAccessFile(file, "rwd");
        randomAccessFile.seek(0L);
        randomAccessFile.readFully(this.j);
        this.f = n2 = c.D(this.j, 0);
        if ((long)n2 <= randomAccessFile.length()) {
            this.g = c.D(this.j, 4);
            int n4 = c.D(this.j, 8);
            int n5 = c.D(this.j, 12);
            this.h = this.A(n4);
            this.i = this.A(n5);
            return;
        }
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"File is truncated. Expected length: ");
        stringBuilder.append(this.f);
        stringBuilder.append(", Actual length: ");
        stringBuilder.append(randomAccessFile.length());
        IOException iOException = new IOException(stringBuilder.toString());
        throw iOException;
    }

    public static int D(byte[] arrby, int n2) {
        return ((255 & arrby[n2]) << 24) + ((255 & arrby[n2 + 1]) << 16) + ((255 & arrby[n2 + 2]) << 8) + (255 & arrby[n2 + 3]);
    }

    public static int a(c c2, int n2) {
        int n3 = c2.f;
        if (n2 < n3) {
            return n2;
        }
        return n2 + 16 - n3;
    }

    public static void d0(byte[] arrby, int n2, int n3) {
        arrby[n2] = (byte)(n3 >> 24);
        arrby[n2 + 1] = (byte)(n3 >> 16);
        arrby[n2 + 2] = (byte)(n3 >> 8);
        arrby[n2 + 3] = (byte)n3;
    }

    public final b A(int n2) {
        if (n2 == 0) {
            return b.c;
        }
        this.e.seek(n2);
        return new b(n2, this.e.readInt());
    }

    public void F() {
        c c2 = this;
        synchronized (c2) {
            if (!this.u()) {
                if (this.g == 1) {
                    this.i();
                } else {
                    b b2 = this.h;
                    int n2 = this.V(4 + b2.a + b2.b);
                    this.H(n2, this.j, 0, 4);
                    int n3 = c.D(this.j, 0);
                    this.c0(this.f, this.g - 1, n2, this.i.a);
                    --this.g;
                    this.h = new b(n2, n3);
                }
                return;
            }
            throw new NoSuchElementException();
        }
    }

    public final void H(int n2, byte[] arrby, int n3, int n4) {
        RandomAccessFile randomAccessFile;
        int n5 = this.f;
        if (n2 >= n5) {
            n2 = n2 + 16 - n5;
        }
        if (n2 + n4 <= n5) {
            this.e.seek(n2);
            randomAccessFile = this.e;
        } else {
            int n6 = n5 - n2;
            this.e.seek(n2);
            this.e.readFully(arrby, n3, n6);
            this.e.seek(16L);
            randomAccessFile = this.e;
            n3 += n6;
            n4 -= n6;
        }
        randomAccessFile.readFully(arrby, n3, n4);
    }

    public final void J(int n2, byte[] arrby, int n3, int n4) {
        RandomAccessFile randomAccessFile;
        int n5 = this.f;
        if (n2 >= n5) {
            n2 = n2 + 16 - n5;
        }
        if (n2 + n4 <= n5) {
            this.e.seek(n2);
            randomAccessFile = this.e;
        } else {
            int n6 = n5 - n2;
            this.e.seek(n2);
            this.e.write(arrby, n3, n6);
            this.e.seek(16L);
            randomAccessFile = this.e;
            n3 += n6;
            n4 -= n6;
        }
        randomAccessFile.write(arrby, n3, n4);
    }

    public int S() {
        if (this.g == 0) {
            return 16;
        }
        b b2 = this.i;
        int n2 = b2.a;
        int n3 = this.h.a;
        if (n2 >= n3) {
            return 16 + (4 + (n2 - n3) + b2.b);
        }
        return n2 + 4 + b2.b + this.f - n3;
    }

    public final int V(int n2) {
        int n3 = this.f;
        if (n2 < n3) {
            return n2;
        }
        return n2 + 16 - n3;
    }

    public final void c0(int n2, int n3, int n4, int n5) {
        byte[] arrby = this.j;
        int[] arrn = new int[4];
        arrn[0] = n2;
        arrn[1] = n3;
        arrn[2] = n4;
        arrn[3] = n5;
        int n6 = 0;
        for (int i2 = 0; i2 < 4; ++i2) {
            c.d0(arrby, n6, arrn[i2]);
            n6 += 4;
        }
        this.e.seek(0L);
        this.e.write(this.j);
    }

    public void close() {
        c c2 = this;
        synchronized (c2) {
            this.e.close();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e(byte[] arrby) {
        int n2 = arrby.length;
        c c2 = this;
        synchronized (c2) {
            if ((0 | n2) >= 0 && n2 <= arrby.length - 0) {
                int n3;
                this.m(n2);
                boolean bl = this.u();
                if (bl) {
                    n3 = 16;
                } else {
                    b b2 = this.i;
                    n3 = this.V(4 + b2.a + b2.b);
                }
                b b3 = new b(n3, n2);
                c.d0(this.j, 0, n2);
                this.J(b3.a, this.j, 0, 4);
                this.J(4 + b3.a, arrby, 0, n2);
                int n4 = bl ? b3.a : this.h.a;
                this.c0(this.f, 1 + this.g, n4, b3.a);
                this.i = b3;
                this.g = 1 + this.g;
                if (bl) {
                    this.h = b3;
                }
                return;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public void i() {
        c c2 = this;
        synchronized (c2) {
            b b2;
            this.c0(4096, 0, 0, 0);
            this.g = 0;
            this.h = b2 = b.c;
            this.i = b2;
            if (this.f > 4096) {
                this.e.setLength(4096);
                this.e.getChannel().force(true);
            }
            this.f = 4096;
            return;
        }
    }

    public final void m(int n2) {
        int n3;
        int n4;
        int n5 = n2 + 4;
        int n6 = this.f - this.S();
        if (n6 >= n5) {
            return;
        }
        int n7 = this.f;
        while ((n6 += (n7 <<= 1)) < n5) {
        }
        this.e.setLength(n7);
        this.e.getChannel().force(true);
        b b2 = this.i;
        int n8 = this.V(4 + b2.a + b2.b);
        if (n8 < this.h.a) {
            FileChannel fileChannel = this.e.getChannel();
            fileChannel.position(this.f);
            long l2 = n8 - 4;
            if (fileChannel.transferTo(16L, l2, fileChannel) != l2) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        if ((n4 = this.i.a) < (n3 = this.h.a)) {
            int n9 = -16 + (n4 + this.f);
            this.c0(n7, this.g, n3, n9);
            this.i = new b(n9, this.i.b);
        } else {
            this.c0(n7, this.g, n3, n4);
        }
        this.f = n7;
    }

    public void s(d d3) {
        c c2 = this;
        synchronized (c2) {
            int n2;
            int n3;
            try {
                n2 = this.h.a;
                n3 = 0;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            do {
                if (n3 >= this.g) break;
                b b2 = this.A(n2);
                d3.a(new c(b2, null), b2.b);
                n2 = this.V(4 + b2.a + b2.b);
                ++n3;
            } while (true);
            return;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c.class.getSimpleName());
        stringBuilder.append('[');
        stringBuilder.append("fileLength=");
        stringBuilder.append(this.f);
        stringBuilder.append(", size=");
        stringBuilder.append(this.g);
        stringBuilder.append(", first=");
        stringBuilder.append(this.h);
        stringBuilder.append(", last=");
        stringBuilder.append(this.i);
        stringBuilder.append(", element lengths=[");
        try {
            this.s((d)new a(this, stringBuilder));
        }
        catch (IOException iOException) {
            k.log(Level.WARNING, "read error", iOException);
        }
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }

    public boolean u() {
        c c2 = this;
        synchronized (c2) {
            int n2 = this.g;
            boolean bl = n2 == 0;
            return bl;
        }
    }

    public static class b {
        public static final b c = new b(0, 0);
        public final int a;
        public final int b;

        public b(int n2, int n3) {
            this.a = n2;
            this.b = n3;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(b.class.getSimpleName());
            stringBuilder.append("[position = ");
            stringBuilder.append(this.a);
            stringBuilder.append(", length = ");
            stringBuilder.append(this.b);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public final class c
    extends InputStream {
        public int e;
        public int f;

        public c(b b2, a a2) {
            int n2 = 4 + b2.a;
            int n3 = c.this.f;
            if (n2 >= n3) {
                n2 = n2 + 16 - n3;
            }
            this.e = n2;
            this.f = b2.b;
        }

        public int read() {
            if (this.f == 0) {
                return -1;
            }
            c.this.e.seek((long)this.e);
            int n2 = c.this.e.read();
            this.e = c.a(c.this, 1 + this.e);
            this.f = -1 + this.f;
            return n2;
        }

        public int read(byte[] arrby, int n2, int n3) {
            Objects.requireNonNull((Object)arrby, "buffer");
            if ((n2 | n3) >= 0 && n3 <= arrby.length - n2) {
                int n4 = this.f;
                if (n4 > 0) {
                    if (n3 > n4) {
                        n3 = n4;
                    }
                    c.this.H(this.e, arrby, n2, n3);
                    this.e = c.a(c.this, n3 + this.e);
                    this.f -= n3;
                    return n3;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public interface d {
        void a(InputStream var1, int var2);
    }

}

