import java.util.Arrays;
public class arrangebysigns{
    public static int[] arrange(int[] arr){
        int[] res = new int[arr.length];
        int i =0;
        int j = 1;

        for(int n=0;n<arr.length;n++){
            if(arr[n]>=0){
                res[i]=arr[n];
                i += 2;
            } else{
                res[j]=arr[n];
                j +=2;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {1,2,-3,-4,-5,7,8,-9};
        int[] result = arrange(arr);
        System.out.print(Arrays.toString(result));
        // arrange(arr);
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }
    }
}