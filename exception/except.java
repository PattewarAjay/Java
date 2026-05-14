import java.util.InputMismatchException;
import java.util.Scanner;

public class except{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = 10;
            int b = sc.nextInt();
            if(b == 0){
                throw new ajayexception("youuuuu beeaatchhhh");
            }
            int result = a / b;
            System.out.println("Result: "+ result);
        
        } catch (ajayexception e) {
            
            System.out.println("fuccckkkk"+ e.getMessage());
        
        } catch (InputMismatchException e) {
            
            System.out.println("Please enter only numbers."+e);

        } finally {
            
            System.out.println("This block will always execute.");
            sc.close();
        }
    }}