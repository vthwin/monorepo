package labs_examples.datatypes_operators.examples;

/*
   Compute the number of cubic inches
   in 1 cubic mile.
*/
class Inches {
    public static void main(String args[]) {

        // Variable declarations
        long ci;
        long im;

        // Variable assignments
        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("There are " + ci +
                " cubic inches in cubic mile.");

    }
}