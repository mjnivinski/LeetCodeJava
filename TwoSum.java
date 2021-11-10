public class TwoSum {
    public static void main(String args[]){
        
        int[] nums = new int[]{1,2,3,4,5};

        //for(int num : nums) System.out.println(num);
        //System.out.println(nums);

        for(int num : method(nums, 1)) System.out.println(num);

        //System.out.println();
    }

    private static int[] method(int[] nums, int target){
        int[] answer = new int[2];

        answer[0] = 5;
        answer[1] = 5+1;


        return answer;
    }
}
