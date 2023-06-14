package az.iktlab.hackerrank;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int begin = 0,fib;
        int ls=1;
        sc.close();
        System.out.print(0+",");
        while(true){

            fib = begin+ls;//1,2
            if (fib>num)
                break;
            System.out.print( fib+",");
            begin =ls;
            ls = fib;//1,

            //begin =ls;//1,
            //System.out.print("," +fib);

        }
    }
}
