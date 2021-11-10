//import java.util.*;

public class ReverseBits {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        print("Hellow World");
        method();
    }

    private static void method(){
        int x = 1;
        int count=0;
        while(count < 100){
            count++;
            System.out.println(x<<=1);
        }
    }

    private static void print(String s){
        System.out.println(s);
    }
}
