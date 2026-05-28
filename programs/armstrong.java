import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 9474;
        int temp = n;
        int ar = 0;
        int dig = String.valueOf(n).length();

        while(n!=0){
            int re = n%10;
            ar += Math.pow(re,dig);
            n = n/10;
        }

        if(temp == ar){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not an armstrong");
        }

    }
}