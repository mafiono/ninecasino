/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.String
 *  java.lang.Void
 */
package d.c.a.d.c;

import android.os.Bundle;
import d.c.a.d.c.r;
import d.c.a.d.c.s;

public final class p
extends s<Void> {
    public p(int n2, Bundle bundle) {
        super(n2, 2, bundle);
    }

    @Override
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            this.c(null);
            return;
        }
        this.b(new r(4, "Invalid response to one way request"));
    }

    @Override
    public final boolean d() {
        return true;
    }
}

