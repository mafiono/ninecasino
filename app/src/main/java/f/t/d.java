/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.e.a
 *  f.f
 *  f.l.g
 *  f.o.a.p
 *  f.o.b.i
 *  f.q.a
 *  f.s.b
 *  f.s.d
 *  f.t.b
 *  f.t.e
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package f.t;

import f.f;
import f.l.g;
import f.o.a.p;
import f.o.b.i;
import f.q.c;
import f.t.a;
import f.t.b;
import f.t.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class d
extends b {
    public static final boolean a(CharSequence charSequence, CharSequence charSequence2, boolean bl) {
        i.e((Object)charSequence, (String)"$this$contains");
        i.e((Object)charSequence2, (String)"other");
        int n2 = d.h(charSequence, (String)charSequence2, 0, bl, 2);
        boolean bl2 = n2 >= 0;
        return bl2;
    }

    public static final boolean b(String string, String string2, boolean bl) {
        if (string == null) {
            return string2 == null;
        }
        if (!bl) {
            return string.equals(string2);
        }
        return string.equalsIgnoreCase(string2);
    }

    public static final int c(CharSequence charSequence) {
        i.e((Object)charSequence, (String)"$this$lastIndex");
        return -1 + charSequence.length();
    }

    public static final int d(CharSequence charSequence, String string, int n2, boolean bl) {
        i.e((Object)charSequence, (String)"$this$indexOf");
        i.e((Object)string, (String)"string");
        if (!bl && charSequence instanceof String) {
            return ((String)charSequence).indexOf(string, n2);
        }
        return d.f(charSequence, string, n2, charSequence.length(), bl, false, 16);
    }

    public static final int e(CharSequence charSequence, CharSequence charSequence2, int n2, int n3, boolean bl, boolean bl2) {
        c c3;
        if (!bl2) {
            int n4;
            if (n2 < 0) {
                n2 = 0;
            }
            if (n3 > (n4 = charSequence.length())) {
                n3 = n4;
            }
            c3 = new c(n2, n3);
        } else {
            int n5 = d.c(charSequence);
            if (n2 > n5) {
                n2 = n5;
            }
            if (n3 < 0) {
                n3 = 0;
            }
            c3 = new f.q.a(n2, n3, -1);
        }
        if (charSequence instanceof String && charSequence2 instanceof String) {
            int n6 = c3.e;
            int n7 = c3.f;
            int n8 = c3.g;
            if (n8 >= 0 ? n6 <= n7 : n6 >= n7) {
                do {
                    String string;
                    int n10;
                    String string2;
                    if (d.k(string = (String)charSequence2, 0, string2 = (String)charSequence, n6, n10 = charSequence2.length(), bl)) {
                        return n6;
                    }
                    if (n6 != n7) {
                        n6 += n8;
                        continue;
                    }
                    break;
                } while (true);
            }
        } else {
            int n11 = c3.e;
            int n12 = c3.f;
            int n13 = c3.g;
            if (n13 >= 0 ? n11 <= n12 : n11 >= n12) {
                do {
                    int n14;
                    if (d.l(charSequence2, 0, charSequence, n11, n14 = charSequence2.length(), bl)) {
                        return n11;
                    }
                    if (n11 == n12) break;
                    n11 += n13;
                } while (true);
            }
        }
        return -1;
    }

    public static /* synthetic */ int f(CharSequence charSequence, CharSequence charSequence2, int n2, int n3, boolean bl, boolean bl2, int n4) {
        boolean bl3 = (n4 & 16) == 0 && bl2;
        return d.e(charSequence, charSequence2, n2, n3, bl, bl3);
    }

    public static int g(CharSequence charSequence, char c3, int n2, boolean bl, int n3) {
        int n4;
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        i.e((Object)charSequence, (String)"$this$indexOf");
        if (!bl) {
            return ((String)charSequence).indexOf(c3, n2);
        }
        char[] arrc = new char[]{c3};
        i.e((Object)charSequence, (String)"$this$indexOfAny");
        i.e((Object)arrc, (String)"chars");
        if (!bl) {
            char c4 = f.l.b.d(arrc);
            return ((String)charSequence).indexOf(c4, n2);
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 <= (n4 = d.c(charSequence))) {
            do {
                boolean bl2;
                block9 : {
                    char c6 = charSequence.charAt(n2);
                    for (int i2 = 0; i2 < 1; ++i2) {
                        if (!d.c.a.e.a.t((char)arrc[i2], (char)c6, (boolean)bl)) continue;
                        bl2 = true;
                        break block9;
                    }
                    bl2 = false;
                }
                if (bl2) {
                    return n2;
                }
                if (n2 == n4) break;
                ++n2;
            } while (true);
        }
        return -1;
    }

    public static /* synthetic */ int h(CharSequence charSequence, String string, int n2, boolean bl, int n3) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return d.d(charSequence, string, n2, bl);
    }

    public static final boolean i(CharSequence charSequence) {
        i.e((Object)charSequence, (String)"$this$isBlank");
        int n2 = charSequence.length();
        boolean bl = true;
        if (n2 != 0) {
            boolean bl2;
            i.e((Object)charSequence, (String)"$this$indices");
            c c3 = new c(0, -1 + charSequence.length());
            if (!(c3 instanceof Collection) || !((Collection)c3).isEmpty()) {
                Iterator iterator = c3.iterator();
                while (((f.q.b)iterator).f) {
                    if (d.c.a.e.a.U((char)charSequence.charAt(((g)iterator).a()))) continue;
                    bl2 = false;
                    break;
                }
            } else {
                bl2 = true;
            }
            if (bl2) {
                return bl;
            }
            bl = false;
        }
        return bl;
    }

    public static f.s.b j(CharSequence charSequence, String[] arrstring, int n2, boolean bl, int n3, int n4) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            bl = false;
        }
        if ((n4 & 8) != 0) {
            n3 = 0;
        }
        boolean bl2 = n3 >= 0;
        if (bl2) {
            return new a(charSequence, n2, n3, (p<? super CharSequence, ? super Integer, f<Integer, Integer>>)new e(d.c.a.e.a.c((Object[])arrstring), bl));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Limit must be non-negative, but was ");
        stringBuilder.append(n3);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static final boolean k(String string, int n2, String string2, int n3, int n4, boolean bl) {
        i.e((Object)string, (String)"$this$regionMatches");
        i.e((Object)string2, (String)"other");
        if (!bl) {
            return string.regionMatches(n2, string2, n3, n4);
        }
        return string.regionMatches(bl, n2, string2, n3, n4);
    }

    public static final boolean l(CharSequence charSequence, int n2, CharSequence charSequence2, int n3, int n4, boolean bl) {
        i.e((Object)charSequence, (String)"$this$regionMatchesImpl");
        i.e((Object)charSequence2, (String)"other");
        if (n3 >= 0 && n2 >= 0 && n2 <= charSequence.length() - n4) {
            if (n3 > charSequence2.length() - n4) {
                return false;
            }
            for (int i2 = 0; i2 < n4; ++i2) {
                if (d.c.a.e.a.t((char)charSequence.charAt(n2 + i2), (char)charSequence2.charAt(n3 + i2), (boolean)bl)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static String m(String string, String string2, String string3, boolean bl, int n2) {
        OutOfMemoryError outOfMemoryError;
        int n3;
        int n4 = n2 & 4;
        int n5 = 0;
        if (n4 != 0) {
            bl = false;
        }
        i.e((Object)string, (String)"$this$replace");
        i.e((Object)string2, (String)"oldValue");
        i.e((Object)string3, (String)"newValue");
        int n6 = d.d(string, string2, 0, bl);
        if (n6 < 0) {
            return string;
        }
        int n7 = string2.length();
        if (n7 >= (n3 = 1)) {
            n3 = n7;
        }
        int n8 = string.length() - n7 + string3.length();
        if (n8 >= 0) {
            StringBuilder stringBuilder = new StringBuilder(n8);
            do {
                stringBuilder.append(string, n5, n6);
                stringBuilder.append(string3);
                n5 = n6 + n7;
            } while (n6 < string.length() && (n6 = d.d(string, string2, n6 + n3, bl)) > 0);
            stringBuilder.append(string, n5, string.length());
            String string4 = stringBuilder.toString();
            i.d((Object)string4, (String)"stringBuilder.append(this, i, length).toString()");
            return string4;
        }
        outOfMemoryError = new OutOfMemoryError();
        throw outOfMemoryError;
    }

    public static List n(CharSequence charSequence, String[] arrstring, boolean bl, int n2, int n3) {
        String string;
        boolean bl2;
        int n4 = n3 & 2;
        int n5 = 0;
        boolean bl3 = n4 == 0 && bl;
        int n6 = (n3 & 4) != 0 ? 0 : n2;
        i.e((Object)charSequence, (String)"$this$split");
        i.e((Object)arrstring, (String)"delimiters");
        int n7 = arrstring.length;
        int n8 = 10;
        int n10 = 1;
        if (n7 == n10 && !(bl2 = (string = arrstring[0]).length() == 0)) {
            boolean bl4 = n6 >= 0;
            if (bl4) {
                int n11 = d.d(charSequence, string, 0, bl3);
                if (n11 != -1 && n6 != n10) {
                    if (n6 <= 0) {
                        n10 = 0;
                    }
                    if (n10 != 0 && n6 <= n8) {
                        n8 = n6;
                    }
                    ArrayList arrayList = new ArrayList(n8);
                    do {
                        arrayList.add(charSequence.subSequence(n5, n11).toString());
                        n5 = n11 + string.length();
                    } while ((n10 == 0 || arrayList.size() != n6 - 1) && (n11 = d.d(charSequence, string, n5, bl3)) != -1);
                    arrayList.add(charSequence.subSequence(n5, charSequence.length()).toString());
                    return arrayList;
                }
                return d.c.a.e.a.Z((Object)charSequence.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Limit must be non-negative, but was ");
            stringBuilder.append(n6);
            stringBuilder.append('.');
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        f.s.b b3 = d.j(charSequence, arrstring, 0, bl3, n6, 2);
        i.e((Object)b3, (String)"$this$asIterable");
        f.s.d d3 = new f.s.d(b3);
        ArrayList arrayList = new ArrayList(d.c.a.e.a.j((Iterable)d3, (int)n8));
        Iterator iterator = d3.iterator();
        while (iterator.hasNext()) {
            arrayList.add(d.q(charSequence, (c)iterator.next()));
        }
        return arrayList;
    }

    public static final boolean o(String string, String string2, boolean bl) {
        i.e((Object)string, (String)"$this$startsWith");
        i.e((Object)string2, (String)"prefix");
        if (!bl) {
            return string.startsWith(string2);
        }
        return d.k(string, 0, string2, 0, string2.length(), bl);
    }

    public static /* synthetic */ boolean p(String string, String string2, boolean bl, int n2) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return d.o(string, string2, bl);
    }

    public static final String q(CharSequence charSequence, c c3) {
        i.e((Object)charSequence, (String)"$this$substring");
        i.e((Object)c3, (String)"range");
        return charSequence.subSequence(Integer.valueOf((int)c3.e).intValue(), 1 + Integer.valueOf((int)c3.f)).toString();
    }

    public static String r(String string, String string2, String string3, int n2) {
        String string4 = (n2 & 2) != 0 ? string : null;
        i.e((Object)string, (String)"$this$substringAfter");
        i.e((Object)string2, (String)"delimiter");
        i.e((Object)string4, (String)"missingDelimiterValue");
        int n3 = d.h(string, string2, 0, false, 6);
        if (n3 == -1) {
            return string4;
        }
        String string5 = string.substring(n3 + string2.length());
        i.d((Object)string5, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return string5;
    }

    public static String s(String string, char c3, String string2, int n2) {
        String string3 = (n2 & 2) != 0 ? string : null;
        i.e((Object)string, (String)"$this$substringAfterLast");
        i.e((Object)string3, (String)"missingDelimiterValue");
        int n3 = d.c(string);
        i.e((Object)string, (String)"$this$lastIndexOf");
        int n4 = string.lastIndexOf(c3, n3);
        if (n4 == -1) {
            return string3;
        }
        String string4 = string.substring(n4 + 1);
        i.d((Object)string4, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return string4;
    }
}

