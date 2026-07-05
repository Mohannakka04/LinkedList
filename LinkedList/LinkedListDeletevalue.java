package LinkedList;
import java.util.*;

public class LinkedListDeletevalue {
    public static void main(String[] args) {
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
		System.out.println("Original Data");
		temp = head.next;
		while(temp!=null)
		{
		    System.out.println(temp.data);
		    temp = temp.next;
		}
		
		temp = head;
		
		int originalvalue = sc.nextInt();
		while(temp.next!=null)
		{
		    if(originalvalue==temp.next.data)
		    {
		        temp.next = temp.next.next;
		        break;
		    }
		    temp = temp.next;
		}
		
		
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
