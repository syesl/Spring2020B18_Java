package calisma;

public class LoopDemo {
    public static void main(String[] args) {
        //For
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("bitti");
        // While blogunda kullanmak icin yeni bir i tanimlamam gerekir
        int i = 2;
        while (i < 10) { // bir ondan kucukmu?i,bir ondan kucukmu?i diyerek sonsuza kadar devam eder

            System.out.println(i);
            i+=2;
        }

        System.out.println("while bitti");
        //Do-While
        int j=100;
        do{
            System.out.println(j);
            j+=2;

        }while(i<10);
        System.out.println("Do-While bitti");
    }
}
