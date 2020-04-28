package Day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer>list1= new ArrayList<>();
        list1.add(5); //0
        list1.add(7); //2
        list1.add(8);  //3

        list1.add (1,6); //1
                 // {5,6,7,8}
        // list1.add(7,10) // index out of bound

        list1.set(3,9);  // new object take the old one place...
        // set(index,object):replaces the original object at given object replacing.
        // index with the new given object replacing.

        System.out.println(list1);

        int [] arr = {1,2,3,4};
        arr[3]=5;

        ArrayList<String>list2= new ArrayList<>();
        list2.add("A");  //{A}
        list2.add("B");  //{A,B}
        list2.add(1,"C");   //{A,C,B}
        list2.add(1,"D");   //{A,D,C,B}

// SET METHOD
        list2.set(3,"F");  // {A,D,C,F}
        list2.set(2,"E");   //{A,D,E,F}
        System.out.println(list2);  //{A,D,E,F} olmasini istiyoruz
        System.out.println("=====================================");
   // REMOVE METHODS
        ArrayList<Integer>list3= new ArrayList<>();
        list3.add(1); //0
        list3.add(2); //1
        list3.add(3); //2
        list3.add(4); //3
        int a =3;
        list3.remove(a);
        System.out.println(list3);
        Integer b=1;
        list3.remove(b);
        System.out.println(list3);




/*iki cesit remove method var.
      remove(int: index) replaces the original object at the given index with new given replacing.

        remove(object): given object will be removed.
     */


    }
}
