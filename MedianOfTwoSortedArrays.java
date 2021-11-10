

public class MedianOfTwoSortedArrays {
    public static void main(String args[]){
        //System.out.println(findMedianSortedArrays(new int[]{1,2,3,4,5,6,7,8,9,10}, new int[]{11,12}) + " answer: ?");

        
        for(int i=10; i<20; i++){
            PrintElements(i);
        }

        //testRecursive(5);
    }


    private static int i1,j1,i2,j2;
    public static float findMedianSortedArrays(int[] nums1, int[] nums2){

        i1 = i2 = 0;
        j1 = nums1.length-1;
        j2 = nums2.length-1;
        //System.out.println(i1);
        //System.out.println(j1);
        //System.out.println(i2);
        //System.out.println(j2);
        //binary search middle of first array within second array.

        System.out.println("i1:" + i1 + " j1:" + j1 + " i2:" + i2 + " j2:" + j2);
        
        System.out.println("middle1: " + (int)((i1 + j1) / 2));
        System.out.println("middle2: " + (int)((i2 + j2) / 2));

        medianRecursive(nums1, nums2);

        System.out.println("i1:" + i1 + " j1:" + j1 + " i2:" + i2 + " j2:" + j2);

        return 0;
        //return medianRecursive(nums1, nums2);
    }

    private static void PrintElements(int n){
        String s = "n: ";
        s += n + " ";
        if(n%2 == 1){
            System.out.println("odd");
            s+=n/2;
        }
        else{
            System.out.println("even");
            s += ((n/2) - 1) + " " + n/2;
        }
        System.out.println(s);
        String str = "";
        for(int i=0; i<n; i++){
            str += i + " ";
        }
        System.out.println(str);
    }

    public static void medianRecursive(int[] nums1, int nums2[]){
        int median1 = (int)((i1 + j1)/2);
        int median2 = (int)((i2 + j2)/2);

        if(nums1[median1] < nums2[median2]){
            i1 = median1;
            j2 = median2;
        }
        else{
            j1 = median1;
            i2 = median2;
        }

        if(j1-i1 > 1 || j2-i2 > 1){
            medianRecursive(nums1, nums2);
        }
    }

    public static void testRecursive(int n){
        if(n>1) testRecursive(n-1);
        System.out.println(n);
    }
}
