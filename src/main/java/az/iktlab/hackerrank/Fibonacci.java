package az.iktlab.hackerrank;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fibonacci(num);
        /*int begin = 0, end = 1;
        //0,1,2,5,12,29
        while (begin <= num) {
            System.out.println(begin);//0,1,
            int tmp = begin;
            begin = end;//1,2
            end = 2 * end + begin;//2
        }*/
    }

    private static void fibonacci(int num) {
        int begin = 0, fib;
        int ls = 1;
        System.out.print(0 + "," + 1 + ",");
        while (true) {
            fib = begin + 2*ls;//1,2
            if (fib > num)
                break;
            System.out.print(fib + ",");
            begin = ls;
            ls = fib;//1,

        }
    }
}
