package Stack;

public class h1 {
    public static void main(String[] args) {
        String str = "(())))(";
        int open = 0;
        int close = 0;
        for(int i = 0; i< str.length(); i++){
            char c = str.charAt(i);
            if(c == '('){
                open = open + 1;
            }
            else{
                close = close + 1;
            }
        }

        int ans = open - close;
        System.out.print(ans);
    }
}
