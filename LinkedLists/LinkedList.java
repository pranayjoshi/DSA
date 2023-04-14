package LinkedLists;

public class LinkedList {
    public static class Node{
        Integer data;
        Node next;

        Node (Integer data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;
    }
}
