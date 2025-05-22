package OOPs;

class Shape {
    public void ans() {
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

public class InheritanceHierarchical {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area(4,5);
        t.ans();

        Circle c = new Circle();
        c.area(7);
        t.ans();

        Shape s = new Shape();
        s.ans();
    }
}
