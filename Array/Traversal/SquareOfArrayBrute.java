package Array.Traversal;
import java.util.Arrays;
public class SquareOfArrayBrute {
    public static void square(int[] arr){
       int n = arr.length;
       for(int i=0;i<n;i++){
          arr[i] = arr[i]*arr[i];
       }
      String nums = Arrays.toString(arr);
      System.out.print(nums);
    }
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,-6};
    square(arr);
}
}
