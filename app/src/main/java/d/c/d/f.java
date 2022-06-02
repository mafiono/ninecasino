/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 */
package d.c.d;

public abstract class f
extends Exception {
    public static final boolean e;
    public static final StackTraceElement[] f;

    public static {
        boolean bl = System.getProperty("surefire.test.class.path") != null;
        e = bl;
        f = new StackTraceElement[0];
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Throwable fillInStackTrace() {
        f f2 = this;
        // MONITORENTER : f2
        // MONITOREXIT : f2
        return null;
    }
}

