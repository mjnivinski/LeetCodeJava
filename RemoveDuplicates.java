public class RemoveDuplicates {
    public static void main(String args[]){
        
        int[] nums = new int[]{1,1,2,2,3,3,4,4,5,5};

        //for(int num : nums) System.out.println(num);
        //System.out.println(nums);

        //int[] nums2 = method(nums);
        //for (int i : nums2) {
        //    System.out.println(i);
        //}

        System.out.println(method(nums));
        

        //System.out.println();
    }

    private static int method(int[] nums){
        if(nums.length < 2) return nums.length;
        int current = nums[0];
        int nextPosition = 1;
        for(int i=1;i<nums.length; i++){
            if(nums[i]!=current){
                current = nums[i];
                nums[nextPosition] = current;
                nextPosition++;
            }
        }
        return nextPosition;
    }
}
