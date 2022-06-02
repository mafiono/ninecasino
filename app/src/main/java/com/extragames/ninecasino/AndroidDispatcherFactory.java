package com.extragames.ninecasino;

public class AndroidDispatcherFactory extends MainDispatcherFactory {

    protected Object clone(Object object) throws CloneNotSupportedException {
        super.clone();
        return getObject();
    }

    private Object getObject() throws CloneNotSupportedException {
        return super.clone();
    }
}
