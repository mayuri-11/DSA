//package BasicsOfJava;
public class PracticeArea {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("MAYURI");
        // Reverse the string code
        for(int i = (name.length() - 1); i>=0 ; i--){
            System.out.print(name.charAt(i));
        }
    }
}
