  class Node{
	int data;
	Node next;
	Node prev;

	Node(int data){
		this.data = data;
		next = null;
		prev = null;
	}
}
 class DoublyLL{
	Node head;
	Node tail;
	int size;

	DoublyLL(){
		head = null;
		tail = null;
		size = 0;
	}
	public void insertNode(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = tail = newNode;
			size++;
			return;
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		size++;
	}
	public void printDLL(){
		if(head == null){
			System.out.println("List is Empty");
			return;
		}
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data +" ");
			temp = temp.next;

		}
	}
	// 1<->2<->
	public void insertAtBegin(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = tail = newNode;
			size++;
			return;
		}
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
		size++;

	}
	public void insertAtEnd(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = tail = newNode;
			size++;
			return;
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		size++;

	}
 
	public void insertAtPos(int data,int pos){
		Node newNode = new Node(data);
		if(pos > size || pos <= 0){
			System.out.println("Enter the valid position less than "+size);
			return;
		}

		if(head == null){
			head = tail = newNode;
			return;
		}
		Node temp = head;
		while(pos - 1 != 0){
			temp = temp.next;
			pos--;
		}
		if(temp == head){
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
			size++;
		}
		else{
			temp.prev.next = newNode;
			temp.prev = newNode;
			newNode.next = temp;
			size++;

		}


	}
	public int size(){
		if(head == null){
			System.out.println("List is Empty");
			
		}
		return size;
	}
// 1 2 3 4
	// reverse the DD linked list 
	public void reverse(){
		Node prev = null;
		Node curr =head;
		// 1 8 2
		while(curr != null){
			Node next = curr.next;
			curr.next = prev;
			curr.prev = next;
			prev = curr;
			curr = next;

		}
		tail = head;
		head = prev;
	}
	// DELETE AT INDEX 1 2 3
	public void deleteAtpos(int pos){
		if(pos <= 0 || pos > size){
			System.out.println("Invalid index press 1 to "+size);
			return;
		}
		if(pos == 1){
			head = head.next;
			head.prev = null;
			return;
		}
		if(pos == size){
			tail = tail.prev;
			tail.next = null;
			return;
		}
		Node temp = head;
		while(pos - 1 != 0){
			temp = temp.next;
			pos--;
		}
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;


	}
}

class UseDoublyLL{
public static void main(String[] args) {
		DoublyLL ll = new DoublyLL();
		ll.insertNode(9);
		ll.insertNode(6);
		ll.insertNode(4);
		ll.insertNode(3);
		ll.insertNode(2);
		ll.printDLL();
		// ll.reverse();
		System.out.println();
		ll.deleteAtpos(3);
		ll.printDLL();

}



}