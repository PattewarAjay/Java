package access;

// public class pvt{
//     private int num;
//     String name;
//     int[] arr;

//     public int getn(){
//         return num;
//     }

//     public int setn(int num){
//         this.num = num;
//         return num;
//     }

//     public pvt(int num, String name){
//         this.num = num;
//         this.name = name;
//         arr = new int[num];
//     }
// }


// -----------protected-----------------

public class pvt{
    protected int num;
    String name;
    int[] arr;

    public int getn(){
        return num;
    }

    public int setn(int num){
        this.num = num;
        return num;
    }

    public pvt(int num, String name){
        this.num = num;
        this.name = name;
        arr = new int[num];
    }
}



