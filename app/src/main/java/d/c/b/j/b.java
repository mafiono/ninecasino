/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.text.DateFormat
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Locale
 */
package d.c.b.j;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class b {
    public static final String[] g = new String[]{"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final DateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    public final String a;
    public final String b;
    public final String c;
    public final Date d;
    public final long e;
    public final long f;

    public b(String string, String string2, String string3, Date date, long l2, long l3) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = date;
        this.e = l2;
        this.f = l3;
    }
}

