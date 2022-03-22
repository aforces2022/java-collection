package com.aforces.corejava.chapter.collection.demo.bean.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add("hi");
        list.add("hi");
        list.add("hello");

        Set<String> sets = new HashSet<>();
        sets.add("hi");
        sets.add("hi");
        System.out.println(sets);

        Set<String> uniqueSet = new HashSet<>(list);
        System.out.println(uniqueSet);




    }
}
