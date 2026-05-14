import java.util.ArrayList;
import java.util.List;

public class Demo2{
    public static void main(String[] args) {
        List<Integer> obj = new ArrayList<Integer>();

        obj.add(10);
        obj.add(23);
        obj.add(43);

        System.out.println(obj.get(2));
        System.out.println(obj.indexOf(10));
        
        for(int n : obj){
            System.out.println(n);
        }
        
    }
}