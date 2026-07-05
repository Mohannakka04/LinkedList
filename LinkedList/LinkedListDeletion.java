package LinkedList;
import java.util.*;

public class LinkedListDeletion {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value;
		Node head = new Node(0);
		Node temp = head;
		for(int i=0;i<n;i++)
		{
		    value = sc.nextInt();
		    Node NewNode = new Node(value);
		    temp.next = NewNode;
		    temp = NewNode;
		}
		temp = head.next;
		while(temp!=null)
		{
		    System.out.println(temp.data);
		    temp = temp.next;
		}
		temp = head;
		
        // deletion at any position
		int postion = sc.nextInt();
		int count = 1;
		while(count<postion && temp.next!=null)
		{
		    temp = temp.next;
		    count++;
		}
		temp.next = temp.next.next;

        
		System.out.println("Updated data");
		temp = head.next;
		while(temp!=null)
		{
		    System.out.println(temp.data);
		    temp = temp.next;
		}
        sc.close();
	}
	static class Node{
	    int data;
	    Node next;
	    Node(int value)
	    {
	        data = value;
	        next = null;
	    }
	}
}
