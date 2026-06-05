import java.util.HashMap;
public class twosum{
    public static int[] twosum(int[] arr, int target){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<arr.length;i++){
            int ans = target-arr[i];

            if(map.containsKey(ans)){
                return new int[] {map.get(ans),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[] arr = {2,4,11,7,15};
        int target = 9;
        int[] result = twosum(arr,target);
        System.out.println(result[0]+" "+result[1]);
    }
}