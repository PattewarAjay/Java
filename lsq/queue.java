public class queue{

    int queue[] = new int[5];
    int front;
    int rear;
    int size;

    public void enqueue(int data){
        if(!isfull()){
            queue[rear] = data;
            rear = (rear+1)%5;
            size++;
        } else {
            System.out.println("Queue is full");
        }
    }

    public int dequeue(){
        if(!isempty()){
            int data = queue[front];
            front= (front+1)%5;
            size--;
            return data;
        } else {
            System.out.println("Queue is empty");
            return -1;
        }
    }

    public int size(){
        return size;
    }

    public boolean isempty(){
        return size == 0;
    }

    public boolean isfull(){
        return size == queue.length;
    }

    public void show(){
        for(int i = 0; i<size; i++){
            System.out.print(queue[(front + i)%5] + " ");
        }
        System.out.println();
        for(int n:queue){
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args){
        queue q = new queue();
        // q.enqueue(5);
        // q.enqueue(10);
        // q.enqueue(15);
        // q.enqueue(20);
        // q.enqueue(11);
        // q.enqueue(16);
        // q.enqueue(22);

        // q.dequeue();
        // q.dequeue();
        // q.dequeue();
        // q.dequeue();

        // q.enqueue(16);
        // q.enqueue(22);

        System.out.println(q.size());
        System.out.println(q.isfull());
        System.out.println(q.isempty());


        q.show();
    }
}