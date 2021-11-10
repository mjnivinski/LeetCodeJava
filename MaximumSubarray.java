public class MaximumSubarray {
    public static void main(String args[]){
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("1: " + method(nums) + " 6");
        System.out.println("1: " + method(new int[]{1,-1,-1,-1,-10000,-1,-100,1000}) + " 1000"); 
        System.out.println("1: " + method(new int[]{5,4,-1,7,8}) + " 1000"); 
    }

    private static int method(int[] nums){
        /*if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int max = nums[0];
        
        for(int i=1; i<nums.length; i++){

        }
        return 0;
        */
        int maxSoFar = 0;
        int maxEndingHere = 0;

        for(int i=0; i<nums.length; i++){
            maxEndingHere = maxEndingHere + nums[i];

            maxEndingHere = Integer.max(maxEndingHere,0);

            maxSoFar = Integer.max(maxSoFar,maxEndingHere);
        }

        return maxSoFar;
    }
}
