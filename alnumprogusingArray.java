import java.util.Scanner;

public class alnumprogusingArray {

    static String nolist[] = { "perfectno", "krishnamurtyno", "armstrongno" };

    static boolean cheaker(int no, int choice) {
        int copy = no;
        int rem;
        int sum = 0;

        while (copy != 0) {
            rem = copy % 10;

            switch (choice) {

                case 0:
                    sum += rem;
                    break;
                case 1:
                    sum += factorial(rem);
                    break;
                case 2:
                    String n = String.valueOf(no);
                    int digit = n.length();
                    sum += Math.pow(rem, digit);
                    break;
                default:
                    System.out.println("en correct choice..");
                    break;
            }
            copy /= 10;
        }
        return (no == sum);
    }

    static int factorial(int rem) {
        return rem == 0 ? 1 : rem + factorial(rem - 1);
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number: ");
        int no = sc.nextInt();

        System.out.print("Available choices...: \n_");
        for (String s : nolist) {
            System.out.printf("|%s| ", s);
        }

        System.out.print("\nen yer choice: ");
        short c = sc.nextShort();

        System.out.print("is the no " + nolist[c - 1] + "?\t" + cheaker(no, c - 1));

        sc.close();
    }
}
