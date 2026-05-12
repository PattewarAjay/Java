class Box1 extends Box{
    double weight;

    Box1(){
        super();
        this.weight = 0;
    }
    
    Box1(double h, double w, double d, double m){
        super(h,w,d);
        this.weight = m;
    }
    
    Box1(double side, double m){
        super(side);
        this.weight = m;
    }

}