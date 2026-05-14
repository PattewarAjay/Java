
import java.util.HashMap;
import java.util.Map;

public class map{
    public static void main(String[] args) {
        Map<String, Integer> obj = new HashMap<String, Integer>(); //TreeSet for sorted values

        obj.put("ajay",99);
        obj.put("Hema", 96);
        obj.put("Sai", 95);

        System.out.println(obj.get("ajay"));       
        System.out.println(obj.keySet());
        System.out.println(obj.values());


        for(String n : obj.keySet()){
            System.out.println(n + " got " + obj.get(n) + " Marks");
        }
        
    }
}