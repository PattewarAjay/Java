public class Main{
    public static void main(String[] args){
        Box b1 = new Box(2,3,4);
        System.out.println(b1.height);

        Box1 b2 = new Box1(2, 3, 4, 5);
        System.out.println(b2.height+" "+ b2.weight);
        System.out.println("valoume:"+ b1.volume());
        Box b3 = new Box(4);
        System.out.println(b3.depth+" "+b3.height+" "+b3.width);


    }
}