package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        String username = "admin";
        String password = "superSecret123";

        if (username != null) {
            if (!username.equals("")) { 
                System.out.println("Welcome " + username); 
            }
        }

        if (username != null) {
            if (!username.equals("")) {
                System.out.println("Welcome " + username);
            }
        }
        int result = divide(6, 0); //
        System.out.println("Result: " + result);

        String[] values = {"a", "b", "c"};
        
        System.out.println(values[5]);

        String user = null;
        System.out.println(user.toLowerCase());

        if (false) {
            System.out.println("This will never run.");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Repeat: " + i);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Repeat: " + i);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Repeat: " + i);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Repeat: " + i);
        }

        if (true) {
            System.out.println("True");
        }

        if (true) {
            System.out.println("True");
        }

        veryLongMethod(); 

        while (true) {
            
        }
    }

    public static int divide(int a, int b) {
        return a * b;
    }

    public static void veryLongMethod() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
            System.out.print("");
        }
        System.out.println("Sum is " + sum);
    }
}
