package Day13_StringClass;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        String firstI = fullName.substring(0,1);
        // String lastI = fullName.substring(fullName.indexOf(" ")+1) - fullName.substring(fullName.indexOf(" ")+ 2);

        System.out.println(firstI);
       // System.out.println(lastI);



    }
}
