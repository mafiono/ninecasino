/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.RandomAccess
 */
package d.c.b.m.e.m;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class w<E>
implements List<E>,
RandomAccess {
    public final List<E> e;

    public w(List<E> list) {
        this.e = Collections.unmodifiableList(list);
    }

    public void add(int n2, E e2) {
        this.e.add(n2, e2);
    }

    public boolean add(E e2) {
        return this.e.add(e2);
    }

    public boolean addAll(int n2, Collection<? extends E> collection) {
        return this.e.addAll(n2, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return this.e.addAll(collection);
    }

    public void clear() {
        this.e.clear();
    }

    public boolean contains(Object object) {
        return this.e.contains(object);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.e.containsAll(collection);
    }

    public boolean equals(Object object) {
        return this.e.equals(object);
    }

    public E get(int n2) {
        return this.e.get(n2);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public int indexOf(Object object) {
        return this.e.indexOf(object);
    }

    public boolean isEmpty() {
        return this.e.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.e.iterator();
    }

    public int lastIndexOf(Object object) {
        return this.e.lastIndexOf(object);
    }

    public ListIterator<E> listIterator() {
        return this.e.listIterator();
    }

    public ListIterator<E> listIterator(int n2) {
        return this.e.listIterator(n2);
    }

    public E remove(int n2) {
        return this.e.remove(n2);
    }

    public boolean remove(Object object) {
        return this.e.remove(object);
    }

    public boolean removeAll(Collection<?> collection) {
        return this.e.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.e.retainAll(collection);
    }

    public E set(int n2, E e2) {
        return this.e.set(n2, e2);
    }

    public int size() {
        return this.e.size();
    }

    public List<E> subList(int n2, int n3) {
        return this.e.subList(n2, n3);
    }

    public Object[] toArray() {
        return this.e.toArray();
    }

    public <T> T[] toArray(T[] arrT) {
        return this.e.toArray((Object[])arrT);
    }
}

