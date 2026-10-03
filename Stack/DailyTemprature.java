package Stack;
import java.util.Stack;
import java.util.Arrays;
public class DailyTemprature {
    public static String temp(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i] ){
                    st.pop();
            }
        if(st.isEmpty()){
            ans[i] = 0;
        }
        else{
            ans[i] = st.peek()-i;
        }
        st.push(i);
        }
        return Arrays.toString(ans);
        }
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        System.out.print(temp(arr));
    }
    }




    
      
   
      
