package Repl_It;
import java.util.Scanner;
/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.
Example:
input: xHiX
output: Hi
Example:
input: apple
output: apple
input: xUxL
output: UxL
input: JavaX
output: Java
 */
public class R75WithoutX_XString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        if (word.contains("x")||word.contains("X")) {
            System.out.println(word.replace("x","").replace("X",""));
        } else {
            System.out.println(word);



        }
    }
}
