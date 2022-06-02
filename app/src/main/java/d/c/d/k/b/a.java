/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.e.a
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.d.k.b;

import d.c.d.k.b.g;
import d.c.d.k.b.h;

public final class a
implements g {
    @Override
    public void a(h h2) {
        String string = h2.a;
        int n2 = h2.f;
        int n3 = string.length();
        int n4 = 0;
        if (n2 < n3) {
            block0 : do {
                char c3 = string.charAt(n2);
                while (d.c.a.e.a.O((char)c3) && n2 < n3) {
                    ++n4;
                    if (++n2 >= n3) continue;
                    continue block0;
                }
                break;
            } while (true);
        }
        if (n4 >= 2) {
            char c4 = h2.a.charAt(h2.f);
            char c6 = h2.a.charAt(1 + h2.f);
            if (d.c.a.e.a.O((char)c4) && d.c.a.e.a.O((char)c6)) {
                char c7 = (char)(130 + (10 * (c4 - 48) + (c6 - 48)));
                h2.e.append(c7);
                h2.f = 2 + h2.f;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("not digits: ");
            stringBuilder.append(c4);
            stringBuilder.append(c6);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        char c8 = h2.b();
        int n5 = d.c.a.e.a.a0((CharSequence)h2.a, (int)h2.f, (int)0);
        if (n5 != 0) {
            if (n5 != 1) {
                if (n5 != 2) {
                    if (n5 != 3) {
                        if (n5 != 4) {
                            if (n5 == 5) {
                                h2.e.append('\u00e7');
                                h2.g = 5;
                                return;
                            }
                            throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(n5)));
                        }
                        h2.e.append('\u00f0');
                        h2.g = 4;
                        return;
                    }
                    h2.e.append('\u00ee');
                    h2.g = 3;
                    return;
                }
                h2.e.append('\u00ef');
                h2.g = 2;
                return;
            }
            h2.e.append('\u00e6');
            h2.g = 1;
            return;
        }
        if (d.c.a.e.a.P((char)c8)) {
            h2.e.append('\u00eb');
            char c9 = (char)(1 + (c8 - 128));
            h2.e.append(c9);
            h2.f = 1 + h2.f;
            return;
        }
        char c10 = (char)(c8 + '\u0001');
        h2.e.append(c10);
        h2.f = 1 + h2.f;
    }
}

