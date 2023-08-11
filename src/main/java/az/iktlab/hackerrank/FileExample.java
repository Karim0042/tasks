package az.iktlab.hackerrank;

import az.iktlab.hackerrank.Prsn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Acer\\IdeaProjects\\task\\docs\\people.json");
        try {
            Scanner sc = new Scanner(file);
               /* sc.next().substring(1);
           String s =  sc.nextLine().split(",")[0];*/
            int tmp = 0;
            List<String>params  = new ArrayList<>();
            List<Prsn>prsns  = new ArrayList<>();
            while (sc.hasNext()){

                sc.next().substring(1);
                String s = sc.nextLine().split(",")[0];
                if (s != "") {
                    String s1 = s.substring(1);
                    if (tmp!=2){
                        s1 = s1.substring(1,s1.length()-1);
                    }
                   params.add(s1);
                   tmp++;
                }
                if (tmp==5){
                    prsns.add(new Prsn(params.get(0),params.get(1),Integer.parseInt(params.get(2)),params.get(3),params.get(4)));
                    params.clear();
                    tmp=0;
                }

            }
            for (String s:params) {

            }
            System.out.println(prsns);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
