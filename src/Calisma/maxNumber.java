package Calisma;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String words[] = new String[5];
        // write your code
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
        int maxIndex = 0;
        int maxlength = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxlength) {
                maxIndex = i; maxlength = words[i].length();

            }
        }
        System.out.println(words[maxIndex]);
    }
}


