import java.util.*;
class singleLinkedList{
	class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
Node head = null;
public void creation(){
	int data , n ;
Scanner sc = new Scanner(System.in);
do{
	System.out.print("Enter data = ");
	data = sc.nextInt();
	Node new_node = new Node(data);
	if (head == null){
		head = new_node;
	}
	else{
		new_node.next = head;
		head = new_node;
	}
	System.out.print("Do you want add more data if yes ");
	System.out.println("press 1");
	n = sc.nextInt();
}while(n ==1);
}
   public void traverse(){
	   Node temp = head ;
	   if (head == null){
		   System.out.print("Linked List Doesn't Exist");
	   }
	   else{
		   while( temp != null){
			   System.out.print(temp.data);
			   temp = temp.next;
			   System.out.print(" ");
		   }
	   }
   }
   public static void main(String args[]){
	   singleLinkedList sll = new singleLinkedList();
	   sll.creation();
	   sll.traverse();
   }
}

