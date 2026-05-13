class thread extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("thread is running...");
            
            try{
                Thread.sleep(10);
            } catch (InterruptedException e ){
                e.printStackTrace();
            }
        }
    }
}

class trea extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("fuck youuuu");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e ){
                e.printStackTrace();
            }
        }
    }
}



public class Main{
    public static void main(String[] args){
        thread t1 = new thread();
        trea t2 = new trea();
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}