package LinkedLists;

public class ReverseLL {

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

    static void Insert(int data, Node head, int pos){
        
        Node toAdd = new Node(data);

        if (pos == 0){
            toAdd.next = head;
            head = toAdd;
            return;
        }

        Node prev = head;

        for ( int i = 0; i < pos-1; i++){
            prev = prev.next;
        }

        toAdd.next = prev.next;
        prev.next = toAdd;

    }

    static void Delete(Node head, int pos){

        if (pos == 0){
            head = head.next;
            return;
        }

        Node prev = head;

        for ( int i = 0; i < pos-1; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;

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
