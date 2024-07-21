
class Node{
	int data ;
	Node next;

	Node(int data){
		this.data = data;
		next = null;
	}
}
class StackUsingLL{
	Node head = null;

	public void takeinput(){
		System.out.println("Enter the data to be pushed press -1 to exit");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data != -1){
			Node newNode = new Node(data);
			if(head == null){
				head = newNode;
			}else{
				newNode.next = head;
				head = newNode;
			}
				System.out.println("Enter the data to be pushed press -1 to exit");
				Scanner sc = new Scanner(System.in);
				data = sc.nextInt();
		}
	}

	public void printStack(){
		if(head == null){
		System.out.println("Stack Underflow");
		return;
		}
		Node temp = head;
		while(temp != null){
			System.out.println("     "+temp.data);
			temp = temp.next;
		}

	}

	public void pop(){
		if(head == null){
			System.out.println("Stack Underflow");
			return;
		}
			System.out.println("Popped "+head.data);
			head = head.data;

	}
}
class StackUsingArray{
public static class Stack{
	private int []stack;
	private int size;
	private int top;
	Stack(int size){
		stack = new int[size];
		this.size = 0;
		this.top = -1;
	}

	// pushing to the stack
	public void push(int elem){
		if(top == size){
			System.out.println("OverFlow");
			return;
		}
		stack[++top] = elem;
		size++;

	}

	// pop operation
	public int pop(){
		if(top == -1){
			System.out.println("Underflow");
			return -1;
		}
			size--;
			return stack[top--];

	}
	public void print(){
		if(top == -1){
			System.out.println("Underflow");
			return;
		}
		System.out.print("top--->");
		for(int i = top ; i >=0 ; i--){
			System.out.println(stack[i]);
		}
	}
}
	
}

class Stack{
	public static void main(String[] args) {
		StackUsingLL st = new StackUsingLL();
		st.takeinput();
		st.printStack();
}