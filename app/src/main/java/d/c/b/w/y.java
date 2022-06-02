/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  d.a.b.a.a
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package d.c.b.w;

import android.util.Log;
import d.a.b.a.a;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class y {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public y(String string, String string2) {
        String string3;
        if (string2 != null && string2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{string}));
            string3 = string2.substring(8);
        } else {
            string3 = string2;
        }
        if (string3 != null && d.matcher(string3).matches()) {
            this.a = string3;
            this.b = string;
            this.c = a.i((int)a.b((String)string2, (int)a.b((String)string, (int)1)), (String)string, (String)"!", (String)string2);
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{string3, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }

    public final boolean equals(Object object) {
        if (!(object instanceof y)) {
            return false;
        }
        y y2 = (y)object;
        return this.a.equals(y2.a) && this.b.equals(y2.b);
    }

    public final int hashCode() {
        Object[] arrobject = new Object[]{this.b, this.a};
        return Arrays.hashCode(arrobject);
    }
}

