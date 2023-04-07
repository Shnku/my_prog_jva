public class func_nonstatic {
    public static void main(String[] args) {
        System.out.println("\n lets call a function.....");

        func_nonstatic object = new func_nonstatic();
        object.function(); //now this is correct....
    }

    void function() {
        System.out.println("this is a func inside you rae.");
    }
}
