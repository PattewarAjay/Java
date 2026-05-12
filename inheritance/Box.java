public class Box{
    double height;
    double width;
    double depth;

    Box(){
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    Box(double h, double w, double d){
        this.height = h;
        this.width = w;
        this.depth = d;
    }

    Box(double side){
        this.height = side;
        this.width = side;
        this.depth = side;
    }

    double volume() {
        return this.height * this.width * this.depth;
    }
}
