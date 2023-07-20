// import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        sc.close();
        try  {
            if (h>0 && b>0) {
            System.out.println((int)(b*h));
                
            }else throw new Exception();
        }
        catch(Exception e){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}

/*problem statement: 
If both values are greater than zero, 
  then the main method must output the area of the parallelogram. 
Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.*/

//output:
// 1 3 
// 3

//-1 3
//.............
