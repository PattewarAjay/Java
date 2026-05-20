public class stack{
    int[] stack = new int[5];
    int top = 0;

    private void push(int data){
        if(top == stack.length){
            System.out.println("Stack is full");
        } else {
            stack[top] = data;
            top++;
        }
    }

    private int pop(){
        if(top == 0){
            System.out.println("Stack is empty");
            return -1;
        } else {
            top--;
            int topElement = stack[top];
            stack[top] = 0;
            return topElement;
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
        stack obj = new stack();
        obj.push(5);
        obj.push(10);
        obj.push(15);
        obj.push(52);
        obj.push(99);
        obj.push(22);
        
        // System.out.println(obj.pop());
        obj.show();

        System.out.println(obj.peak());
    }
}