public class star{
    public void square(int n){
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pat2(int n){
        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        star obj =new star();
        obj.pat2(5);
    }
}