public class bubble{
    public static void main(String[] args){
        
        int[] arr = {5,2,1,6,9,3};
        int temp = 0;
        int size = arr.length;
        for(int i = 0; i<size; i++){
            for(int j=0; j<size-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        for(int nums : arr){
            System.out.print(nums + " ");
        }
        
    }
}