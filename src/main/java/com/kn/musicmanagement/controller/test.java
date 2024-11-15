package com.kn.musicmanagement.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        int[] ints = new int[2];
        System.out.println(ints.length);
        ints[0] = 85;
        ints[1] = 54;
        System.out.println(Arrays.toString(ints));
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("8");
        stringArrayList.add("9");
        stringArrayList.add("5");
        stringArrayList.add("5");
        stringArrayList.add("498");
        stringArrayList.add("46df");
        stringArrayList.add(5, "45");
        System.out.println(stringArrayList);
        Map<Integer, String> maptest = new HashMap<>();
        maptest.put(1, "asfd");
        maptest.put(2, "asfd");
        maptest.put(13, "asfd");
        maptest.put(189987, "asfd");
        System.out.println(maptest);
    }
}
