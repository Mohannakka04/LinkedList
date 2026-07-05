package LinkedList;
public class LinkedList
{
    static class Node
    {
        int data;
        Node next;
        Node(int value)
        {
            data = value;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node newNode1 = new Node(10);
        Node newNode2 = new Node(20);
        Node newNode3 = new Node(30);
        Node newNode4 = new Node(40);

        // linking to the next 
        newNode1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = newNode4;

        //traversal 
        Node temp = newNode1;

        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}