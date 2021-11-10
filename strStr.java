public class strStr {
    public static void main(String args[]){
        
        //int[] nums = new int[]{1,2,3,4,5};

        String haystack = "hello";
        String needle = "ll";

        System.out.println(method(haystack,needle));

    }

    //returns a pointer to the first occurence of str2 in str1
    private static int method(String haystack, String needle){

        if(needle.length() == 0) return 0;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if(haystack.charAt(i) == needle.charAt(0) && haystack.charAt(i+needle.length()-1) == needle.charAt(needle.length()-1)){
                System.out.println(haystack.substring(i, i + needle.length()));
                if(haystack.substring(i, i + needle.length()).equals(needle)) return i;
            }
        }
        return -1;
    }
}
