import java.util.*;

public class LongestSubstring {
    public static void main(String args[]){
        System.out.println(lengthOfLongestSubstring("abcabcbb") + " answer: " + 3);
        System.out.println(lengthOfLongestSubstring("bbbbb") + " answer: " + 1);
        System.out.println(lengthOfLongestSubstring("pwwkew") + " answer: " + 3);
        System.out.println(lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxayz") + " answer: " + 26);
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        
        int answer = 1;

        int i=0;

        set.add(s.charAt(i));

        
        /*for(int i=0; i<s.length(); i++){
            int challenger = 0;
            //System.out.println("yea");
            int j=i;
            while(!set.contains(s.charAt(j))){
                //System.out.println(s.charAt(j));
                challenger++;
                set.add(s.charAt(j));
                //System.out.println("set.contains(s.charAt(j): " + set.contains(s.charAt(j)));
                j++;
                if(j >= s.length()) break;
                //System.out.println("set.contains(s.charAt(j): " + set.contains(s.charAt(j)));
            }
            if(challenger > answer) answer = challenger;
            set.clear();
        }
        */
        
        return answer;
        //set.contains();
    }
}
