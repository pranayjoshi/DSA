package LinkedLists;

public class PalindromeLL {

    public static class Node{
        Integer data;
        Node next;

        Node (Integer data){
            this.data = data;
        }
    }

    static void Traverse(Node head){
        Node cur = head;
        while (cur != null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    static Node middle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static boolean palindrom(Node head){

        if (head == null){
            return true;
        }

        Node mid = middle(head);

        Node last = Reverse(mid.next);

        Node curr = head;

        while (last !=null){
            if (last.data != curr.data){
                return false;
            }
            last = last.next;
            curr = curr.next;
        }

        return true;

    }


    static Node Reverse(Node head){

        if (head == null || head.next == null){
            return head;
        }

        Node newHead = Reverse(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;

        return newHead;

    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;

        Traverse(head);
    }
}
