/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.TypedValue
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.TextView
 *  androidx.appcompat.app.AlertController
 *  androidx.appcompat.app.AlertController$RecycleListView
 *  androidx.core.widget.NestedScrollView
 *  androidx.core.widget.NestedScrollView$b
 *  c.b.c.c
 *  c.b.c.d
 *  c.b.c.e
 *  c.b.h.h0
 *  c.b.h.h0$a
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Objects
 */
package c.b.c;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import c.b.c.b;
import c.b.c.c;
import c.b.c.d;
import c.b.c.e;
import c.b.c.q;
import c.b.h.h0;
import java.util.Objects;

public class g
extends q
implements DialogInterface {
    public final AlertController g = new AlertController(this.getContext(), (q)this, this.getWindow());

    public g(Context context, int n2) {
        super(context, g.c(context, n2));
    }

    public static int c(Context context, int n2) {
        if ((255 & n2 >>> 24) >= 1) {
            return n2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130903078, typedValue, true);
        return typedValue.resourceId;
    }

    @Override
    public void onCreate(Bundle bundle) {
        ListView listView;
        AlertController alertController;
        ListAdapter listAdapter;
        block62 : {
            ViewGroup viewGroup;
            View view;
            block64 : {
                View view2;
                View view3;
                block66 : {
                    block65 : {
                        int n2;
                        block63 : {
                            int n3;
                            ListView listView2;
                            boolean bl;
                            boolean bl2;
                            block60 : {
                                Object object;
                                block61 : {
                                    block59 : {
                                        ViewGroup viewGroup2;
                                        View view4;
                                        int n4;
                                        ViewGroup viewGroup3;
                                        ViewGroup viewGroup4;
                                        boolean bl3;
                                        block55 : {
                                            Button button;
                                            block57 : {
                                                block58 : {
                                                    block56 : {
                                                        TextView textView;
                                                        Button button2;
                                                        Button button3;
                                                        Button button4;
                                                        boolean bl4;
                                                        NestedScrollView nestedScrollView;
                                                        super.onCreate(bundle);
                                                        alertController = this.g;
                                                        int n5 = alertController.J;
                                                        alertController.b.setContentView(n5);
                                                        View view5 = alertController.c.findViewById(2131231001);
                                                        View view6 = view5.findViewById(2131231118);
                                                        View view7 = view5.findViewById(2131230854);
                                                        View view8 = view5.findViewById(2131230820);
                                                        viewGroup4 = view5.findViewById(2131230858);
                                                        Object object2 = alertController.h;
                                                        if (object2 == null) {
                                                            object2 = alertController.i != 0 ? LayoutInflater.from((Context)alertController.a).inflate(alertController.i, viewGroup4, false) : null;
                                                        }
                                                        if (!(bl4 = object2 != null) || !AlertController.a((View)object2)) {
                                                            alertController.c.setFlags(131072, 131072);
                                                        }
                                                        if (bl4) {
                                                            FrameLayout frameLayout = (FrameLayout)alertController.c.findViewById(2131230857);
                                                            frameLayout.addView(object2, new ViewGroup.LayoutParams(-1, -1));
                                                            if (alertController.n) {
                                                                frameLayout.setPadding(alertController.j, alertController.k, alertController.l, alertController.m);
                                                            }
                                                            if (alertController.g != null) {
                                                                ((h0.a)viewGroup4.getLayoutParams()).a = 0.0f;
                                                            }
                                                        } else {
                                                            viewGroup4.setVisibility(8);
                                                        }
                                                        View view9 = viewGroup4.findViewById(2131231118);
                                                        View view10 = viewGroup4.findViewById(2131230854);
                                                        View view11 = viewGroup4.findViewById(2131230820);
                                                        viewGroup2 = alertController.d(view9, view6);
                                                        viewGroup = alertController.d(view10, view7);
                                                        viewGroup3 = alertController.d(view11, view8);
                                                        alertController.A = nestedScrollView = (NestedScrollView)alertController.c.findViewById(2131231034);
                                                        nestedScrollView.setFocusable(false);
                                                        alertController.A.setNestedScrollingEnabled(false);
                                                        alertController.F = textView = viewGroup.findViewById(16908299);
                                                        if (textView != null) {
                                                            CharSequence charSequence = alertController.f;
                                                            if (charSequence != null) {
                                                                textView.setText(charSequence);
                                                            } else {
                                                                textView.setVisibility(8);
                                                                alertController.A.removeView((View)alertController.F);
                                                                if (alertController.g != null) {
                                                                    ViewGroup viewGroup5 = (ViewGroup)alertController.A.getParent();
                                                                    int n6 = viewGroup5.indexOfChild((View)alertController.A);
                                                                    viewGroup5.removeViewAt(n6);
                                                                    viewGroup5.addView((View)alertController.g, n6, new ViewGroup.LayoutParams(-1, -1));
                                                                } else {
                                                                    viewGroup.setVisibility(8);
                                                                }
                                                            }
                                                        }
                                                        alertController.o = button3 = viewGroup3.findViewById(16908313);
                                                        button3.setOnClickListener(alertController.R);
                                                        if (TextUtils.isEmpty((CharSequence)alertController.p) && alertController.r == null) {
                                                            alertController.o.setVisibility(8);
                                                            n4 = 0;
                                                        } else {
                                                            alertController.o.setText(alertController.p);
                                                            Drawable drawable = alertController.r;
                                                            if (drawable != null) {
                                                                int n7 = alertController.d;
                                                                drawable.setBounds(0, 0, n7, n7);
                                                                alertController.o.setCompoundDrawables(alertController.r, null, null, null);
                                                            }
                                                            alertController.o.setVisibility(0);
                                                            n4 = 1;
                                                        }
                                                        alertController.s = button4 = viewGroup3.findViewById(16908314);
                                                        button4.setOnClickListener(alertController.R);
                                                        if (TextUtils.isEmpty((CharSequence)alertController.t) && alertController.v == null) {
                                                            alertController.s.setVisibility(8);
                                                        } else {
                                                            alertController.s.setText(alertController.t);
                                                            Drawable drawable = alertController.v;
                                                            if (drawable != null) {
                                                                int n8 = alertController.d;
                                                                drawable.setBounds(0, 0, n8, n8);
                                                                alertController.s.setCompoundDrawables(alertController.v, null, null, null);
                                                            }
                                                            alertController.s.setVisibility(0);
                                                            n4 |= 2;
                                                        }
                                                        alertController.w = button2 = viewGroup3.findViewById(16908315);
                                                        button2.setOnClickListener(alertController.R);
                                                        if (TextUtils.isEmpty((CharSequence)alertController.x) && alertController.z == null) {
                                                            alertController.w.setVisibility(8);
                                                        } else {
                                                            alertController.w.setText(alertController.x);
                                                            Drawable drawable = alertController.z;
                                                            if (drawable != null) {
                                                                int n9 = alertController.d;
                                                                drawable.setBounds(0, 0, n9, n9);
                                                                alertController.w.setCompoundDrawables(alertController.z, null, null, null);
                                                            }
                                                            alertController.w.setVisibility(0);
                                                            n4 |= 4;
                                                        }
                                                        Context context = alertController.a;
                                                        TypedValue typedValue = new TypedValue();
                                                        context.getTheme().resolveAttribute(2130903076, typedValue, true);
                                                        boolean bl5 = typedValue.data != 0;
                                                        if (!bl5) break block55;
                                                        if (n4 != 1) break block56;
                                                        button = alertController.o;
                                                        break block57;
                                                    }
                                                    if (n4 != 2) break block58;
                                                    button = alertController.s;
                                                    break block57;
                                                }
                                                if (n4 != 4) break block55;
                                                button = alertController.w;
                                            }
                                            alertController.b(button);
                                        }
                                        if (!(bl3 = n4 != 0)) {
                                            viewGroup3.setVisibility(8);
                                        }
                                        if (alertController.G != null) {
                                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                                            viewGroup2.addView(alertController.G, 0, layoutParams);
                                            alertController.c.findViewById(2131231115).setVisibility(8);
                                        } else {
                                            alertController.D = (ImageView)alertController.c.findViewById(16908294);
                                            if (true ^ TextUtils.isEmpty((CharSequence)alertController.e) && alertController.P) {
                                                TextView textView;
                                                alertController.E = textView = (TextView)alertController.c.findViewById(2131230791);
                                                textView.setText(alertController.e);
                                                int n10 = alertController.B;
                                                if (n10 != 0) {
                                                    alertController.D.setImageResource(n10);
                                                } else {
                                                    Drawable drawable = alertController.C;
                                                    if (drawable != null) {
                                                        alertController.D.setImageDrawable(drawable);
                                                    } else {
                                                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                                                        alertController.D.setVisibility(8);
                                                    }
                                                }
                                            } else {
                                                alertController.c.findViewById(2131231115).setVisibility(8);
                                                alertController.D.setVisibility(8);
                                                viewGroup2.setVisibility(8);
                                            }
                                        }
                                        bl2 = viewGroup4.getVisibility() != 8;
                                        n3 = viewGroup2 != null && viewGroup2.getVisibility() != 8 ? 1 : 0;
                                        bl = viewGroup3.getVisibility() != 8;
                                        if (!bl && (view4 = viewGroup.findViewById(2131231099)) != null) {
                                            view4.setVisibility(0);
                                        }
                                        if (n3 == 0) break block59;
                                        NestedScrollView nestedScrollView = alertController.A;
                                        if (nestedScrollView != null) {
                                            nestedScrollView.setClipToPadding(true);
                                        }
                                        object = alertController.f == null && alertController.g == null ? null : viewGroup2.findViewById(2131231114);
                                        if (object == null) break block60;
                                        break block61;
                                    }
                                    object = viewGroup.findViewById(2131231100);
                                    if (object == null) break block60;
                                }
                                object.setVisibility(0);
                            }
                            if ((listView2 = alertController.g) instanceof AlertController.RecycleListView) {
                                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView)listView2;
                                Objects.requireNonNull((Object)recycleListView);
                                if (!bl || n3 == 0) {
                                    int n11 = recycleListView.getPaddingLeft();
                                    int n12 = n3 != 0 ? recycleListView.getPaddingTop() : recycleListView.e;
                                    int n13 = recycleListView.getPaddingRight();
                                    int n14 = bl ? recycleListView.getPaddingBottom() : recycleListView.f;
                                    recycleListView.setPadding(n11, n12, n13, n14);
                                }
                            }
                            if (bl2) break block62;
                            ListView listView3 = alertController.g;
                            if (listView3 == null) {
                                listView3 = alertController.A;
                            }
                            if (listView3 == null) break block62;
                            int n15 = 0;
                            if (bl) {
                                n15 = 2;
                            }
                            n2 = n3 | n15;
                            view2 = alertController.c.findViewById(2131231033);
                            view = alertController.c.findViewById(2131231032);
                            int n16 = Build.VERSION.SDK_INT;
                            if (n16 < 23) break block63;
                            if (n16 >= 23) {
                                listView3.setScrollIndicators(n2, 3);
                            }
                            if (view2 != null) {
                                viewGroup.removeView(view2);
                            }
                            if (view == null) break block62;
                            break block64;
                        }
                        if (view2 != null && (n2 & 1) == 0) {
                            viewGroup.removeView(view2);
                            view2 = null;
                        }
                        if (view != null && (n2 & 2) == 0) {
                            viewGroup.removeView(view);
                            view3 = null;
                        } else {
                            view3 = view;
                        }
                        if (view2 == null && view3 == null) break block62;
                        if (alertController.f == null) break block65;
                        alertController.A.setOnScrollChangeListener((NestedScrollView.b)new b(alertController, view2, view3));
                        alertController.A.post((Runnable)new c(alertController, view2, view3));
                        break block62;
                    }
                    ListView listView4 = alertController.g;
                    if (listView4 == null) break block66;
                    listView4.setOnScrollListener((AbsListView.OnScrollListener)new d(alertController, view2, view3));
                    alertController.g.post((Runnable)new e(alertController, view2, view3));
                    break block62;
                }
                if (view2 != null) {
                    viewGroup.removeView(view2);
                }
                if (view3 == null) break block62;
                view = view3;
            }
            viewGroup.removeView(view);
        }
        if ((listView = alertController.g) != null && (listAdapter = alertController.H) != null) {
            listView.setAdapter(listAdapter);
            int n17 = alertController.I;
            if (n17 > -1) {
                listView.setItemChecked(n17, true);
                listView.setSelection(n17);
            }
        }
    }

    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.A;
        boolean bl = nestedScrollView != null && nestedScrollView.l(keyEvent);
        if (bl) {
            return true;
        }
        return Dialog.super.onKeyDown(n2, keyEvent);
    }

    public boolean onKeyUp(int n2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.A;
        boolean bl = nestedScrollView != null && nestedScrollView.l(keyEvent);
        if (bl) {
            return true;
        }
        return Dialog.super.onKeyUp(n2, keyEvent);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.g;
        alertController.e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

