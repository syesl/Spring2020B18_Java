package Day15_forLoop;

import java.util.Scanner;

public class Palindrome_practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("write a word");
        String word= input.nextLine();
        String reverseWord = "";

        for(int i= word.length()-1; i>=0; i--) {
            reverseWord += word.charAt(i);

        }
        System.out.println(reverseWord);

        boolean palindrome = word.equals(reverseWord);

        System.out.println(palindrome);





    }
}
