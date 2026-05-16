public class insertion{
    public static void main(String[] args){
        int[] arr = {3,1,8,2,9,5};
        int size = arr.length;
        for(int i=1; i<size; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int nums : arr){
            System.out.print(nums+" ");
        }
    }
}