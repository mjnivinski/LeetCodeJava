//import java.util.*;

public class TwoSumSorted {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        int[] a = twoSum(new int[]{3,24,50,79,88,150,345},200);
        for (int i : a) {
            print("" + i);
        }
    }

    private static int[] twoSum(int[] numbers, int target){
        int left = 0;
        int right = numbers.length-1;
        //int mid, tempMid;
        int t;
        //int x;

        while(left < right){
            t = target - numbers[left];
            right = insertPosition(numbers, t);
            if(numbers[right] == t){
                return new int[]{left+1,right+1};
            }
            //mid = (left+right)/2;
            t = target - numbers[right];
            left = insertPosition(numbers, t);
            if(numbers[left] == t){
                return new int[]{left+1, right+1};
            }
        }
        return new int[]{0,0};
    }

    private static int insertPosition(int[] nums, int target){
        if(target > nums[nums.length-1]) return nums.length-1;
        if(target < nums[0]) return 0;
        int left = 0;
        int right = nums.length - 1;
        int mid = (left+right)/2;
        while(nums[mid]!=target){
            if(left+1 == right) return right;
            if(target > nums[mid]){
                left = mid;
                mid = (left+right)/2;
            }
            else{
                right = mid;
                mid = (left+right)/2;
            }
        }
        return mid;
    }

    private static void print(String s){
        System.out.println(s);
    }
}
