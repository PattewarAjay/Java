import java.util.Arrays;

public class zerostolast{
    public static void optimal(int[] arr){
        int i = 0;
        
    
        while(i<arr.length){
            if(arr[i]==0){
                break;
            }
            i++;
        }

        if(i==arr.length){
            return;
        }

        int j = i+1;

        while(j<arr.length){
            if(arr[j]!=0){
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args){
        int[] arr = {1,0,4,5,0,0,2,4,1};
        optimal(arr); 
        System.out.print(Arrays.toString(arr));
    }
}