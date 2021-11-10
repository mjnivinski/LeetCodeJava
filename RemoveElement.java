public class RemoveElement {
    public static void main(String args[]){
        
        //int[] nums = new int[]{1,1,1,1,1,1,1,2,3,4,5};
        int[] nums = new int[]{0,1,2,2,3,0,4,2};


        System.out.println(method(nums,2));
    }

    private static int method(int[] nums, int val){
        int nextPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[nextPosition++] = nums[i];
            }
        }
        return nextPosition;
    }
}
