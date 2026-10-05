package Sorting;

public class MergeSort {
    public static void merge_sort(int start, int end, int[] arr){
        if(start>=end) return;
        int mid = start + (end - start)/2;
        merge_sort(start,mid,arr);
        merge_sort(mid+1,end,arr);
        merge(start,mid,end,arr);
    }
    public static void merge(int start, int mid, int end, int[] arr){
        int size = end - start +1;
        int[] temp = new int[size];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=end){
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int x = start; x<=end;x++){
            arr[x] = temp[x-start];
        }

    }
    public static void main(String[] args) {
        int[] arr = {6,4,1,3,2};
        merge_sort(0,arr.length-1,arr);
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
