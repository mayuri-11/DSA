package OOPs;
// Polymorphism  :-
// 1)Compile Time Polymorphism (Static)
//    1. Method Overloading :-
// 2)Run Time Polymorphism (Dynamic)
//  Method Overriding

class Worker {
    public void printInfo(String name){
        System.out.println("Name : "+name);
    }

    public void printInfo(int age){
        System.out.println("Age : "+age);
    }

    public void printInfo(String city, int money){
        System.out.println("City : "+city);
    }

}
public class Overloading {
    public static void main(String[] args) {
        Worker w = new Worker();
        w.printInfo("Rahul");
        w.printInfo(25);
    }
}
