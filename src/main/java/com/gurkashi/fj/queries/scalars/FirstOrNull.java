package com.gurkashi.fj.queries.scalars;

import com.gurkashi.fj.queries.stracture.ScalarQuery;

import java.util.Collection;

/**
 * Created by Gur on 11/21/2016.
 */
public class FirstOrNull<T> implements ScalarQuery<T,T> {
    public T execute(Collection<T> collection){
        return collection.iterator().hasNext() ? collection.iterator().next() : null;
    }
}
