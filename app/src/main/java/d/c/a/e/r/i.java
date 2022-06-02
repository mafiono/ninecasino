/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 *  d.c.a.e.r.i$a
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 */
package d.c.a.e.r;

import android.text.TextPaint;
import d.c.a.e.r.i;
import d.c.a.e.t.d;
import java.lang.ref.WeakReference;

public class i {
    public final TextPaint a = new TextPaint(1);
    public final d b = new a(this);
    public float c;
    public boolean d = true;
    public WeakReference<b> e = new WeakReference(null);
    public d.c.a.e.t.b f;

    public i(b b2) {
        this.e = new WeakReference(b2);
    }

    public float a(String string) {
        if (!this.d) {
            return this.c;
        }
        float f2 = string == null ? 0.0f : this.a.measureText((CharSequence)string, 0, string.length());
        this.c = f2;
        this.d = false;
        return f2;
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] var1);
    }

}

