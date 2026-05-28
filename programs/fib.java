public class fib{
    public static void main(String[] args){
        int a =0;
        int b = 1;
        int n = 10;

        for(int i=1; i<=n;i++){
            int c = a+b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }

}