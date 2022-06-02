/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.String
 */
package d.c.a.d.c;

import android.os.Bundle;
import d.c.a.d.c.s;

public final class u
extends s<Bundle> {
    public u(int n2, Bundle bundle) {
        super(n2, 1, bundle);
    }

    @Override
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        this.c(bundle2);
    }

    @Override
    public final boolean d() {
        return false;
    }
}

