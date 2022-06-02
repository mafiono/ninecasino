/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.b.g
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.b;

import d.a.b.a.a;
import d.b.g;

public class f
extends g {
    public static final long serialVersionUID = 1L;
    public int e;
    public String f;

    public f(String string, int n2, String string2) {
        super(string);
        this.e = n2;
        this.f = string2;
    }

    public final String toString() {
        StringBuilder stringBuilder = a.e((String)"{FacebookDialogException: ", (String)"errorCode: ");
        stringBuilder.append(this.e);
        stringBuilder.append(", message: ");
        stringBuilder.append(this.getMessage());
        stringBuilder.append(", url: ");
        return a.o((StringBuilder)stringBuilder, (String)this.f, (String)"}");
    }
}

