package com.company;

import java.util.Scanner;

public class getInputs {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.println("Enter your name : ");

        String name = sc.nextLine();

        System.out.println("Your name is : " + name);
    }
}
