package az.iktlab.hackerrank;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] arr =A.toCharArray();
        boolean ff =true;
        for(int i=0;i<A.length();i++){
            if(arr[i] != arr[arr.length-i-1])
            {
                System.out.println("No");
                ff= false;
                break;
            }
        }
        if(ff){
            System.out.println("Yes");
        }
    }
}
