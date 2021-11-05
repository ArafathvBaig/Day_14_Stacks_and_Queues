package com.Day_14_Stacks_and_Queues;

public class Stacks_and_Queues 
{
   public Node head; // the first node
   public Node tail; // the last node
   int currentSize;
   
   // nest class to define node
   public class Node 
   {
       int value;
       Node next;
   }

   public Stacks_and_Queues()
   {
       head = null;
       tail = null;
       currentSize = 0;
   }

   //Remove all the elements, till the stack is empty
   public void pop()
   {
	   if (head == null)
	   {
		   System.out.println("Stack is Empty");
	   }
	   else
	   {
		   while(head != null)
		   {
			   head = head.next;
		   }
	   }
   }

   // Add value to the beginning of the list to demonstrate the behavior of stack
   public void push(int value) 
   {
       Node oldHead = head;
       head = new Node();
       head.value = value;
       head.next = oldHead;
   }
   
   // Add values to the end of the list, so that the first element added will stay at Top
   public void enqueue(int value) 
   {
		Node oldHead = head;
		head = new Node();
		head.value = value;
		head.next = null;
		if (currentSize==0) 
		{
			tail = head;
		}
		else 
		{
			oldHead.next = head;
		}
		currentSize++;
		System.out.println(value + " added to the queue");
	}
   
   public static void printList(Node head) 
   {
       Node temp = head;
       while (temp != null) 
       {
           System.out.print(temp.value+" ");
           temp = temp.next;
       }
       System.out.println();
   }

   public static void main(String args[]) 
   {
	   Stacks_and_Queues saq=new Stacks_and_Queues();
       saq.push(70);
       saq.push(30);
       saq.push(56);
       System.out.println("Elements After PUSH");
       printList(saq.head);
       System.out.println("Elements After POP");
       saq.pop();
       printList(saq.head);
       saq.enqueue(56);
       saq.enqueue(30);
       saq.enqueue(70);
   }
}














