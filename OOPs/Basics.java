package OOPs;

class Student{
    String name = "Radhe";
    int age = 12;

    public void getInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
}

public class Basics {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;
        s1.getInfo();

        Student s2 = new Student();
        s2.name = "Mike";
        s2.age = 25;
        s2.getInfo();

        Student s3 = new Student();
        s3.getInfo();
        
    }
}
