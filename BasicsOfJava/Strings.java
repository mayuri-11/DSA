//package BasicsOfJava;
public class Strings {
    public static void main(String[] args) {
        String name = "Hello World";
        System.out.println(name);
        int age = 12;
        String address = new String();
        address = age + name;
        System.out.println(address);

        // lenght() method
        System.out.println(address.length());

        //charAt() method
        System.out.println(address.charAt(0));

        System.out.println("-------------------------------------");
        
        // Compare 2 Strings 
        String name1 = "Tony";
        String name2 = "tony";
        System.out.println(name1.compareTo(name2));

        //Sub string
        System.out.println(address.substring(2,5));

        // Strings are immutable;

    }
}
