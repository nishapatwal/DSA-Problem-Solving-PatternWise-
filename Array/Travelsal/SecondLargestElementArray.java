package Array.Travelsal;
public class SecondLargestElementArray {
    public static void main(String[] args) {

        int[] arr = {10, 5, 8, 20, 15};

        int largest = arr[0];
        int second = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } 
            else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }
        System.out.println("Second largest: " + second);
    }
    
}
