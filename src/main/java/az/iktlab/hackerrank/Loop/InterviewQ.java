package az.iktlab.hackerrank.Loop;

import java.util.Scanner;

public class InterviewQ {
    public static void main(String[] args) {
           Scanner sc  =new Scanner(System.in);
           int n  = sc.nextInt();
           int c =n,d=1,z=0;
           String rep ="* ";
           String bs =" ";
        for (int i = 1; i <= 2*n; i++) {
            if (i<=n) {
                System.out.println(bs.repeat(n - i) + rep.repeat(i));
            }else {
                System.out.println(bs.repeat(z) + rep.repeat(c));
                z++;
                c--;
            }
        }
        /*for (int i = 0; i < 2*n; i++) {
            if (i<n) {
                c--;
            }else {
                c++;
            }
           if (i==n){
                c=0;
                d=n;
            }
                for (int j = 0; j <c; j++) {
                    System.out.print(" ");
                }
            for (int j = 0; j < d; j++) {
                System.out.print("*"+" ");
            }
            if (i<n){
                d++;
            }else {
                d--;
            }
            System.out.println();

        }*/

        }
    }

