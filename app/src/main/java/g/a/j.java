/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.m.d
 *  g.a.r
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 */
package g.a;

import f.m.d;
import g.a.r;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class j
extends r {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    private final /* synthetic */ int _resumed;

    public static {
        c = AtomicIntegerFieldUpdater.newUpdater(j.class, "_resumed");
    }

    public j(d<?> d3, Throwable throwable, boolean bl) {
        if (throwable == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Continuation ");
            stringBuilder.append(d3);
            stringBuilder.append(" was cancelled normally");
            throwable = new CancellationException(stringBuilder.toString());
        }
        super(throwable, bl);
        this._resumed = 0;
    }
}

