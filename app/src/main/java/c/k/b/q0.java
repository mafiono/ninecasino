/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.transition.Transition
 *  android.transition.Transition$EpicenterCallback
 *  android.transition.Transition$TransitionListener
 *  android.transition.TransitionManager
 *  android.transition.TransitionSet
 *  android.view.View
 *  android.view.ViewGroup
 *  c.h.f.a
 *  c.k.b.m
 *  c.k.b.q0$a
 *  c.k.b.q0$b
 *  c.k.b.q0$c
 *  c.k.b.q0$d
 *  c.k.b.q0$e
 *  c.k.b.r0
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package c.k.b;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import c.k.b.m;
import c.k.b.q0;
import c.k.b.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class q0
extends r0 {
    public static boolean z(Transition transition) {
        return !r0.k((List)transition.getTargetIds()) || !r0.k((List)transition.getTargetNames()) || !r0.k((List)transition.getTargetTypes());
        {
        }
    }

    public void a(Object object, View view) {
        if (object != null) {
            ((Transition)object).addTarget(view);
        }
    }

    public void b(Object object, ArrayList<View> arrayList) {
        block4 : {
            int n2;
            Transition transition;
            block3 : {
                transition = (Transition)object;
                if (transition == null) {
                    return;
                }
                boolean bl = transition instanceof TransitionSet;
                if (!bl) break block3;
                TransitionSet transitionSet = (TransitionSet)transition;
                int n3 = transitionSet.getTransitionCount();
                for (n2 = 0; n2 < n3; ++n2) {
                    this.b(transitionSet.getTransitionAt(n2), arrayList);
                }
                break block4;
            }
            if (q0.z(transition) || !r0.k((List)transition.getTargets())) break block4;
            int n4 = arrayList.size();
            while (n2 < n4) {
                transition.addTarget(arrayList.get(n2));
                ++n2;
            }
        }
    }

    public void c(ViewGroup viewGroup, Object object) {
        TransitionManager.beginDelayedTransition(viewGroup, object);
    }

    public boolean e(Object object) {
        return object instanceof Transition;
    }

    public Object g(Object object) {
        if (object != null) {
            return ((Transition)object).clone();
        }
        return null;
    }

    public Object l(Object object, Object object2, Object object3) {
        Object object4 = object;
        Transition transition = (Transition)object2;
        Transition transition2 = (Transition)object3;
        if (object4 != null && transition != null) {
            object4 = new TransitionSet().addTransition(object4).addTransition(transition).setOrdering(1);
        } else if (object4 == null) {
            object4 = transition;
        }
        if (transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (object4 != null) {
                transitionSet.addTransition(object4);
            }
            transitionSet.addTransition(transition2);
            return transitionSet;
        }
        return object4;
    }

    public Object m(Object object, Object object2, Object object3) {
        TransitionSet transitionSet = new TransitionSet();
        if (object != null) {
            transitionSet.addTransition((Transition)object);
        }
        if (object2 != null) {
            transitionSet.addTransition((Transition)object2);
        }
        if (object3 != null) {
            transitionSet.addTransition((Transition)object3);
        }
        return transitionSet;
    }

    public void o(Object object, View view) {
        if (object != null) {
            ((Transition)object).removeTarget(view);
        }
    }

    public void p(Object object, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        block6 : {
            int n2;
            int n3;
            List list;
            Transition transition;
            block5 : {
                transition = (Transition)object;
                boolean bl = transition instanceof TransitionSet;
                if (!bl) break block5;
                TransitionSet transitionSet = (TransitionSet)transition;
                int n4 = transitionSet.getTransitionCount();
                for (n3 = 0; n3 < n4; ++n3) {
                    this.p(transitionSet.getTransitionAt(n3), arrayList, arrayList2);
                }
                break block6;
            }
            if (q0.z(transition) || (list = transition.getTargets()) == null || list.size() != arrayList.size() || !list.containsAll(arrayList)) break block6;
            if (arrayList2 == null) {
                n2 = 0;
                n3 = 0;
            } else {
                n2 = arrayList2.size();
            }
            while (n3 < n2) {
                transition.addTarget(arrayList2.get(n3));
                ++n3;
            }
            for (int i2 = -1 + arrayList.size(); i2 >= 0; --i2) {
                transition.removeTarget(arrayList.get(i2));
            }
        }
    }

    public void q(Object object, View view, ArrayList<View> arrayList) {
        ((Transition)object).addListener((Transition.TransitionListener)new b(this, view, arrayList));
    }

    public void r(Object object, Object object2, ArrayList<View> arrayList, Object object3, ArrayList<View> arrayList2, Object object4, ArrayList<View> arrayList3) {
        Transition transition = (Transition)object;
        c c2 = new c(this, object2, arrayList, object3, arrayList2, object4, arrayList3);
        transition.addListener((Transition.TransitionListener)c2);
    }

    public void s(Object object, Rect rect) {
        if (object != null) {
            ((Transition)object).setEpicenterCallback((Transition.EpicenterCallback)new e(this, rect));
        }
    }

    public void t(Object object, View view) {
        if (view != null) {
            Transition transition = (Transition)object;
            Rect rect = new Rect();
            this.j(view, rect);
            transition.setEpicenterCallback((Transition.EpicenterCallback)new a(this, rect));
        }
    }

    public void u(m m2, Object object, c.h.f.a a2, Runnable runnable) {
        ((Transition)object).addListener((Transition.TransitionListener)new d(this, runnable));
    }

    public void w(Object object, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet)object;
        List list = transitionSet.getTargets();
        list.clear();
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            r0.d((List)list, (View) arrayList.get(i2));
        }
        list.add(view);
        arrayList.add(view);
        this.b(transitionSet, arrayList);
    }

    public void x(Object object, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet)object;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            this.p(transitionSet, arrayList, arrayList2);
        }
    }

    public Object y(Object object) {
        if (object == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition)object);
        return transitionSet;
    }
}

