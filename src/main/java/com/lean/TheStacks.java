package com.lean;

import java.util.Stack;

public class TheStacks {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        num.add(1);
        num.add(12);
        num.add(14);
        num.add(13);
        num.add(5);

        System.out.println(num);

        System.out.println();


        num.push(1);
        num.push(14);
        num.push(4);
        num.push(2);

        System.out.println(num);
        System.out.println(num.size());
        System.out.println(num.peek());
        System.out.println(num.pop());
        System.out.println(num.size());
        System.out.println(num.empty());
        System.out.println(num);

        System.out.println();

        System.out.println(num.remove(1));
        System.out.println(num.size());

        System.out.println();

        num.clear();
        System.out.println(num);
        System.out.println(num.size());
        System.out.println(num.empty());


    }
}
