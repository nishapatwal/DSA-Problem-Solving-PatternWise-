package Array.TargetSum;

public class TotalSumOfPairEqualToTarget {
    public static int pairs(int[] arr, int target) {
      int count = 0;
      for(int i =0; i<arr.length;i++){
        for(int j =i+1;j<arr.length;j++){
             if(arr[i]+arr[j]==target){
                count++;
             }
        }
    }       
       return count;
    }
    public static void main(String[] args) {
        int[] arr = {4,6,3,5,8,2};
        System.out.print("Total No. of pairs: "+ pairs(arr,6));
    }
}
