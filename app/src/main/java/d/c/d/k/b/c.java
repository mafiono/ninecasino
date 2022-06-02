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

public class c
implements g {
    public static void f(h h2, StringBuilder stringBuilder) {
        char c3 = stringBuilder.charAt(0);
        char c4 = stringBuilder.charAt(1);
        int n2 = 1 + (stringBuilder.charAt(2) + (c3 * 1600 + c4 * 40));
        String string = new String(new char[]{(char)(n2 / 256), (char)(n2 % 256)});
        h2.e.append(string);
        stringBuilder.delete(0, 3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(h var1_1) {
        block5 : {
            block2 : {
                var2_2 = new StringBuilder();
                while (var1_1.d()) {
                    block3 : {
                        block4 : {
                            var4_3 = var1_1.b();
                            var1_1.f = 1 + var1_1.f;
                            var5_4 = this.c(var4_3, var2_2);
                            var6_5 = (var2_2.length() / 3 << 1) + var1_1.a();
                            var1_1.f(var6_5);
                            var7_6 = var1_1.h.b - var6_5;
                            if (var1_1.d()) break block3;
                            var8_7 = new StringBuilder();
                            if (var2_2.length() % 3 != 2 || var7_6 >= 2 && var7_6 <= 2) break block4;
                            var3_8 = this;
                            ** GOTO lbl-1000
                        }
                        var3_8 = this;
                        break block2;
                    }
                    if (var2_2.length() % 3 != 0 || a.a0((CharSequence)var1_1.a, (int)var1_1.f, (int)this.d()) == this.d()) continue;
                    var1_1.g = 0;
                    break;
                }
                var3_8 = this;
                break block5;
            }
            while (var2_2.length() % 3 == 1 && (var5_4 <= 3 && var7_6 != 1 || var5_4 > 3)) lbl-1000: // 2 sources:
            {
                var5_4 = var3_8.b(var1_1, var2_2, var8_7, var5_4);
            }
        }
        var3_8.e(var1_1, var2_2);
    }

    public final int b(h h2, StringBuilder stringBuilder, StringBuilder stringBuilder2, int n2) {
        int n3 = stringBuilder.length();
        stringBuilder.delete(n3 - n2, n3);
        h2.f = -1 + h2.f;
        int n4 = this.c(h2.b(), stringBuilder2);
        h2.h = null;
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int c(char n2, StringBuilder stringBuilder) {
        block16 : {
            block10 : {
                int n3;
                block14 : {
                    int n4;
                    block12 : {
                        block15 : {
                            block13 : {
                                block11 : {
                                    block9 : {
                                        block8 : {
                                            char c3;
                                            block5 : {
                                                int n5;
                                                block7 : {
                                                    block6 : {
                                                        block4 : {
                                                            if (n2 != 32) break block4;
                                                            c3 = '\u0003';
                                                            break block5;
                                                        }
                                                        if (n2 < 48 || n2 > 57) break block6;
                                                        n5 = 4 + (n2 - 48);
                                                        break block7;
                                                    }
                                                    if (n2 < 65 || n2 > 90) break block8;
                                                    n5 = 14 + (n2 - 65);
                                                }
                                                c3 = (char)n5;
                                            }
                                            stringBuilder.append(c3);
                                            return 1;
                                        }
                                        if (n2 >= 32) break block9;
                                        stringBuilder.append('\u0000');
                                        break block10;
                                    }
                                    n4 = 33;
                                    if (n2 < n4 || n2 > 47) break block11;
                                    stringBuilder.append('\u0001');
                                    break block12;
                                }
                                if (n2 < 58 || n2 > 64) break block13;
                                stringBuilder.append('\u0001');
                                n3 = 15 + (n2 - 58);
                                break block14;
                            }
                            if (n2 < 91 || n2 > 95) break block15;
                            stringBuilder.append('\u0001');
                            n3 = 22 + (n2 - 91);
                            break block14;
                        }
                        n4 = 96;
                        if (n2 < n4 || n2 > 127) break block16;
                        stringBuilder.append('\u0002');
                    }
                    n3 = n2 - n4;
                }
                n2 = (char)n3;
            }
            stringBuilder.append(n2);
            return 2;
        }
        stringBuilder.append("\u0001\u001e");
        return 2 + this.c((char)(n2 - 128), stringBuilder);
    }

    public int d() {
        return 1;
    }

    public void e(h h2, StringBuilder stringBuilder) {
        IllegalStateException illegalStateException;
        block11 : {
            block8 : {
                block9 : {
                    int n2;
                    int n3;
                    block10 : {
                        block7 : {
                            int n4 = stringBuilder.length() / 3 << 1;
                            n3 = stringBuilder.length() % 3;
                            int n5 = n4 + h2.a();
                            h2.f(n5);
                            n2 = h2.h.b - n5;
                            if (n3 != 2) break block7;
                            stringBuilder.append('\u0000');
                            while (stringBuilder.length() >= 3) {
                                c.f(h2, stringBuilder);
                            }
                            if (!h2.d()) break block8;
                            break block9;
                        }
                        if (n2 != 1 || n3 != 1) break block10;
                        while (stringBuilder.length() >= 3) {
                            c.f(h2, stringBuilder);
                        }
                        if (h2.d()) {
                            h2.e.append('\u00fe');
                        }
                        --h2.f;
                        break block8;
                    }
                    if (n3 != 0) break block11;
                    while (stringBuilder.length() >= 3) {
                        c.f(h2, stringBuilder);
                    }
                    if (n2 <= 0 && !h2.d()) break block8;
                }
                h2.e.append('\u00fe');
            }
            h2.g = 0;
            return;
        }
        illegalStateException = new IllegalStateException("Unexpected case. Please report!");
        throw illegalStateException;
    }
}

