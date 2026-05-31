public class largestinarrary{
    public static void main(String[] args){
        int[] arr = {3,5,2,7,9,8,2,1};
        int largest = arr[0];

        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            System.out.println(largest);
        }

         System.out.println(largest);

    }
}