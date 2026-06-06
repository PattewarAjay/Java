public class chara{
    public void pat2(int n){
        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pat3(int n){
        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+(n-i-1);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void pat4(int n){
        for(int i=0;i<n;i++){
            char ch = (char)('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }


    public void pat5(int n){
        for(int i=0;i<n;i++){

            int breakpoint =(2*i+1)/2;
            char ch = 'A';
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=(2*i+1);j++){
                System.out.print(ch);
                if(j<=breakpoint){
                    ch++;
                }else{
                    ch--;
                    // System.out.print(ch+" ");
                }
                // System.out.print(ch);
                // ch++;

            }

            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public void pat6(int n){
        for(int i=0;i<n;i++){
            for(char j=(char)('E'-i);j<='E';j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args){
        chara obj =new chara();
        obj.pat6(5);
    }
}