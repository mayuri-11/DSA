package OOPs;
class Student{
    String name = "rinkal";
    int rno = 18;

    public void getinfo(){
        System.out.println("name" + this.name);
        System.out.println(this.rno);
    }

    public int sum(int a, int b){
        return a+b;
    }
}
public class Practise1 {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        
        System.out.println(s1.sum(2,3));
        
    }
}
