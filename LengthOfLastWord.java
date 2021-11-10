public class LengthOfLastWord {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        System.out.println(method("aa"));
    }

    private static int method(String s){
        int length = 0;
        int i=s.length()-1;
        while(i >= 0 && s.charAt(i) == ' ') i--;
        while(i >= 0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;
    }
}
