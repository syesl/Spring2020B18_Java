package Day23_Methods;
/*
Access-modifier specifier return-type methodName(){
statements;
}
 */

public class Methods {
    /*
    Access-modifer specifier return-type  methodName(){
					statements;
			}
			step1: Hello Cybertek
			step2: Hello World 5 times
			step3: Hello Btach 18
			step4: Hello World 5 times
			step5: Helle Saim
			step6: Hello World 5 times
     */

    public static void main(String[] args) {

        System.out.println("Hello Cybertek");
        printHello5();
        System.out.println("Hello Batch18");
        printHello5();
        System.out.println("Hello Saim");
        printHello5();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        evenNumbers1_100();
        OddNumbers1_100();
    }


    public static void printHello5() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

    }

    public static void evenNumbers1_100() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void OddNumbers1_100() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }







/* step1:void method (without parameter)
step2: void method(with parameter)
step3:return method (without parameter)
step4:return method (with parameter)
step5: using the method different classes
step6:overloading...

 */


    }
}