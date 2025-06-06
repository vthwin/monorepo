package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i += 2) {
            list.add(i);
        }

        for (int val : list ) {
            System.out.print(val + " ");
        }

        // Check if an element exist in ArrayList
        if (!list.contains(3)) {
            System.out.println("3 is not found");
        }

        int index = list.indexOf(3);

        System.out.println(index);
    }
}
