package trycatchscopejavacpp;

import java.util.Scanner;

class onlytry {

    int var2, var3;
    static int stat;

    onlytry(int var2, int var3) {
        this.var2 = var2;
        this.var3 = var3;
    }

    onlytry(int stat) {
        onlytry.stat = stat;
    }

    // this is the main function......
    public static void main(String[] args) {
        int v1, v2;
        System.out.println("tnter two integer: ");

        try (Scanner sc = new Scanner(System.in)) {
            v1 = sc.nextInt();
            // int v2 = sc.nextInt(); //! v2 cannot be resolved to a variable
            v2 = sc.nextInt();
        }
        onlytry foo = new onlytry(v1, v2);

        // catch (Exception e) { //Syntax error on token "catch", invalid
        // RecordHeaderName
        // System.out.println("input type errr....");
        // }

    }
}
