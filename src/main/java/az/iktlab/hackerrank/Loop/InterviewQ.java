package az.iktlab.hackerrank.Loop;

public class InterviewQ {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //0,1,2  |  2,1,0  |  0,1,2  arr[1][0]
        //3,4,5  |  5,4,3  |  3,4,5
        Integer[] index = {0, 1, 2};
        Integer[] step = {2, 1, 0};
        Integer[] tmp = new Integer[index.length];
        for (int i = 0; i < 3; i++) {
            int temp = 0;
            System.out.print(arr[i][index[temp]] + " ");
            temp++;
            System.out.print(arr[i][index[temp]] + " ");//2,5
            temp++;
            System.out.print(arr[i][index[temp]] + " ");//3,
            tmp = index;
            index = step;
            step = tmp;
            //Collections.reverse(Arrays.asList(index));

        }
    }
}
