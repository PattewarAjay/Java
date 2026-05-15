public class selection{
    public static void main(String[] args){
        int[] arr = {3,1,8,2,9,5};
        int temp = 0;
        int size = arr.length;
        int minIndex = -1;
        for(int i=0; i<size-1; i++){
            minIndex = i;
            for(int j=i+1;j<size;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            for(int nums : arr){
                System.out.print(nums+ " ");
            }
            System.out.println();
        }
        System.out.println("after");
        for(int nums : arr){
            System.out.print(nums+ " ");
        }
    }
}