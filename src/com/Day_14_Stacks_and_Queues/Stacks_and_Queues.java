package com.Day_14_Stacks_and_Queues;

public class Stacks_and_Queues 
{
   public Node head; // the first node

   // nest class to define linkedlist node
   public class Node 
   {
       int value;
       Node next;
   }

   public Stacks_and_Queues()
   {
       head = null;
   }

   // Add value to the beginning of the list for demonstrating behaviour of stack
   public void push(int value) 
   {
       Node oldHead = head;
       head = new Node();
       head.value = value;
       head.next = oldHead;
   }

   public static void main(String args[]) 
   {
	   Stacks_and_Queues lls=new Stacks_and_Queues();
       lls.push(70);
       lls.push(30);
       lls.push(56);
       printList(lls.head);
   }
   public static void printList(Node head) 
   {
       Node temp = head;
       while (temp != null) 
       {
           System.out.format("%d ", temp.value);
           temp = temp.next;
       }
       System.out.println();
   }
}














