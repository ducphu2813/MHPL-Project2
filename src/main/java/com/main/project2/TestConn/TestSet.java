package com.main.project2.TestConn;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> ds = new HashSet<>();

        ds.add(1);
        ds.add(2);
        ds.add(1);
        ds.add(3);
        ds.add(5);
        ds.add(3);

        System.out.println(ds);
    }
}
