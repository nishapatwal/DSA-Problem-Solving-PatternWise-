package Array.TargetSum;

public class DistintValueInArray {
    public static int distinct(int[] arr){
        int count = 0;
        for(int i =0;i<arr.length;i++){
            boolean isDistinct = true;
            for(int j =0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Total no. of distinct values: "+distinct(arr));
    }
}
