import java.lang.Math;

public class PalindromeNumber {
    public static void main(String args[]){
        
        

        for(int i=1; i<(int)Math.pow(10, 5);i++){
            isPalindrome(i);
        }
        
    }

    private static void isPalindrome(int x){
        int y=x;
        int reverse = 0;

        if(x < 0 || x %10 == 0 && x != 0){
            return;
        }

        while(y > reverse){
            reverse = reverse *10 + y%10;
            y /= 10;
        }

        if(y == reverse){
            System.out.println(x + " " + y + " " + reverse);
        }
    }
}
