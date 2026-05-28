public class largest{
    public static void main(String[] args){
        int a = 2;
        int b = 8;
        int c = 6;
        if(a>=b && a>=c){
            System.out.println(a + " is the largest number");
        } else if(b>=a && b>=c){
            System.out.println(b + " is the largest number");
        } else {
            System.out.println(c + " is the largest number");
        }
    }
}