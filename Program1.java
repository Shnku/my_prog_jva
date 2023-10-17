class Program1 {
    public static void main(String args[]) {
        int a = 5;
        char b = '4';

        for (int i = 0; i < a; i++) {
            System.out.println(b + "" + a);
            b++;
        }
    }
}

// out
/*
 * 45
 * 55
 * 65
 * 75
 * 85
 */
