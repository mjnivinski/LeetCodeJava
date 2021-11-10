

public class PlusOne {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        method(new int[]{1});
        for (Integer n : method(new int[]{9,9,9,9})) {
            System.out.print(n);
        }
    }

    private static int[] method(int[] digits){
        int[] answer;
        if(digits[0] == 9){
            answer = new int[digits.length+1];
        }
        else answer= new int[digits.length];
        int carry = 1;
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[digits.length-1-i];
            digits[digits.length-1-i] = (digit+carry)%10;
            answer[answer.length-1-i] = digits[digits.length-1-i];
            if(carry == 1 && digit == 9) carry = 1;
            else carry = 0;
        }
        if(carry == 1){
            answer[0] = 1;
            return answer;
        }
        return digits;
    }
}
