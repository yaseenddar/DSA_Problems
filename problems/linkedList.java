import java.util.Scanner;
class Node{

	int data;
	Node next;
    
    Node (){

    }
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}

class List{
		Node head=null;
		Node tail = null;
		int size;
		public List(){
			tail = null;
			head = null;
			size = 0;
		}
	
	public void addNode(int data){
		Node newNode = new Node(data);
		System.out.println("adding the node");
		if(head == null){
			head = tail = newNode;
			size++;
			return;
		}
		tail.next = newNode;
		tail = newNode;
		size++;
	}

	public void print(){
		Node temp = head;
		System.out.println("_______________The linked list is_______________");
		while(temp != null){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println();
	}
	public  void takeinput(){
	System.out.println("Enter the node to add press -1 for exit");
	Scanner sc = new Scanner(System.in);
	int data = sc.nextInt();
	while(data != -1){

		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
			size = 1;

		}else{
			tail.next = newNode;
			tail = newNode;
			size++;
			
		}
		System.out.println("Enter the node to add press -1 for exit");
		data = sc.nextInt();
	}
}

//retrun tail 
public void getTail(){
	if(tail != null){
		System.out.println("the tail is "+tail.data);
	}
	else{
		System.out.println("the list has empty tail");

	}
}

//size of LL
public void getSize(){
	if(size > 0){
		System.out.println("the size is "+size);
	}
	else{
		System.out.println("The List is Empty");

	}
}


// _____________________Reverse the List_____________________________
// 1 2 3 4 5 6 7 89;

public void reverseList(){
	Node prev = null;
	Node curr = head;
	Node next = curr.next;
	while(next != null){
		curr.next = prev;
		prev = curr;
		curr = next;
		next = next.next;
	}
	head = prev;

}

public Node ReverseList(Node node){
	Node prev = null;
	Node curr = node;
	Node next = curr.next;
	while(next != null){
		curr.next = prev;
		prev = curr;
		curr = next;
		next = next.next;
	}
	node = prev;
	return prev;

}
// 1 2 3


//remove the nth node from linkedList
public void removeNode(int pos){
	if(pos == 0 && head != null){
		head = head.next;
		size--;
		return;
	}
	if(pos >= size){
		System.out.println("please enter the positoin less than size");
		return;
	}
  removeNodeHelper(head,null,pos);
}

//remove helper 
// 1 2 3 4 5 6
public void removeNodeHelper(Node curr,Node prev, int pos){
	if(pos == 0 && curr != null){
		// code to remove
		prev.next = curr.next;
		size--;
		return;

	}
	removeNodeHelper(curr.next,curr,pos - 1);
}

//find middle node
//  1 2 3 4 
public Node findMid(){
	Node slow = head;
	Node fast = head;
	while(fast != null && fast.next != null){
		slow = slow.next;
		fast = fast.next.next;
	}
	return slow;
}

//check palindrome
public boolean CheckPalindrome(){
	if(head == null || head.next == null){
		return true;
	}
	// find the middle
	Node mid = findMid();

	// reverse the half right list

	Node prev = null;
	Node curr = mid;
	Node next = curr.next;
	while(next != null){
		curr.next = prev;
		prev = curr;
		curr = next;
		next = next.next;
	}
	Node left = head;
	Node right = curr;
	

	// check for palindrome in left and right linked List
	while(right != null){
		if(left.data != right.data){
			return false;
		}
		right = right.next;
		left = left.next;
	}
	return true;


}
public Node getHead(){
	return head;
}


}
class linkedList{

	public static void main(String[] args) {
		System.out.println("This is the linked list ");
		List ll = new List();
		ll.takeinput();
		Node head = ll.getHead();
		

		

	}
}