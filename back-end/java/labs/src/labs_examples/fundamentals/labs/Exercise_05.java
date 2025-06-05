package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int strLength = str.length();

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        // IDE will highlight due to the result already known at compile time
        boolean strEquals = str.equals(str2);

        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str + str2;
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        // End every statement with semicolon (;)
        String str4 = str3.replace("hello", "NotHello");
        System.out.println(str4);

        boolean doesContain = str4.contains("!");
        System.out.println("Does contain `!`: " + doesContain);
    }


}