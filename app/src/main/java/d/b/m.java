/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.b.g
 *  d.b.j
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.b;

import d.a.b.a.a;
import d.b.g;
import d.b.j;

public class m
extends g {
    private static final long serialVersionUID = 1L;
    public final j e;

    public m(j j2, String string) {
        super(string);
        this.e = j2;
    }

    public final String toString() {
        StringBuilder stringBuilder = a.e((String)"{FacebookServiceException: ", (String)"httpResponseCode: ");
        stringBuilder.append(this.e.f);
        stringBuilder.append(", facebookErrorCode: ");
        stringBuilder.append(this.e.g);
        stringBuilder.append(", facebookErrorType: ");
        stringBuilder.append(this.e.i);
        stringBuilder.append(", message: ");
        stringBuilder.append(this.e.a());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

