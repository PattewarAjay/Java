public class sumofdig{
    // public static void summ(int a)
    public void summ(int a){ 
        int sum =  0;

        while(a!=0){
            int re = a%10;
            sum = sum+re;
            a = a/10;
        }
        System.out.println(sum);
    } 
    public static void main(String[] args){

        // calling by obj

        sumofdig obj = new sumofdig();
        obj.summ(123);

        // calling directly static method
        // summ(1234);
        
        // no method directly in main
        // int a = 1234;
        // int sum =  0;

        // while(a!=0){
        //     int re = a%10;
        //     sum = sum+re;
        //     a = a/10;
        // }
        // System.out.println(sum);
    }
}