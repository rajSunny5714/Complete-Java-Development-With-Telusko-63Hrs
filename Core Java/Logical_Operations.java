public class Logical_Operations {
    public static void main(String[] args) {
        //Declare integer variables
        int a = 10;
        int b = 20;
        int c = 10;

        //Logical AND (&&)
        System.out.println((a < b) && (a == c));

        //Logical OR (||)
        System.out.println((a > b) || (a == c));

        //Logical NOT (!)
        System.out.println(!(a > b));

        //More logical operations
        System.out.println((a <= b) && (b >= c));
        System.out.println((a != b) || (b == c));
        System.out.println(!(a == b));

        // boolean a = true;
        // boolean b = false;

        // //Logical AND
        // boolean result1 = a && b;
        // System.out.println("a && b = " + result1);

        // //Logical OR
        // boolean result2 = a || b;
        // System.out.println("a || b = " + result2);

        // //Logical NOT
        // boolean result3 = !a;
        // System.out.println("!a = " + result3);

        // //Another Logical NOT
        // boolean result4 = !b;
        // System.out.println("!b = " + result4);

        // //Combined logical operation
        // boolean result5 = (a && b) || !b;
        // System.out.println("(a && b) || !b = " + result5);
    }
}
