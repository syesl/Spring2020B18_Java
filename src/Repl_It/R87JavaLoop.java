package Repl_It;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class R87JavaLoop {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.indexOf("java")==0||word.indexOf("java")==1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    }

