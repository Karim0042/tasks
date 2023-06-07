package az.iktlab.hackerrank;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(B.charAt(0)<A.charAt(0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        if(A.charAt(0)>='A' && A.charAt(0)<='Z'){
            System.out.print(A+" ");
        }
        else{
            char ch = (char) (A.charAt(0) -32);
            System.out.print(ch +A.substring(1,A.length())+" ");
        }
        if(B.charAt(0)>='A' && B.charAt(0)<='Z'){
            System.out.print(B+" ");
        }
        else{
            char ch = (char) (B.charAt(0) -32);
            System.out.print(ch +B.substring(1,B.length()));
        }
    }
}
