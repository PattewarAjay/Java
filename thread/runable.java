class a implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("thread is running...");
            
            try{
                Thread.sleep(10);
            } catch (InterruptedException e ){
                e.printStackTrace();
            }
        }
    }
}

class b implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("fuck youuuu");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e ){
                e.printStackTrace();
            }
        }
    }
}



public class runable{
    public static void main(String[] args){
        Runnable t1 = new a();
        Runnable t2 = new b();
        
        Thread obj1 = new Thread(t1);
        Thread obj2 = new Thread(t2);
        obj1.start();
        obj2.start();
    }
}