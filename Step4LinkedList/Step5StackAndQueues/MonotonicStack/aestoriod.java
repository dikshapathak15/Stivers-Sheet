import java.util.ArrayList;
import java.util.List;

public class aestoriod {


    public static int[] aestoriodCollision(int[] aestoriod){
        int n = aestoriod.length;
        List<Integer> st = new ArrayList<>();


        for(int i = 0 ; i < n ; i++){
            
            //aestorid moving rightwards - positive aestoriod
        if (aestoriod[i] > 0) {
            st.add(aestoriod[i]);
        }
          //aestorid moving leftwards - negative aestoriod
        else{
            //destroying right moving with smaller values
              while (!st.isEmpty() && st.get(st.size() - 1) > 0 && st.get(st.size() - 1) < Math.abs(aestoriod[i])) {
                st.remove(st.size() - 1);
              }

              //removes equal and opposite aestoroid
              if (!st.isEmpty() && st.get(st.size() - 1) == Math.abs(aestoriod[i])) {
                 st.remove(st.size() - 1);
              }

              //no collision
              else if(st.isEmpty() || st.get(st.size() - 1) < 0){
                    st.add(aestoriod[i]);
              }
        }


        }

        int[] result = new int[st.size()];
        for(int i = 0 ; i < st.size(); i++){
            result[i] = st.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] aestoriod = { 10, 20, -20 };
        int[] result = aestoriodCollision(aestoriod);

        System.out.println("The state of aestoriods after collision is: ");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
        System.out.println();
    }

}

//tc = 0(n) in traversing all the elements of the array
//sc = 0(n) in worst case if no colllision happens we need to store all the elements in the stack