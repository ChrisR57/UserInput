package com.learningjavaprogrammingcrashcourse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name +"\nHow old are?");
//        var age = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
//        int age = scanner.nextInt();
//        double age = Double.parseDouble(scanner.nextLine());
        System.out.println(name + " is " + age + " years old");



        scanner.close();
    }
}
