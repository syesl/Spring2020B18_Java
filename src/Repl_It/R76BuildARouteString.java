package Repl_It;

import java.util.Scanner;

/*
Write a program that will print out route instructions. Your program should take 2 parameters: start point and end point. Use left, right, up and down for navigation. Insert ">" between commands. If start point equals to end point - display: "start/end(start or end variable!) found".
Note: you may move only clock wise.
Example:
Input: A
Input: D
Output: right > down > left: D found

Input: C
Input: C
Output: C found
 */
public class R76BuildARouteString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is start point?");
        String start = scan.next();
        System.out.println("What is end point?");
        String end = scan.next();
        if (start.equalsIgnoreCase("a") && end.equalsIgnoreCase("d")) {
            System.out.println("right > down > left : D found");
        } else if (start.equalsIgnoreCase("b") && end.equalsIgnoreCase("d")) {
            System.out.println("down > left : D found");
        } else if (start.equalsIgnoreCase("a") && end.equalsIgnoreCase("c")) {
            System.out.println("right > down : C found");
        } else if (start.equalsIgnoreCase("a") && end.equalsIgnoreCase("b")) {
            System.out.println("right : B found");
        } else if (start.equalsIgnoreCase("b") && end.equalsIgnoreCase("c")) {
            System.out.println("down > left : D found");
        } else if (start.equalsIgnoreCase("b") && end.equalsIgnoreCase("a")) {
            System.out.println("down > left >up : A found");
        } else if (start.equalsIgnoreCase("a") && end.equalsIgnoreCase("a")) {
            System.out.println("A found");
        } else if (start.equalsIgnoreCase("b") && end.equalsIgnoreCase("b")) {
            System.out.println("B found");
        } else if (start.equalsIgnoreCase("c") && end.equalsIgnoreCase("c")) {
            System.out.println("C found");
        } else if (start.equalsIgnoreCase("d") && end.equalsIgnoreCase("d")) {
            System.out.println("D found");
        } else if (start.equalsIgnoreCase("c") && end.equalsIgnoreCase("d")) {
            System.out.println("left : D found");
        } else if (start.equalsIgnoreCase("c") && end.equalsIgnoreCase("a")) {
            System.out.println("left > up : A found");
        } else if (start.equalsIgnoreCase("c") && end.equalsIgnoreCase("b")) {
            System.out.println("left > up > right : B found");
        }


    }


}
