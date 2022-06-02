/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.b.g
 *  d.b.j
 *  d.b.s
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.b;

import d.a.b.a.a;
import d.b.g;
import d.b.j;
import d.b.s;

public class h
extends g {
    public final s e;

    public h(s s2, String string) {
        super(string);
        this.e = s2;
    }

    public final String toString() {
        s s2 = this.e;
        j j2 = s2 != null ? s2.c : null;
        StringBuilder stringBuilder = a.d((String)"{FacebookGraphResponseException: ");
        String string = this.getMessage();
        if (string != null) {
            stringBuilder.append(string);
            stringBuilder.append(" ");
        }
        if (j2 != null) {
            stringBuilder.append("httpResponseCode: ");
            stringBuilder.append(j2.f);
            stringBuilder.append(", facebookErrorCode: ");
            stringBuilder.append(j2.g);
            stringBuilder.append(", facebookErrorType: ");
            stringBuilder.append(j2.i);
            stringBuilder.append(", message: ");
            stringBuilder.append(j2.a());
            stringBuilder.append("}");
        }
        return stringBuilder.toString();
    }
}

