package OOPs;

class Girls{
    String name;
    int age;

    Girls(String name, int age){
        this.name =name;
        this.age = age;
        System.out.println("Name :"+ name);
        System.out.println("Age :" + age);
    }
}

public class Constructores {
    public static void main(String[] args) {
        Girls w1 = new Girls("Mayuri",20);
        w1.name = "Diya";
        System.out.println(w1.name);
        System.out.println(w1.age);
    }
    
}
