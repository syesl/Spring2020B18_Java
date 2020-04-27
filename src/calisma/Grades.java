package calisma;

import java.util.Scanner;
/* 90+ AA
80-90 BB
70-90 CC
70-F
 */

public class Grades {
    public static void main(String[] args) {
        System.out.println("Please enter your grade");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i >= 90) {
            System.out.println("AA");
        } else if (i >= 80 ) {
            System.out.println("BB");
        } else if ( i >= 70) {
            System.out.println("CC");
        } else {
            System.out.println("F");

        }
    }
}