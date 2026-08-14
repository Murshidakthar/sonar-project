package com.example;

import java.util.*;

public class App {

    public static void main(String[] args) {

        // Issue 1: Hard-coded password
        String password = "admin123";

        // Issue 2: Unused variable
        String username = "murshid";

        // Issue 3: Duplicate code
        int a = 10;
        int b = 20;
        int result1 = a + b;

        int x = 10;
        int y = 20;
        int result2 = x + y;

        // Issue 4: Empty catch block
        try {
            int number = 10 / 0;
        } catch (Exception e) {
        }

        // Issue 5: Null pointer possibility
        String name = null;

        if (name.equals("Murshid")) {
            System.out.println("Hello Murshid");
        }

        // Issue 6: System.out.println
        System.out.println("Result: " + result1);
        System.out.println("Result: " + result2);

        // Issue 7: TODO
        // TODO: Fix security issue later

        // Issue 8: Inefficient loop
        List<String> users = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            users.add("User " + i);
        }

        for (String user : users) {
            System.out.println(user);
        }
    }
}
