public class backtrack{
    public void back(int i,int n,int fac){
        // if(i>n){
        //     return;
        // }
        // back(i+1,n);
        // System.out.println(i);

        if(i>n){
            System.out.print(fac);
            return;
        }
        back(i+1,n,fac*i);
    }
    public static void main(String[] args){
        int n = 5;
        backtrack obj = new backtrack();
        obj.back(1,n,1);
    }
}