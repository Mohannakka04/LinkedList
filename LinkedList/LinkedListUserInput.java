package LinkedList;
import java.util.*;

public class LinkedListUserInput {
    static class Node{
        int data;
        Node next;
        Node(int value)
        {
            data = value;
            next = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // creating the head node
        int value = sc.nextInt();
        Node head = new Node(value);
        Node temp = head;
        
        // remaining node values 
        for(int i=2;i<=n;i++)
        {
            value = sc.nextInt();
            temp.next = new Node(value);
            temp = temp.next;
        }

        temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        sc.close();
    }    
}