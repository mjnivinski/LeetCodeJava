//import java.util.*;

public class DecodeWays {
    public static void main(String args[]){
        System.out.println("27: " + numDecodings("27") + " 1");
        System.out.println("226: " + numDecodings("226") + " 3");
        System.out.println("99: " + numDecodings("99") + " 1");
        System.out.println("12: " + numDecodings("12") + " 2");
        System.out.println("2101: " + numDecodings("2101") + " 1");
        System.out.println("1201234: " + numDecodings("1201234") + " 3");
        System.out.println("123: " + numDecodings("123") + " 3");
        System.out.println("11: " + numDecodings("1111") + " 5");
        System.out.println("1113: " + numDecodings("1113") + " 5");
        System.out.println("10011: " + numDecodings("10011") + " 0");
        System.out.println("10: " + numDecodings("10") + " 1");
        System.out.println("123123: " + numDecodings("123123") + " 9");
        System.out.println("2611055971756562: " + numDecodings("2611055971756562") + " 4");
        System.out.println("17: " + numDecodings("17") + " 2");
        System.out.println("301: " + numDecodings("301") + " 0");
    }

    public static int numDecodings(String s) {
        if(s.charAt(0) == '0') return 0;
        if(s.length() < 2) return s.length();
        int answer=1;
        int i=0;
        int j=0;
        
        while(i < s.length()){
            if(s.charAt(i) == '0'){
                if(s.charAt(i-1) != '1' && s.charAt(i-1) != '2'){
                    return 0;
                }
                else if(i < s.length()-1 && s.charAt(i+1) == '0'){
                    return 0;
                }
            }
            while(i < s.length() && (s.charAt(i) != '1' && s.charAt(i) != '2')){
                if(s.charAt(i) == '0'){
                    if(s.charAt(i-1) == '0' || !(s.charAt(i-1) == '1' || s.charAt(i-1) == '2')){
                        return 0;
                    }
                    if(i < s.length()-1 && s.charAt(i+1) == '0') return 0;
                }
                i++;
            }
            if(i == s.length()){
                break;
            }
            j=i;
            while(j < s.length() && (s.charAt(j) == '1' || s.charAt(j) == '2')) j++;
            if(j == s.length()){
                answer*=fibonnaci(j-i);
                break;
            }
            switch(s.charAt(j)){
                case '0':
                    j-=2;
                    break;
                case '3':
                case '4':
                case '5':
                case '6':
                    break;
                case '7':
                case '8':
                case '9':
                    if(j > 0 && s.charAt(j-1) == '1'){
                    }
                    else j--;
                    break;
            }
            if(j>i){
                answer*=fibonnaci(j-i+1);
            }
            i=j;
            i++;
            if(i < s.length()-1 && s.charAt(i+1) == '0') i++;
        }
        return answer;
        
    }

    public static int fibonnaci(int n) {
        if(n <= 3) return n;
        int current = 1, last = 0, temp;
        for(int i=0; i<n; i++){
            temp = current;
            current+= last;
            last = temp;
        }
        return current;
    }

    private static void print(String s){
        System.out.println(s);
    }
}
