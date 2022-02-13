package datatypes;
import java.util.Scanner;

/**
 * @author Husna Maulana
 * @version 1.0
 * @since 2022-02-11
 */
public class datatypes {

/**
* <h1>Input Format</h1>
* The first line contains an integer, T, denoting 
* the number of test cases. Each test case, T, is 
* comprised of a single line with an integer, n, 
* which can be arbitrarily large or small.
* 
* <h2>Output Format</h2>
* For each input variable n and appropriate 
* primitive dataType, you must determine if 
* the given primitives are capable of
* storing it.
*
     * @param args
*/
    public static void main(String args[]) {
        // TODO code application logic here
        // create a new scanner
        Scanner keyboard = new Scanner(System.in);
        int x=keyboard.nextInt();
        
        //for one or more appropriate primitive dataType
        for(int i=0;i<x;i++){
          try {
              long n=keyboard.nextLong();
              System.out.println(n+" can be fitted in:");
              
              if(n>=-128 && n<=127)System.out.println("* byte");
              if(n>=-32768 && n<=32767)System.out.println("* short");
              if(n>=-2147483648 && n<= 2147483647)System.out.println("* int");
              if(n>=-9223372036854775808L && n<= 9223372036854775807L)System.out.println("* long");
          }  
          
          //if the number cannot be stored in one of the four aforementioned primitives
          catch(Exception e){
              System.out.println(keyboard.next()+" can't be fitted anywhere.");
          }
        }
    }
}
