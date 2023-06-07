package az.iktlab.hackerrank;

import java.util.Scanner;

public class Task3 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] arr = new String[s.length()-(k-1)];

        for(int i = 0; i< arr.length; i++)
            arr[i]=s.substring(i,i+k);

        smallest = arr[0];
        largest = arr[0];
        for(int i = 1; i< arr.length; i++)
            if(largest.compareTo(arr[i])<0)
                largest= arr[i];
            else if(smallest.compareTo(arr[i])>0)
                smallest= arr[i];

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

