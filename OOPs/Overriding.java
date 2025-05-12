package OOPs;

// Polymorphism  :-
// 1)Compile Time Polymorphism (Static)
//    1. Method Overloading :-
// 2)Run Time Polymorphism (Dynamic)
//  Method Overriding

class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((0.5)*b*h);
    }  
}
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }  
}
 

public class Overriding {

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area(4,5);
        t.area();

        Circle c = new Circle();
        c.area(7);
        t.area();

        Shape s = new Shape();
        s.area();

    }
    
}
