package LinkedLists;
class Node
{
    int data;
    Node next;
    Node down;
 
    Node(int data) {
        this.data = data;
    }
}
 
class Main
{
    // Utility function to print a list with `down` and `next` pointers
    public static void printOriginalList(Node head)
    {
        if (head == null) {
            return;
        }
 
        System.out.print(" " + head.data + " ");
 
        if (head.down != null)
        {
            System.out.print("[");
            printOriginalList(head.down);
            System.out.print("]");
        }
 
        printOriginalList(head.next);
    }
 
    // Utility function to print a linked list
    public static void printFlattenedList(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
 
    // Recursive function to flatten a multilevel linked list
    public static Node flattenList(Node head)
    {
        // base case
        if (head == null) {
            return null;
        }
 
        // keep track of the next pointer
        Node next = head.next;
 
        // process the down list first
        head.next = flattenList(head.down);
 
        // go to the last node
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
 
        // process the next list after the down list
        tail.next = flattenList(next);
 
        // return head node
        return head;
    }
 
    public static void main(String[] args)
    {
        // create individual nodes and link them together later
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        Node thirteen = new Node(13);
        Node fourteen = new Node(14);
        Node fifteen = new Node(15);
 
        // set head node
        Node head = one;
 
        // set next pointers
        one.next = four;
        four.next = fourteen;
        fourteen.next = fifteen;
        five.next = nine;
        nine.next = ten;
        seven.next = eight;
        eleven.next = thirteen;
 
        // set down pointers
        one.down = two;
        two.down = three;
        four.down = five;
        five.down = six;
        six.down = seven;
        ten.down = eleven;
        eleven.down = twelve;
 
        System.out.println("The original list is :");
        printOriginalList(head);
 
        head = flattenList(head);
        System.out.println("\n\nThe flattened list is :");
        printFlattenedList(head);
    }
}