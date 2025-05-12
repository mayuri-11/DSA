//package BasicsOfJava;
public class Stringbuilder {
    public static void main(String[] args) {
        String name = "M";
        name = name + "A";
        name = name + "Y";
        
        StringBuilder animal = new StringBuilder("lion");
        System.out.println(animal);

        // --> All the method of String we can easily use with String Builder
        System.out.println(animal.charAt(2));

        animal.setCharAt(2, '2');
        System.out.println(animal);

        animal.insert(4,"o");
        animal.insert(2,"o");
        System.out.println(animal);

        animal.delete(2, 4);
        System.out.println(animal);
        
        StringBuilder bird = new StringBuilder("Sparrow");

        bird.append(1);
        System.out.println(bird);

        System.out.println(bird.reverse());

    }
}
