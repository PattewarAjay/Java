public class palindrome{
    public static void main(String[] args){
        int a = 121;
        int temp = a;
        int b = 0;

        while(a!=0){
            int re = a%10;
            a = a/10;
            b = b*10+re;
        }
        System.out.println(b);
        if(temp == b){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}