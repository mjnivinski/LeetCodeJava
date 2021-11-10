import java.util.*;

public class ValidParentheses {
    public static void main(String args[]){
        

        //for(int num : nums) System.out.println(num);
        //System.out.println(nums);


        String str = "(";

        System.out.println(method(str));

        //System.out.println();
    }

    private static boolean method(String str){
        Stack<Character> parenths = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                //System.out.println("c: " + c);
                parenths.push(c);
            }
            else if(c == ')' || c == ']' || c == '}'){
                if(parenths.size() == 0) return false;
                char p = parenths.pop();
                //System.out.println(c);
                //System.out.println(c + " " + p);
                if(c == ')' && p != '('){
                    //System.out.println("here");
                    return false; 
                }
                else if(c == ']' && p != '['){
                    //System.out.println("here");
                    return false; 
                }
                else if(c == '}' && p != '{')return false;
                else {
                    //System.out.println("match");
                    //return false;
                }
            }
        }

        if(parenths.size()>0) return false;

        return true;
    }
}
