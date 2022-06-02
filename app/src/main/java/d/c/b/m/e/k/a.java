/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.Map
 *  java.util.Objects
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package d.c.b.m.e.k;

import d.c.b.m.e.k.g;
import d.c.b.m.e.n.b;
import d.c.b.m.e.n.c;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class a {
    public static final Pattern e = Pattern.compile("http(s?)://[^\\/]+", 2);
    public final String a;
    public final c b;
    public final d.c.b.m.e.n.a c;
    public final String d;

    public a(String string, String string2, c c2, d.c.b.m.e.n.a a2) {
        if (string2 != null) {
            if (c2 != null) {
                this.d = string;
                if (!g.r(string)) {
                    string2 = e.matcher(string2).replaceFirst(string);
                }
                this.a = string2;
                this.b = c2;
                this.c = a2;
                return;
            }
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public b b() {
        return this.c(Collections.emptyMap());
    }

    public b c(Map<String, String> map) {
        c c2 = this.b;
        d.c.b.m.e.n.a a2 = this.c;
        String string = this.a;
        Objects.requireNonNull((Object)c2);
        b b2 = new b(a2, string, map);
        b2.d.put((Object)"User-Agent", (Object)"Crashlytics Android SDK/17.3.0");
        b2.d.put((Object)"X-CRASHLYTICS-DEVELOPER-TOKEN", (Object)"470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return b2;
    }
}

