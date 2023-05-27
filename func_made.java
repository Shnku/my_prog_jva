class func_made {

    static void func() { // making this ststic fix all...
        System.out.println("insidr func");
    }

    public static void main(String[] args) {
        System.out.println("\ncalling function....\n");

        func_made.func(); // ? if do this..
        // calling function....
        // insidr func

        // func();
        // !Cannot make a static reference to the non-static method func() from the type
        // func_made
        // func_out_of_class(); //!error....
    }

}

// void func_out_of_class(){
// System.out.println("out of class func...\n");
// /*func_made.java:17: error: class, interface, enum, or record expected
// void func_out_of_class(){
// func_made.java:19: error: class, interface, enum, or record expected
// }
// */
// }
