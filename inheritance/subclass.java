package inheritance;

import access.pvt;

public class subclass extends pvt{

    public subclass(int num, String name){
        super(num,name);
    }
    public static void main(String[] args){
        subclass a2 = new subclass(504, "ajayyyyy");
        System.out.println(a2.num);
    }
}