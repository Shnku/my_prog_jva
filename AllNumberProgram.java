import java.util.Scanner;
import java.lang.Math;

public class AllNumberProgram {

    enum nolist {
        perfectno, krishnamurtyno, armstrongno
    }

    static boolean cheaker(int no, String choice) {
        int copy = no;
        int rem;
        int sum = 0;
        nolist key = nolist.valueOf(choice);

        while (copy != 0) {
            rem = copy % 10;

            switch (key) {

                case perfectno:
                    sum += rem;
                    break;
                case krishnamurtyno:
                    sum += factorial(rem);
                    break;
                case armstrongno:
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

    public static void main(String s[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("En the no to cheak: ");
        int no = scanner.nextInt();
        System.out.println("en your choice: ");
        String choice = scanner.next();

        System.out.print("is the no " + choice + " ?\t");
        System.out.println(cheaker(no, choice));

        scanner.close();
    }
}
