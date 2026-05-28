public class factorial{

    public static int facc(int num){
        int fac =1;
        for(int i=1;i<=num;i++){
            fac *= i;
        }

        return fac;

    }
    public static void main(String[] args){
        // factorial obj = new factorial();
        // int result = obj.facc(5);

        int result = facc(5);
        System.out.println(result);


        // int n = 5;
        // int fac =1;
        // for(int i=1;i<=n;i++){
        //     fac *= i;
        // }

        // System.out.println(fac);
    }
}