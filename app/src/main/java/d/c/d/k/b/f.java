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
 *  java.lang.Throwable
 */
package d.c.d.k.b;

import d.c.a.e.a;
import d.c.d.k.b.g;
import d.c.d.k.b.h;
import d.c.d.k.b.j;

public final class f
implements g {
    public static String b(CharSequence charSequence, int n2) {
        int n3 = charSequence.length() - n2;
        if (n3 != 0) {
            char c3 = charSequence.charAt(n2);
            char c4 = n3 >= 2 ? charSequence.charAt(n2 + 1) : '\u0000';
            char c6 = n3 >= 3 ? charSequence.charAt(n2 + 2) : '\u0000';
            char c7 = '\u0000';
            if (n3 >= 4) {
                c7 = charSequence.charAt(n2 + 3);
            }
            int n4 = c7 + ((c3 << 18) + (c4 << 12) + (c6 << 6));
            char c8 = (char)(255 & n4 >> 16);
            char c9 = (char)(255 & n4 >> 8);
            char c10 = (char)(n4 & 255);
            StringBuilder stringBuilder = new StringBuilder(3);
            stringBuilder.append(c8);
            if (n3 >= 2) {
                stringBuilder.append(c9);
            }
            if (n3 >= 3) {
                stringBuilder.append(c10);
            }
            return stringBuilder.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a(h var1_1) {
        block14 : {
            block17 : {
                block16 : {
                    block15 : {
                        block12 : {
                            block13 : {
                                var2_2 = new StringBuilder();
                                do lbl-1000: // 3 sources:
                                {
                                    var3_3 = var1_1.d();
                                    var4_4 = 1;
                                    if (!var3_3) break block12;
                                    var13_5 = var1_1.b();
                                    if (var13_5 < ' ' || var13_5 > '?') {
                                        if (var13_5 < '@' || var13_5 > '^') break block13;
                                        var13_5 = (char)(var13_5 - 64);
                                    }
                                    var2_2.append(var13_5);
                                    var1_1.f = var4_4 + var1_1.f;
                                    if (var2_2.length() < 4) ** GOTO lbl-1000
                                    var15_6 = f.b((CharSequence)var2_2, 0);
                                    var1_1.e.append(var15_6);
                                    var2_2.delete(0, 4);
                                } while (a.a0((CharSequence)var1_1.a, (int)var1_1.f, (int)4) == 4);
                                var1_1.g = 0;
                                break block12;
                            }
                            a.K((char)var13_5);
                            throw null;
                        }
                        var2_2.append('\u001f');
                        try {
                            var7_7 = var2_2.length();
                            if (var7_7 == 0) break block14;
                            if (var7_7 == var4_4) {
                                var1_1.e();
                                var8_8 = var1_1.h.b - var1_1.a();
                                var9_9 = var1_1.c();
                                if (var9_9 > var8_8) {
                                    var1_1.f(var4_4 + var1_1.a());
                                    var8_8 = var1_1.h.b - var1_1.a();
                                }
                                if (var9_9 <= var8_8 && var8_8 <= 2) break block14;
                            }
                            if (var7_7 > 4) break block15;
                        }
                        catch (Throwable var6_12) {
                            var1_1.g = 0;
                            throw var6_12;
                        }
                        var10_10 = var7_7 - var4_4;
                        var11_11 = f.b((CharSequence)var2_2, 0);
                        if ((var4_4 ^ var1_1.d()) == 0 || var10_10 > 2) break block16;
                        break block17;
                    }
                    throw new IllegalStateException("Count must not exceed 4");
                }
                var4_4 = 0;
            }
            if (var10_10 <= 2) {
                var1_1.f(var10_10 + var1_1.a());
                if (var1_1.h.b - var1_1.a() >= 3) {
                    var1_1.f(var1_1.a() + var11_11.length());
                    var4_4 = 0;
                }
            }
            if (var4_4 != 0) {
                var1_1.h = null;
                var1_1.f -= var10_10;
            } else {
                var1_1.e.append(var11_11);
            }
        }
        var1_1.g = 0;
    }
}

