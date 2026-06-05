public class nums{
   
    public void pat2num(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void pat3num(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pat4num(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    int start = 1;
    public void pat10num(int n){
        for(int i=0;i<n;i++){
            if(i%2==0){
                start =1;
            } else{
                start =0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public void pat33num(int n){
        for(int i=1;i<=n;i++){
            int space = 2*(n-i);
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }

    public void pat12num(int n){
        int num =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        nums obj =new nums();
        obj.pat12num(5);
    }
}