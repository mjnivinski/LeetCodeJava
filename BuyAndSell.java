//import java.util.*;

public class BuyAndSell {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        print("Hellow World");
        print("" + maxProfit(new int[]{7,6,4,3,1}));
    }

    private static int maxProfit(int[] prices){
        int best = 0;
        int lowest = prices[0];
        for(int i=0; i<prices.length; i++){
            if(prices[i] < lowest) lowest = prices[i];
            else{
                int diff = prices[i] - lowest;
                if(diff > best) best = diff;
                //best = prices[i] - lowest > best ? prices[i] - lowest : best;
            }
        }
        return best;
    }

    private static void print(String s){
        System.out.println(s);
    }
}
