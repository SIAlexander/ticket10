package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String[] str = {"aa", "bb", "cc", "aa", "bb", "dd"};

        Set<String> stringSet = new HashSet<>(Arrays.asList(str));
        String result = String.join(" ", stringSet);
        System.out.println(result);
    }
}