import java.util.*;

class ArrayListAllOperation {
    public static void main(String[] args) {
        /*
         * 
         * Some Key Points of ArrayList
         * 1. ArrayList is Resizable Array or Growable Array
         * 2. ArrayList Duplicates are Allowed
         * 3. Insertion Order is Preserved
         * 4. Herterogeneous objects are allowed
         * 5. Null insertion is possible
         * 
         */

        /*
         * Some basic Operations on the ArrayList are listed
         * 
         * 1. Adding element to List/Add element
         * 2. Changing elements/Set element
         * 3. Removing elements/Delete element
         * 4. Iterating elements
         * 5. get elements
         * 6. add element in between two number
         * 7. Sorting elements
         * 8. ArrayList size
         * 
         */

        /*
         * Adding Elements
         * add() method
         * 
         */

        // Creating an Array of string type
        ArrayList<Integer> arr = new ArrayList<>();

        // Adding elements to ArrayList
        // Custom inputs
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(98);
        arr.add(6);

        // Here we are mentioning the index
        // at which it is to be added

        arr.add(1, 5);

        // Printing all the elements in an ArrayList
        System.out.println(arr);

        /*
         * Changing Elements
         * set() method
         * 
         */

        arr.set(0, 1000);
        System.out.println("Updated array is : " + arr);

        /*
         * 
         * Removing Elements
         * remove() method
         * 
         */
        // In remove we have to mention index
        // or in case of string it take object

        arr.remove(1);
        System.out.println("After the Object Removal " + arr);

        /*
         * Iterating the ArrayList
         * get() method
         * 
         */

        System.out.println("From using get method and for loop");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println("\nFrom for Each Loop");
        for (Integer i : arr) {
            System.out.print(i + " ");
        }

        /*
         * Get method
         */

        Integer m = arr.get(0);
        System.out.println("\nElement at index 0 is " + m);

        /*
         * Add Elements between 2 numbers
         */
        arr.add(0, 1007);
        System.out.println(arr);

        /*
         * ArrayList Sort
         * Collections.sort(arr);
         */

         Collections.sort(arr);
         System.out.println(arr);

         /*
          * Size of the element
          */

          System.out.println( arr.size());

        //   Does ArrayList allow duplicates?
        //   Yes, ArrayList allows duplicate values to be stored.
    }
}