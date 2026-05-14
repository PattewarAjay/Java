import java.util.ArrayList;
import java.util.Collection;

public class Demo{
    public static void main(String[] args) {
        Collection<Integer> obj = new ArrayList<Integer>();

        obj.add(10);
        obj.add(23);
        obj.add(43);

        // for(Object n : obj){
        //     int num = (Integer)n;
        //     System.out.println(num);
        // }
        
        for(int n : obj){
            System.out.println(n);
        }
        
    }
}