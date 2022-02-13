package strings;
import java.io.*;
import java.util.Scanner;
/**
* @author Husna Maulana
* @version 1.0
* @since 2022-02-13
*/
public class Strings {
    /**
* Input Format
* The first line contains a string A.The second line 
 contains another string B.The strings are 
 comprised of only lowercase English letters.Output Format
 There are three lines of output:
 - For the first line, sum the lengths of A and B.- For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.- For the third line, capitalize the first letter in both A and and B print them on a single line, 
 separated by a space.
     * @param X
     * @param Y
     * @return 
*/
    
    public static String XLargerY(String X, String Y) {
        return X.compareTo(Y) > 0 ? "Yes" : "No";
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String X = keyboard.next();
        String Y = keyboard.next();

        System.out.println(X.length()+Y.length());
        System.out.println(XLargerY (X, Y));
        String ab=X.substring(0,1).toUpperCase();
        String ab1=Y.substring(0,1).toUpperCase();
        System.out.println(ab+X.substring(1)+" "+ab1+Y.substring(1));
    }
}

