package OOPs;

class Pets{
    public void print(){
        System.out.println("My Pet is very cutee");
    }
}

class Dogs extends Pets{
    public void petName(String name){
        System.out.println("My Pet name is "+name);
    }
}

class Husky extends Dogs{
    public void petColor(String Color){
        System.out.println("My Pet color is "+Color);
    }
}

public class InheritanceMultilevel {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.petName("Husky");
        h.petColor("Black");
        h.print();
    } 
}
    

/* 4th Type of Inheritance */ 
/*  Hybrid inheritance : Hybrid inheritance is a combination of 
simple, multiple inheritance and hierarchical inheritance. */

