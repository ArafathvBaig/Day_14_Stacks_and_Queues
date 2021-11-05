package com.Day_14_Stacks_and_Queues;

public class Stacks_and_Queues 
{
   public Node head; // the first node

   // nest class to define node
   public class Node 
   {
       int value;
       Node next;
   }

   public Stacks_and_Queues()
   {
       head = null;
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

   // Add value to the beginning of the list for demonstrating behaviour of stack
   public void push(int value) 
   {
       Node oldHead = head;
       head = new Node();
       head.value = value;
       head.next = oldHead;
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
       System.out.println("Elements Before POP");
       printList(saq.head);
       System.out.println("Elements After POP");
       saq.pop();
       printList(saq.head);
   }
}














