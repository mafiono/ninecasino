/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 *  java.nio.charset.StandardCharsets
 */
package d.c.d.k.b;

import d.c.d.b;
import d.c.d.k.b.j;
import d.c.d.k.b.k;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class h {
    public final String a;
    public k b;
    public b c;
    public b d;
    public final StringBuilder e;
    public int f;
    public int g;
    public j h;
    public int i;

    public h(String string) {
        byte[] arrby = string.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder stringBuilder = new StringBuilder(arrby.length);
        int n2 = arrby.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = (char)(255 & arrby[i2]);
            if (c2 == '?' && string.charAt(i2) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            stringBuilder.append(c2);
        }
        this.a = stringBuilder.toString();
        this.b = k.e;
        this.e = new StringBuilder(string.length());
        this.g = -1;
    }

    public int a() {
        return this.e.length();
    }

    public char b() {
        return this.a.charAt(this.f);
    }

    public int c() {
        return this.a.length() - this.i - this.f;
    }

    public boolean d() {
        return this.f < this.a.length() - this.i;
    }

    public void e() {
        this.f(this.a());
    }

    public void f(int n2) {
        j j2 = this.h;
        if (j2 == null || n2 > j2.b) {
            this.h = j.i(n2, this.b, this.c, this.d, true);
        }
    }
}

