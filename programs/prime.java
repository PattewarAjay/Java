public class prime{
    public static void main(String[] args){
        int n = 9;
        boolean isprime = true;

        for(int i=2;i<n/2;i++){
            if(n%i==0){
                isprime = false;
                break;
            }
        }

        if(isprime){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}