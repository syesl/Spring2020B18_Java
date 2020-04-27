package Day26_MethodOverloading;

public class MethodOverloading4 {
    public static void main(String[] args) {
        System.out.println("String");
        // eger boyle 3 tane overload yaparsak original olan print out oluyor

    }

    public static void main(double[] args) {
        System.out.println("Double");
    }

    public static void main(int[] args) {
        System.out.println("Int");
    }
}
