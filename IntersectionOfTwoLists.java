//import java.util.*;

public class IntersectionOfTwoLists {
    public static void main(String args[]){
        ListNode n = new ListNode(5);
        getIntersectionNode(n, n);
    }

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode a = headA;
        ListNode b = headB;
        int aSize = 0;
        int bSize = 0;
        while(a != null){
            aSize++;
            a = a.next;
        }

        while(b != null){
            bSize++;
            b = b.next;
        }

        a = headA;
        b = headB;

        int diff;
        if(aSize>bSize){
            diff = aSize - bSize;
            while(diff > 0){
                a = a.next;
                diff--;
            }
        }
        else if(bSize > aSize){
            diff = bSize - aSize;
            while(diff > 0){
                b = b.next;
                diff--;
            }
        }
        
        while(a != null){
            if(a == b) return a;
            a = a.next;
            b = b.next;
        }

        return null;
        /*
        if(headA == headB) return headA;
        while(a != null){
            while(b != null){
                if(a == b) {
                    return a;
                }
                b = b.next;
            }
            b = headB;
            a = a.next;
        }
        return null;
        */
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
