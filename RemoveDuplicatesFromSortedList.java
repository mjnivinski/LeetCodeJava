public class RemoveDuplicatesFromSortedList {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        ListNode head = new ListNode();
        method(head);
    }

    private static ListNode method(ListNode head){
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode node = head;
        while(node.next != null){
            if(node.next.val == node.val){
                node.next = node.next.next;
            }
            else node = node.next;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
        
}
