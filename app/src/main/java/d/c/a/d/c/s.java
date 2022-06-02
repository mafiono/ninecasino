/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 *  d.c.a.d.j.f0
 *  d.c.a.d.j.i
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.a.d.c;

import android.os.Bundle;
import android.util.Log;
import d.c.a.d.c.r;
import d.c.a.d.j.f0;
import d.c.a.d.j.i;

public abstract class s<T> {
    public final int a;
    public final i<T> b = new i();
    public final int c;
    public final Bundle d;

    public s(int n2, int n3, Bundle bundle) {
        this.a = n2;
        this.c = n3;
        this.d = bundle;
    }

    public abstract void a(Bundle var1);

    public final void b(r r2) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String string = String.valueOf(this);
            String string2 = String.valueOf(r2);
            StringBuilder stringBuilder = new StringBuilder(14 + string.length() + string2.length());
            stringBuilder.append("Failing ");
            stringBuilder.append(string);
            stringBuilder.append(" with ");
            stringBuilder.append(string2);
            Log.d("MessengerIpcClient", stringBuilder.toString());
        }
        this.b.a.q((Exception)r2);
    }

    public final void c(T t2) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String string = String.valueOf(this);
            String string2 = String.valueOf(t2);
            StringBuilder stringBuilder = new StringBuilder(16 + string.length() + string2.length());
            stringBuilder.append("Finishing ");
            stringBuilder.append(string);
            stringBuilder.append(" with ");
            stringBuilder.append(string2);
            Log.d("MessengerIpcClient", stringBuilder.toString());
        }
        this.b.a.r(t2);
    }

    public abstract boolean d();

    public String toString() {
        int n2 = this.c;
        int n3 = this.a;
        boolean bl = this.d();
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Request { what=");
        stringBuilder.append(n2);
        stringBuilder.append(" id=");
        stringBuilder.append(n3);
        stringBuilder.append(" oneWay=");
        stringBuilder.append(bl);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

