package az.iktlab.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class task5 {
    static boolean isAnagram(String a, String b) {
        char[] A = a.toCharArray();
        char [] B =b.toCharArray();
        sort(A);
        sort(B);
        String ss = Arrays.toString(A);
        String ss1 = Arrays.toString(B);
        if (ss.equals(ss1)){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

