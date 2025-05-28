/*optimized  */
class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double areaCircle() {
        return r * r * Math.PI;
    }

    public void show() {
        System.out.println("Area: " + areaCircle());
    }
}

public class AreaCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.show(); // Clean, simple, and safe
    }
}

// class Circle {

//     double r;
    
//     public Circle(double r) {
//         this.r = r;
//     }
//     public double areaCircle()
//     {
//         return  (Math.pow(this.r, 2)) * Math.PI ;
        
//     }
//     public void show(){
//         System.out.println(areaCircle());
//     }
// }

// public class AreaCircle {
//     public static void main(String[] args) {
//         Circle c1 = new Circle(5);
//         // System.out.println(c1);
//         c1.areaCircle();
//         c1.show();
//     }
// }

// class Circle {

//     double r;
//     double area;
//     public Circle(double r) {
//         this.r = r;
//     }
//     public double areaCircle()
//     {
//         this.area = (Math.pow(this.r, 2)) * Math.PI ;
//         return area;
//     }
//     public void show(){
//         System.out.println(area);
//     }
// }

// public class AreaCircle {
//     public static void main(String[] args) {
//         Circle c1 = new Circle(5);
//         // System.out.println(c1);
//         c1.areaCircle();
//         c1.show();
//     }
// }
