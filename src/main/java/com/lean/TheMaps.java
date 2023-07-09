package com.lean;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    public static void main(String[] args) {
        Map<Integer, String> skills = new HashMap<>();
        skills.put(1, "Java");
        skills.put(2, "Rust");
        skills.put(3, "Solidity");
        skills.put(4, "Go");

        System.out.println(skills);
        System.out.println(skills.size());
        System.out.println(skills.get(1));
        System.out.println(skills.containsKey(3));
        System.out.println(skills.containsKey(5));

        System.out.println(skills.keySet());
        System.out.println(skills.values());
        System.out.println(skills.entrySet());


        System.out.println();


        skills.forEach((key, value) -> System.out.println(key + " :: " + value));

        System.out.println();

        skills.entrySet().forEach(x -> System.out.println(x.getKey() + " :: " + x.getValue()));

    }
}
