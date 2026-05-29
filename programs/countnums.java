import java.util.Scanner;

public class countnums{
    public static void main(String[] args){
        // int n = 1328390;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while(n>0){
            n = n/10;
            count++;
        }

        System.out.println(count);
    }
}