package Hashing;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i = nums2.length-1; i>=0; i--){
            int elements = nums2[i];
            while(!st.isEmpty() && st.peek() <= elements){
                st.pop();
            }
            if(st.isEmpty()){
                mp.put(elements,-1);
             }
            else{
                mp.put(elements,st.peek());
             }
            st.push(elements);
        }
        for(int i=0;i<nums1.length;i++){
            if(mp.containsKey(nums1[i])){
                nums1[i] = mp.get(nums1[i]);
            }
        }
        return nums1;
    }
    public static void main(String[] args) {
        NextGreaterElement nge = new NextGreaterElement();
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] result = nge.nextGreaterElement(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
