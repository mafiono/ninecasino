/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.d.m.m
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package d.c.b;

import d.c.a.d.d.m.m;

public class h
extends Exception {
    @Deprecated
    public h() {
    }

    public h(String string) {
        m.f((String)string, (Object)"Detail message must not be empty");
        super(string);
    }

    public h(String string, Throwable throwable) {
        m.f((String)string, (Object)"Detail message must not be empty");
        super(string, throwable);
    }
}

