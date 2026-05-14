
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set{
    public static void main(String[] args) {
        Set<Integer> obj = new HashSet<Integer>(); //TreeSet for sorted values

        obj.add(1);
        obj.add(3);
        obj.add(4);
        obj.add(1);

        Iterator<Integer> val = obj.iterator();
        
        while(val.hasNext()){
            System.out.println(val.next());
        }

        
        // System.out.println(obj);
        // for(int n : obj){
        //     System.out.println(n);
        // }
        
    }
}