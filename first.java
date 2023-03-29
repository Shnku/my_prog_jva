
import java.util.Scanner;

class first {
    public static void main(String args[]) {
        System.out.println("\nthis is a simple java program..");
        System.out.println("first.main()");
        System.out.println("\n en the input: ");

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("value of input is: " + x);

        System.out.println("ebter a string type: ");
        try (Scanner second = new Scanner(System.in)) {
            String a = second.nextLine();
            System.out.println("the string is: " + a + " pre val is" + x);
        }

    }
}
