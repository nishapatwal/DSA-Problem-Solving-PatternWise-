package Array.TwoPointer;

public class SortArrayZeroOrOne2 {
    public static void sortedArray(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,1,1};
        sortedArray(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
