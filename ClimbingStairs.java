public class ClimbingStairs {
    public static void main(String args[]){
        for(int i=1; i<46; i++){
            System.out.println("i: " + i + " " + method(i));
        }
    }

    //fibonnaci
    private static int method(int n){
        if(n <= 3) return n;
        int current = 1, last = 0, temp;
        for(int i=0; i<n; i++){
            temp = current;
            current+= last;
            last = temp;
        }
        return current;
    }
}
