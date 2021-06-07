/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int legalAge = 16;

        Scanner jb = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = jb.nextInt();

        String output = (age >= legalAge ? "You are old enough to legally drive."
                : "You are not old enough to legally drive" );

        System.out.println(output);
    }
}
