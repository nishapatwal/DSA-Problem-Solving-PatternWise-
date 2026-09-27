package Array.TwoPointer;

public class MergeTwoSortedArray {
    public static void merge(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                ans[k++] = arr1[i++];
            }
            else{
                ans[k++] = arr2[j++];
            }
        }
        while(i<n){
            ans[k++] = arr1[i++];
        }
        while(j<m){
            ans[k++] = arr2[j++];
        }
        for(int l=0;l<ans.length;l++){
            System.out.print(ans[l]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};
        merge(arr1,arr2);
    }
}
