package Calisma;
import java.util.Scanner;

public class Shoppinglist {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");

        String item1 = scan.next();
        Double price1 = scan.nextDouble();
        int count1 = scan.nextInt();
        double totalPrice1= price1* count1;
        System.out.println("Enter Item2, count and its price:");

        String item2= scan.next();
        Double price2 = scan.nextDouble();
        int count2 = scan.nextInt();
        double totalPrice2= price2* count2;
        System.out.println("Enter Item3, count and its price:");

        String item3= scan.next();
        Double price3 = scan.nextDouble();
        int count3 = scan.nextInt();
        double totalPrice3= price3* count3;

        String report = "";
        double totalPrice;
        if (count1 <= 0) {
            report = ("Item2: " + item2 + " Price: " + totalPrice2 + ", Item3: " + item3 + " Price: " + totalPrice3);
            totalPrice = totalPrice2 + totalPrice3;
        } else if (count2 <= 0) {
            report = ("Item1: " + item1 + " Price: " + totalPrice1 + ", Item3: " + item3 + " Price: " + totalPrice3);
            totalPrice = totalPrice1 + totalPrice3;
        } else if (count3 <= 0) {
            report = ("Item1: " + item1 + " Price: " + totalPrice1 + ", Item2: " + item2 + " Price: " + totalPrice2);
            totalPrice = totalPrice2 + totalPrice1;
        } else {
            report = ("Item1: " + item1 + " Price: " + totalPrice1 + ", Item2: " + item2 + " Price: " + totalPrice2 + " Item3: " + item3 + " Price: " + totalPrice3);
            totalPrice = totalPrice1 + totalPrice2 + totalPrice3;
        }

        System.out.println(report);
        System.out.println("Total price: " + totalPrice);

    }
}