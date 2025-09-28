

import java.util.HashMap;
import java.util.Map;

public class MaxEleBetter {
    public static int maxEle(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
         
        //count frequencies
        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0)+1);
        }
        //chcking majority element
        for(int key : map.keySet()){
            if(map.get(key) > arr.length/2){
                return key;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,5,2,2,5,5,5,5,5};
        System.out.println(maxEle(arr));
    }
}
//tc = 0(n)
//sc = 0(n)
