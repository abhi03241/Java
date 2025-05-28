class Circle {

    double r;
    
    public Circle(double r) {
        this.r = r;
    }
    public double areaCircle()
    {
        return  (Math.pow(this.r, 2)) * Math.PI ;
        
    }
    public void show(){
        System.out.println(areaCircle());
    }
}

public class AreaCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        // System.out.println(c1);
        c1.areaCircle();
        c1.show();
    }
}