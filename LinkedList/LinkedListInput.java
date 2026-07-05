package LinkedList;
import java.util.*;
public class LinkedListInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value ; //= sc.nextInt();
		Node head = new Node(0); // dummy node
		Node temp=head;
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
		    System.out.print(temp.data+" ");
		    temp = temp.next;
		}
		System.out.println("");
		int count = 1;
		temp = head;
		int position = sc.nextInt();
		int newValue = sc.nextInt();
		while(count<position && temp !=null)
		{
		    temp = temp.next;
		    count++;
		}
		Node NewNode = new Node(newValue);
		Node ptr = temp.next;
		temp.next = NewNode;
		NewNode.next = ptr;
		
		temp = head.next;
		System.out.println("updated linked ");
		while(temp!=null)
		{
		    System.out.print(temp.data+" ");
		    temp = temp.next;
		}
        sc.close();
	}
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
}
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		int value = sc.nextInt();
// 		Node head = new Node(value);
// 		Node temp=head;
// 		for(int i=1;i<n;i++)
// 		{
// 		    value = sc.nextInt();
// 		    Node NewNode = new Node(value);
// 		    temp.next = NewNode;
// 		    temp = NewNode;
// 		}
// 		temp = head;
// 		while(temp!=null)
// 		{
// 		    System.out.print(temp.data+" ");
// 		    temp = temp.next;
// 		}
// 		System.out.println("");
// 		int count = 1;
// 		temp = head;
// 		int position = sc.nextInt();
// 		int newValue = sc.nextInt();
// 		while(count!=position-1)
// 		{
// 		    temp = temp.next;
// 		    count++;
// 		}
// 		Node NewNode = new Node(newValue);
// 		Node ptr = temp.next;
// 		temp.next = NewNode;
// 		NewNode.next = ptr;
		
// 		temp = head;
// 		System.out.println("updated linked");
// 		while(temp!=null)
// 		{
// 		    System.out.print(temp.data+" ");
// 		    temp = temp.next;
// 		}
// 	}
// 	static class Node
// 	{
// 	    int data;
// 	    Node next;
// 	    Node(int value)
// 	    {
// 	        data = value;
// 	        next = null;
// 	    }
// 	}
// }