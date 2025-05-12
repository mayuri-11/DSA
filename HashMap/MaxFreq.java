package HashMap;

import java.util.*;

public class MaxFreq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3,4,6,4,4,7,4,7,7};

        Map<Integer,Integer> freq = new HashMap<>();
        for(int ele:arr){
            if(!freq.containsKey(ele)){
                freq.put(ele,1);
            }else{
                freq.put(ele,freq.get(ele)+1);
            }
        }

        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());

        int mxfreq = 0, ansKey = -1;
        for(var e: freq.entrySet()){
            if(e.getValue() > mxfreq){
                mxfreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.println("Max Frequency Element: "+ansKey+" with frequency "+mxfreq);
    }
}
