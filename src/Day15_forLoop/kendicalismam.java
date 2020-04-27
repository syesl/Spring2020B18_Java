package Day15_forLoop;

public class kendicalismam {
    public static void main(String[] args) {
       /* for (int i=99 ; i>=1; i-=2) {
            System.out.println("" + i);


        }*/

       /*
        for (int i = 0; i < 50; i++) {
       System.out.println("" + (100 - (2 * i + 1)));


        }

        */

       for (int i=1; i<100; i++){
           if(i%3==0 && i%7 == 0){
               System.out.println(""+i);
           }
       }
    }
}



