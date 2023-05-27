package trycatchscopejavacpp;

import java.util.Scanner;

/**
 * trycatch_scanner
 */
public class trycatch_scanner {

    public static void main(String args[]) {
        int var1, var2;
        System.out.println("enter values of  var1,var2: ");
        try (Scanner sc = new Scanner(System.in)) {
            var1 = sc.nextInt();
            var2 = sc.nextInt();
        }
        // catch (Exception e) {
        // System.out.println("wrong input error..");
        // }

        System.out.println("LETS CALL THE FUNC\n");
        trycatch_scanner foo = new trycatch_scanner();
        foo.function(var1, var2);
        // !problem: The local variable var1 may not have been initialized...

    }

    void function(int v1, int v2) {
        System.out.println("the values of var1= " + v1 + " var2= " + v2);
    }
}
