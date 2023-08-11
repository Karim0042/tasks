package az.iktlab.Loop;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        int[] arr1= new int[t];
        int[] arr2 = new int[t];
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            arr[i] = a;
            arr1[i] = b;
            arr2[i] =n;

        }
        in.close();
        int iz;
        for (int i = 0; i < t; i++) {
            for (iz = 0; iz < arr2[i]; iz++) {
                int res = arr[i];
                int c = 1;
                for (int index = 0; index < iz + 1; index++) {
                    res = res + arr1[i] * c;
                    c = c * 2;
                    // System.out.print(res+" ");
                }
                System.out.print(res + " ");

            }
            System.out.println();
        }
    }
}
