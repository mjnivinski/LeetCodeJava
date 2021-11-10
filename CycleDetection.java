//import java.util.*;

public class CycleDetection {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        print("Hellow World");
        ListNode n = new ListNode(5);
        hasCycle(n);
    }

    private static boolean hasCycle(ListNode head){
        if(head == null) return false;
        ListNode tortoise = head;
        ListNode hare = head.next;
        while(tortoise!= null && hare != null){
            tortoise = tortoise.next;
            try {hare = hare.next.next;}
            catch(Exception e) {return false;}
            if(tortoise == hare) return true;
        }
        return false;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private static void print(String s){
        System.out.println(s);
    }
}
