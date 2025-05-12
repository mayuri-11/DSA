package OOPs;

class Aakar {
    public void area() {
        System.out.println("Displays ");
    }
}
class Tri extends Aakar {
    public void area(int h, int b) {
        System.out.println("Hello");
    }  
}
 

public class InheritanceSingle {
    public static void main(String[] args) {
        Tri tum = new Tri();
        tum.area(5, 4);

        
    }
}
