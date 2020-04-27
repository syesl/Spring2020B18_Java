package Day21_MultiDimensionalArrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        for (int eachElement : nums) {
            System.out.println(eachElement);
        }
//When do we use it: whenever we don't need to provide index numbers.
        String[] students = {"Muhtar", "Asiya", "Murodil"};
        for (String eachstudent : students) {
            System.out.println(eachstudent);
            // you must have data structure. bunu calistirmak icin data st. siz calismaz.
        }
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(arr1); // [1,2,3,4,5,6,7,8,9,10]
        for (int each : arr1) {
            if (each < 5) {
                continue;
            }

            System.out.println(each);
        }

        System.out.println("-----------------------------------");
        String sentence = "I like Java"; // Java like I
String[] words = sentence.split(""); // [I,like,Java]
        for (String eachword: words) { // 0~2
            System.out.print(eachword);
        }
        System.out.println();
        System.out.println("---------------------------------");

        String sentence1 = "I like Java";
        for (int i= words.length-1; i >=0; i--){
                System.out.print(words[i]);    }






    }
}
