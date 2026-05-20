public class Dstack{
    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    private void push(int data){
        if(size() == capacity){
            expand();
        } else {
            stack[top] = data;
            top++;
        }
    }

    private void expand(){
        int[] newstack = new int[capacity*2];
        for(int i=0;i<capacity;i++){
            newstack[i] = stack[i];
        }
        capacity = capacity*2;
        stack = newstack;
    }

    private int pop(){
        if(top == 0){
            System.out.println("Stack is empty");
            return -1;
        } else {
            top--;
            int topElement = stack[top];
            stack[top] = 0;
            shrink();
            return topElement;
        }
    }

    private void shrink(){
        if(size() < (capacity/2)/2){
            int[] newstack = new int[capacity/2];
            for(int i=0;i<capacity/2;i++){
                newstack[i] = stack[i];
            }
            capacity = capacity/2;
            stack = newstack;
        }
    }

    private int peak(){
        if(top == 0){
            return -1;
        } else{
            int data = stack[top-1];
            return data;
        }
    }

    private int size(){
        return top;
    }

    private void show(){
        for(int nums : stack){
            System.out.print(nums+ " ");
        }
        
        System.out.println();
    }

    public static void main(String[] args){
        Dstack obj = new Dstack();
        obj.push(5);
        obj.push(10);
        obj.push(15);
        obj.push(52);
        obj.push(99);
        obj.push(22);
        obj.push(91);
        obj.push(92);
        obj.push(93);
        obj.push(94);
        obj.push(95);
        
        // System.out.println(obj.pop());
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.show();

        System.out.println(obj.peak());
    }
}