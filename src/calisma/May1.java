package calisma;

import java.util.Scanner;

public class May1 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter email");
            String email = scan.next();


            if(email.contains("_")){
                String firstname=""+email.substring(email.indexOf("_")+1,email.indexOf("@"));
                String lastname=""+email.substring(0,email.indexOf("_"));
                System.out.println(firstname+"_"+lastname+"@gmail.com");
            }else{
                System.out.println(email);
            }
        }
    }