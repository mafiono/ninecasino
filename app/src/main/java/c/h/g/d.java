/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.e.h
 *  c.h.g.e
 *  c.h.g.e$d
 *  c.h.g.f
 *  c.h.g.f$c
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package c.h.g;

import c.e.h;
import c.h.g.e;
import c.h.g.f;
import java.util.ArrayList;

public class d
implements f.c<e.d> {
    public final /* synthetic */ String a;

    public d(String string) {
        this.a = string;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void b(e.d d2) {
        Object object;
        Object object2 = object = e.c;
        // MONITORENTER : object2
        h h2 = e.d;
        ArrayList arrayList = (ArrayList)h2.get((Object)this.a);
        if (arrayList == null) {
            // MONITOREXIT : object2
            return;
        }
        h2.remove((Object)this.a);
        // MONITOREXIT : object2
        int n2 = 0;
        while (n2 < arrayList.size()) {
            ((f.c)arrayList.get(n2)).a((Object)d2);
            ++n2;
        }
        return;
        {
            catch (Throwable throwable) {}
            {
                // MONITOREXIT : object2
                throw throwable;
            }
        }
    }
}

