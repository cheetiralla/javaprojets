package priya;
class ListNodeCycle {
    int val;
    ListNodeCycle next;
    ListNodeCycle(int val) { this.val = val; }
}
public class DetectCycle {
    public boolean hasCycle(ListNodeCycle head) {
        if (head == null || head.next == null) return false;
        ListNodeCycle slow = head;
        ListNodeCycle fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
    public static void main(String[] args) {
    	
        ListNodeCycle a = new ListNodeCycle(1);
        ListNodeCycle b = new ListNodeCycle(2);
        ListNodeCycle c = new ListNodeCycle(3);
        a.next = b;
        b.next = c;
        c.next = b; 
        DetectCycle obj = new DetectCycle();
        System.out.println("Has cycle: " + obj.hasCycle(a)); 
    }
    
}