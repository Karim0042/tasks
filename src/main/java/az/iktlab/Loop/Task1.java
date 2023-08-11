package az.iktlab.Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int index = 1; index <= 10; index++) {
            System.out.println(N+" x "+index+" = "+ N*index);
        }
        bufferedReader.close();
    }
}
