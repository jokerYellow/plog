package com.pipasese.blog.util;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestRun {

    @Test
    public void test() {
        List<String> name = new ArrayList<>();
        name.add("1");
        name.add("2");
        Run.run(name);

        Run<String> r = new Run<>("hello");
        String h = r.get();
        name.add(r.get());
        Run.run(name);

        Run.foo(r);
    }
}
