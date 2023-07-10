package az.iktlab.hackerrank.Loop;

import java.util.Arrays;
import java.util.Collections;

public class InterviewQ {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //0,1,2  |  2,1,0  |  0,1,2  arr[1][0]
        //3,4,5  |  5,4,3  |  3,4,5
        Integer[] step = {0, 1, 2};
        for (int i = 0; i < 3; i++) {
            int temp = 0;
            System.out.print(arr[i][step[temp] % 3]+" ");
            temp++;
            System.out.print(arr[i][step[temp] % 3] + " ");//2,5
            temp++;
            System.out.print(arr[i][step[temp] % 3] + " ");//3,
            Collections.reverse(Arrays.asList(step));
        }
    }
}
