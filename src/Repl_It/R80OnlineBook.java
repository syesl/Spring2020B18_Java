package Repl_It;
import java.util.Scanner;
public class R80OnlineBook {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Premium customer?");
        boolean isPremiumCustomer = scan.nextBoolean();
        System.out.println("How many books?");
        int n = scan.nextInt();
        if (isPremiumCustomer) {
            if (n>=5&& n<8) {
                freeBooks += 1;
            }
            if (n >=8) {
                freeBooks += 2;
            }
        }else{
            if(n>=7&&n<12){
                freeBooks += 1;
            }else if (n>=12){
                freeBooks += 2;
            }
        }

        System.out.println(freeBooks);

    }
}
