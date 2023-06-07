package az.iktlab.hackerrank;

import java.util.Random;
import java.util.Scanner;

public class GitHub {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hello");
        System.out.println("***********************");
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("***********************");
        System.out.println(" begin!"+name);
        int rnd = (int) (Math.random() * 100);


        System.out.println(rnd);
        while(true){

            System.out.println("0 ile 100 arasinda eded daxil edin");

            int num = sc.nextInt();
            if(num>100 || num<0){
                System.out.println("Error");
            }

            if(num ==rnd){
                System.out.println("Tebrikler,"+name+"!");
                break;

            }else if (num<rnd && num>=0) {
                System.out.println("daxil edilen reqem kicikdir");
            }

            else if (num>rnd && num<=100) {
                System.out.println("daxil edilen reqem boyukdur");

            }
        }

    }
}
