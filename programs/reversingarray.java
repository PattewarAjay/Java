import java.util.Arrays;
public class reversingarray{

    public static int[] rev(int[] arr,int left,int right){
        if(left>right){
            return arr;
        }

        int temp = arr[left];
        arr[left] = arr[right-1];
        arr[right-1] = temp;
        return rev(arr,left+1,right-1);
    }
    

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] result = rev(arr,0,5);
        System.out.print(Arrays.toString(result));

    //     int[] arr = {1,2,3,4,5};
    //     int[] reversedArr = new int[arr.length];
    //     int index=0;

    //     for(int i=arr.length-1;i>=0;i--){
    //         reversedArr[index] = arr[i];
    //         index++;
    //     }

    //     for(int n:reversedArr){
    //         System.out.print(n+" ");
    //     }
    }
}