/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.String
 *  java.util.Locale
 */
package d.c.b.w;

import java.util.Locale;

public final class v
extends Exception {
    public v(String string) {
        super(string);
        if (string == null) {
            return;
        }
        string.toLowerCase(Locale.US).hashCode();
    }
}

