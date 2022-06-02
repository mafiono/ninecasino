/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.UiModeManager
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.IntentFilter
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.location.Location
 *  android.location.LocationManager
 *  android.media.AudioManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.PowerManager
 *  android.util.AndroidRuntimeException
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.KeyCharacterMap
 *  android.view.KeyEvent
 *  android.view.KeyboardShortcutGroup
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory
 *  android.view.LayoutInflater$Factory2
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.view.Window$Callback
 *  android.view.WindowInsets
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow
 *  android.widget.TextView
 *  androidx.appcompat.view.menu.ExpandedMenuView
 *  androidx.appcompat.widget.ActionBarContextView
 *  androidx.appcompat.widget.ContentFrameLayout
 *  c.b.a
 *  c.b.b
 *  c.b.c.a
 *  c.b.c.h
 *  c.b.c.i
 *  c.b.c.j
 *  c.b.c.k$a
 *  c.b.c.k$b
 *  c.b.c.k$d$a
 *  c.b.c.k$g
 *  c.b.c.k$j
 *  c.b.c.r
 *  c.b.c.s
 *  c.b.c.t
 *  c.b.c.t$a
 *  c.b.d.a.a
 *  c.b.g.a
 *  c.b.g.a$a
 *  c.b.g.c
 *  c.b.g.f
 *  c.b.g.g
 *  c.b.g.h
 *  c.b.g.i.e$a
 *  c.b.g.i.g$a
 *  c.b.g.i.m
 *  c.b.g.i.m$a
 *  c.b.h.b0
 *  c.b.h.c0
 *  c.b.h.c1
 *  c.b.h.j
 *  c.b.h.m0
 *  c.b.h.w0
 *  c.e.e
 *  c.e.h
 *  c.h.b.b
 *  c.h.b.e
 *  c.h.b.g
 *  c.h.c.a
 *  c.h.j.d
 *  c.h.j.d$a
 *  c.h.j.n
 *  c.h.j.s
 *  c.h.j.t
 *  c.h.j.w
 *  c.n.f
 *  c.n.f$b
 *  c.n.k
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.lang.reflect.Field
 *  java.util.Calendar
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  java.util.WeakHashMap
 */
package c.b.c;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import c.b.c.k;
import c.b.c.q;
import c.b.c.r;
import c.b.c.s;
import c.b.c.t;
import c.b.c.u;
import c.b.g.a;
import c.b.g.i.e;
import c.b.g.i.g;
import c.b.g.i.m;
import c.b.h.b0;
import c.b.h.c0;
import c.b.h.c1;
import c.b.h.m0;
import c.b.h.w0;
import c.h.j.d;
import c.h.j.n;
import c.h.j.w;
import c.n.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/*
 * Exception performing whole class analysis.
 */
public class k
extends c.b.c.j
implements g.a,
LayoutInflater.Factory2 {
    public static final c.e.h<String, Integer> c0;
    public static final boolean d0;
    public static final int[] e0;
    public static final boolean f0;
    public static final boolean g0;
    public static boolean h0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public j[] I;
    public j J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public g T;
    public g U;
    public boolean V;
    public int W;
    public final Runnable X;
    public boolean Y;
    public Rect Z;
    public Rect a0;
    public r b0;
    public final Object g;
    public final Context h;
    public Window i;
    public e j;
    public final c.b.c.i k;
    public c.b.c.a l;
    public MenuInflater m;
    public CharSequence n;
    public b0 o;
    public c p;
    public k q;
    public c.b.g.a r;
    public ActionBarContextView s;
    public PopupWindow t;
    public Runnable u;
    public c.h.j.s v;
    public boolean w;
    public ViewGroup x;
    public TextView y;
    public View z;

    public static {
        c0 = new c.e.h();
        boolean bl = Build.VERSION.SDK_INT < 21;
        d0 = bl;
        e0 = new int[]{16842836};
        f0 = true ^ "robolectric".equals(Build.FINGERPRINT);
        g0 = true;
        if (bl && !h0) {
            Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new a(Thread.getDefaultUncaughtExceptionHandler()));
            h0 = true;
        }
    }

    public k(Context context, Window window, c.b.c.i i2, Object object) {
        Integer n2;
        c.e.h<String, Integer> h2;
        this.v = null;
        this.P = -100;
        this.X = new b(this);
        this.h = context;
        this.k = i2;
        this.g = object;
        if (object instanceof Dialog) {
            c.b.c.h h3;
            block6 : {
                while (context != null) {
                    if (context instanceof c.b.c.h) {
                        h3 = (c.b.c.h)context;
                        break block6;
                    }
                    if (!(context instanceof ContextWrapper)) break;
                    context = ((ContextWrapper)context).getBaseContext();
                }
                h3 = null;
            }
            if (h3 != null) {
                this.P = h3.r().f();
            }
        }
        if (this.P == -100 && (n2 = (Integer)(h2 = c0).getOrDefault((Object)this.g.getClass().getName(), null)) != null) {
            this.P = n2;
            h2.remove((Object)this.g.getClass().getName());
        }
        if (window != null) {
            this.B(window);
        }
        c.b.h.j.e();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean A(boolean var1_1) {
        block63 : {
            block62 : {
                block65 : {
                    block64 : {
                        block61 : {
                            block57 : {
                                block60 : {
                                    block58 : {
                                        block59 : {
                                            if (this.O) {
                                                return false;
                                            }
                                            var2_2 = this.P;
                                            if (var2_2 == -100) {
                                                var2_2 = -100;
                                            }
                                            var3_3 = this.R(this.h, var2_2);
                                            var4_4 = Build.VERSION.SDK_INT;
                                            var5_5 = this.h;
                                            var6_6 = null;
                                            var7_7 = this.F(var5_5, var3_3, null);
                                            var8_8 = this.S;
                                            var9_9 = true;
                                            if (var8_8 || !(this.g instanceof Activity)) ** GOTO lbl27
                                            var57_10 = this.h.getPackageManager();
                                            if (var57_10 == null) {
                                                var10_11 = false;
                                            } else {
                                                var58_12 = var4_4 >= 29 ? 269221888 : (var4_4 >= 24 ? 786432 : 0);
                                                try {
                                                    var61_13 = var57_10.getActivityInfo(new ComponentName(this.h, this.g.getClass()), var58_12);
                                                    var62_14 = var61_13 != null && (512 & var61_13.configChanges) != 0;
                                                    this.R = var62_14;
                                                }
                                                catch (PackageManager.NameNotFoundException var59_15) {
                                                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", var59_15);
                                                    this.R = false;
                                                }
lbl27: // 3 sources:
                                                this.S = var9_9;
                                                var10_11 = this.R;
                                            }
                                            var11_16 = 48 & this.h.getResources().getConfiguration().uiMode;
                                            var12_17 = 48 & var7_7.uiMode;
                                            if (var11_16 == var12_17 || !var1_1 || var10_11 || !this.L || !k.f0 && !this.M || !((var53_18 = this.g) instanceof Activity) || ((Activity)var53_18).isChild()) break block57;
                                            var54_19 = (Activity)this.g;
                                            if (var4_4 >= 28) break block58;
                                            if (var4_4 > 23) break block59;
                                            new Handler(var54_19.getMainLooper()).post((Runnable)new c.h.b.b(var54_19));
                                            break block60;
                                        }
                                        if (c.h.b.e.b((Activity)var54_19)) break block60;
                                    }
                                    var54_19.recreate();
                                }
                                var13_20 = true;
                                break block61;
                            }
                            var13_20 = false;
                        }
                        if (var13_20 || var11_16 == var12_17) break block62;
                        var18_21 = this.h.getResources();
                        var19_22 = new Configuration(var18_21.getConfiguration());
                        var19_22.uiMode = var12_17 | -49 & var18_21.getConfiguration().uiMode;
                        var18_21.updateConfiguration(var19_22, null);
                        if (var4_4 < 26 && var4_4 < 28) {
                            if (var4_4 >= 24) {
                                if (!c.b.a.h) {
                                    try {
                                        c.b.a.g = var52_23 = Resources.class.getDeclaredField("mResourcesImpl");
                                        var52_23.setAccessible(var9_9);
                                    }
                                    catch (NoSuchFieldException var50_24) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", var50_24);
                                    }
                                    c.b.a.h = var9_9;
                                }
                                if ((var39_25 = c.b.a.g) != null) {
                                    try {
                                        var42_26 = var39_25.get((Object)var18_21);
                                    }
                                    catch (IllegalAccessException var40_27) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", var40_27);
                                        var42_26 = null;
                                    }
                                    if (var42_26 != null) {
                                        if (!c.b.a.b) {
                                            try {
                                                c.b.a.a = var49_28 = var42_26.getClass().getDeclaredField("mDrawableCache");
                                                var49_28.setAccessible(var9_9);
                                            }
                                            catch (NoSuchFieldException var47_29) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", var47_29);
                                            }
                                            c.b.a.b = var9_9;
                                        }
                                        var43_30 = c.b.a.a;
                                        var44_31 = null;
                                        if (var43_30 != null) {
                                            try {
                                                var44_31 = var43_30.get(var42_26);
                                            }
                                            catch (IllegalAccessException var45_32) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", var45_32);
                                            }
                                        }
                                        if (var44_31 != null) {
                                            c.b.a.a(var44_31);
                                        }
                                    }
                                }
                            } else if (var4_4 >= 23) {
                                if (!c.b.a.b) {
                                    try {
                                        c.b.a.a = var38_33 = Resources.class.getDeclaredField("mDrawableCache");
                                        var38_33.setAccessible(var9_9);
                                    }
                                    catch (NoSuchFieldException var36_34) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", var36_34);
                                    }
                                    c.b.a.b = var9_9;
                                }
                                var32_35 = c.b.a.a;
                                var33_36 = null;
                                if (var32_35 != null) {
                                    try {
                                        var33_36 = var32_35.get((Object)var18_21);
                                    }
                                    catch (IllegalAccessException var34_37) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", var34_37);
                                    }
                                }
                                if (var33_36 != null) {
                                    c.b.a.a(var33_36);
                                }
                            } else if (var4_4 >= 21) {
                                if (!c.b.a.b) {
                                    try {
                                        c.b.a.a = var31_38 = Resources.class.getDeclaredField("mDrawableCache");
                                        var31_38.setAccessible(var9_9);
                                    }
                                    catch (NoSuchFieldException var29_39) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", var29_39);
                                    }
                                    c.b.a.b = var9_9;
                                }
                                if ((var25_40 = c.b.a.a) != null) {
                                    try {
                                        var6_6 = var28_41 = (Map)var25_40.get((Object)var18_21);
                                    }
                                    catch (IllegalAccessException var26_42) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", var26_42);
                                    }
                                    if (var6_6 != null) {
                                        var6_6.clear();
                                    }
                                }
                            }
                        }
                        if ((var20_43 = this.Q) != 0) {
                            this.h.setTheme(var20_43);
                            if (var4_4 >= 23) {
                                this.h.getTheme().applyStyle(this.Q, var9_9);
                            }
                        }
                        if (!var10_11 || !((var21_44 = this.g) instanceof Activity)) break block63;
                        var22_45 = (Activity)var21_44;
                        if (!(var22_45 instanceof c.n.k)) break block64;
                        var23_46 = ((c.n.m)((c.n.k)var22_45).a()).c.compareTo((Enum)f.b.h);
                        var24_47 = false;
                        if (var23_46 >= 0) {
                            var24_47 = true;
                        }
                        if (!var24_47) break block63;
                        break block65;
                    }
                    if (!this.N) break block63;
                }
                var22_45.onConfigurationChanged(var19_22);
                break block63;
            }
            var9_9 = var13_20;
        }
        if (var9_9 && (var17_48 = this.g) instanceof c.b.c.h) {
            ((c.b.c.h)var17_48).u();
        }
        if (var2_2 == 0) {
            this.M(this.h).e();
        } else {
            var14_49 = this.T;
            if (var14_49 != null) {
                var14_49.a();
            }
        }
        if (var2_2 != 3) {
            var15_51 = this.U;
            if (var15_51 == null) return var9_9;
            var15_51.a();
            return var9_9;
        }
        var16_50 = this.h;
        if (this.U == null) {
            this.U = new f(var16_50);
        }
        this.U.e();
        return var9_9;
    }

    public final void B(Window window) {
        if (this.i == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof e)) {
                e e2;
                this.j = e2 = new e(callback);
                window.setCallback((Window.Callback)e2);
                w0 w02 = w0.p((Context)this.h, null, (int[])e0);
                Drawable drawable = w02.h(0);
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                w02.b.recycle();
                this.i = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public void C(int n2, j j2, Menu object) {
        if (object == null && j2 != null) {
            object = j2.h;
        }
        if (j2 != null && !j2.m) {
            return;
        }
        if (!this.O) {
            this.j.e.onPanelClosed(n2, object);
        }
    }

    public void D(c.b.g.i.g g2) {
        if (this.H) {
            return;
        }
        this.H = true;
        this.o.l();
        Window.Callback callback = this.O();
        if (callback != null && !this.O) {
            callback.onPanelClosed(108, (Menu)g2);
        }
        this.H = false;
    }

    public void E(j j2, boolean bl) {
        ViewGroup viewGroup;
        b0 b02;
        if (bl && j2.a == 0 && (b02 = this.o) != null && b02.c()) {
            this.D(j2.h);
            return;
        }
        WindowManager windowManager = (WindowManager)this.h.getSystemService("window");
        if (windowManager != null && j2.m && (viewGroup = j2.e) != null) {
            windowManager.removeView(viewGroup);
            if (bl) {
                this.C(j2.a, j2, null);
            }
        }
        j2.k = false;
        j2.l = false;
        j2.m = false;
        j2.f = null;
        j2.o = true;
        if (this.J == j2) {
            this.J = null;
        }
    }

    public final Configuration F(Context context, int n2, Configuration configuration) {
        int n3 = n2 != 1 ? (n2 != 2 ? 48 & context.getApplicationContext().getResources().getConfiguration().uiMode : 32) : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = n3 | -49 & configuration2.uiMode;
        return configuration2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean G(KeyEvent var1_1) {
        block24 : {
            block19 : {
                block22 : {
                    block23 : {
                        block20 : {
                            block21 : {
                                var2_2 = this.g;
                                var3_3 = var2_2 instanceof d.a;
                                var4_4 = true;
                                if ((var3_3 || var2_2 instanceof q) && (var5_5 = this.i.getDecorView()) != null && c.h.j.d.a((View)var5_5, (KeyEvent)var1_1)) {
                                    return var4_4;
                                }
                                if (var1_1.getKeyCode() == 82 && this.j.e.dispatchKeyEvent(var1_1)) {
                                    return var4_4;
                                }
                                var6_6 = var1_1.getKeyCode();
                                var7_7 = var1_1.getAction() == 0;
                                if (var7_7) {
                                    if (var6_6 != 4) {
                                        if (var6_6 != 82) {
                                            return false;
                                        }
                                        if (var1_1.getRepeatCount() != 0) return var4_4;
                                        var23_8 = this.N(0);
                                        if (var23_8.m != false) return var4_4;
                                        this.U(var23_8, var1_1);
                                        return var4_4;
                                    }
                                    if ((128 & var1_1.getFlags()) == 0) {
                                        var4_4 = false;
                                    }
                                    this.K = var4_4;
                                    return false;
                                }
                                if (var6_6 == 4) break block19;
                                if (var6_6 != 82) {
                                    return false;
                                }
                                if (this.r != null) {
                                    return var4_4;
                                }
                                var16_9 = this.N(0);
                                var17_10 = this.o;
                                if (var17_10 == null || !var17_10.h() || ViewConfiguration.get(this.h).hasPermanentMenuKey()) break block20;
                                if (this.o.c()) break block21;
                                if (this.O || !this.U(var16_9, var1_1)) ** GOTO lbl-1000
                                var19_11 = this.o.f();
                                break block22;
                            }
                            var19_11 = this.o.e();
                            break block22;
                        }
                        var18_12 = var16_9.m;
                        if (var18_12 || var16_9.l) break block23;
                        if (!var16_9.k) ** GOTO lbl-1000
                        if (var16_9.p) {
                            var16_9.k = false;
                            var22_13 = this.U(var16_9, var1_1);
                        } else {
                            var22_13 = true;
                        }
                        if (var22_13) {
                            this.S(var16_9, var1_1);
                            var19_11 = true;
                        } else lbl-1000: // 3 sources:
                        {
                            var19_11 = false;
                        }
                        break block22;
                    }
                    this.E(var16_9, var4_4);
                    var19_11 = var18_12;
                }
                if (var19_11 == false) return var4_4;
                var20_14 = (AudioManager)this.h.getApplicationContext().getSystemService("audio");
                if (var20_14 != null) {
                    var20_14.playSoundEffect(0);
                    return var4_4;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return var4_4;
            }
            var8_15 = this.K;
            this.K = false;
            var9_16 = this.N(0);
            if (var9_16.m) {
                if (var8_15 != false) return var4_4;
                this.E(var9_16, var4_4);
                return var4_4;
            }
            var10_17 = this.r;
            if (var10_17 == null) break block24;
            var10_17.c();
            ** GOTO lbl-1000
        }
        this.P();
        var11_18 = this.l;
        if (var11_18 != null) {
            var13_19 = (u)var11_18;
            var14_20 = var13_19.e;
            if (var14_20 != null && var14_20.s()) {
                var13_19.e.collapseActionView();
                var15_21 = true;
            } else {
                var15_21 = false;
            }
            ** if (!var15_21) goto lbl-1000
        }
        ** GOTO lbl-1000
lbl-1000: // 2 sources:
        {
            var12_22 = true;
            ** GOTO lbl92
        }
lbl-1000: // 2 sources:
        {
            var12_22 = false;
        }
lbl92: // 2 sources:
        if (var12_22 == false) return false;
        return var4_4;
    }

    public void H(int n2) {
        j j2 = this.N(n2);
        if (j2.h != null) {
            Bundle bundle = new Bundle();
            j2.h.w(bundle);
            if (bundle.size() > 0) {
                j2.q = bundle;
            }
            j2.h.z();
            j2.h.clear();
        }
        j2.p = true;
        j2.o = true;
        if ((n2 == 108 || n2 == 0) && this.o != null) {
            j j3 = this.N(0);
            j3.k = false;
            this.U(j3, null);
        }
    }

    public void I() {
        c.h.j.s s2 = this.v;
        if (s2 != null) {
            s2.b();
        }
    }

    /*
     * Exception decompiling
     */
    public final void J() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl243 : ALOAD : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    public final void K() {
        Object object;
        if (this.i == null && (object = this.g) instanceof Activity) {
            this.B(((Activity)object).getWindow());
        }
        if (this.i != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public j L(Menu menu) {
        int n2;
        j[] arrj = this.I;
        int n3 = 0;
        if (arrj != null) {
            n2 = arrj.length;
            n3 = 0;
        } else {
            n2 = 0;
        }
        while (n3 < n2) {
            j j2 = arrj[n3];
            if (j2 != null && j2.h == menu) {
                return j2;
            }
            ++n3;
        }
        return null;
    }

    public final g M(Context context) {
        if (this.T == null) {
            if (t.d == null) {
                Context context2 = context.getApplicationContext();
                t.d = new t(context2, (LocationManager)context2.getSystemService("location"));
            }
            this.T = new h(t.d);
        }
        return this.T;
    }

    public j N(int n2) {
        j j2;
        j[] arrj = this.I;
        if (arrj == null || arrj.length <= n2) {
            j[] arrj2 = new j[n2 + 1];
            if (arrj != null) {
                System.arraycopy(arrj, 0, arrj2, 0, arrj.length);
            }
            this.I = arrj2;
            arrj = arrj2;
        }
        if ((j2 = arrj[n2]) == null) {
            arrj[n2] = j2 = new /* Unavailable Anonymous Inner Class!! */;
        }
        return j2;
    }

    public final Window.Callback O() {
        return this.i.getCallback();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void P() {
        block5 : {
            c.b.c.a a2;
            block8 : {
                u u2;
                block7 : {
                    Object object;
                    block6 : {
                        this.J();
                        if (!this.C) break block5;
                        if (this.l != null) {
                            return;
                        }
                        object = this.g;
                        if (!(object instanceof Activity)) break block6;
                        u2 = new u((Activity)this.g, this.D);
                        break block7;
                    }
                    if (!(object instanceof Dialog)) break block8;
                    u2 = new u((Dialog)this.g);
                }
                this.l = u2;
            }
            if ((a2 = this.l) != null) {
                a2.c(this.Y);
            }
        }
    }

    public final void Q(int n2) {
        this.W |= 1 << n2;
        if (!this.V) {
            View view = this.i.getDecorView();
            Runnable runnable = this.X;
            view.postOnAnimation(runnable);
            this.V = true;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int R(Context context, int n2) {
        g g2;
        if (n2 == -100) return -1;
        if (n2 == -1) return n2;
        if (n2 != 0) {
            if (n2 == 1 || n2 == 2) return n2;
            if (n2 != 3) throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            if (this.U == null) {
                this.U = new f(context);
            }
            g2 = this.U;
            do {
                return g2.c();
                break;
            } while (true);
        }
        if (Build.VERSION.SDK_INT >= 23 && context.getApplicationContext().getSystemService(UiModeManager.class).getNightMode() == 0) {
            return -1;
        }
        g2 = this.M(context);
        return g2.c();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void S(j var1_1, KeyEvent var2_2) {
        block31 : {
            block29 : {
                block28 : {
                    block30 : {
                        block27 : {
                            if (var1_1.m != false) return;
                            if (this.O) {
                                return;
                            }
                            if (var1_1.a == 0) {
                                if ((15 & this.h.getResources().getConfiguration().screenLayout) == 4) {
                                    return;
                                }
                                var33_3 = false;
                                if (var33_3) {
                                    return;
                                }
                            }
                            if ((var3_4 = this.O()) != null && !var3_4.onMenuOpened(var1_1.a, (Menu)var1_1.h)) {
                                this.E(var1_1, true);
                                return;
                            }
                            var4_5 = (WindowManager)this.h.getSystemService("window");
                            if (var4_5 == null) {
                                return;
                            }
                            if (!this.U(var1_1, var2_2)) {
                                return;
                            }
                            var5_6 = var1_1.e;
                            if (var5_6 == null || var1_1.o) break block27;
                            var31_7 = var1_1.g;
                            if (var31_7 == null || (var32_8 = var31_7.getLayoutParams()) == null || var32_8.width != -1) break block28;
                            var18_9 = -1;
                            break block29;
                        }
                        if (var5_6 == null) {
                            this.P();
                            var21_10 = this.l;
                            var22_11 = var21_10 != null ? var21_10.b() : null;
                            if (var22_11 == null) {
                                var22_11 = this.h;
                            }
                            var23_12 = new TypedValue();
                            var24_13 = var22_11.getResources().newTheme();
                            var24_13.setTo(var22_11.getTheme());
                            var24_13.resolveAttribute(2130903042, var23_12, true);
                            var26_14 = var23_12.resourceId;
                            if (var26_14 != 0) {
                                var24_13.applyStyle(var26_14, true);
                            }
                            var24_13.resolveAttribute(2130903641, var23_12, true);
                            var28_15 = var23_12.resourceId;
                            if (var28_15 == 0) {
                                var28_15 = 2131689879;
                            }
                            var24_13.applyStyle(var28_15, true);
                            var29_16 = new c.b.g.c(var22_11, 0);
                            var29_16.getTheme().setTo(var24_13);
                            var1_1.j = var29_16;
                            var30_17 = var29_16.obtainStyledAttributes(c.b.b.j);
                            var1_1.b = var30_17.getResourceId(84, 0);
                            var1_1.d = var30_17.getResourceId(1, 0);
                            var30_17.recycle();
                            var1_1.e = new i(var1_1.j);
                            var1_1.c = 81;
                        } else if (var1_1.o && var5_6.getChildCount() > 0) {
                            var1_1.e.removeAllViews();
                        }
                        var6_18 = var1_1.g;
                        if (var6_18 == null) break block30;
                        var1_1.f = var6_18;
                        ** GOTO lbl-1000
                    }
                    if (var1_1.h != null) {
                        if (this.q == null) {
                            this.q = new k();
                        }
                        var7_19 = this.q;
                        if (var1_1.i == null) {
                            var1_1.i = var8_20 = new c.b.g.i.e(var1_1.j, 2131427348);
                            var8_20.i = var7_19;
                            var9_21 = var1_1.h;
                            var9_21.b(var8_20, var9_21.a);
                        }
                        var10_22 = var1_1.i;
                        var11_23 = var1_1.e;
                        if (var10_22.h == null) {
                            var10_22.h = (ExpandedMenuView)var10_22.f.inflate(2131427345, var11_23, false);
                            if (var10_22.j == null) {
                                var10_22.j = new /* Unavailable Anonymous Inner Class!! */;
                            }
                            var10_22.h.setAdapter((ListAdapter)var10_22.j);
                            var10_22.h.setOnItemClickListener((AdapterView.OnItemClickListener)var10_22);
                        }
                        var12_24 = var10_22.h;
                        var1_1.f = var12_24;
                        ** if (var12_24 == null) goto lbl-1000
                    }
                    ** GOTO lbl-1000
lbl-1000: // 2 sources:
                    {
                        var13_25 = true;
                        ** GOTO lbl84
                    }
lbl-1000: // 2 sources:
                    {
                        var13_25 = false;
                    }
lbl84: // 2 sources:
                    if (!var13_25 || !(var14_26 = var1_1.f != null && (var1_1.g != null || (var1_1.i.b()).getCount() > 0))) break block31;
                    var15_27 = var1_1.f.getLayoutParams();
                    if (var15_27 == null) {
                        var15_27 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    var16_28 = var1_1.b;
                    var1_1.e.setBackgroundResource(var16_28);
                    var17_29 = var1_1.f.getParent();
                    if (var17_29 instanceof ViewGroup) {
                        ((ViewGroup)var17_29).removeView(var1_1.f);
                    }
                    var1_1.e.addView(var1_1.f, var15_27);
                    if (!var1_1.f.hasFocus()) {
                        var1_1.f.requestFocus();
                    }
                }
                var18_9 = -2;
            }
            var1_1.l = false;
            var19_30 = new WindowManager.LayoutParams(var18_9, -2, 0, 0, 1002, 8519680, -3);
            var19_30.gravity = var1_1.c;
            var19_30.windowAnimations = var1_1.d;
            var4_5.addView((View)var1_1.e, (ViewGroup.LayoutParams)var19_30);
            var1_1.m = true;
            return;
        }
        var1_1.o = true;
    }

    public final boolean T(j j2, int n2, KeyEvent keyEvent, int n3) {
        boolean bl;
        block7 : {
            block6 : {
                if (keyEvent.isSystem()) {
                    return false;
                }
                if (j2.k) break block6;
                boolean bl2 = this.U(j2, keyEvent);
                bl = false;
                if (!bl2) break block7;
            }
            c.b.g.i.g g2 = j2.h;
            bl = false;
            if (g2 != null) {
                bl = g2.performShortcut(n2, keyEvent, n3);
            }
        }
        if (bl && (n3 & 1) == 0 && this.o == null) {
            this.E(j2, true);
        }
        return bl;
    }

    public final boolean U(j j2, KeyEvent keyEvent) {
        b0 b02;
        int n2;
        Window.Callback callback;
        if (this.O) {
            return false;
        }
        if (j2.k) {
            return true;
        }
        j j3 = this.J;
        if (j3 != null && j3 != j2) {
            this.E(j3, false);
        }
        if ((callback = this.O()) != null) {
            j2.g = callback.onCreatePanelView(j2.a);
        }
        boolean bl = (n2 = j2.a) == 0 || n2 == 108;
        if (bl && (b02 = this.o) != null) {
            b02.g();
        }
        if (j2.g == null) {
            c.b.g.i.g g2 = j2.h;
            if (g2 == null || j2.p) {
                b0 b03;
                if (g2 == null) {
                    Context context = this.h;
                    int n3 = j2.a;
                    if ((n3 == 0 || n3 == 108) && this.o != null) {
                        Resources.Theme theme;
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(2130903049, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(2130903050, typedValue, true);
                        } else {
                            theme2.resolveAttribute(2130903050, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            c.b.g.c c2 = new c.b.g.c(context, 0);
                            c2.getTheme().setTo(theme);
                            context = c2;
                        }
                    }
                    c.b.g.i.g g3 = new g(context);
                    g3.e = this;
                    j2.a(g3);
                    if (j2.h == null) {
                        return false;
                    }
                }
                if (bl && (b03 = this.o) != null) {
                    if (this.p == null) {
                        this.p = new c();
                    }
                    b03.a((Menu)j2.h, (m.a)this.p);
                }
                j2.h.z();
                if (!callback.onCreatePanelMenu(j2.a, (Menu)j2.h)) {
                    b0 b04;
                    j2.a(null);
                    if (bl && (b04 = this.o) != null) {
                        b04.a(null, (m.a)this.p);
                    }
                    return false;
                }
                j2.p = false;
            }
            j2.h.z();
            Bundle bundle = j2.q;
            if (bundle != null) {
                j2.h.v(bundle);
                j2.q = null;
            }
            if (!callback.onPreparePanel(0, j2.g, (Menu)j2.h)) {
                b0 b05;
                if (bl && (b05 = this.o) != null) {
                    b05.a(null, (m.a)this.p);
                }
                j2.h.y();
                return false;
            }
            int n4 = keyEvent != null ? keyEvent.getDeviceId() : -1;
            boolean bl2 = KeyCharacterMap.load(n4).getKeyboardType() != 1;
            j2.n = bl2;
            j2.h.setQwertyMode(bl2);
            j2.h.y();
        }
        j2.k = true;
        j2.l = false;
        this.J = j2;
        return true;
    }

    public final boolean V() {
        ViewGroup viewGroup;
        return this.w && (viewGroup = this.x) != null && viewGroup.isLaidOut();
    }

    public final void W() {
        if (!this.w) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final int X(w w2, Rect rect) {
        View view;
        boolean bl;
        int n2 = w2 != null ? w2.d() : (rect != null ? rect.top : 0);
        ActionBarContextView actionBarContextView = this.s;
        if (actionBarContextView != null && actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.s.getLayoutParams();
            boolean bl2 = this.s.isShown();
            boolean bl3 = true;
            if (bl2) {
                boolean bl4;
                if (this.Z == null) {
                    this.Z = new Rect();
                    this.a0 = new Rect();
                }
                Rect rect2 = this.Z;
                Rect rect3 = this.a0;
                if (w2 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(w2.b(), w2.d(), w2.c(), w2.a());
                }
                c1.a((View)this.x, (Rect)rect2, (Rect)rect3);
                int n3 = rect2.top;
                int n4 = rect2.left;
                int n5 = rect2.right;
                ViewGroup viewGroup = this.x;
                w w3 = Build.VERSION.SDK_INT >= 23 ? w.h((WindowInsets)viewGroup.getRootWindowInsets()) : null;
                int n6 = w3 == null ? 0 : w3.b();
                int n7 = w3 == null ? 0 : w3.c();
                if (marginLayoutParams.topMargin == n3 && marginLayoutParams.leftMargin == n4 && marginLayoutParams.rightMargin == n5) {
                    bl4 = false;
                } else {
                    marginLayoutParams.topMargin = n3;
                    marginLayoutParams.leftMargin = n4;
                    marginLayoutParams.rightMargin = n5;
                    bl4 = true;
                }
                if (n3 > 0 && this.z == null) {
                    View view2;
                    this.z = view2 = new View(this.h);
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = n6;
                    layoutParams.rightMargin = n7;
                    this.x.addView(this.z, -1, layoutParams);
                } else {
                    View view3 = this.z;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams)view3.getLayoutParams();
                        int n8 = marginLayoutParams2.height;
                        int n9 = marginLayoutParams.topMargin;
                        if (n8 != n9 || marginLayoutParams2.leftMargin != n6 || marginLayoutParams2.rightMargin != n7) {
                            marginLayoutParams2.height = n9;
                            marginLayoutParams2.leftMargin = n6;
                            marginLayoutParams2.rightMargin = n7;
                            this.z.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = this.z;
                bl = view4 != null;
                if (bl && view4.getVisibility() != 0) {
                    int n10;
                    Context context;
                    View view5 = this.z;
                    if ((8192 & view5.getWindowSystemUiVisibility()) == 0) {
                        bl3 = false;
                    }
                    if (bl3) {
                        context = this.h;
                        n10 = 2131034118;
                    } else {
                        context = this.h;
                        n10 = 2131034117;
                    }
                    view5.setBackgroundColor(c.h.c.a.b((Context)context, (int)n10));
                }
                if (!this.E && bl) {
                    n2 = 0;
                }
                bl3 = bl4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                bl = false;
            } else {
                bl = false;
                bl3 = false;
            }
            if (bl3) {
                this.s.setLayoutParams(marginLayoutParams);
            }
        } else {
            bl = false;
        }
        if ((view = this.z) != null) {
            int n11 = bl ? 0 : 8;
            view.setVisibility(n11);
        }
        return n2;
    }

    public boolean a(c.b.g.i.g g2, MenuItem menuItem) {
        j j2;
        Window.Callback callback = this.O();
        if (callback != null && !this.O && (j2 = this.L((Menu)g2.k())) != null) {
            return callback.onMenuItemSelected(j2.a, menuItem);
        }
        return false;
    }

    public void b(c.b.g.i.g g2) {
        b0 b02 = this.o;
        if (b02 != null && b02.h() && (!ViewConfiguration.get(this.h).hasPermanentMenuKey() || this.o.b())) {
            Window.Callback callback = this.O();
            if (this.o.c()) {
                this.o.e();
                if (!this.O) {
                    callback.onPanelClosed(108, (Menu)this.N(0).h);
                    return;
                }
            } else if (callback != null && !this.O) {
                if (this.V && (1 & this.W) != 0) {
                    this.i.getDecorView().removeCallbacks(this.X);
                    this.X.run();
                }
                j j2 = this.N(0);
                c.b.g.i.g g3 = j2.h;
                if (g3 != null && !j2.p && callback.onPreparePanel(0, j2.g, (Menu)g3)) {
                    callback.onMenuOpened(108, (Menu)j2.h);
                    this.o.f();
                    return;
                }
            }
        } else {
            j j3 = this.N(0);
            j3.o = true;
            this.E(j3, false);
            this.S(j3, null);
        }
    }

    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        this.J();
        ((ViewGroup)this.x.findViewById(16908290)).addView(view, layoutParams);
        this.j.e.onContentChanged();
    }

    /*
     * Exception decompiling
     */
    public Context d(Context var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl522 : ALOAD : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    public <T extends View> T e(int n2) {
        this.J();
        return this.i.findViewById(n2);
    }

    public int f() {
        return this.P;
    }

    public MenuInflater g() {
        if (this.m == null) {
            this.P();
            c.b.c.a a2 = this.l;
            Context context = a2 != null ? a2.b() : this.h;
            this.m = new c.b.g.f(context);
        }
        return this.m;
    }

    public c.b.c.a h() {
        this.P();
        return this.l;
    }

    public void i() {
        LayoutInflater layoutInflater = LayoutInflater.from(this.h);
        if (layoutInflater.getFactory() == null) {
            c.h.b.g.M((LayoutInflater)layoutInflater, (LayoutInflater.Factory2)this);
            return;
        }
        if (!(layoutInflater.getFactory2() instanceof k)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void j() {
        this.P();
        this.Q(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void k(Configuration configuration) {
        if (this.C && this.w) {
            this.P();
            c.b.c.a a2 = this.l;
            if (a2 != null) {
                u u2 = (u)a2;
                u2.f(u2.a.getResources().getBoolean(2130968576));
            }
        }
        c.b.h.j j2 = c.b.h.j.a();
        Context context = this.h;
        c.b.h.j j3 = j2;
        synchronized (j3) {
            m0 m02;
            m0 m03 = m02 = j2.a;
            synchronized (m03) {
                c.e.e e2 = (c.e.e)m02.d.get((Object)context);
                if (e2 != null) {
                    e2.c();
                }
            }
        }
        this.A(false);
    }

    /*
     * Exception decompiling
     */
    public void l(Bundle var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl33.1 : ALOAD : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m() {
        Object object;
        g g2;
        g g3;
        c.e.h<String, Integer> h2 = c0;
        if (this.g instanceof Activity) {
            Object object2;
            Object object3 = object2 = c.b.c.j.f;
            synchronized (object3) {
                c.b.c.j.s((c.b.c.j)this);
            }
        }
        if (this.V) {
            this.i.getDecorView().removeCallbacks(this.X);
        }
        this.N = false;
        this.O = true;
        if (this.P != -100 && (object = this.g) instanceof Activity && ((Activity)object).isChangingConfigurations()) {
            h2.put((Object)this.g.getClass().getName(), (Object)this.P);
        } else {
            h2.remove((Object)this.g.getClass().getName());
        }
        c.b.c.a a2 = this.l;
        if (a2 != null) {
            Objects.requireNonNull(a2);
        }
        if ((g3 = this.T) != null) {
            g3.a();
        }
        if ((g2 = this.U) != null) {
            g2.a();
        }
    }

    public void n(Bundle bundle) {
        this.J();
    }

    public void o() {
        this.P();
        c.b.c.a a2 = this.l;
        if (a2 != null) {
            ((u)a2).u = true;
        }
    }

    /*
     * Exception decompiling
     */
    public final View onCreateView(View var1, String var2, Context var3, AttributeSet var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl525 : ALOAD : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    public View onCreateView(String string, Context context, AttributeSet attributeSet) {
        return this.onCreateView(null, string, context, attributeSet);
    }

    public void p(Bundle bundle) {
    }

    public void q() {
        this.N = true;
        this.z();
    }

    public void r() {
        this.N = false;
        this.P();
        c.b.c.a a2 = this.l;
        if (a2 != null) {
            u u2 = (u)a2;
            u2.u = false;
            c.b.g.g g2 = u2.t;
            if (g2 != null) {
                g2.a();
            }
        }
    }

    public boolean t(int n2) {
        if (n2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            n2 = 108;
        } else if (n2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            n2 = 109;
        }
        if (this.G && n2 == 108) {
            return false;
        }
        if (this.C && n2 == 1) {
            this.C = false;
        }
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 5) {
                    if (n2 != 10) {
                        if (n2 != 108) {
                            if (n2 != 109) {
                                return this.i.requestFeature(n2);
                            }
                            this.W();
                            this.D = true;
                            return true;
                        }
                        this.W();
                        this.C = true;
                        return true;
                    }
                    this.W();
                    this.E = true;
                    return true;
                }
                this.W();
                this.B = true;
                return true;
            }
            this.W();
            this.A = true;
            return true;
        }
        this.W();
        this.G = true;
        return true;
    }

    public void u(int n2) {
        this.J();
        ViewGroup viewGroup = this.x.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.h).inflate(n2, viewGroup);
        this.j.e.onContentChanged();
    }

    public void v(View view) {
        this.J();
        ViewGroup viewGroup = this.x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.j.e.onContentChanged();
    }

    public void w(View view, ViewGroup.LayoutParams layoutParams) {
        this.J();
        ViewGroup viewGroup = this.x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.j.e.onContentChanged();
    }

    public void x(int n2) {
        this.Q = n2;
    }

    public final void y(CharSequence charSequence) {
        this.n = charSequence;
        b0 b02 = this.o;
        if (b02 != null) {
            b02.setWindowTitle(charSequence);
            return;
        }
        c.b.c.a a2 = this.l;
        if (a2 != null) {
            ((u)a2).e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.y;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean z() {
        return this.A(true);
    }

    public final class c
    implements m.a {
        public void a(c.b.g.i.g g2, boolean bl) {
            k.this.D(g2);
        }

        public boolean b(c.b.g.i.g g2) {
            Window.Callback callback = k.this.O();
            if (callback != null) {
                callback.onMenuOpened(108, (Menu)g2);
            }
            return true;
        }
    }

    public class d
    implements a.a {
        public a.a a;

        public d(a.a a2) {
            this.a = a2;
        }

        public boolean a(c.b.g.a a2, Menu menu) {
            n.r((View)k.this.x);
            return this.a.a(a2, menu);
        }

        public boolean b(c.b.g.a a2, MenuItem menuItem) {
            return this.a.b(a2, menuItem);
        }

        public boolean c(c.b.g.a a2, Menu menu) {
            return this.a.c(a2, menu);
        }

        public void d(c.b.g.a a2) {
            this.a.d(a2);
            k k2 = k.this;
            if (k2.t != null) {
                k2.i.getDecorView().removeCallbacks(k.this.u);
            }
            k k3 = k.this;
            if (k3.s != null) {
                k3.I();
                k k4 = k.this;
                c.h.j.s s2 = n.a((View)k4.s);
                s2.a(0.0f);
                k4.v = s2;
                c.h.j.s s3 = k.this.v;
                a a3 = new a(this);
                View view = (View)s3.a.get();
                if (view != null) {
                    s3.e(view, (c.h.j.t)a3);
                }
            }
            k k5 = k.this;
            c.b.c.i i2 = k5.k;
            if (i2 != null) {
                i2.i(k5.r);
            }
            k k6 = k.this;
            k6.r = null;
            n.r((View)k6.x);
        }
    }

    public class e
    extends c.b.g.h {
        public e(Window.Callback callback) {
            super(callback);
        }

        /*
         * Exception decompiling
         */
        public final ActionMode a(ActionMode.Callback var1) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl144 : ALOAD : trying to set 1 previously set to 0
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
            // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
            // org.benf.cfr.reader.b.a(Driver.java:128)
            // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
            // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
            // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
            // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
            // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
            // java.lang.Thread.run(Thread.java:920)
            throw new IllegalStateException("Decompilation failed");
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return k.this.G(keyEvent) || this.e.dispatchKeyEvent(keyEvent);
            {
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            int n2;
            block9 : {
                k k2;
                j j2;
                block8 : {
                    boolean bl;
                    c.b.g.i.g g2;
                    boolean bl2 = this.e.dispatchKeyShortcutEvent(keyEvent);
                    n2 = 1;
                    if (bl2) return (boolean)n2;
                    k2 = k.this;
                    int n3 = keyEvent.getKeyCode();
                    k2.P();
                    c.b.c.a a2 = k2.l;
                    if (a2 == null) break block8;
                    u.d d2 = ((u)a2).i;
                    if (d2 != null && (g2 = d2.h) != null) {
                        boolean bl3 = KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != n2;
                        g2.setQwertyMode(bl3);
                        bl = g2.performShortcut(n3, keyEvent, 0);
                    } else {
                        bl = false;
                    }
                    if (bl) break block9;
                }
                if ((j2 = k2.J) != null && k2.T(j2, keyEvent.getKeyCode(), keyEvent, n2)) {
                    j j3 = k2.J;
                    if (j3 != null) {
                        j3.l = n2;
                    }
                } else {
                    if (k2.J != null) return (boolean)0;
                    j j4 = k2.N(0);
                    k2.U(j4, keyEvent);
                    boolean bl = k2.T(j4, keyEvent.getKeyCode(), keyEvent, n2);
                    j4.k = false;
                    if (!bl) return (boolean)0;
                }
            }
            boolean bl = true;
            if (!bl) return (boolean)0;
            return (boolean)n2;
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int n2, Menu menu) {
            if (n2 == 0 && !(menu instanceof c.b.g.i.g)) {
                return false;
            }
            return this.e.onCreatePanelMenu(n2, menu);
        }

        public boolean onMenuOpened(int n2, Menu menu) {
            this.e.onMenuOpened(n2, menu);
            k k2 = k.this;
            Objects.requireNonNull(k2);
            if (n2 == 108) {
                k2.P();
                c.b.c.a a2 = k2.l;
                if (a2 != null) {
                    a2.a(true);
                }
            }
            return true;
        }

        public void onPanelClosed(int n2, Menu menu) {
            this.e.onPanelClosed(n2, menu);
            k k2 = k.this;
            Objects.requireNonNull(k2);
            if (n2 == 108) {
                k2.P();
                c.b.c.a a2 = k2.l;
                if (a2 != null) {
                    a2.a(false);
                    return;
                }
            } else if (n2 == 0) {
                j j2 = k2.N(n2);
                if (j2.m) {
                    k2.E(j2, false);
                }
            }
        }

        public boolean onPreparePanel(int n2, View view, Menu menu) {
            c.b.g.i.g g2 = menu instanceof c.b.g.i.g ? (c.b.g.i.g)menu : null;
            if (n2 == 0 && g2 == null) {
                return false;
            }
            if (g2 != null) {
                g2.x = true;
            }
            boolean bl = this.e.onPreparePanel(n2, view, menu);
            if (g2 != null) {
                g2.x = false;
            }
            return bl;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int n2) {
            c.b.g.i.g g2 = k.this.N((int)0).h;
            if (g2 != null) {
                this.e.onProvideKeyboardShortcuts(list, (Menu)g2, n2);
                return;
            }
            this.e.onProvideKeyboardShortcuts(list, menu, n2);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            Objects.requireNonNull(k.this);
            return this.a(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int n2) {
            Objects.requireNonNull(k.this);
            if (n2 != 0) {
                return this.e.onWindowStartingActionMode(callback, n2);
            }
            return this.a(callback);
        }
    }

    public class f
    extends g {
        public final PowerManager c;

        public f(Context context) {
            super(k.this);
            this.c = (PowerManager)context.getApplicationContext().getSystemService("power");
        }

        public IntentFilter b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        public int c() {
            int n2 = Build.VERSION.SDK_INT;
            int n3 = 1;
            if (n2 >= 21 && this.c.isPowerSaveMode()) {
                n3 = 2;
            }
            return n3;
        }

        public void d() {
            k.this.z();
        }
    }

    public class h
    extends g {
        public final t c;

        public h(t t2) {
            super(k.this);
            this.c = t2;
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /*
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public int c() {
            int n2;
            boolean bl;
            block11 : {
                boolean bl2;
                block13 : {
                    block12 : {
                        block10 : {
                            t.a a2;
                            block9 : {
                                long l2;
                                t t2 = this.c;
                                a2 = t2.c;
                                long l3 = a2.b;
                                long l4 = System.currentTimeMillis();
                                n2 = 1;
                                boolean bl3 = l3 > l4;
                                if (bl3) break block9;
                                Location location = c.h.b.g.h((Context)t2.a, (String)"android.permission.ACCESS_COARSE_LOCATION") == 0 ? t2.a("network") : null;
                                int n3 = c.h.b.g.h((Context)t2.a, (String)"android.permission.ACCESS_FINE_LOCATION");
                                Location location2 = null;
                                if (n3 == 0) {
                                    location2 = t2.a("gps");
                                }
                                if (location2 != null && location != null ? location2.getTime() > location.getTime() : location2 != null) {
                                    location = location2;
                                }
                                if (location == null) break block10;
                                t.a a3 = t2.c;
                                long l5 = System.currentTimeMillis();
                                if (s.d == null) {
                                    s.d = new s();
                                }
                                s s2 = s.d;
                                s2.a(l5 - 86400000L, location.getLatitude(), location.getLongitude());
                                s2.a(l5, location.getLatitude(), location.getLongitude());
                                int n4 = s2.c;
                                boolean bl4 = n4 == n2;
                                long l6 = s2.b;
                                long l7 = s2.a;
                                s2.a(l5 + 86400000L, location.getLatitude(), location.getLongitude());
                                long l8 = s2.b;
                                if (l6 != -1L && l7 != -1L) {
                                    long l9 = l5 > l7 ? l8 + 0L : (l5 > l6 ? l7 + 0L : l6 + 0L);
                                    l2 = l9 + 60000L;
                                } else {
                                    l2 = 43200000L + l5;
                                }
                                a3.a = bl4;
                                a3.b = l2;
                            }
                            bl = a2.a;
                            break block11;
                        }
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int n5 = Calendar.getInstance().get(11);
                        if (n5 < 6) break block12;
                        bl2 = false;
                        if (n5 < 22) break block13;
                    }
                    bl2 = true;
                }
                bl = bl2;
            }
            if (!bl) return n2;
            return 2;
        }

        public void d() {
            k.this.z();
        }
    }

    public class i
    extends ContentFrameLayout {
        public i(Context context) {
            super(context, null);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return k.this.G(keyEvent) || FrameLayout.super.dispatchKeyEvent(keyEvent);
            {
            }
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int n2 = (int)motionEvent.getX();
                int n3 = (int)motionEvent.getY();
                boolean bl = n2 < -5 || n3 < -5 || n2 > 5 + this.getWidth() || n3 > 5 + this.getHeight();
                if (bl) {
                    k k2 = k.this;
                    k2.E(k2.N(0), true);
                    return true;
                }
            }
            return FrameLayout.super.onInterceptTouchEvent(motionEvent);
        }

        public void setBackgroundResource(int n2) {
            this.setBackgroundDrawable(c.b.d.a.a.b((Context)this.getContext(), (int)n2));
        }
    }

    public final class k
    implements m.a {
        public void a(c.b.g.i.g g2, boolean bl) {
            j j2;
            c.b.g.i.g g3 = g2.k();
            boolean bl2 = g3 != g2;
            k k2 = k.this;
            if (bl2) {
                g2 = g3;
            }
            if ((j2 = k2.L((Menu)g2)) != null) {
                if (bl2) {
                    k.this.C(j2.a, j2, (Menu)g3);
                    k.this.E(j2, true);
                    return;
                }
                k.this.E(j2, bl);
            }
        }

        public boolean b(c.b.g.i.g g2) {
            if (g2 == g2.k()) {
                Window.Callback callback;
                k k2 = k.this;
                if (k2.C && (callback = k2.O()) != null && !k.this.O) {
                    callback.onMenuOpened(108, (Menu)g2);
                }
            }
            return true;
        }
    }

}

