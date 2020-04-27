package Day23_Methods;

public class UniqueValues {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "A","C","D"};
        for (String each : arr) { // 3: A B A
            int count2 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(each)) {
                    count2++;

                }
            }
            if (count2 == 1) {
                System.out.println(each);
            }
        }
            System.out.println("====================================");
            //solution 2
            for (String each2 : arr) {
                int count = 0;
                for (String each : arr) {
                    if (each.equals(each2)) {
                        count++;
                    }
                }
                if (count == 1) {
                    System.out.println(each2);
                }
            }


    }
}
