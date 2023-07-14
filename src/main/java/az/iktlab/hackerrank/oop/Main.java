package az.iktlab.hackerrank.oop;

public class Main {
    public static void main(String[] args) {
        Family f = new Family(new Human("solmaz", "asadova", 1980, 100, null), new Human("Rahim", "rhov", 1978, 123, null));
         f.addChild(new Human("kazim","rmov",2001,143,null));
        f.addChild(new Human("kazim1","rmov",2002,141,null));
        f.addChild(new Human("kazim2","rmov",2003,140,null));
        f.addChild(new Human("kazim3","rmov",2004,140,null));
        f.deleteChildByIndex(0);
        f.deleteChild(new Human("kazim3","rmov",2004,140,null));
        System.out.println(f);

    }
}
