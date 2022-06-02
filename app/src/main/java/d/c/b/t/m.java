/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Byte
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.nio.charset.Charset
 *  java.util.UUID
 */
package d.c.b.t;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public class m {
    public static final byte a = Byte.parseByte("01110000", 2);
    public static final byte b = Byte.parseByte("00001111", 2);

    public String a() {
        UUID uUID = UUID.randomUUID();
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[17]);
        byteBuffer.putLong(uUID.getMostSignificantBits());
        byteBuffer.putLong(uUID.getLeastSignificantBits());
        byte[] arrby = byteBuffer.array();
        arrby[16] = arrby[0];
        arrby[0] = (byte)(b & arrby[0] | a);
        return new String(Base64.encode(arrby, 11), Charset.defaultCharset()).substring(0, 22);
    }
}

