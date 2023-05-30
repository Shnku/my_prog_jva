package trycatchscopejavacpp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Propertrycatch {
    static int number;

    public static void main(String[] args) {

        // int number; //?cause var not initialize problem...
        boolean stop = false;
        try (Scanner scanner = new Scanner(System.in)) {

            while (!stop) {
                try {
                    System.out.println("ener ana integer : ");
                    number = scanner.nextInt();
                    System.out.println("you entered :" + number);
                    stop = true;
                } catch (InputMismatchException e) {
                    System.out.println("invalid input ...need integer value " + e);
                    scanner.nextLine(); // ?without this fall infinite lkoop..
                    // scuse it clears previous buffers...
                    /*
                     * Without scanner.nextLine(), 
                     * the loop would enter an infinite loop because the
                     * invalid input would keep triggering the exception repeatedly.
                     */
                }
            }
        }
        System.out.println("the number is : " + number);

    }
}

// output...
/*
 * ava Propertrycatch.java
 * ener ana integer :
 * rt
 * invalid input ...need integer value java.util.InputMismatchException
 * ener ana integer :
 * 5
 * you entered :5
 * the number is : 5
 * >
 */
