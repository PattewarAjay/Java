
public class CustomerArraylist{
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomerArraylist(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isfull()){
            resize();
        }
        data[size++] = num;
    }

    public boolean isfull(){
        return size == data.length;
    }

    public void resize(){
        int[] temp = new int[DEFAULT_SIZE*2];

        for(int i=0; i<data.length; i++){
            temp[i] = data[i];

        }
        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append("[");

            for(int i = 0; i < size; i++) {
                sb.append(data[i]);

                 if(i < size - 1) {
                    sb.append(", ");
                }
            }

            sb.append("]");

            return sb.toString();
    }


    public static void main(String[] args){
        CustomerArraylist list1 = new CustomerArraylist();
        list1.add(2);
        list1.add(6);
        list1.set(4,8);
        list1.add(66);
        System.out.println(list1);
    }


}