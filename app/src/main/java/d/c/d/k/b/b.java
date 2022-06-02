/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.e.a
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.d.k.b;

import d.c.a.e.a;
import d.c.d.k.b.g;
import d.c.d.k.b.h;
import d.c.d.k.b.j;

public final class b
implements g {
    @Override
    public void a(h h2) {
        IllegalStateException illegalStateException;
        int n2;
        block8 : {
            StringBuilder stringBuilder;
            int n3;
            block6 : {
                block7 : {
                    stringBuilder = new StringBuilder();
                    n3 = 0;
                    stringBuilder.append('\u0000');
                    while (h2.d()) {
                        int n4;
                        stringBuilder.append(h2.b());
                        h2.f = n4 = 1 + h2.f;
                        if (a.a0((CharSequence)h2.a, (int)n4, (int)5) == 5) continue;
                        h2.g = 0;
                        break;
                    }
                    n2 = stringBuilder.length() - 1;
                    int n5 = 1 + (n2 + h2.a());
                    h2.f(n5);
                    boolean bl = h2.h.b - n5 > 0;
                    if (!h2.d() && !bl) break block6;
                    if (n2 > 249) break block7;
                    stringBuilder.setCharAt(0, (char)n2);
                    break block6;
                }
                if (n2 > 1555) break block8;
                stringBuilder.setCharAt(0, (char)(249 + n2 / 250));
                stringBuilder.insert(1, (char)(n2 % 250));
            }
            int n6 = stringBuilder.length();
            while (n3 < n6) {
                int n7 = stringBuilder.charAt(n3) + (1 + 149 * (1 + h2.a()) % 255);
                if (n7 > 255) {
                    n7 -= 256;
                }
                char c3 = (char)n7;
                h2.e.append(c3);
                ++n3;
            }
            return;
        }
        illegalStateException = new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(n2)));
        throw illegalStateException;
    }
}

