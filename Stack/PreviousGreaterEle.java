package Stack;
import java.util.*;
public class PreviousGreaterEle {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] res = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        int n = arr.length;

        res[0] = -1;
        s.push(arr[0]);

        for (int i = 1; i<n; i++) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            res[i] = s.isEmpty() ? -1 : s.peek();

            s.push(arr[i]);
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
