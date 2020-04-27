package Day13_StringClass;

import java.util.Scanner;

public class numbertoWords2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 ~ 9");
        int num = input.nextByte();
        String result = "";
       // switch(num){
        System.out.println(result);
        String result2 = (num==0) ? "Zero" : (num ==1) ? "One" : (num==2) ? "Two" : ( num== 3)? "Three" : (num== 4) ? "Four" :(num==5) ? "Five" : (num== 6) ? "Six" : (num==7) ? "Seven" : (num==8) ? "Eight" :  (num==9) ? "Nine" :"Invalid";
        System.out.println(result2);




    }
}
