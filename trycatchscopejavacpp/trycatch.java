package trycatchscopejavacpp;

import java.util.Scanner;

class trycatch {
    public static void main(String args[]) {

        int a, b;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b = sc.nextInt();

        }

        System.out.println(" a= " + a + b);

        // catch(...){ //?cant do in java..
        // System.out.println("catching all os exception at end..");
        // }
    }
}

/*
 * java trycatch
 * trycatch.java:17: error: variable a might not have been initialized
 * System.out.println(" a= " + a + b);
 * ^
 * trycatch.java:17: error: variable b might not have been initialized
 * System.out.println(" a= " + a + b);
 */
