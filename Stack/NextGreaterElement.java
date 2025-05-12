package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void ans1(int []arr, int []res){
        // These method find Next greater elmenet using loops
        // which takes too much time
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[j] > arr[i]){
                    res[i] = arr[j];
                    break;
                }else{
                    res[i] = -1;
                }
            }
        }

        for(int i=0; i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }

    public static void ans2(int []arr,int []res){
        Stack<Integer> s =new Stack<>();
        int n = arr.length;
        arr[n-1] = -1;
        s.push(arr[n-1]);

        for(int i = n-2; n>=0; i--){
            while(s.peek() < arr[i] && s.size() > 0){
                s.pop();
            }

            if(s.size() == 0) res[i] = -1;
            else res[i] = s.peek();
        }

        for(int i=0; i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int []arr = {1,3,2,1,8,6,3,4};
        int []res = new int[arr.length];

        ans2(arr, res);
    }
}
