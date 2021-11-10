//import java.util.*;

public class SingleNumber {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        print("Hellow World");
        print("" + singleNumber(new int[]{1,2,1,2,3,3,5,5,6,6,7,7,8,8,9,9,10,10}));
    }

    private static int singleNumber(int[] nums){
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            answer ^= nums[i];
        }
        return answer;
    }

    private static void print(String s){
        System.out.println(s);
    }
}
