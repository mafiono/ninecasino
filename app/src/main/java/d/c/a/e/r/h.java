/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.StaticLayout$Builder
 *  android.text.TextDirectionHeuristic
 *  android.text.TextDirectionHeuristics
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  d.a.b.a.a
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.util.Objects
 */
package d.c.a.e.r;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.util.Objects;

public final class h {
    public static boolean j;
    public static Constructor<StaticLayout> k;
    public static Object l;
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int d;
    public Layout.Alignment e;
    public int f;
    public boolean g;
    public boolean h;
    public TextUtils.TruncateAt i;

    public h(CharSequence charSequence, TextPaint textPaint, int n2) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = n2;
        this.d = charSequence.length();
        this.e = Layout.Alignment.ALIGN_NORMAL;
        this.f = Integer.MAX_VALUE;
        this.g = true;
        this.i = null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public StaticLayout a() {
        int n2;
        if (this.a == null) {
            this.a = "";
        }
        int n3 = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        if (this.f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.b, (float)n3, this.i);
        }
        this.d = n2 = Math.min(charSequence.length(), this.d);
        int n4 = Build.VERSION.SDK_INT;
        if (n4 >= 23) {
            if (this.h) {
                this.e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder builder = StaticLayout.Builder.obtain(charSequence, 0, n2, this.b, n3);
            builder.setAlignment(this.e);
            builder.setIncludePad(this.g);
            TextDirectionHeuristic textDirectionHeuristic = this.h ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            builder.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.i;
            if (truncateAt != null) {
                builder.setEllipsize(truncateAt);
            }
            builder.setMaxLines(this.f);
            return builder.build();
        }
        if (!j) {
            Constructor constructor;
            boolean bl = this.h && n4 >= 23;
            TextDirectionHeuristic textDirectionHeuristic = bl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            l = textDirectionHeuristic;
            Class class_ = Integer.TYPE;
            Class class_2 = Float.TYPE;
            Class[] arrclass = new Class[]{CharSequence.class, class_, class_, TextPaint.class, class_, Layout.Alignment.class, TextDirectionHeuristic.class, class_2, class_2, Boolean.TYPE, TextUtils.TruncateAt.class, class_, class_};
            k = constructor = StaticLayout.class.getDeclaredConstructor(arrclass);
            constructor.setAccessible(true);
            j = true;
        }
        try {
            Constructor<StaticLayout> constructor = k;
            Objects.requireNonNull(constructor);
            Object[] arrobject = new Object[13];
            arrobject[0] = charSequence;
            arrobject[1] = 0;
            arrobject[2] = this.d;
            arrobject[3] = this.b;
            arrobject[4] = n3;
            arrobject[5] = this.e;
            Object object = l;
            Objects.requireNonNull(object);
            arrobject[6] = object;
            arrobject[7] = Float.valueOf(1.0f);
            arrobject[8] = Float.valueOf(0.0f);
            arrobject[9] = this.g;
            arrobject[10] = null;
            arrobject[11] = n3;
            arrobject[12] = this.f;
            return constructor.newInstance(arrobject);
        }
        catch (Exception exception) {
            throw new a(exception);
        }
        catch (Exception exception) {
            throw new a(exception);
        }
    }

    public static class a
    extends Exception {
        public a(Throwable throwable) {
            StringBuilder stringBuilder = d.a.b.a.a.d((String)"Error thrown initializing StaticLayout ");
            stringBuilder.append(throwable.getMessage());
            super(stringBuilder.toString(), throwable);
        }
    }

}

