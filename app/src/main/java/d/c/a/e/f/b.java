/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.android.material.bottomappbar.BottomAppBar
 *  com.google.android.material.floatingactionbutton.FloatingActionButton
 *  com.google.android.material.floatingactionbutton.FloatingActionButton$a
 */
package d.c.a.e.f;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class b
extends FloatingActionButton.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    public b(BottomAppBar bottomAppBar, int n2) {
        this.b = bottomAppBar;
        this.a = n2;
    }

    public void a(FloatingActionButton floatingActionButton) {
        BottomAppBar bottomAppBar = this.b;
        int n2 = this.a;
        floatingActionButton.setTranslationX(bottomAppBar.A(n2));
        floatingActionButton.m(new FloatingActionButton.a(){

            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.v((BottomAppBar)b.this.b);
            }
        }, true);
    }

}

