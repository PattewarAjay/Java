import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class divisiors{
    public void divisors(int n){
        List<Integer> lst = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                lst.add(i);
                if((n/i)!=i){
                    lst.add(n/i);
                }
            }
        }
        Collections.sort(lst);
        // lst.sort(null);
        System.out.println(lst);
    }
    public static void main(String[] args){
        divisiors d = new divisiors();
        d.divisors(10);
    }
}