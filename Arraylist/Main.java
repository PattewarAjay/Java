public class Main{
    public static void main(String[] args){
        student s1 = new student(1, "John", 85);

        student s2 = new student(2, "Jane", 90);

        student s3 = new student(3, "white", 99);

        student arr[] = new student[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        for(int i =0;i<arr.length;i++){
            System.out.println("Roll No: "+arr[i].rollno+" Name: "+arr[i].name+" Marks: "+arr[i].marks);
        }
    }
}