package com.pipasese.blog.util;

import java.util.ArrayList;
import java.util.List;

public class Run<T> {
    private final T t;

    public Run(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }

    public static <E> void run(List<E> list) {
        for (E e : list) {
            System.out.println(e);
        }
    }

    public static <E extends Comparable<E>> E max(E x, E y) {
        if (x.compareTo(y) > 0) {
            return x;
        }
        return y;
    }

    public static <M extends Comparable<M>> Run<M> maxRun(Run<M> x, Run<M> y) {
        if (x.get().compareTo(y.get()) > 0) {
            return x;
        }
        return y;
    }

    public static void foo(Run<?> run) {
        System.out.println(run.get());
    }
}
