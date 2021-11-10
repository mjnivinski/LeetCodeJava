public class Sqrt {
    public static void main(String args[]){
        System.out.println(method(1000));
    }

    private static int method(int x){
        int start = 1;
        int end = x;
        int mid, answer = 0;
        while(start <= end){
            mid = (start + end)/2;
            if(x / mid >= mid){
                start = mid + 1;
                answer = mid;
            }
            else end = mid - 1;
        }
        return answer;
    }
}
