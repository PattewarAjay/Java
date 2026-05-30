import java.util.ArrayList;
public class factors{
    public static void main(String[] args){
        // int num = 20;
        // int[] arr = new int[10];
        // int index = 0;

        // for(int i=1;i<num;i++){
        //     if(num%i==0){
        //         arr[index] = i;
        //         index++; 
        //     }
        // }
        // // int result = Arrays.toString(arr);
        // // System.out.println(Arrays.toString(arr));

        // for(int n:arr){
        //     System.out.print(n);
        // }


        int num = 20;
        ArrayList<Integer> arr = new ArrayList<>();
        // int index = 0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                arr.add(i); 
            }
        }
        // int result = Arrays.toString(arr);
        // System.out.println(Arrays.toString(arr));

        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}