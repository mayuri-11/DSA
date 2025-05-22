package OOPs;

class Student{
    String name = "Radhe";
    int age = 12;

    public void getInfo(String name,int age){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class Basics {
  
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;
        s1.getInfo("Rinkal",20);

        Student s2 = new Student();
        s2.name = "Mike";
        s2.age = 25;
        s2.getInfo(s2.name,s2.age);

        Student s3 = new Student();
        s3.getInfo(s1.name,s1.age);

        
       
        
    }
}
