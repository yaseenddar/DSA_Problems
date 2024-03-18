class Queue1{
	public static class Queue{
		int [] arr;
		int rear = -1;
		int size;
		int front = -1;

		Queue(int size){
			arr = new int[size];
			this.size = size;
		}
	
		public void enqueue(int data){
			if((rear + 1)%size == front){
				System.out.println("Queue is full");
				return;
			}
			if(front == -1){
				front = 0;
			}
			rear = (rear+1)%size;
			arr[rear] = data;

		}
		public boolean isEmpty(){
			return rear == -1 || front == -1; 
		}
		public int size(){
			return arr.length;
		}
		public int dequeue(){
			if(isEmpty()){
				System.out.println("Queue is Empty");
				return -1;
			} 
			int elem = arr[front];

			if(rear == front){
				front = rear = -1;
				return elem;
				
			}
			front = (front+1)%size;
			return elem;
		}
		public void print(){
			if(isEmpty()){
				System.out.println("Queue is Empty");
				return;
			}
			
			for(int i = front ; i <= rear ; i++){
				System.out.print(arr[i]+" ");
			}
			for(int i = rear ; i < front ; i++){
				System.out.print(arr[i]+" ");

			}

			}

			//peek 
			public int peek(){
				return arr[front];
			}

		}
	

   	static class Node {
   		int data;
   		Node next;

   		Node(int data){
   			this.data = data;
   			next = null;
   		}
   	}

   	static class QueueUsingLL{
   		Node head = null;
   		Node tail = null;


   		public void add(int data){
   			Node newNode = new Node(data);
   			if(head == null){
   				head = newNode;
   				tail = newNode;
   				return;
   			}

   			tail.next = newNode;
   			tail = newNode;
   		}

   		public void print(){
   			if(head == null){
   				System.out.println("Underflow");
   			}
   			Node temp = head;
   			while(temp != null){
   				System.out.print(temp.data+" ");
   				temp = temp.next;
   			}
   		}

   		// dequeue
   		public void dequeue(){
   			if(head == null){
   				System.out.println("Underflow condition");
   				return;
   			}
			System.out.println("deleted"+head.data);

   			int elem = head.data;
   			head = head.next;
   		}
   		public boolean isEmpty(){
   			return head == null || tail == null;
   		}

   		// sort the queue
   	}
   

6 5 4 3 2 1 
	public static void main(String[] args) {

		// Queue q = new Queue(10);
		
		// q.enqueue(12);
		// q.enqueue(12);
		// q.enqueue(12);
		// q.enqueue(12);
		// q.dequeue();
		// while(!q.isEmpty()){
		// 	System.out.print(q.dequeue()+" ");
		// }

		//**********Queue Using Linked List****************
		// QueueUsingLL q = new QueueUsingLL();
		// q.add(1);
		// q.add(2);
		// q.add(3);
		// q.add(4);
		// q.add(5);
		// q.print();
		// q.dequeue();
		// q.dequeue();
		// q.dequeue();
		// q.print();

	}
}