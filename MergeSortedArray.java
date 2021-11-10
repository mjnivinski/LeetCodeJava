public class MergeSortedArray {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        int[] nums1 = new int[]{1,3,5,7,9,0,0,0,0,0};        
        int[] nums2 = new int[]{2,4,6,8,10};   
        
        //int x= 0;
        //System.out.println(x++);

        method(nums1,5,nums2,nums2.length);
    }

    private static void method(int[] nums1, int m, int[] nums2, int n){
        for (int i = nums1.length-1; i >= 0; i--) {
            System.out.println("i: " + i + " m: " + m + " n: " + n);
            if(m==0) nums1[i] = nums2[(n--)-1];
            else if(n==0) nums1[i] = nums1[(m--)-1];
            else nums1[i] = nums1[m-1] > nums2[n-1] ? nums1[(m--)-1] : nums2[(n--)-1];
        }
        
        for (int x : nums1) {
            System.out.print(x + ",");
            
        }
    }
}
