package Array.TwoPointer;

public class SortArrayZeroOrOne {
    public static void sortedArray(int[] arr){
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                arr[count++] = 0;
            }
        }
        for(int i = count;i<arr.length;i++){
            arr[i] = 1;
        }

    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,0,1};
        sortedArray(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
