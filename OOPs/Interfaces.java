package OOPs;

interface Birds{
   public void fly();
   public void eat();
}

class Sparrow implements Birds{
   public void fly(){
      System.out.println("Sparrow can fly");
   }

   public void eat(){
      System.out.println("Sparrow can eat");
   }
}

class Parrot implements Birds{
   public void fly(){
      System.out.println("Parrot can fly");
   }

   public void eat(){
      System.out.println("Parrot can eat");
   }
}
public class Interfaces {
   public static void main(String[] args) {
      Sparrow b1 = new Sparrow();
      b1.eat();

      Parrot b2 = new Parrot();
      b2.fly();
   } 
}
