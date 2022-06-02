/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.View
 *  android.widget.HeaderViewListAdapter
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  androidx.appcompat.view.menu.ListMenuItemView
 *  c.b.g.i.f
 *  c.b.h.e0
 *  c.b.h.k0
 *  java.lang.reflect.Method
 */
package c.b.h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.view.menu.ListMenuItemView;
import c.b.g.i.f;
import c.b.g.i.g;
import c.b.g.i.i;
import c.b.h.e0;
import c.b.h.j0;
import c.b.h.k0;
import java.lang.reflect.Method;

public class l0
extends j0
implements k0 {
    public static Method I;
    public k0 H;

    /*
     * Exception decompiling
     */
    public static {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl21 : RETURN : trying to set 1 previously set to 0
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

    public l0(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, null, n2, n3);
    }

    public void e(g g2, MenuItem menuItem) {
        k0 k02 = this.H;
        if (k02 != null) {
            k02.e(g2, menuItem);
        }
    }

    public void h(g g2, MenuItem menuItem) {
        k0 k02 = this.H;
        if (k02 != null) {
            k02.h(g2, menuItem);
        }
    }

    @Override
    public e0 q(Context context, boolean bl) {
        e0 e02 = new e0(context, bl){
            public final int r;
            public final int s;
            public k0 t;
            public MenuItem u;
            {
                if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                    this.r = 21;
                    this.s = 22;
                    return;
                }
                this.r = 22;
                this.s = 21;
            }

            public boolean onHoverEvent(MotionEvent motionEvent) {
                if (this.t != null) {
                    int n2;
                    MenuItem menuItem;
                    ListAdapter listAdapter = this.getAdapter();
                    if (listAdapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)listAdapter;
                        n2 = headerViewListAdapter.getHeadersCount();
                        listAdapter = headerViewListAdapter.getWrappedAdapter();
                    } else {
                        n2 = 0;
                    }
                    f f2 = (f)listAdapter;
                    int n3 = motionEvent.getAction();
                    i i2 = null;
                    if (n3 != 10) {
                        int n4 = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
                        i2 = null;
                        if (n4 != -1) {
                            int n5 = n4 - n2;
                            i2 = null;
                            if (n5 >= 0) {
                                int n6 = f2.getCount();
                                i2 = null;
                                if (n5 < n6) {
                                    i2 = f2.b(n5);
                                }
                            }
                        }
                    }
                    if ((menuItem = this.u) != i2) {
                        g g2 = f2.e;
                        if (menuItem != null) {
                            this.t.h(g2, menuItem);
                        }
                        this.u = i2;
                        if (i2 != null) {
                            this.t.e(g2, i2);
                        }
                    }
                }
                return super.onHoverEvent(motionEvent);
            }

            public boolean onKeyDown(int n2, KeyEvent keyEvent) {
                ListMenuItemView listMenuItemView = (ListMenuItemView)this.getSelectedView();
                if (listMenuItemView != null && n2 == this.r) {
                    if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                        this.performItemClick((View)listMenuItemView, this.getSelectedItemPosition(), this.getSelectedItemId());
                    }
                    return true;
                }
                if (listMenuItemView != null && n2 == this.s) {
                    this.setSelection(-1);
                    ((f)this.getAdapter()).e.c(false);
                    return true;
                }
                return ListView.super.onKeyDown(n2, keyEvent);
            }

            public void setHoverListener(k0 k02) {
                this.t = k02;
            }
        };
        e02.setHoverListener(this);
        return e02;
    }

}

