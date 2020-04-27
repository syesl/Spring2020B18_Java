package calisma;

import java.util.Scanner;

public class Calismalar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        
        int num = input.nextInt();
        System.out.println(num);

int digit1 = num/10000;
        System.out.println(digit1);

int digit2 = num%10000/1000;
        System.out.println(digit2);

int digit3 = num%1000/100;
        System.out.println(digit3);

int digit4 = num%100/10;
        System.out.println(digit4);

int digit5 = num%10;
        System.out.println(digit5);

/*
switch(num)   {
    case digit1:
        num /=10000;
    case digit2:
        num/1000;
    case digit3:
        num/100;
    case digit4:
        num/10;
    case digit5:
        num%10;


}   */

    }




}
