package Day14_StringContinue;

import java.util.Scanner;
/*
 2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */
public class combineTwoString2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.next();
        word1 = word1.substring(1);
        System.out.println("Enter second word");
        String word2 = input.next();
        word2 = word2.substring(1);

        String result = word1.concat(word2);

        System.out.println(result);


    }
}