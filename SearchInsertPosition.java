

public class SearchInsertPosition {
    public static void main(String args[]){
        System.out.println("1: " + method(new int[]{1,3,5,6}, 5) + " " + 2);
        System.out.println("2: " + method(new int[]{1,3,5,6}, 2) + " " + 1);
        System.out.println("3: " + method(new int[]{1,3,5,6}, 7) + " " + 4);
        System.out.println("4: " + method(new int[]{1,3,5,6}, 0) + " " + 0);
        System.out.println("5: " + method(new int[]{1}, 0) + " " + 0);
        System.out.println("6: " + method(new int[]{1,3}, 2) + " " + 1);
        System.out.println("7: " + method(new int[]{1,2,3,4,5,6,7,8,9,10}, 7) + " " + 6);
    }

    private static int method(int[] nums, int target){
        if(target > nums[nums.length-1]) return nums.length;
        if(target < nums[0]) return 0;
        int left = 0;
        int right = nums.length-1;
        int mid = (int)(left+right)/2;
        while(nums[mid]!=target){
            if(left+1 == right) return right;
            if(target > nums[mid]){
                left = mid;
                mid = (int)(left+right)/2;
            }
            else{
                right = mid;
                mid = (int)(left+right)/2;
            }
        }
        return mid;
    }
}
