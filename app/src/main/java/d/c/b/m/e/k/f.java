/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  d.c.b.m.e.k.r0
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.util.Date
 *  java.util.Locale
 *  java.util.concurrent.atomic.AtomicLong
 */
package d.c.b.m.e.k;

import android.os.Process;
import d.c.b.m.e.k.g;
import d.c.b.m.e.k.r0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

public class f {
    public static final AtomicLong a = new AtomicLong(0L);
    public static String b;

    public f(r0 r02) {
        byte[] arrby = new byte[10];
        long l2 = new Date().getTime();
        long l3 = l2 / 1000L;
        long l4 = l2 % 1000L;
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt((int)l3);
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        byteBuffer.position(0);
        byte[] arrby2 = byteBuffer.array();
        arrby[0] = arrby2[0];
        arrby[1] = arrby2[1];
        arrby[2] = arrby2[2];
        arrby[3] = arrby2[3];
        byte[] arrby3 = f.a(l4);
        arrby[4] = arrby3[0];
        arrby[5] = arrby3[1];
        byte[] arrby4 = f.a(a.incrementAndGet());
        arrby[6] = arrby4[0];
        arrby[7] = arrby4[1];
        byte[] arrby5 = f.a(Integer.valueOf(Process.myPid()).shortValue());
        arrby[8] = arrby5[0];
        arrby[9] = arrby5[1];
        String string = g.t(r02.b());
        String string2 = g.p(arrby);
        Locale locale = Locale.US;
        Object[] arrobject = new Object[]{string2.substring(0, 12), string2.substring(12, 16), string2.subSequence(16, 20), string.substring(0, 12)};
        b = String.format(locale, "%s-%s-%s-%s", arrobject).toUpperCase(locale);
    }

    public static byte[] a(long l2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(2);
        byteBuffer.putShort((short)l2);
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        byteBuffer.position(0);
        return byteBuffer.array();
    }

    public String toString() {
        return b;
    }
}

