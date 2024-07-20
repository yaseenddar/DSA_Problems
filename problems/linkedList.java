import java.util.Scanner;
class linkedList{
 static class Node{

	int data;
	Node next;
    
    Node (){

    }
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}

 static class  List{
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
	
public int numComponents(ListNode head, int[] nums) {
	/*
	You are given the head of a linked list containing unique integer values 
	and an integer array nums that is a subset of the linked list values.
	Return the number of connected components in nums where two values are 
	connected if they appear consecutively in the linked list.

 
	*/
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        boolean isCom =  false;
        int result = 0;
        while( head != null){
            if(set.contains(head.val)){
            if(!isCom){
                isCom = true;
                result++;
            }
            }else{
                isCom = false;
            }

            head = head.next;

        }
        return result;
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
	while(fast != null && fast.next.next != null){
		slow = slow.next;
		fast = fast.next.next;
	}
	return slow;
}

//check palindrome
/*
--> to check the linkedList is palindrome or not 
	we have only one pointer to head of the LL
	we find the mid of LL
	then we have the mid of LL and to the right of mid we reverse the list and return the node
	then we have head and the node which are two LLs
	now we start comparing the left and right LLs
	if its palindrome then return true else false
	//STEPS
	(1) find the mid
	(2) reverse the list to the right of mid and return the pointer to it
	(3) compare the left and right lists 
	(4) return if it is palindrome
*/
public boolean CheckPalindrome(){

	if(head == null || head.next == null){
		return true;
	}
	//STEP (1)__find the middle
	Node mid = findMid();// return the mid node

	//STEP (2)__reverse the half right list
	Node prev = null;
	Node curr = mid;
	Node next = curr.next;
	while(next != null){
		curr.next = prev;
		prev = curr;
		curr = next;
		next = next.next;
	}
	//STEP (3)__initialize left and right lists
	Node left = head;
	Node right = curr;
	

	//STEP (4)__check for palindrome in left and right linked List
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

// sort the linked list
 public void sort(){
 	head = mergeSort(head);

 }
public Node middle(Node node){
	Node slow = node; 
	Node fast = node;
	while(fast.next != null && fast.next.next != null){
		slow = slow.next;
		fast = fast.next.next;
	}
	return slow;
}
 public Node mergeSort(Node node){
    if(node == null || node.next == null){
        return node;
    } 
    Node mid = middle(node);
    Node nextNode = mid.next;
    mid.next = null;
    Node leftLL = mergeSort(node);
    Node rightLL = mergeSort(nextNode);

    return merge(leftLL,rightLL);
}

public Node merge(Node left, Node right) {
    Node headNode = new Node();
    Node temp = headNode;

    while (left != null && right != null) {
        if (left.data <= right.data) {
            temp.next = left;
            left = left.next;
        } else {
            temp.next = right;
            right = right.next;
        }
        temp = temp.next;
    }

    if (left == null) 
        temp.next = right; 
    else 
        temp.next = left;

    return headNode.next;
}

}



	public static void main(String[] args) {
		System.out.println("This is the linked list ");
		List ll = new List();
		ll.takeinput();
		// Node head = ll.getHead();
		// System.out.println("ehjfsdvn");
		ll.print();
		ll.sort();
		System.out.println();
		ll.print();
		

		

	}
}