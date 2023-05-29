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
                    System.out.println("invalid input ...need integer value " + e.getMessage());
                    scanner.nextLine();
                }
            }
        }
        System.out.println("the number is : " + number);

    }
}
