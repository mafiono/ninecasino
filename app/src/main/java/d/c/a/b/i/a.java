/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.b.g0.a
 *  d.c.a.b.b
 *  d.c.a.b.j.d
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Set
 *  java.util.regex.Pattern
 */
package d.c.a.b.i;

import d.c.a.b.b;
import d.c.a.b.j.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class a
implements d {
    public static final String c;
    public static final String d;
    public static final String e;
    public static final Set<b> f;
    public static final a g;
    public final String a;
    public final String b;

    public static {
        String string;
        String string2;
        c = d.b.g0.a.j((String)"hts/frbslgiggolai.o/0clgbthfra=snpoo", (String)"tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        d = string2 = d.b.g0.a.j((String)"hts/frbslgigp.ogepscmv/ieo/eaybtho", (String)"tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        e = string = d.b.g0.a.j((String)"AzSCki82AwsLzKd5O8zo", (String)"IayckHiZRO1EFl1aGoK");
        Object[] arrobject = new b[]{new b("proto"), new b("json")};
        f = Collections.unmodifiableSet(new HashSet(Arrays.asList(arrobject)));
        g = new a(string2, string);
    }

    public a(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public static a a(byte[] arrby) {
        String string = new String(arrby, Charset.forName("UTF-8"));
        if (string.startsWith("1$")) {
            String[] arrstring = string.substring(2).split(Pattern.quote("\\"), 2);
            if (arrstring.length == 2) {
                String string2 = arrstring[0];
                if (!string2.isEmpty()) {
                    String string3 = arrstring[1];
                    if (string3.isEmpty()) {
                        string3 = null;
                    }
                    return new a(string2, string3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public byte[] b() {
        String string = this.b;
        if (string == null && this.a == null) {
            return null;
        }
        Object[] arrobject = new Object[4];
        arrobject[0] = "1$";
        arrobject[1] = this.a;
        arrobject[2] = "\\";
        if (string == null) {
            string = "";
        }
        arrobject[3] = string;
        return String.format("%s%s%s%s", arrobject).getBytes(Charset.forName("UTF-8"));
    }
}

