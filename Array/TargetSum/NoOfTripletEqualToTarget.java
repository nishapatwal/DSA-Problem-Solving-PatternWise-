package Array.TargetSum;

public class NoOfTripletEqualToTarget {
    public static int triplets(int[] arr,int Target){
        int n = arr.length;
        int count = 0;
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==Target){
                        count++;
                    }
                }
            }
           
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3};
        System.out.print("Total no. of triplets: "+triplets(arr,12));
    }
}
